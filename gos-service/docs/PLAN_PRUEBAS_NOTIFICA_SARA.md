# Plan de pruebas mínimo — Notifica PDP SARA

Ejecutar cuando haya acceso a red SARA y entorno de pruebas Notifica (OE dado de alta).

## Pre-requisitos

1. Alta de la organización en entorno pruebas Notifica (trámite administrativo PAe).
2. Certificado cliente SSL instalado en el servidor gos-service.
3. Parámetros en `ge_parametro_sistema` o variables de entorno:
   - 9400: código DIR3
   - 9401: procedimiento SIA
   - 9402: URL del WS Notifica
4. `notifica.modo=real` en perfil de pruebas.
5. Adviser expuesto con dominio público y HTTPS (`POST /notifica/adviser`).
6. Tabla `gf_envio_notifica` creada (script `db/gf_envio_notifica.sql`).

## Casos de prueba

| # | Caso | Pasos | Resultado esperado |
|---|------|-------|-------------------|
| 1 | Envío con PDF | Notificación GENERADA con codArchi → Enviar a Notifica | Estado 8 NOTIFICA_ENVIADA, fila en gf_envio_notifica |
| 2 | Puesta a disposición | Sincronizar (1ª vez) | estado_notifica=PUESTA_DISPOSICION |
| 3 | Recepción | Sincronizar (2ª vez) o callback Adviser | Estado 3 RECEPCIONADA, tarea acuse, codArchiAcuse |
| 4 | Consulta envío | GET /notificacion/envioNotifica/{id} | idEnvioExterno y estadoNotifica visibles |
| 5 | Adviser | POST /notifica/adviser con idEnvioExterno | Sincronización automática del estado |
| 6 | Caducada | (solo mock: mensaje_error=MOCK_CADUCAR) | Estado 9 CADUCADA |
| 7 | Rechazada | (solo mock: mensaje_error=MOCK_RECHAZAR) | Estado 10 RECHAZADA |
| 8 | Sin PDF | Enviar sin codArchi | Error 400 con mensaje claro |
| 9 | JWT (prod) | jwt.enabled=true, petición sin Bearer | 401 |
| 10 | Login seguro | POST /usuario/login con body JSON | Token JWT en respuesta |

## Checklist post-pruebas

- [ ] Acuse visible como tarea en expediente
- [ ] Estados 7-10 correctos en listado de notificaciones
- [ ] Logs sin credenciales en claro
- [ ] CORS limitado al origen del front de producción
