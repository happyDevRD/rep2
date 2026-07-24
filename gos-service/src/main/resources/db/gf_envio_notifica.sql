-- Tabla de integración con la plataforma Notifica (PAe/SARA)
-- Ejecutar en la BD iflowprue si la tabla no existe aún

CREATE TABLE IF NOT EXISTS gf_envio_notifica (
    id_envio          BIGINT       NOT NULL AUTO_INCREMENT,
    id_notif          BIGINT       NOT NULL,
    id_envio_externo  VARCHAR(100) NULL,
    estado_notifica   VARCHAR(50)  NULL,
    cod_dir3          VARCHAR(20)  NULL,
    procedimiento_sia VARCHAR(50)  NULL,
    fec_envio         DATETIME     NULL,
    fec_ult_sinc      DATETIME     NULL,
    fec_recepcion     DATETIME     NULL,
    id_acuse_externo  VARCHAR(100) NULL,
    mensaje_error     VARCHAR(500) NULL,
    activo            CHAR(1)      NOT NULL DEFAULT 'S',
    usu_contr         VARCHAR(50)  NULL,
    fec_contr         DATETIME     NULL,
    PRIMARY KEY (id_envio),
    KEY idx_gf_envio_notif_id_notif (id_notif),
    CONSTRAINT fk_gf_envio_notif_pe_notif
        FOREIGN KEY (id_notif) REFERENCES pe_notificacion (id_notif)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
