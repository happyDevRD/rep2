-- Tabla de datos de contacto de persona/entidad.
-- No existía script de creación en el repo; generada a partir de la entidad JPA
-- (PersonaContacto.java + PersonaContactoPK.java) porque faltaba en el esquema
-- local (iflow_dev) y rompía con 500 la consulta de detalle de solicitud/interesado
-- (PersonaContactoDao.findByIdHisPersoAndIdPerso, sin manejo de error, a diferencia
-- de gf_envio_inside). Verificar longitudes de varchar contra el esquema real antes
-- de aplicar en un entorno que no sea de desarrollo local.

CREATE TABLE IF NOT EXISTS pe_persona_contacto (
    id_his_perso   BIGINT       NOT NULL,
    id_perso       BIGINT       NOT NULL,
    num_orden      SMALLINT     NOT NULL,
    tip_conta      SMALLINT     NULL,
    dat_conta      VARCHAR(200) NULL,
    rec_notif      SMALLINT     NULL,
    observaciones  VARCHAR(500) NULL,
    usu_contr      VARCHAR(50)  NULL,
    fec_contr      DATETIME     NULL,
    PRIMARY KEY (id_his_perso, id_perso, num_orden)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
