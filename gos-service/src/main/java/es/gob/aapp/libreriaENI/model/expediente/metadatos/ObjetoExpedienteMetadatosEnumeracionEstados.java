package es.gob.aapp.libreriaENI.model.expediente.metadatos;

public enum ObjetoExpedienteMetadatosEnumeracionEstados {

    E_01("E01"),
    E_02("E02"),
    E_03("E03");
	
    private final String value;

    ObjetoExpedienteMetadatosEnumeracionEstados(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjetoExpedienteMetadatosEnumeracionEstados fromValue(String v) {
        for (ObjetoExpedienteMetadatosEnumeracionEstados c: ObjetoExpedienteMetadatosEnumeracionEstados.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}