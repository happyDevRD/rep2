-- Tabla de integración con ARCHIVE (archivo definitivo RedSARA)
-- Ejecutar en la BD iflowprue si la tabla no existe aún.
-- Sin FK para poder crearla aunque el nombre PK de ex_expediente varíe entre entornos.

CREATE TABLE IF NOT EXISTS gf_envio_archive (
    id_envio              BIGINT       NOT NULL AUTO_INCREMENT,
    id_expediente         BIGINT       NOT NULL,
    operacion             VARCHAR(80)  NOT NULL,
    estado_envio          VARCHAR(30)  NOT NULL DEFAULT 'PENDIENTE',
    codigo_respuesta      VARCHAR(20)  NULL,
    descripcion_respuesta VARCHAR(500) NULL,
    identificador_eni     VARCHAR(200) NULL,
    csv                   VARCHAR(200) NULL,
    modo_dry_run          CHAR(1)      NOT NULL DEFAULT 'N',
    mensaje_error         VARCHAR(500) NULL,
    activo                CHAR(1)      NOT NULL DEFAULT 'S',
    usu_contr             VARCHAR(50)  NULL,
    fec_envio             DATETIME     NULL,
    fec_contr             DATETIME     NULL,
    PRIMARY KEY (id_envio),
    KEY idx_gf_envio_archive_expediente (id_expediente),
    KEY idx_gf_envio_archive_estado (estado_envio)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
