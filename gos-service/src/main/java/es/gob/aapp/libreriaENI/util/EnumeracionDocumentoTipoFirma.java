package es.gob.aapp.libreriaENI.util;

/**
 * Enumeracion para los Tipos de Firma de un objeto ENI
 */
public enum EnumeracionDocumentoTipoFirma {


    SIN_FIRMAR("SIN_FIRMAR"),
    TF_01("TF01"),      //CSV
    TF_02("TF02"),      //XAdES_Detached
    TF_03("TF03"),      //XAdES_Enveloped
//    TF_04("TF04"),      //CAdES_Detached
    TF_05("TF05"),      //CAdES_Attached
    TF_06("TF06"),      //PAdES
    TF_07("TF07"),      //XadES_Manifest
    TF_08("TF08");      //Firma Basica (Versión ENI 2)
    private final String value;

    EnumeracionDocumentoTipoFirma(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumeracionDocumentoTipoFirma fromValue(String v) {
        for (EnumeracionDocumentoTipoFirma c: EnumeracionDocumentoTipoFirma.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException("No existe el Tipo de Firma: " + v);
    }

}
