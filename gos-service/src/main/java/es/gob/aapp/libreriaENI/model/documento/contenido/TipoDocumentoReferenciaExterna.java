package es.gob.aapp.libreriaENI.model.documento.contenido;


/**
 * Modelo para el Tipo Referencia Externa de la versión 2 de ENI
 */
public class TipoDocumentoReferenciaExterna {

    private String referencia;
    private String valorHuella;
    private String funcionResumen;


    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getValorHuella() {
        return valorHuella;
    }

    public void setValorHuella(String valorHuella) {
        this.valorHuella = valorHuella;
    }

    public String getFuncionResumen() {
        return funcionResumen;
    }

    public void setFuncionResumen(String funcionResumen) {
        this.funcionResumen = funcionResumen;
    }
}
