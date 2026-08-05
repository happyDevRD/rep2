# Registro de cambios — antes / después / por qué

Este documento complementa a `FLUJOS-REALES.md` (que explica cómo funciona la app *hoy*). Aquí se registra cada mejora que se aplica de verdad al código: qué había, qué se cambió, y por qué — para tener control de las mejoras sin depender de la memoria de la conversación.

Cada entrada sigue el mismo formato: contexto, qué cambió exactamente (antes/después), qué se decidió mantener igual a propósito, y los archivos tocados.

---

## 2026-07-31 — "Atributos EXP": faltaban datos de configuración + manipulación directa del DOM sustituida por un formulario normal

**Contexto:** al abrir "Atributos EXP" no aparecía nada. Investigado: dos causas distintas, una de datos y una de código.

**Causa 1 (datos):** los 3 procedimientos de prueba se crearon directamente por SQL en una sesión anterior, saltándose la lógica de alta real de `POST /procedimiento/crear`, que en cascada crea también un `MetadatoGrupo` (grupo de atributos) para el procedimiento. Como nunca se creó ese grupo, no había ninguna definición de atributo (`ge_metadato_grupo_atrib`) a la que enlazar, y por tanto ningún expediente podía tener atributos — el mensaje "Este expediente no tiene atributos configurados" era, técnicamente, correcto pero sin ninguna forma de comprobarlo con datos reales.

**Causa 2 (código, bug real):** el formulario de edición no usaba Angular en absoluto — generaba los `<input>` a mano con `document.createElement`/`innerHTML` sobre un `<div id="divform">` vacío, indexando cada campo por su posición en el array (`nuevoinput0`, `nuevoinput1`...). Al probar el guardado de un atributo de tipo fecha encontramos además un bug de datos: `modificaAtributo()` decidía si un valor era una fecha mirando si **contenía un guion** (`valor.includes('-')`), sin comprobar el tipo real del atributo — cualquier valor de texto libre con un guion (p. ej. "Madrid-Centro") o cualquier número negativo se habría reinterpretado como fecha y corrompido con `substring()` a ciegas.

### Antes
- Sin `MetadatoGrupo`/atributos definidos para ningún procedimiento de prueba — imposible probar el flujo con datos reales.
- Formulario editable generado con manipulación directa del DOM, al margen del change detection de Angular.
- `enviar()` mandaba un `PUT` por **cada** atributo en la lista, hubiera cambiado o no.
- `modificaAtributo()` "adivinaba" si un valor era fecha por la presencia de un guion, en vez de mirar el tipo del atributo — bug real de corrupción de datos para valores de texto o números negativos con guion.
- Una rejilla jqx aparte ("Listado de atributos") con el mismo patrón fragil de reintentos (`shown.bs.modal` + 60/250/500 ms) ya visto en Tareas del Expediente, solo para poder seleccionar qué atributo borrar.

### Después
- Creado el `MetadatoGrupo` que faltaba para los 3 procedimientos de prueba (mismo efecto que si se hubieran dado de alta por la API real), y 3 atributos de ejemplo en el procedimiento 1 (superficie construida, fecha de inspección, observaciones), con valores ya cargados en el expediente 1.
- El modal es ahora una única tabla (etiqueta + valor editable + borrar), sin `<div>` vacío ni rejilla aparte. El valor se edita con un `<input>` normal de Angular (`[(ngModel)]`), con `type="date"` solo para atributos `FECHACORTA` (igual que antes) y modo numérico para `NUMERO`/`COEFICIENTE`/`MONEDA` (igual que antes) — mismo criterio de tipos, sin ampliarlo.
- Al guardar, solo se manda `PUT` de los atributos que realmente cambiaron (comparando contra el valor original cargado), y se espera a que todas las peticiones terminen (`forkJoin`) antes de refrescar — antes se limpiaba el formulario a los 1000 ms diera tiempo o no a que terminaran las peticiones.
- Arreglada la detección de fecha: la conversión dd/MM/yyyy ↔ yyyy-MM-dd ahora solo se aplica a atributos de tipo `FECHACORTA` (comprobando `attr.tipo`), nunca por la presencia de un guion en el texto.
- Borrar un atributo es ahora un botón por fila, sin el paso intermedio de "selecciona la fila, luego pulsa Eliminar".
- Verificado end-to-end contra el backend real: editar un valor numérico, editar la fecha (confirmando que el valor vuelve a guardarse como `dd/MM/yyyy`, no como `yyyy-MM-dd`), y borrar un atributo.

### Archivos tocados
- `repo/src/app/features/expedientes/services/expedientes-atributos.facade.ts` — reescrito: sin DOM, con copia editable y guardado solo de lo modificado.
- `repo/src/app/features/expedientes/expedientes.component.ts` — nuevas propiedades/métodos delegando al facade; quitados los de la rejilla jqx.
- `repo/src/app/features/expedientes/expedientes.service.ts` — quitada la detección de fecha por guion en `modificaAtributo`.
- `repo/src/app/features/expedientes/components/expedientes-modals/expedientes-modals.component.html` y `.ts` — tabla editable en vez de `divform` + rejilla; quitado el `@ViewChild` ya no usado.
- `repo/src/app/features/expedientes/services/expedientes-grid.facade.ts` y `config/expedientes-grid.config.ts` — quitadas las fábricas/columnas/métodos jqx específicos de atributos (confirmado que el módulo de Procedimientos tiene los suyos propios, independientes).
- `repo/src/app/features/expedientes/services/expedientes-expediente.facade.ts` — quitada la llamada a la rejilla jqx en `marcarExpedienteSeleccionado`.

### Verificación
`ng serve` compila sin errores. Backend verificado por curl: editar valor numérico (201), editar y releer fecha confirmando formato `dd/MM/yyyy` correcto tras el guardado, borrar atributo (204) y confirmar que desaparece del listado.

---

## 2026-07-31 — "Tareas del Expediente": sustituida la rejilla jqx por una tabla plana (bug real de código, esta vez sí)

**Contexto:** el modal "Tareas del Expediente" (acción "Tareas" del listado de expedientes) nunca mostraba datos, ni siquiera después de crear una tarea real. A diferencia del caso anterior, **esta vez sí era un bug de código**, confirmado comparando: el backend (`GET /tareaTramiteExpediente/listarPorExpediente/{id}`) devuelve los datos correctamente (verificado por curl), pero la rejilla nunca los pintaba.

**Causa raíz:** el modal usaba una rejilla jqxGrid dentro de un modal Bootstrap recién abierto — un patrón ya señalado como frágil en `FLUJOS-REALES.md` (sección "Expedientes → tareas"). El propio código ya intentaba parchear el problema con reintentos a ciegas (`window.setTimeout` a 60/250/500 ms tras el evento `shown.bs.modal`), la señal clásica de un timing bug nunca resuelto de raíz. Además, se encontró que **ya existía sin usar** un método de servicio (`getTareaTramiteExpeporExpe`) que devolvía los datos como array plano — trabajo empezado y nunca conectado a la UI.

### Antes
- `abrirModalTareasExpediente()` apuntaba una rejilla jqx a la URL del endpoint, abría el modal, y esperaba a que jqxGrid se enterase de que ya podía dibujarse — con reintentos manuales como red de seguridad.
- El estado "estos son los datos" solo existía como efecto secundario del evento `bindingComplete` de la rejilla (`onTareasExpedienteBindingComplete`), es decir, dependía de que jqx funcionara para que la UI supiera si había datos o no.

### Después
- El modal pide los datos directamente por HTTP al abrirse (reutilizando `getTareaTramiteExpeporExpe`, que ya existía y no se usaba), sin pasar por ninguna rejilla — mismo patrón robusto que ya usamos en Asignar Tramitador.
- La lista se pinta con una tabla Bootstrap normal (`table table-hover`, `*ngFor`), igual que ya se hace en otros sitios de la app (p. ej. "Firmantes" en el modal de Firma Electrónica) — sin depender de que un widget jqx se inicialice bien dentro de un modal.
- Se añadió `catchNotFoundAsEmpty` a `listarPorExpediente` (ya estaba importado en el servicio, pero no aplicado a este método) para que un expediente realmente sin trámites se trate como "vacío", no como error.
- Se limpiaron los restos ahora muertos: la rejilla jqx, sus columnas, el adaptador de datos, los métodos de refresco con reintentos, y el `@ViewChild` que los conectaba.
- Verificado end-to-end: `GET /tareaTramiteExpediente/listarPorExpediente/1` devuelve la tarea creada antes, y el flujo ya no depende de temporizadores.

### Archivos tocados
- `repo/src/app/features/expedientes/expedientes.component.ts` — `abrirModalTareasExpediente` reescrito para pedir datos por HTTP directo; eliminados los métodos/propiedades de la rejilla jqx.
- `repo/src/app/features/expedientes/components/expedientes-modals/expedientes-modals.component.html` — tabla Bootstrap en vez de `app-iflow-grid`.
- `repo/src/app/features/expedientes/components/expedientes-modals/expedientes-modals.component.ts` — quitado el `@ViewChild` de la rejilla ya no usada.
- `repo/src/app/features/expedientes/services/expedientes-grid.facade.ts` y `config/expedientes-grid.config.ts` — quitadas las fábricas/columnas/métodos jqx específicos de esta rejilla (confirmado por búsqueda que no se usaban en ningún otro sitio).
- `repo/src/app/core/service/tarea-tramite/tarea-tramite-expediente-api.service.ts` — `listarPorExpediente` ahora trata 404 como lista vacía.

### Verificación
`ng serve` compila sin errores. Backend verificado por curl devolviendo la tarea creada en la sesión anterior. Pendiente verificación visual en navegador.

---

## 2026-07-31 — "Nueva Tarea del Trámite": no era un bug de código, eran datos de prueba incompletos

**Contexto:** al intentar crear una tarea desde el modal "Nueva Tarea del Trámite" (dentro de la ficha de un expediente), el formulario no se podía enviar nunca. Investigado a fondo: **no es un bug de la aplicación**, es una combinación de dos reglas de negocio reales que nuestros datos de prueba no cumplían.

**Causa raíz:**
1. El desplegable "Tarea procedimiento" del modal se alimenta de `GET /tareaProcedimiento/listar/{procedimiento}/{fase}`, que filtra por la fase exacta del trámite actual **y excluye explícitamente las tareas marcadas como `tarea_automatica`** (`TareaProcedimientoDao.findByProcedimientoAndFaseTarea`, con `WHERE tarea_automatica = false` fijo en la consulta). Las automáticas se gestionan aparte, no se eligen a mano.
2. La única tarea de procedimiento que existía para el procedimiento 1 era precisamente la que marcamos como `tarea_automatica = true` (lo hicimos a propósito en una sesión anterior, para probar el flujo de firmas con el mock de e-firma). Resultado: para el trámite de prueba (fase INICIO), el desplegable no tenía ninguna opción — y al ser un campo obligatorio, el formulario nunca pasaba validación.

**No se tocó ningún código** — el comportamiento del backend (excluir automáticas del selector manual) es intencional y correcto. Se completaron los datos de prueba.

### Antes
- Procedimiento 1: una sola tarea de procedimiento, automática, fase INSTRUCCION.
- Procedimientos 2 y 3: una sola tarea cada uno, manual, pero solo en fase INSTRUCCION.
- Cualquier trámite en fase INICIO o RESOLUCION, en cualquiera de los 3 procedimientos, tenía el desplegable de "Nueva Tarea" vacío.

### Después
- Cada procedimiento (1, 2 y 3) tiene ahora tareas manuales (`tarea_automatica = false`) en las tres fases: INICIO, INSTRUCCION y RESOLUCION.
- Se añadieron permisos (`ex_permiso`) para `lgomez` y `prodriguez` en las 6 tareas nuevas, igual que en las existentes, para que también se puedan ofrecer vía "Asignar Tramitador".
- Verificado end-to-end: `POST /tareaTramiteExpediente/crear/null` con una tarea de procedimiento válida devuelve `201 Created`.

### Archivos tocados
Ninguno de código. Solo datos (`ex_tarea_procedimiento`, `ex_permiso` en la base de datos local).

---

## 2026-07-31 — Modal "Asignar Tramitador": rediseño visual + corrección de bugs

**Contexto:** el modal tenía tres problemas reales (documentados en `FLUJOS-REALES.md` §2): las rejillas de selección solo aparecían si el usuario hacía clic en un campo de texto sin relación funcional; no se validaba que hubiera tarea/persona seleccionada antes de enviar; y la tarea elegida se perdía silenciosamente (nunca llegaba al backend, aunque el modelo tenía el campo). Además, toda la interacción era a base de rejillas jqx (tablas), sin contexto visual de en qué paso estás ni a quién vas a ofrecer el expediente.

**Se decidió explícitamente mantener igual:** el flujo de negocio de fondo — "Asignar Tramitador" sigue siendo una *oferta* (crea un `ex_mensaje`, no asigna nada hasta que el destinatario lo acepta desde su bandeja). Eso no se ha tocado, ni en frontend ni en backend.

### Antes
- Id del modal con un typo: `AsigfnarTramitadorModal`, repetido en HTML, componente y facade.
- Las rejillas "Tareas del procedimiento" y "Permisos" (tablas jqx) solo se revelaban con un `(click)` puesto en el campo de texto "Asunto" — nada que ver funcionalmente con cargar datos. Con teclado (Tab) nunca aparecían.
- Única validación de envío: que el "Asunto" no estuviera vacío. Se podía enviar sin haber seleccionado tarea ni persona, y el backend devolvía un `400` genérico.
- El campo `idtarea` del modelo `CrearMensaje` nunca se rellenaba, ni siquiera se incluía en el payload HTTP — la tarea elegida se perdía sin dejar rastro.
- Sin resumen de confirmación: no había forma de ver "vas a ofrecer el expediente a X" antes de enviar.

### Después
- Id corregido a `AsignarTramitadorModal` en todos los sitios (HTML, componente, facade).
- Flujo explícito por pasos, con indicador visual (1. Elegir tarea → 2. Elegir persona → 3. Asunto y confirmar). Las tareas se cargan automáticamente al abrir el modal (y también, como antes, al seleccionar el expediente en el listado, para que estén listas de inmediato).
- Las tarjetas de selección (tareas / personas) son botones reales (`<button role="radio">`), accesibles por teclado, con estado visual claro de selección, carga y error — sustituyen a las dos tablas jqx.
- Validación explícita de tres pasos (tarea, persona, asunto) antes de permitir enviar, con mensajes inline junto a cada selección faltante en vez de un error genérico del backend.
- El campo `idtarea` ahora se rellena con la tarea seleccionada y viaja en el payload de `POST /mensaje/crear` (el backend sigue sin leerlo — ese código está comentado en `MensajeController.crear` — pero al menos el frontend ya no descarta el dato).
- Paso 3 muestra un resumen explícito: *"Vas a ofrecer este expediente a **X** para la tarea **Y**. Quedará pendiente de que lo acepte desde su bandeja de Mensajes."*
- Botón de envío renombrado de "Asignar" a "Ofrecer expediente", más fiel a lo que realmente hace.
- Limpieza de código muerto que quedó huérfano tras el rediseño: las fábricas de datos jqx específicas de este modal (`createTareaProcediSourcePlain`, `createPermisosAdapter`), sus column-builders (`buildColumnsTareaProcedi`, `buildColumnsPermi`) y los métodos de facade que solo existían para alimentarlas (`lanzaSourcePermi`, y la implementación anterior de `lanzaTareaProcedi`) — confirmado por búsqueda en todo el repo que no los usaba nada más. También se eliminó `atrasNuevoMensaje()` y dos propiedades (`verTareasdelTramite`, `nuevotramitador`) que eran una copia sin usar de una pantalla distinta (`edita-expediente`), no leídas por ningún template de este componente.
- Corregidos de paso varios comentarios con caracteres corruptos en el código que se tocó (p. ej. "Nueva funci?n principal" → sin comentario innecesario; "?Est? seguro" → "¿Confirma...").

### Archivos tocados
- `repo/src/app/features/expedientes/expedientes.component.ts` — estado y lógica del nuevo flujo por pasos.
- `repo/src/app/features/expedientes/components/expedientes-modals/expedientes-modals.component.html` — markup del modal, completo.
- `repo/src/app/features/expedientes/components/expedientes-acciones/expedientes-acciones.component.ts` — id del modal.
- `repo/src/app/features/expedientes/services/expedientes-expediente.facade.ts` — id del modal (en el cierre tras éxito).
- `repo/src/app/features/expedientes/services/expedientes-grid.facade.ts` — quitadas las fábricas/métodos jqx ya no usados.
- `repo/src/app/features/expedientes/config/expedientes-grid.config.ts` — quitados los adapters/column-builders ya no usados.
- `repo/src/app/features/expedientes/expedientes.service.ts` — dos métodos HTTP nuevos (`getTareasProcedimientoListar`, `getPermisosTareaListar`) y arreglo del payload de `crearMensaje` (incluye `idtarea`).
- `repo/src/styles/views/expedientes.css` — estilos nuevos para el indicador de pasos y las tarjetas de selección.

### Verificación
`ng serve` compila sin errores tras el cambio completo (confirmado en el log de build). Pendiente: verificación visual en navegador (la extensión de Claude en Chrome no estaba conectada en el momento del cambio).

---

## 2026-07-31 — Modal "Asignar Tramitador": segunda vuelta — de tarjetas a formulario clásico

**Contexto:** el rediseño anterior (tarjetas seleccionables + indicador de pasos con preguntas tipo "¿A quién se la ofreces?") funcionaba, pero el usuario indicó que no encaja con el resto de la aplicación: los usuarios reales están acostumbrados a formularios clásicos, y ese patrón de tarjetas/preguntas no es el lenguaje visual del resto de la app. Se pidió usar como referencia el modal "Nueva Solicitud" (`solicitudes-modals-alta`), que ya resuelve un caso parecido (selects en cascada: provincia → municipio) con controles de formulario estándar.

**De paso**, se detectó y arregló un problema real en ese mismo modal de referencia: usaba un tamaño de modal *fijo* (`iflow-modal--fixed`, 540px de alto siempre) en vez de *ajustado al contenido* (`iflow-modal--fit`), por lo que cuando las secciones opcionales (interesado no localizado, sin representante) mostraban poco contenido, quedaba un hueco en blanco grande al fondo del modal.

### Antes
- "Asignar Tramitador": indicador de pasos (1/2/3) + tarjetas-botón seleccionables para tarea y persona, con títulos tipo pregunta ("1. ¿Para qué tarea...?", "2. ¿A quién se la ofreces?") y un resumen de confirmación en un tercer bloque. Modal ancho (`modal-xl`) y alto (hasta 720px) para caber las dos listas.
- "Nueva Solicitud": modal de altura *fija* (`iflow-modal--fixed`, 540px), que dejaba espacio en blanco visible cuando el contenido (interesado sin localizar, sin representantes) era corto.

### Después
- "Asignar Tramitador" ahora es un formulario plano de tres campos en el mismo lenguaje visual que "Nueva Solicitud": un `<select>` de Tarea, un `<select>` de Persona (deshabilitado hasta elegir tarea, se puebla igual que el cascade provincia→municipio) y el campo Asunto — sin tarjetas, sin preguntas, sin indicador de pasos. Modal reducido a `modal-lg` / hasta 420px de alto, acorde a lo corto del formulario.
- La lógica de selección (`seleccionarTareaAsignar`, `seleccionarPersonaAsignar`, carga de permisos al cambiar de tarea, validaciones) se mantuvo intacta — solo cambió cómo se disparan (ahora vía `(ngModelChange)` de un `<select>` en vez de `(click)` en una tarjeta), y se les añadió una guarda para el valor `null` que el `<select>` puede emitir.
- "Nueva Solicitud" pasa a `iflow-modal--fit` (se ajusta al contenido, tope de 640px) — ya no deja espacio en blanco cuando el contenido es corto.

### Archivos tocados
- `repo/src/app/features/expedientes/components/expedientes-modals/expedientes-modals.component.html` — formulario reescrito (selects en cascada en vez de tarjetas), `dialogClass` a `modal-lg`.
- `repo/src/app/features/expedientes/expedientes.component.ts` — `seleccionarTareaAsignar`/`seleccionarPersonaAsignar` ahora aceptan `null` de forma segura.
- `repo/src/styles/views/expedientes.css` — quitado todo el CSS de tarjetas/indicador de pasos (ya no se usa); tamaño del modal reducido a 420px.
- `repo/src/app/features/solicitudes/components/modals/solicitudes-modals-alta/solicitudes-modals-alta.component.html` — `modalClass` de `--fixed` a `--fit`.
- `repo/src/styles/views/solicitudes.css` — regla de tamaño de `.soli-alta-modal` adaptada a `--fit` (ajustado al contenido, tope 640px, antes altura fija de 540px).

### Verificación
`ng serve` compila sin errores tras el cambio (confirmado en el log de build). Pendiente verificación visual en navegador.

---

## 2026-07-31 — "Atributos EXP": cabecera del modal corregida (info dinámica movida al cuerpo)

**Contexto:** tras el rediseño anterior de este modal, la cabecera concatenaba el título fijo con `e.tituloExp` (que puede ser largo) directamente como texto plano, sin ninguna separación visual. El resto de la aplicación tiene una convención distinta para esto — visible en el modal "Ver expediente" — donde la parte dinámica va en un `<span>` con estilo atenuado (`text-secondary fw-normal`) dentro del propio título. El usuario pidió corregirlo y, en general, que cualquier información adicional que un modal necesite mostrar vaya en el cuerpo, no forzada en la cabecera.

### Antes
- `<ng-container modalTitle>Atributos EXP: {{ e.tituloExp }}</ng-container>` — título variable, sin separación visual, y con un nombre ("Atributos EXP") que no coincidía con el resto de textos de la app ("del expediente").

### Después
- Cabecera estática y corta: `title="Atributos del expediente"`.
- `e.tituloExp` se muestra ahora como subtítulo dentro del cuerpo del modal: `<p class="text-secondary small mb-3"><i class="bi bi-folder2-open me-1"></i>{{ e.tituloExp }}</p>`, justo encima del listado de atributos.

### Archivos tocados
- `repo/src/app/features/expedientes/components/expedientes-modals/expedientes-modals.component.html` — cabecera del modal `NAtributosModal2`.

### Verificación
`ng serve` compila sin errores tras el cambio. Cambio puramente de maquetación (no toca lógica ni llamadas al backend).

---

## 2026-07-31 — "Interesados del expediente": sustituida la rejilla jqx por una tabla plana

**Contexto:** el listado de interesados de un expediente usaba `<app-iflow-grid>` (jqxGrid) con selección por radio-button, `rowClick`/`rowDoubleClick` y un `dataAdapter` (`sourceInteresado`) construido a mano. Es el mismo patrón que ya causó problemas en "Tareas del Expediente": la rejilla no siempre renderiza al abrir dentro de un modal recién mostrado. Aquí además la lógica de selección de fila estaba triplicada (una copia del mismo bloque de asignación de campos en `crearInteresado()`, `borrarinteresados()` y en el propio manejador de click), cada una reconstruyendo el `dataAdapter` jqx por separado tras cada operación.

**Se decidió explícitamente mantener igual:** los sub-modales "Nuevo Interesado" y "Ver Interesado" (`interesado-modals.component.html`) — ya usaban `form-floating` y el lenguaje visual correcto de la app, no necesitaban rediseño. Tampoco se tocó el modal contenedor (`interesado.component.html`, `title="Interesados del expediente"`), que ya seguía la convención correcta de cabecera estática.

### Antes
- `interesado.component.ts` mantenía columnas jqx (`columnsInteresado`), renderers de celda (`columnrendererInteresado`, `columnrendererRepresentante`, `cellsrendererPrincipal`, etc.), un `GridRadioSelector` para la columna de selección, un objeto de localización propio (`localizationObject`) y un `dataAdapter` (`sourceInteresado`) que había que reconstruir manualmente cada vez que cambiaba la lista.
- Tres copias casi idénticas de la asignación de campos del interesado seleccionado, una dentro de cada callback de éxito (`crearInteresado`, `borrarinteresados`) y otra en el manejador de clic de fila.
- La plantilla (`interesado-list.component.html`) usaba `<app-iflow-grid [source]="i.sourceInteresado" [columns]="i.columnsInteresado" ...>`.

### Después
- `interesado.component.ts`: se añadió `interesados: InteresadoListarDto[]` + `cargandoInteresados: boolean`, cargados vía `cargarInteresados()` (llama directamente a `expedientesService.getInteresadoListarDto`, ya existente). Se unificó la asignación de campos del interesado seleccionado en un único método `seleccionarInteresado(rowData)`, reutilizado por `clickInteresado()` (clic simple, habilita borrar) y `abrirModalVerInteresado()` (doble clic, abre el detalle de solo lectura). Se eliminaron todos los símbolos jqx (`columnsInteresado`, `sourceInteresado`, `columnseleccion`, `columnrendererInteresado`, `columnrendererRepresentante`, `cellsrendererPrincipal`, `localizationObject`, `GridRadioSelector`, `jqxGrid_ES`) y el `HttpClient` inyectado que ya no se usaba directamente.
- `interesado-list.component.html`: la rejilla se sustituyó por una tabla `table table-hover` normal (mismo patrón que "Tareas del Expediente"), con estado de carga (`spinner-border` + "Cargando interesados…") y estado vacío (`alert alert-light`, "Este expediente no tiene interesados registrados."). Cada fila muestra interesado, documento, badge Sí/No de "Principal", representante y documento del representante; clic selecciona (resalta la fila con `table-active` y habilita el botón Borrar), doble clic abre "Ver Interesado".

### Archivos tocados
- `repo/src/app/features/expedientes/interesado/interesado.component.ts` — reescrito: fuera jqx, dentro `interesados[]` + `cargarInteresados()` + `seleccionarInteresado()`.
- `repo/src/app/features/expedientes/interesado/components/interesado-list/interesado-list.component.html` — tabla plana en vez de `<app-iflow-grid>`.

### Verificación
- `ng serve` compila sin errores (confirmado en el log de build tras el cambio).
- Búsqueda en todo `repo/src` de los símbolos eliminados (`columnsInteresado`, `sourceInteresado`, `columnrendererInteresado`, `columnrendererRepresentante`) sin resultados — nada más dependía de ellos.
- `curl http://localhost:8090/api/gos/interesado/listar/1` (ruta real que usa el frontend, vía gateway) devuelve la lista de interesados del expediente 1 con la forma exacta de `InteresadoListarDto` (`nomInter`, `numDocumInter`, `principal`, `nomRepre`, `numDocumRepre`, etc.), confirmando que la tabla nueva se puede alimentar con datos reales sin ajustes adicionales.

---

## 2026-07-31 — Módulo "Procedimientos": rediseño completo (rejillas jqx → tablas, limpieza de lógica, eliminación de pantallas rotas)

**Contexto:** se pidió rehacer el módulo Procedimientos y "organizar bien su lógica". Auditoría previa (agente Explore) encontró: 4 rejillas jqxGrid (listado, Tareas, Permisos, Atributos del workspace); 4 pantallas standalone huérfanas o rotas enlazadas desde rutas/menú; un componente "dios" (`ProcedimientosComponent`) con bastante código muerto (métodos duplicados de un refactor a medio terminar) y varios pequeños bugs reales. Los formularios de alta/edición (modales y offcanvas) **ya usaban** el patrón bueno (`form-floating` + `<select>` nativo) desde antes — a diferencia de Expedientes, aquí el trabajo pendiente estaba casi entero en las tablas y en la limpieza.

**Decisión confirmada con el usuario antes de tocar código** (afecta navegación): eliminar del menú los enlaces "Tareas"/"Permisos" (llevaban a pantallas standalone rotas, sin relación real con la gestión que ya funciona dentro del workspace por-procedimiento) y eliminar las rutas huérfanas `/modifprocedimiento` y `/verprocedi/:id`.

### Antes
- 4 `<app-iflow-grid>` (jqxGrid) con `dataAdapter`s manuales (`config/procedimientos-grid.config.ts`) y refrescos a base de `setTimeout` (doble refresco de 200ms+500ms tras crear/editar en el listado principal).
- Menú "Procedimientos" con 4 enlaces: Listado, Nuevo procedimiento, **Tareas** (→ `/tareasprocedimientos`, pintaba el array de `procedimientos` bajo cabeceras "Descripción/Fase/Plazo/Tipo plazo/Acciones" — datos completamente equivocados; botón "Nueva tarea" abría un modal con el texto literal "Formulario de nueva tarea (en desarrollo)"), **Permisos** (→ `/permisoprocedimiento`, placeholder inerte que solo decía "vaya al listado").
- Rutas huérfanas sin ningún `routerLink` en toda la app: `/modifprocedimiento` (`FormModifProcediComponent`, con el método `create()` **completamente comentado** — el botón no hacía nada) y `/verprocedi/:id` (`VerProcedimientoComponent`, solo lectura, `create()` vacío).
- Carpeta `procedimientos/recibos-pendientes/` con un único `.css` huérfano (sin `.ts`/`.html`).
- Doble reseteo del formulario "Nuevo Procedimiento" con `setTimeout(() => prepararFormularioNuevoProcedimiento(), 0)` **después** de abrir el modal — condición de carrera latente si el usuario tecleaba muy rápido.
- `procedimientos.component.ts:197`: `if (this.nivAcces === '6' || this.session.canManageProcedimientos)` — segunda condición tautológica, ya que `canManageProcedimientos` es literalmente `nivAcces === '6'`.
- `ProcedimientosTareasFacade.getFirma()` reimplementaba con su propio `HttpClient` la misma llamada (`procesoFirmado/listar/{plantilla}`) que ya existía en `ProcedimientoService.getFirma()`, con tipos de retorno ligeramente distintos (`FirmaListar` vs. el ahora eliminado `ProcesoFirmadoListar`, duplicado casi idéntico).
- `limpiarErrores()`, `limpiarErroresModificarTarea()`, `limpiarErroresEditarProcedimiento()` hacían cada una su propio `document.getElementById(...).classList.remove('was-validated')` a mano, en vez de usar el helper compartido `clearFormValidation`/`resetForm` que el resto de facades del mismo componente ya usaban.
- Bastante código muerto: métodos duplicados nunca llamados desde ningún template (`editaProcedi()`, `creoAtributo()`, `editoAtributo()`, `create()`, `createTareaProcedi(procedimientoId)`, `editaTareaProcedim()`, `createPermisoProcedi()`, `abrirModalEditarTarea()`, `limpiarErroresAlAbrirModal()` con cuerpo vacío, `limpiarTodosLosFormularios()` sin ningún llamador); `isValidTab()` de `ProcedimientosWorkspaceFacade` definida pero nunca usada (la misma validación se reimplementaba inline con un array literal); una llamada a `getListaTareas()` que traía la misma lista de tareas por HTTP **por duplicado** solo para guardarla en una propiedad (`listatareaprocedi`) que ningún template leía; varios campos "write-only" que algún facade rellenaba pero que nadie volvía a leer nunca (`respuestahttp`, `tareaprocedicreada`, `permisoprocedicreado`, y sus clases de modelo asociadas); `getUsuarios()`/`getUsuarioListar()` en `ProcedimientoService` sin consumidores **dentro de Procedimientos** (`getUsuarioListar` sí tenía un consumidor real en Expedientes — ver "Archivos tocados").

### Después
- Las 4 rejillas se sustituyeron por tablas Bootstrap (`table table-hover`) con estado de carga (`spinner-border`) y estado vacío (`alert alert-light`), igual que en los rediseños previos de Expedientes. `ProcedimientosGridFacade` pasó de construir `jqx.dataAdapter`s a hacer llamadas HTTP directas (`cargarProcedimientos`, `cargarTareas`, `cargarPermisos`, `cargarAtributos`) y rellenar arrays tipados (`Procedimiento[]`, `ListaTareaProcedi[]`, `ProcediPermisosListar[]`, `AtributosListar[]`) — desaparece por completo la necesidad de refrescos con `setTimeout`.
- Se añadieron dos métodos nuevos a `ProcedimientoService` para poder alimentar las tablas por HTTP normal: `getPermisosListar(idTarea)` (reutiliza la ruta `permiso/listar/{id}`, antes solo disponible envuelta en un adapter jqx) y `getAtributosListarPorProc(idprocedimiento)` (ruta `metadatoGrupoAtrib/listarPorProc/{id}`, antes solo usada por el adapter jqx del componente).
- Listado principal: clic en una fila navega directamente (`abrirProcedimiento(id)`); se quitó el doble manejador `rowClick`/`rowDoubleClick` que antes podía encadenar hasta 3 `router.navigate()` a la misma pantalla.
- Menú "Procedimientos" reducido a "Listado" + "Nuevo procedimiento". Eliminados los componentes `TareasProcedimientosComponent`, `PermisoprocedimientoComponent`, `FormModifProcediComponent`, `VerProcedimientoComponent`, sus rutas en `procedimientos-routing.module.ts`, sus entradas en `procedimientos.module.ts` y las entradas correspondientes en `layout/page-titles.ts`. Carpeta `recibos-pendientes/` eliminada.
- `abrirNuevoProcedimientoModal()`/`abrirModal()`: un único reseteo del formulario antes de abrir el modal, sin el `setTimeout(0)` adicional.
- Condición de acceso simplificada a `this.session.canManageProcedimientos` (una sola fuente de verdad); el getter `nivAcces` sin uso se quitó tanto del componente como de `ProcedimientoService`.
- `ProcedimientosTareasFacade.getFirma()` eliminado; ahora delega en `ProcedimientoService.getFirma()`. Se unificaron los dos modelos casi-duplicados (`FirmaListar` y `ProcesoFirmadoListar`) en uno solo (`FirmaListar`).
- Las tres funciones de limpieza de errores ahora usan el helper compartido `clearFormValidation`/`resetForm` en vez de reimplementar el acceso al DOM cada vez.
- Eliminado todo el código muerto listado arriba, incluyendo las clases de modelo que quedaron sin consumidores (`PermisProcedi`, `UsuariosListar`, `ProcesoFirmadoListar`, `RespuestasHttp` de Procedimientos, `TareaProcediCreada`, `PermisoProcediCreado`). `isValidTab()` ahora sí se usa (sustituye la validación inline de query param `tab`). `Procedimiento` y `ListaTareaProcedi` (modelos de dominio compartidos) se completaron con los campos que el backend ya devolvía pero que la clase TypeScript no declaraba (`siglas`, `modalidad`, `idMatProce`, `desEleme`, `accion`) — necesarios para poder tipar las nuevas tablas sin `any`.

### Se decidió explícitamente mantener igual
- Toda la lógica de negocio real de creación/edición/borrado (payloads, endpoints, validaciones de formulario) — el rediseño es de listas y limpieza, no de flujo.
- **`editaTareaProcedimiento()` sigue enviando `0` (no `null`) para "limpiar" `plantillaDefecto`/`firmaPorDefecto`.** Se investigó inicialmente como posible bug ("inconsistente" con `crear`, que sí usa `null`), pero verificado contra el controller real (`TareaProcedimientoController.editar`, backend) y con curl: el backend solo limpia esos campos cuando recibe literalmente el string `"0"` — un `null` en edición es un no-op silencioso que **deja el valor anterior intacto**. Se confirmó con pruebas reales contra `tareaProcedimiento/editar/{id}` (fijar un valor, intentar limpiar con `null` → no cambia; limpiar con `"0"` → sí se limpia). No se tocó este comportamiento.
- **No se ha tocado ningún archivo del backend (`rep2/gos-service`)**, aunque la verificación reveló dos bugs reales ahí: (1) `TareaProcedimientoController.editar` fuerza incondicionalmente `tareaAutomatica=false` en cualquier edición de tarea, incluida la tarea inicial automática de un procedimiento; (2) `metadatoGrupoAtrib/listarPorProc/{id}` depende de una fila en `gf_tarifa`, tabla que no existe en el esquema local (`iflow_dev`) y devuelve 500 siempre. Ambos quedan documentados en `FLUJOS-REALES.md` §4 — están fuera del alcance de esta sesión (solo frontend) y son decisión del equipo de backend.

### Archivos tocados
- `repo/src/app/features/procedimientos/components/procedimientos-list/procedimientos-list.component.{ts,html}` — tabla plana del listado.
- `repo/src/app/features/procedimientos/components/procedimientos-workspace/procedimientos-workspace.component.{ts,html}` — tablas planas de Tareas/Permisos/Atributos.
- `repo/src/app/features/procedimientos/procedimientos.component.ts` — reescrito: fuera jqx y código muerto, dentro arrays tipados + estados de carga + helpers de label por fila.
- `repo/src/app/features/procedimientos/procedimiento.service.ts` — `getPermisosListar`/`getAtributosListarPorProc` nuevos, `getFirma` devuelve `FirmaListar`, `getProcedimientos` usa `canManageProcedimientos` y devuelve `of([])` en vez de `of()`, eliminados `getUsuarios`/`getUsuarioListar`/urls muertas, `editaTareaProcedimiento` sin el `catchError` que enmascaraba el error real del backend.
- `repo/src/app/features/procedimientos/services/procedimientos-grid.facade.ts` — reescrito: de adapters jqx a llamadas HTTP + arrays.
- `repo/src/app/features/procedimientos/services/procedimientos-{tareas,permisos,atributos,workspace}.facade.ts` — renombrados los métodos de recarga (`lanzaSourceTarea`→`cargarTareas`, etc.), quitados campos write-only sin consumidor.
- `repo/src/app/features/procedimientos/helpers/procedimientos-tarea-row.helper.ts` — `TareaRowData` simplificado a `Partial<ListaTareaProcedi>`.
- `repo/src/app/features/procedimientos/config/procedimientos-grid.config.ts` — **eliminado** (ya no queda ninguna rejilla jqx en el módulo).
- `repo/src/app/features/procedimientos/menuprocedimiento.component.html` — quitados los enlaces "Tareas"/"Permisos".
- `repo/src/app/features/procedimientos/{form-modif-procedi,ver-procedimiento,permisoprocedimiento}.component.*`, `tarea-procedimiento/`, `recibos-pendientes/` — **eliminados**.
- `repo/src/app/features/procedimientos/procedimientos-routing.module.ts`, `procedimientos.module.ts` — quitadas las rutas/declaraciones de los componentes eliminados.
- `repo/src/app/layout/page-titles.ts` — quitadas las entradas de título de las rutas eliminadas.
- `repo/src/app/core/models/procedimiento-domain.model.ts` — `Procedimiento`/`ListaTareaProcedi` completados con campos reales del backend; `PermisProcedi`, `UsuariosListar`, `ProcesoFirmadoListar` eliminados (sin consumidores).
- `repo/src/app/features/procedimientos/models/procedimientos-internal.models.ts` — `RespuestasHttp`, `TareaProcediCreada`, `PermisoProcediCreado` eliminados (sin consumidores); `FirmaListar` es ahora el único modelo de firma.
- `repo/src/app/features/expedientes/edita-expediente/services/edita-expediente-lifecycle.facade.ts` — actualizada la única llamada externa a `procedimientoService.getUsuarioListar` para usar el nuevo nombre `getPermisosListar`.

### Verificación
- `ng serve` compila sin errores tras el cambio completo (confirmado en el log de build, hash `408c76e` a las 17:49:46 UTC del 2026-07-31, justo después de la última edición).
- Búsqueda en todo `repo/src` de los símbolos jqx eliminados (`sourceTarea`, `sourcePermi`, `sourceAtributos`, `sourcePro`, `columnsPro/Tarea/Permi/Atributos`, `gridProcedimientos/Tareas/Permisos/Atributos`, `jqxGrid_ES`) sin resultados fuera de otros módulos no tocados.
- Verificado contra el backend real (`localhost:8082`, sin pasar por gateway): `GET procedimiento/listar/1`, `GET tareaProcedimiento/listar/1` y `GET permiso/listar/1` devuelven datos con la forma exacta que esperan las tablas nuevas.
- `GET metadatoGrupoAtrib/listarPorProc/1` devuelve 500 por la tabla `gf_tarifa` ausente en el esquema local (ver arriba) — confirmado que el frontend lo degrada a "sin atributos" sin romper la pantalla.
- `PUT tareaProcedimiento/editar/1` probado en vivo tres veces (fijar plantilla, intentar limpiar con `null`, limpiar con `"0"`) para verificar el comportamiento real de "limpiar campo" antes de decidir no tocar `editaTareaProcedimiento`. Los datos de prueba mutados durante la verificación (`tarea_automatica`, descripción) se restauraron a su estado original al terminar.
