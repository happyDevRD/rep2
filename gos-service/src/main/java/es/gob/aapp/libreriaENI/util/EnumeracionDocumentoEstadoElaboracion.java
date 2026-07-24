package es.gob.aapp.libreriaENI.util;

import java.io.Serializable;

public enum EnumeracionDocumentoEstadoElaboracion implements Serializable {

	/**
	- EE01 - Original. 	
	- EE02 - Copia electrónica auténtica con cambio de formato.	
	- EE03 - Copia electrónica auténtica de documento papel. 	
	- EE04 - Copia electrónica parcial auténtica.	
	- EE99 - Otros.
	**/
	EE_01("EE01"),

	EE_02("EE02"),

	EE_03("EE03"),

	EE_04("EE04"),

	EE_99("EE99");
	
    private final String value;

    EnumeracionDocumentoEstadoElaboracion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumeracionDocumentoEstadoElaboracion fromValue(String v) {
        for (EnumeracionDocumentoEstadoElaboracion c: EnumeracionDocumentoEstadoElaboracion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
