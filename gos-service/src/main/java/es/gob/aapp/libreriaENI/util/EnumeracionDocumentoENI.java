package es.gob.aapp.libreriaENI.util;


/**
 * Enumeración con las diferentes versiones del ENI
 *
 */
public enum EnumeracionDocumentoENI {

    ENI_V1("http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e"),
    ENI_V2("http://administracionelectronica.gob.es/ENI/XSD/v2.0/documento-e");
	
    private final String value;

    EnumeracionDocumentoENI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumeracionDocumentoENI fromValue(String v) {
        for (EnumeracionDocumentoENI c: EnumeracionDocumentoENI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
    /*
     * Funcionalidad que nos indicar si es la versión 1 del ENI
     * @param v
     * @return
     */
    public static boolean isEniV1(String v) {
    	return fromValue(v) == ENI_V1;
    }
    
    /*
     * Funcionalidad que nos indicar si es la versión 2 del ENI
     * @param v
     * @return
     */
    public static boolean isEniV2(String v) {
    	return fromValue(v) == ENI_V2;
    }
}
