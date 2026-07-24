package es.gob.aapp.libreriaENI.model.documento.metadatos;


import es.gob.aapp.libreriaENI.util.EnumeracionDocumentoTipoDocumental;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class ObjetoDocumentoMetadatos {

    // Para los Metadatos
    private String versionNTI;
    private String identificadorDocumento;
    private List<String> organo;
    private GregorianCalendar fechaCaptura;
    private boolean origenCiudadanoAdministracion;
    private ObjetoDocumentoMetadatosEstadoElaboracion estadoElaboracion;
    private EnumeracionDocumentoTipoDocumental tipoDocumental;

    // Para los Metadatos Adicionales
    private List<ObjetoMetadatoAdicional> metadatosAdicionales;

    public String getVersionNTI() {
        return versionNTI;
    }

    public void setVersionNTI(String versionNTI) {
        this.versionNTI = versionNTI;
    }

    public String getIdentificadorDocumento() {
        return identificadorDocumento;
    }

    public void setIdentificadorDocumento(String identificadorDocumento) {
        this.identificadorDocumento = identificadorDocumento;
    }

    public List<String> getOrgano() {
        if (this.organo == null) {
            this.organo = new ArrayList<>();
        }
        return organo;
    }

    public void setOrgano(List<String> organo) {
        this.organo = organo;
    }

    public GregorianCalendar getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(GregorianCalendar fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public boolean getOrigenCiudadanoAdministracion() {
        return origenCiudadanoAdministracion;
    }

    public void setOrigenCiudadanoAdministracion(boolean origenCiudadanoAdministracion) {
        this.origenCiudadanoAdministracion = origenCiudadanoAdministracion;
    }

    public ObjetoDocumentoMetadatosEstadoElaboracion getEstadoElaboracion() {
        return estadoElaboracion;
    }

    public void setEstadoElaboracion(ObjetoDocumentoMetadatosEstadoElaboracion estadoElaboracion) {
        this.estadoElaboracion = estadoElaboracion;
    }

    public EnumeracionDocumentoTipoDocumental getTipoDocumental() {
        return tipoDocumental;
    }

    public void setTipoDocumental(EnumeracionDocumentoTipoDocumental tipoDocumental) {
        this.tipoDocumental = tipoDocumental;
    }

    public List<ObjetoMetadatoAdicional> getMetadatosAdicionales() {
        if (this.metadatosAdicionales == null) {
            this.metadatosAdicionales = new ArrayList<>();
        }
        return metadatosAdicionales;
    }

    public void setMetadatosAdicionales(List<ObjetoMetadatoAdicional> metadatosAdicionales) {
        this.metadatosAdicionales = metadatosAdicionales;
    }
}
