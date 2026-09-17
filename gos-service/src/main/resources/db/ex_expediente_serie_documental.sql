-- Añade la Serie Documental (Código SIA) por expediente, usada como Clasificación
-- en el preingreso ARCHIVE (RedSARA). Ejecutar en la BD iflowprue si la columna
-- no existe aún.

ALTER TABLE ex_expediente ADD COLUMN serie_documental VARCHAR(50) NULL;
