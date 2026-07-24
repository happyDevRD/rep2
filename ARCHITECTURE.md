# iFlow — Arquitectura

Documento de referencia para front ([iflow-master](../iflow-master)) y back ([iFlowServer](./)).
La guía detallada de Angular también vive en `.cursor/rules/iflow-angular-architecture.mdc`.

## Principios

1. Incremental: no reescrituras big-bang ni NgRx/standalone masivos en esta fase.
2. **InSide es la plantilla oficial** para código nuevo y refactors de casos de uso.
3. Package-by-feature dentro de cada dominio; códigos cortos de backend documentados (no renombrar en masa).
4. Tests primero en lógica pura (mappers, helpers, orchestrators).
5. Seguridad y config antes que estética de carpetas.

## Capas objetivo

```
Component / Controller fino
  → Facade / Application Service
    → Orchestrator (caso de uso)
      → Service HTTP/SOAP/DAO
      → Mapper + DTO tipado
```

### Frontend (referencia)

`EditaExpedienteInsideFacade` → `InsideExpedienteOrchestrator` → `InsideService` / `InsidePrepareApiService` → SOAP client.

Ubicación: `iflow-master/src/app/core/service/inside/`.

### Backend (referencia)

`InsidePrepareController` → `InsideEnvioService` / `InsideDocumentoEnvioService` → `InsideIflowMapper` + `InsideSoapEnvelopeBuilder`.

Ubicación: `iFlowServer/gos-service/.../com/greenaall/inside/`.

## Glosario de dominios backend (`gos-service`)

| Código | Dominio |
|--------|---------|
| `ad` | Administración / organización |
| `co` | Contabilidad |
| `ex` | Expedientes / trámites / solicitudes |
| `ge` | Gestión documental / firma / archivos |
| `gf` | Gestión fiscal |
| `pa` | Padrón |
| `pe` | Personas / notificaciones |
| `rd` | Registro de documentos |
| `se` | Sede electrónica |
| `te` | Territorio |
| `ve` | Vehículos |
| `inside` | Integración INSIDE / ENI |
| `notifica` | Integración Notifica |

## Frontend — estructura

```
src/app/
├── core/           # guards, interceptors, services root, models
├── shared/         # UI reutilizable (sin negocio)
├── features/       # widgets embebidos
├── expedientes/ | solicitudes/ | procedimientos/ | inicio/ | mensajes/
├── login/          # auth eager
├── nav/ | layout/
└── routing/
```

Reglas: dominios y features → `shared`/`core`; `core` no importa dominios.

## Configuración y secretos

- **Front:** `environment.ts` usa placeholders `${IFLOW_API_URL}`; desarrollo en `environment.development.ts`. No versionar IPs internas.
- **Back:** perfil vía `-Dspring.profiles.active=dev|prod`. Prod fuerza `jwt.enabled=true`.
- `config.properties` y `*.p12` están en `.gitignore`. Usar `config.properties.example`.
- `application-dev.properties` es local (gitignore); plantilla: `application-dev.properties.example`.

## Anti-patrones a evitar

- HTTP directo en componentes de dominio.
- Controllers con orquestación multi-dominio de miles de líneas.
- DTOs anidados dentro de mappers.
- Duplicar stubs JAXB entre `gos-service` y `gosWS-service` (extraer a `gos-common` solo al tocar SOAP legacy).
- Seguir engordando god-files abiertos.

## Utilidades (`com.greenaall.util`)

Paquetes temáticos en curso:

| Paquete | Contenido |
|---------|-----------|
| `util.fecha` | `UtilDate` (canónico); shim `@Deprecated` en `util.UtilDate` |
| `util.fiscal` | `GestionFiscalConstantes` |
| `util.texto` / `util.pdf` | Destino previsto de `Cadena`, `ConvertirPDF` |

Nuevas utilidades deben ir al paquete temático correspondiente.
