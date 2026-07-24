# iFlowServer — Backend

API de iFlow basada en microservicios Spring Boot. El frontend Angular consume los endpoints expuestos por el gateway.

## Requisitos

- JDK 17+
- MySQL
- Maven Wrapper incluido en cada módulo (`mvnw`)

## Servicios

| Módulo | Puerto | Función |
|--------|--------|---------|
| `discovery-service` | 8761 | Eureka |
| `gos-service` | 8082 | API GOS |
| `gateway-service` | 8090 | Gateway (`/api/gos/**`) |

Arrancar en este orden, dejando que cada servicio esté listo antes del siguiente:

```bash
cd discovery-service && ./mvnw spring-boot:run
cd gos-service && ./mvnw spring-boot:run
cd gateway-service && ./mvnw spring-boot:run
```

En Windows, usar `mvnw.cmd` en lugar de `./mvnw`.

## URLs

| Servicio | URL |
|----------|-----|
| API | http://localhost:8090/api/gos/ |
| Eureka | http://localhost:8761/ |

## Configuración

Cada módulo define su configuración en `src/main/resources/`.

Para desarrollo en `gos-service`, copiar el ejemplo y ajustar credenciales de base de datos:

```bash
cp gos-service/src/main/resources/application-dev.properties.example \
   gos-service/src/main/resources/application-dev.properties
```

No versionar ficheros con credenciales reales (ver `.gitignore`).

## Estructura

```
discovery-service/
gateway-service/
gos-service/
gosWS-service/
```
