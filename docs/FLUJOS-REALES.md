# iFlow — Cómo funciona realmente (por pantalla y flujo)

Este documento explica, para cada pantalla o acción de la app, **qué hace de verdad** (código real, endpoints reales, validaciones reales), no lo que su nombre sugiere. Donde el comportamiento actual difiere de lo que "debería" ser lógicamente, se marca como **⚠️ Discrepancia** — se documenta pero **no se cambia nada de código**. Nada de esto se ha tocado; es un mapa para entender el estado real del sistema antes de decidir qué mejorar.

Convenciones: `FE` = frontend Angular (`repo/`), `BE` = backend Spring Boot (`rep2/gos-service/`). Rutas relativas a esas raíces salvo que se indique lo contrario.

## Índice
1. [Login y verificación en dos pasos](#1-login-y-verificación-en-dos-pasos)
2. [Expedientes → Asignar Tramitador](#2-expedientes--asignar-tramitador)
3. [Expedientes → resto de acciones](#3-expedientes--resto-de-acciones)
4. [Procedimientos](#4-procedimientos)
5. [Solicitudes](#5-solicitudes)
6. [Mensajes](#6-mensajes)
7. [Integración INSIDE (red SARA / ENI)](#7-integración-inside-red-sara--eni)
8. [Integración Notifica](#8-integración-notifica)
9. [🚨 Hallazgos críticos (resumen)](#9-hallazgos-críticos-resumen)

---

## 1. Login y verificación en dos pasos

**Dónde:** `FE: src/app/login/login.component.ts` · `BE: com.greenaall.ge.controllers.UsuarioController`

1. Usuario/contraseña → `POST /usuario/{usuario}/{password}` (o `POST /usuario/login` con body JSON).
2. El backend (`UsuarioController.login`):
   - Busca el usuario (`ge_usuario`), valida contraseña con SHA-1+Base64 (`Codificador.encriptar`).
   - Comprueba bloqueo, caducidad de usuario y de contraseña.
   - **⚠️ Solo devuelve datos si el usuario tiene un registro en `ad_organizacion_usuario`.** Si no lo tiene, el método cae hasta el final y hace `return null` → `HTTP 201` con **cuerpo vacío**, sin error explícito. El frontend recibe `response = null` y falla de forma confusa.
   - Si el parámetro de sistema `9277` = `"SI"`, intenta un código de verificación de 4 dígitos por email (SMTP real vía parámetros 51/52/53/54/9273/9274/9275). Si falta alguno, o falla el envío, `ErrorEnvioEmail` → `HTTP 403`.
   - Si `9277` no existe o no es `"SI"`, se omite el email y `codigo` queda en `0`.
3. Frontend (`login.component.ts`):
   - `response.codigo == 0` → navega directo a `/inicio`.
   - `response.codigo != 0` → pide el código, comparándolo contra `codigoLogin`, que **es el mismo valor que ya llegó en la respuesta del login** y queda en `localStorage`.
   - **⚠️ Discrepancia de seguridad:** el "segundo factor" no es independiente del primero — el código viaja en la misma respuesta y en el `localStorage` del navegador; no hace falta leer el email para tenerlo.

**Tablas:** `ge_usuario`, `ad_organizacion_usuario`, `ad_organizacion_elemento`, `ge_parametro_sistema` (51-54, 250, 9270-9277).

---

## 2. Expedientes → Asignar Tramitador

**Dónde:** `FE: src/app/features/expedientes/{expedientes.component.ts, services/expedientes-expediente.facade.ts, services/expedientes-grid.facade.ts, components/expedientes-modals/*}` · `BE: com.greenaall.ex.controllers.MensajeController`

### Lo que ve y hace el usuario
1. Al seleccionar un expediente ya se cargan en segundo plano las "Tareas del procedimiento" (`GET /tareaProcedimiento/listar/{idProcedimiento}`).
2. Acción "Tramitador" abre el modal (id interno **`AsigfnarTramitadorModal`** — typo repetido en todo el código).
3. **⚠️ Las rejillas "Tareas"/"Permisos" solo aparecen si el usuario hace clic dentro del campo de texto "Asunto"** — el `(click)` que las revela está enganchado a un `<input>` sin relación funcional. Con Tab en vez de ratón, nunca aparecen.
4. Seleccionar una tarea → aparece "Permisos" (`GET /permiso/listar/{idTarea}`, personas habilitadas).
5. Seleccionar una persona → guarda `usuarioPermiso` (`idOrgUsuar`) internamente.
6. Asunto obligatorio + "Asignar".
   - **⚠️ Solo se valida que el Asunto no esté vacío.** No se valida que haya tarea/persona seleccionada. Sin selección, `destinatario` va `undefined` → el backend responde `400 FaltanDatosException`, un error genérico en vez de un aviso claro.
   - **⚠️ El campo `idtarea` de `CrearMensaje` nunca se rellena** (la tarea elegida se pierde). En backend, el código que lo leería está comentado (`MensajeController.crear`, ~L340-343). El mensaje creado no queda vinculado a ninguna tarea concreta, solo al expediente + texto libre.

### Qué pasa de verdad al pulsar "Asignar"
**No asigna tramitador en este paso.** Es una **oferta**:
1. `POST /mensaje/crear` con `{descripcion, destinatario, idExped, fecEnvio}`.
2. Backend valida: no auto-enviártelo, no enviarlo al instructor actual, no duplicar tramitador ya en posesión (`TramitadorPoseeException`).
3. Crea `ex_mensaje` con `estado=PENDIENTE`. **No toca `ex_tramitador`.**
4. La asignación real ocurre cuando el destinatario **tramita** el mensaje desde su bandeja (`PUT /mensaje/tramitar/{idMensaje}`): pasa el mensaje a `TRAMITANDO` y crea la fila real en `ex_tramitador` (`posesion=1`, `TRAMITANDO`).

**En una frase:** "Asignar Tramitador" es en realidad **"ofrecer el expediente a alguien"**; el diseño de dos pasos (oferta + aceptación) es razonable y tiene validaciones sensatas, pero el nombre engaña si se lee como asignación inmediata.

**Tablas:** `ex_mensaje`, `ex_tramitador`, `ad_organizacion_usuario`, `ex_tarea_procedimiento`, `ex_permiso`.

---

## 3. Expedientes → resto de acciones

Todas se habilitan/deshabilitan vía `accionExpediente()` en `expedientes-acciones.component.ts:12-63`.

### 3.1 `tramitar` → navega a `/expedientes/:id/tramitar`
Puro `router.navigate`, sin HTTP propio. Abre `EditaExpedienteComponent`, un módulo grande aparte (trámites, tareas, firma, notificaciones, tramitadores) que queda fuera del alcance de este documento — merece su propia sesión.

### 3.2 `interesados` → modal con `InteresadoComponent` embebido
- Grid: `GET interesado/listar/{idExpediente}`. Alta: `POST interesado/crear` — **rechaza duplicados** por `idHisPerso` (`InteresadoExistenteException`, 403). Baja: `DELETE interesado/borrar/{id}`.
- **⚠️ El interesado `principal` no se puede borrar** desde aquí (`ErrorBorradoException`, 403) — solo se marca `principal` al crear el expediente, nunca desde este modal.

### 3.3 `registro` → solo lectura
- **⚠️ El botón no llama a ningún endpoint al pulsar.** Los datos (`GET rdDocumento/ver/{idHisDocum}`) ya se cargaron al seleccionar la fila del listado; el clic solo formatea y muestra una notificación con los datos ya en memoria. Si el backend devuelve `null` (documento no encontrado), no hay excepción — se muestran campos vacíos silenciosamente.

### 3.4 `tareas` → modal de solo lectura
`GET tareaTramiteExpediente/listarPorExpediente/{idExp}`. Sin alta/edición/borrado desde aquí (eso vive en la ficha de tramitación). Puede fallar con 404/403 si falta configuración de firma o parámetros de sistema.

### 3.5 `atributo` → CRUD estándar
`PUT atributoExpediente/editar` por cada atributo modificado. **⚠️ El backend no valida los límites (`requerido`, `valMinim`, `valMaxim`) que sí define el modelo** — solo se usan para pintar el tipo de input en frontend.

### 3.6 `devolver` → reverso de "Asignar Tramitador"
`PUT expediente/devolverExpediente/{idExped}/{idOrgUsuar}/{usuario}` → quita posesión al tramitador actual (`posesion=0`, `TRAMITADO`) y cierra (`FINALIZADO`) el mensaje de asignación.
- **🐛 Bug real:** el backend comprueba `if (oTramitador == null)` para decidir si lanzar `NoDataFoundException`, pero los repositorios Spring Data **nunca devuelven `null`, devuelven lista vacía** — la guarda es inerte. Si no hay tramitador en posesión (doble clic, ya devuelto...), `oTramitador.get(0)` lanza `IndexOutOfBoundsException` → **500 genérico no controlado**, pese a que el modal advierte "Este paso no se podrá revertir" como si fuera una operación controlada.

### 3.7 `cerrar` → la única acción con validación de negocio real
Formulario: fecha de cierre + "código de serie documental" (ambos obligatorios). `PUT expediente/cerrar/{id}`.
- **Backend valida que no queden tareas sin `fecFin`** (`NoFechaFinException` → 403, "Existen tareas sin finalizar") — la única regla de negocio real de todo el bloque cerrar/cancelar/abrir/archivar.
- Genera físicamente el XML del expediente ENI y un SIP en disco; si falla, **solo hace `printStackTrace()` y el cierre continúa igualmente** (no aborta la transacción).
- El "código de serie documental" solo se aplica si el expediente tiene tareas con archivo — si no, se descarta silenciosamente (ni se persiste, no hay campo `serieDocumental` en `Expediente`).
- Dispara efectos colaterales hacia INSIDE (ver §7) según `inside.registrar-pendiente-on-close` / `inside.auto-envio-on-close`.

### 3.8 `cancelar` → reutiliza el endpoint genérico
`PUT expediente/editar/{id}` con `{estado:'CANCELADO', fecCancelacion}` — no hay endpoint dedicado. **⚠️ Sin ninguna validación de negocio en backend** (no comprueba que no esté ya cerrado/archivado); la única protección es el frontend deshabilitando el botón según el estado.

### 3.9 `abrir` → mismo endpoint genérico, con bug de orden
`PUT expediente/editar/{id}` con `{estado:'ABIERTO'}`. Al reabrir, el backend limpia `fecCancelacion`/`fecArchivo`/`fecFin`.
- **🐛 Bug de UX:** el PUT se ejecuta **antes** de mostrar el diálogo "¿Está seguro?". Si el usuario cancela el diálogo, el cambio **ya se persistió** igualmente — cancelar solo evita el mensaje de éxito y el refresco de grid, no revierte nada.
- Riesgo de NPE en backend: `expediente.getEstado().equals(...)` sin comprobar null (a diferencia del resto del método).

### 3.10 `archivar` → confirmado 100% simulación
El propio código lo admite: *"Archivar sin REDSARA: marca ARCHIVADO en iFlow (demo). TODO SARA real: sustituir por integración red SARA en cutover."* Mismo endpoint genérico `PUT expediente/editar/{id}`, sin integración SARA real, sin endpoint dedicado.
- **🐛 Bug grave de manejo de errores:** si el `PUT` falla (red, 4xx, 5xx), el callback de error **muestra un mensaje de éxito** ("Archivado (simulación local)") en vez de un error. El usuario cree que archivó el expediente, pero el grid ni se refresca — el expediente sigue como estaba.

### 3.11 `indiceEni` → solo lectura
`GET archivo/verIndice/{idexpe}`, lee un fichero `.properties` auxiliar generado al cerrar (§3.7). Si el fichero físico no existe (borrado, entorno distinto), lanza `IOException` no capturada → 500 sin traducir a mensaje de negocio.

---

## 4. Procedimientos

**Acceso:** solo si `nivAcces === '6'` (`UserSessionService.canManageProcedimientos`).

### Flujo
- Listado (`app-procedimientos-list`, tabla plana desde 2026-07-31) + modal "Nuevo Procedimiento". Clic en una fila → `/procedimientos/:id?tab=datos` (workspace con pestañas **Datos / Tareas / Permisos / Atributos** — ver/editar es la misma vista).
- Pestaña **Tareas**: aquí sí se gestiona `ex_tarea_procedimiento` (alta/edición en offcanvas, borrado con confirmación).
- Pestaña **Permisos**: asigna usuarios a una tarea concreta (quién puede tramitarla).
- Pestaña **Atributos**: gestiona `ge_metadato_grupo_atrib`, pero **el listado no cuelga directamente del procedimiento** — ver hallazgo de `gf_tarifa` más abajo.

### Validaciones y efectos colaterales
- Alta: rechaza siglas duplicadas (`MetadatoGrupoError`) y descripción duplicada exacta (`ProcedimientoDescripcionError`).
- **⚠️ Crear un procedimiento crea en cascada, sin que la UI lo explique:** un `MetadatoGrupo`, una `TareaProcedimiento` "Tarea inicial automática" (`tareaAutomatica=true`), y una `GfTarifa` con rango de fechas **hardcodeado** (`01/01/(año-2)` a `31/12/(año)`), no configurable desde la UI. Todo en un único `try/catch` que da un mensaje genérico si falla cualquiera de los tres pasos.
- Borrar: bloqueado si hay expedientes que referencien el procedimiento (`ErrorBorradoProcedimientoException`, 403); si se permite, borra en cascada tareas, permisos, tarifas y metadato de grupo.
- **🐛 Al editar cualquier tarea del procedimiento, el backend fuerza siempre `tareaAutomatica=false`** (`TareaProcedimientoController.editar`, línea con `tareaProcedimientoDB.setTareaAutomatica(false)` incondicional) — incluida la "Tarea inicial automática": basta con editarla una vez para que pierda esa marca silenciosamente. Verificado con curl directo contra el backend (2026-07-31): edición de la tarea id 1 pasó de `tareaAutomatica=true` a `false` sin que el payload enviado tocara ese campo. No se ha tocado el backend — está fuera del alcance de esta sesión (solo frontend) — pero queda documentado aquí porque es un bug real y activo.
- **🐛 El "0" como centinela de "limpiar campo" es inconsistente entre alta y edición de tarea, y es fácil de romper si se toca sin verificar:** `crear` guarda `plantillaDefecto`/`procesoFirmadoDefecto` tal cual (un `null` significa "sin valor" porque es un registro nuevo), pero `editar` **ignora un `null` entrante** (lo trata como "no lo toques") y solo limpia el campo si recibe literalmente el string `"0"`. El frontend (`ProcedimientoService.editaTareaProcedimiento`) ya enviaba `0` correctamente para "Sin Plantilla"; verificado con curl contra el backend real que `null` es un no-op silencioso (el valor anterior se queda) y `"0"` sí limpia — no cambiar esto sin volver a verificar contra el controller.
- **🆕 `metadatoGrupoAtrib/listarPorProc/{idProce}` no lee los atributos por procedimiento directamente:** primero busca una fila en `gf_tarifa` con ese `idProce` y usa **su** `idGrupo` para buscar los atributos — es decir, los atributos "del procedimiento" en realidad cuelgan del grupo de metadatos asociado a la **tarifa** del procedimiento, no del procedimiento en sí. En el entorno local (`iflow_dev`) la tabla `gf_tarifa` **no existe** (`Table 'iflow_dev.gf_tarifa' doesn't exist`, verificado con curl 2026-07-31), así que este endpoint devuelve **500** para cualquier procedimiento — la pestaña "Atributos" no se puede probar de extremo a extremo en este entorno hasta que se migre esa tabla. El frontend ya trata cualquier error de esta lista como "sin atributos" (no rompe la UI), pero el error real queda oculto al usuario.

### Discrepancias resueltas en el rediseño de 2026-07-31 (ver `CAMBIOS.md`)
- Las 4 rejillas jqx del módulo (listado, tareas, permisos, atributos) se sustituyeron por tablas planas.
- Se eliminaron las pantallas huérfanas/rotas: `/modifprocedimiento` (`create()` comentado, no hacía nada), `/verprocedi/:id` (no enlazada desde ningún sitio), `/tareasprocedimientos` (pintaba `procedimientos` bajo cabeceras de "tarea", datos incorrectos) y `/permisoprocedimiento` (placeholder inerte). Los enlaces "Tareas"/"Permisos" del menú superior, que apuntaban a estas dos últimas, también se quitaron — la gestión real siempre ha vivido en el workspace por-procedimiento.
- Carpeta `procedimientos/recibos-pendientes/` (solo tenía un `.css` huérfano) eliminada.
- Todas las excepciones de negocio de este módulo se siguen mapeando a **HTTP 403** (no 400/409/422) — semánticamente confuso; no se ha tocado (es comportamiento de backend, fuera de alcance).

---

## 5. Solicitudes

### Flujo
- Vista única (listado + panel detalle, sin workspace por rutas). Alta: hay que pulsar **"Buscar"** el DNI del interesado antes de poder guardar (bloqueado si no).
- Acciones sobre una solicitud seleccionada: **Asignar** (usuario), **Rechazar** (motivo obligatorio), **Modificar** (solo si `PENDIENTE`), **Iniciar Expediente** (solo si no tiene expediente ya), **Eliminar** (solo si no tiene expediente).
- **No existe un botón "Aceptar solicitud" independiente.** El único camino a `ACEPTADA` es "Iniciar Expediente".

### Cómo funciona de verdad la conversión Solicitud → Expediente
**Es al revés de lo intuitivo: crear el expediente es lo que acepta la solicitud, no hay paso de "aceptar" primero.** Dentro de `POST /expediente/crear/{email}/{forNotif}`, si el nuevo expediente referencia una solicitud: la marca `ACEPTADA`, la vincula (`solicitud.expediente = id`), y traslada los documentos de la solicitud como tareas del nuevo expediente.
- **⚠️ Si alguna vez se crea un expediente "a mano" sin pasar el id de la solicitud, la solicitud original nunca cambia de estado** — quedaría `PENDIENTE` para siempre aunque ya se esté tramitando aparte.
- **Asignar/Rechazar/Modificar son el mismo endpoint genérico** `PUT /solicitud/editar/{id}` con distintos payloads parciales — no hay `/solicitud/aceptar` ni endpoints dedicados.
- **⚠️ Rechazar puede fallar por motivos ajenos al rechazo:** si la solicitud viene de un registro de entrada, rechazarla intenta enviar un email (8 parámetros SMTP); si falta cualquiera, `ErrorEnvioEmail` (403) y **toda la operación aborta**, aunque la intención era solo cambiar el estado.

### Discrepancias graves
- **🐛 Posible contrato roto en el flujo activo de "Iniciar Expediente":** el frontend postea a `expediente/crear` con `email`/`forNotif` **en el body** (comentario explícito en el código: "Contrato preferido: email/forNotif en body"), pero el backend solo mapea `@PostMapping("/expediente/crear/{email}/{forNotif}")`, exigiéndolos como **path variables**. Si no hay ningún rewrite de rutas, esta llamada debería fallar con 404 — **merece verificación funcional directa**, es justo el flujo que acepta una solicitud.
- Métodos legados no enlazados a ningún botón (`iniciarExpediente()`, `editExpediente()`, `creaExpediente()`) con bugs propios que ya no importan salvo que alguien los reconecte: una llamada HTTP sin `.subscribe()` (nunca se envía), un mensaje de éxito mostrado antes de llamar al backend, y una URL sin los path variables que el backend exige.
- Reutiliza el texto de excepción de Procedimientos ("No se ha podido borrar el procedimiento...") al bloquear el borrado de una Solicitud con expediente — mensaje engañoso.

---

## 6. Mensajes

### Flujo
- Bandeja unificada (no dos listados separados): combina `GET mensaje/listarRecibidos/{idOrgUsuar}` + `GET mensaje/listarEnviados/{idOrgUsuar}` en un único array. Filtros (Todos/Recibidos/Enviados, texto, estado) son **100% en cliente**, sin llamadas al backend por filtro.
- **Seleccionar un mensaje NO lo marca como leído en backend** — es un `Object.assign` puramente local. `fecLectura` solo se rellena como efecto colateral de Tramitar o Rechazar.
- **Tramitar** y **Rechazar** solo visibles para mensajes recibidos en estado `PENDIENTE`/`LEIDO`.

### Rechazar — qué hace de verdad
`PUT mensaje/rechazar/{idMensaje}` → `estado=RECHAZADO`, guarda motivo y fecha; si nunca se había leído, aprovecha para poner `fecLectura` también. **No toca `ex_tramitador`** (a diferencia de Tramitar). **⚠️ El motivo no se valida en backend** — solo en frontend; un PUT directo sin motivo lo aceptaría.

### Bugs reales
- **🐛 `tramitar()` y `rechazar()` no comprueban que el mensaje exista** — si el id no existe, `findById` devuelve `null` y la siguiente línea lanza `NullPointerException` → **500 genérico sin traducir**, a diferencia de otros métodos del mismo controlador que sí validan.
- **🐛 Desalineación de nombres de estado:** el frontend comprueba el literal `'TRAMITADO'`, que no existe en el backend (el valor real es `'FINALIZADO'`). Cuando un mensaje llega a `FINALIZADO` (al cerrar el expediente), la etiqueta/badge caen al genérico "Sin estado" en vez de "Finalizado" — y ese chip de filtro ni siquiera existe, esos mensajes solo son visibles bajo "Todos".
- **🐛 Bug de datos en el backend:** al listar "Enviados" (y en el detalle/`ver`), el código resuelve correctamente el remitente pero luego hace `setNomRemit(null)` en vez de asignar el nombre resuelto — siempre pone `null`. Hoy es inofensivo porque la UI de "Enviados" muestra el destinatario, no el remitente, pero afecta a `mensaje/ver/{id}` si se reconecta.
- El estado `LEIDO` es prácticamente inalcanzable: ningún endpoint activo lo asigna nunca (el único que lo haría, `marcarLeido()`, no está enlazado a ningún botón). El filtro "Leídos" de la UI estará siempre vacío.
- Acciones "Borrar mensaje" y "Marcar como leído" existen completas en servicio y backend pero no están enganchadas a ningún botón de la UI.

---

## 7. Integración INSIDE (red SARA / ENI)

### 🚨 Hallazgo crítico primero
**`inside.soap.dry-run` vale `false` por defecto y NO está sobreescrito en `application-dev.properties` ni `application-prod.properties`.** Es decir: tal como está el repositorio, **cualquier clic en "INSIDE Expediente", "Alta XML" o "Remisión Justicia" intenta de verdad una llamada HTTPS a `https://se-e-inside.redsara.es/...`** (servicio real del Ministerio), en cualquier entorno, salvo que alguien active el dry-run manualmente al arrancar. El comentario del frontend que sugiere "en desarrollo esto está simulado" **es falso en el estado actual del repo** — el único freno de facto hoy es la falta de datos válidos o de red de salida hacia `redsara.es`, no una desactivación explícita. Con `mtls.enabled=false` (también por defecto) y sin certificado cliente, cualquier llamada real fallaría casi seguro por autenticación en el lado de RedSARA — pero el intento de conexión saliente es real.

### Flujo
- Acción "INSIDE" (icono nube) se habilita solo con `!editExpedientes` — **sin comprobar el estado del expediente**. Abre un modal con 6 botones (sin formulario, salvo "Remisión Justicia") + confirmación previa con badge "simulación" si `environment.inside.dryRun` es true en frontend.
- **⚠️ Ese flag de frontend es cosmético.** Como `useBackendProxy=true` siempre (dev y prod), el flujo real nunca pasa por el cliente SOAP simulado del frontend — llama directo a endpoints REST del backend (`/inside/expediente/{id}/enviar-*`), cuyo propio interruptor (`inside.soap.dry-run` en el backend) es el único que realmente decide.
- Backend arma sobres SOAP 1.1 a mano (concatenación de strings) y los postea con `java.net.http.HttpClient` a las URLs reales de RedSARA, con timeout de 5 minutos.
- Cada intento (éxito o error) intenta registrarse en `gf_envio_inside` (tabla creada por script SQL manual, sin Flyway/Liquibase). **Si la tabla no existe, el fallo de persistencia se ignora silenciosamente** y el flujo continúa como si nada.

### Validaciones reales
- Solo **"Alta XML de Expediente"** exige que el expediente esté `CERRADO`/`ARCHIVADO`. **"INSIDE Expediente" y "Documentos" no lo exigen** — se puede enviar un expediente completo a INSIDE estando todavía abierto, desde el mismo modal, sin distinción visual de cuál acción requiere qué estado.
- Remisión a Justicia valida campos obligatorios (idexpEni, dir3Juzgado, dir3Remitente, nig) — pero **la validación de frontend es solo un `if`, sin bloquear realmente el submit** (`[disabled]` del botón no depende de la validez del formulario).
- **Firma electrónica hardcodeada a `false`**: no hay integración con ningún proveedor de firma/certificado real; los documentos se envían marcados como no firmados.
- Órgano DIR3 con valor ficticio por defecto (`'EA0000000'` / `'L99999999'`) si no se puede resolver — solo genera advertencia, no bloquea el envío.
- Existe un helper de validación más completo (`inside-validation.helper.ts`) que revisa interesados, PDFs, tareas sin `fecFin`, etc., pero **solo se ejecuta si el usuario pulsa explícitamente "Validar"** — un paso opcional que puede saltarse por completo; el camino real de envío no lo invoca.

### Otras discrepancias
- `puedeEnviarInside()` (comprobación de estado CERRADO/ARCHIVADO) existe en el código pero **no está conectado a ningún template** — dando la falsa sensación de que hay un guard de UI que en realidad no aplica.
- Dos "interruptores dry-run" independientes en el backend, leyendo la misma property pero en clases distintas sin relación entre sí.

**Tablas:** `gf_envio_inside`.

---

## 8. Integración Notifica

### Resumen
Existe una **capa de aplicación completa** (cliente, orquestador, controladores REST, scheduler opcional, callback) para integrarse con Notifica (plataforma PAe de notificaciones electrónicas), pero corre **enteramente sobre un modo mock**. A diferencia de INSIDE, aquí el modo "real" está **deliberadamente sin implementar**: `NotificaRealClient` simplemente lanza una excepción explicando que falta el WSDL del CTT y los certificados SARA — no hay ningún riesgo de llamada accidental real, porque no hay código que la haga.

### Cómo funciona el mock
- `notifica.modo=mock` (valor por defecto): `enviar(...)` genera un `idEnvioExterno = "MOCK-" + UUID` sin llamar a nada externo. `consultarEstado(...)` simula una máquina de estados `ENVIADA → PUESTA_DISPOSICION → RECEPCIONADA`, con trucos de prueba (escribir literalmente `MOCK_CADUCAR`/`MOCK_RECHAZAR` en el mensaje de error para forzar esos casos).
- `notifica.sync-scheduled=false` por defecto → el scheduler de sincronización periódica **no corre** en este despliegue.

### Ciclo de vida de una notificación
- No hay pantalla de menú "Notificaciones" independiente — vive **dentro de la ficha de un expediente** (pestaña/vista `notificaciones`).
- Estados reales usados por la integración (10, no los 6 de la entidad `Notificacion.java`): GENERADA(1), ENVIADA(2), RECEPCIONADA(3), DEVUELTA(4), COBRADA(5), ANULADA(6), NOTIFICA_GENERADA(7), NOTIFICA_ENVIADA(8), CADUCADA(9), RECHAZADA(10).
- **"Enviar" (clásico) y "Enviar a Notifica" son dos acciones distintas y no excluyentes** cuando la notificación está en `GENERADA`: el envío clásico solo mueve `situacion` a `ENVIADA` (2) vía `PUT notificacion/editar/`; "Enviar a Notifica" es el que de verdad llama a la integración y mueve a 7/8. Ambos botones visibles a la vez, sin distinción fuerte de cuál es el telemático real.
- Cuando `sincronizarConNotifica` detecta `recepcionada`, **crea automáticamente una nueva tarea de trámite** ("Acuse Notifica: …") encadenada a la que originó la notificación.

### Discrepancias
- **⚠️ Dos catálogos numéricos distintos con el mismo nombre "forma de notificación"**: `Notificacion`/`GfNotificacion` usan 4=papel/5=telemática, mientras `Interesado`/`ExpedienteDto`/`GestionFiscalConstantes` usan 0=papel/1=telemática. Riesgo real de bug si se mezclan.
- **Entidades huérfanas** `ExNotificacion` (`ex_notificacion`) y `GfNotificacion` (`gf_notificacion`): sin DAO/servicio/controlador — código muerto, vestigio de un modelo de datos anterior.
- La tabla `gf_envio_notifica` (imprescindible para "Enviar a Notifica") se crea con un script SQL suelto, sin Flyway/Liquibase — despliegue manual.
- El scheduler **traga cualquier excepción por envío sin loguearla** — si la sincronización periódica falla sistemáticamente, no queda ningún rastro.
- El callback `POST /notifica/adviser` no muestra protección/autenticación visible en el código (el propio Javadoc advierte que en producción debe ir tras dominio público + SSL).
- Al copiar el PDF de la tarea al crear la notificación, un fallo de `IOException` solo hace `printStackTrace()` sin relanzar — la notificación puede quedar sin PDF real y nadie se entera hasta que falla el envío.

**Tablas:** `pe_notificacion`, `gf_envio_notifica`.

---

## 9. Hallazgos críticos (resumen)

| # | Dónde | Qué pasa | Severidad |
|---|---|---|---|
| 1 | INSIDE | Dry-run desactivado por defecto en todo entorno — intenta llamadas HTTPS reales a RedSARA | 🔴 Alta (riesgo operativo/seguridad) |
| 2 | Solicitudes → Iniciar Expediente | Posible contrato roto front/back (body vs. path variables) en el flujo que acepta una solicitud | 🔴 Alta (puede estar simplemente roto) |
| 3 | Login | 2FA no es un segundo factor real: el código viaja en la misma respuesta y en localStorage | 🟠 Media (seguridad) |
| 4 | Expedientes → archivar | Errores HTTP se muestran como éxito al usuario | 🟠 Media (integridad de datos percibida) |
| 5 | Expedientes → abrir | Cambio de estado se persiste antes de pedir confirmación | 🟠 Media (UX/integridad) |
| 6 | Expedientes → devolver | Guardas `== null` inertes → 500 no controlado en casos límite | 🟡 Baja-media |
| 7 | Mensajes | `tramitar`/`rechazar` sin comprobación de null → 500 si el id no existe | 🟡 Baja-media |
| 8 | Mensajes | Estado `FINALIZADO` mal mapeado en frontend (busca `'TRAMITADO'`) | 🟡 Baja (cosmético pero confuso) |
| 9 | Procedimientos | ~~Menú "Tareas"/"Permisos" superior roto~~ — **resuelto 2026-07-31**: pantallas huérfanas y enlaces eliminados, solo queda el workspace funcional | ✅ Resuelto |
| 10 | Asignar Tramitador | Sin validación de selección antes de enviar; tarea elegida no viaja al backend | 🟡 Baja |
| 11 | Procedimientos → editar Tarea | El backend fuerza `tareaAutomatica=false` en **cualquier** edición de tarea, incluida la tarea inicial automática de un procedimiento | 🟠 Media (rompe silenciosamente una tarea automática con solo editarla una vez) — backend, fuera de alcance de esta sesión |
| 12 | Procedimientos → Atributos | `metadatoGrupoAtrib/listarPorProc` depende de una fila en `gf_tarifa`, tabla ausente en el entorno local (`iflow_dev`) → 500 siempre, la UI lo trata como "sin atributos" | 🟡 Baja-media (bloquea probar esta pestaña en local; backend/esquema, fuera de alcance) |

---

*(Pendiente de documentar en detalle en futuras sesiones: la ficha de tramitación completa de un expediente — trámites, firma, registro de salida — que es tan grande como cualquiera de las secciones anteriores.)*
