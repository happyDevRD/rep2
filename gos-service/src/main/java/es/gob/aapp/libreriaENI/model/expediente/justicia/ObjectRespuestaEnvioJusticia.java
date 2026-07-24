package es.gob.aapp.libreriaENI.model.expediente.justicia;

import java.util.Date;

public class ObjectRespuestaEnvioJusticia {

	private Integer id; 
    private String auditoriaEsbAplicacion;
    private String auditoriaEsbModulo;
    private String auditoriaEsbServicio;
    private String auditoriaEsbMarcaTiempo;
    private String ack;
    private String codigoEnvio;
    private String mensaje;
	private String descripcionEstado;
    private String codigoUnidadOrganoRemitente;
    private String estado;
    private byte[] resguardo;
    private Integer idExpediente;
    private String identificadorExpediente;
    private Integer versionExpediente;
    private Date fechaNotificacionMJU;
    private String codigoDir3OrganoJudicial;
    private String comentario;
    private Integer nIntentosEstado;

	public ObjectRespuestaEnvioJusticia() {
    	super();
	}

	public ObjectRespuestaEnvioJusticia(
			String auditoriaEsbAplicacion, String auditoriaEsbModulo,
			String auditoriaEsbServicio, String auditoriaEsbMarcaTiempo,
			String ack, String codigoEnvio, String mensaje) {
		
		this.auditoriaEsbAplicacion = auditoriaEsbAplicacion;
		this.auditoriaEsbModulo = auditoriaEsbModulo;
		this.auditoriaEsbServicio = auditoriaEsbServicio;
		this.auditoriaEsbMarcaTiempo = auditoriaEsbMarcaTiempo;
		this.ack = ack;
		this.codigoEnvio = codigoEnvio;
		this.mensaje = mensaje;
	
	}



	public String getAuditoriaEsbAplicacion() {
		return auditoriaEsbAplicacion;
	}

	public void setAuditoriaEsbAplicacion(String auditoriaEsbAplicacion) {
		this.auditoriaEsbAplicacion = auditoriaEsbAplicacion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuditoriaEsbModulo() {
		return auditoriaEsbModulo;
	}

	public void setAuditoriaEsbModulo(String auditoriaEsbModulo) {
		this.auditoriaEsbModulo = auditoriaEsbModulo;
	}


	public String getAuditoriaEsbServicio() {
		return auditoriaEsbServicio;
	}

	public void setAuditoriaEsbServicio(String auditoriaEsbServicio) {
		this.auditoriaEsbServicio = auditoriaEsbServicio;
	}

	
	public String getAuditoriaEsbMarcaTiempo() {
		return auditoriaEsbMarcaTiempo;
	}

	public void setAuditoriaEsbMarcaTiempo(String auditoriaEsbMarcaTiempo) {
		this.auditoriaEsbMarcaTiempo = auditoriaEsbMarcaTiempo;
	}

	
	public String getAck() {
		return ack;
	}

	public void setAck(String ack) {
		this.ack = ack;
	}

	
	public String getCodigoEnvio() {
		return codigoEnvio;
	}

	public void setCodigoEnvio(String codigoEnvio) {
		this.codigoEnvio = codigoEnvio;
	}

	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	public String getCodigoUnidadOrganoRemitente() {
		return codigoUnidadOrganoRemitente;
	}

	public void setCodigoUnidadOrganoRemitente(String codigoUnidadOrganoRemitente) {
		this.codigoUnidadOrganoRemitente = codigoUnidadOrganoRemitente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcionEstado() {
		return descripcionEstado;
	}

	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}

	public byte[] getResguardo() {
		return resguardo;
	}

	public void setResguardo(byte[] resguardo) {
		this.resguardo = resguardo;
	}

	public Integer getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Integer idExpediente) {
		this.idExpediente = idExpediente;
	}

	public String getIdentificadorExpediente() {
		return identificadorExpediente;
	}

	public void setIdentificadorExpediente(String identificadorExpediente) {
		this.identificadorExpediente = identificadorExpediente;
	}

	public Integer getVersionExpediente() {
		return versionExpediente;
	}

	public void setVersionExpediente(Integer versionExpediente) {
		this.versionExpediente = versionExpediente;
	}

	public Date getFechaNotificacionMJU() {
		return fechaNotificacionMJU;
	}

	public void setFechaNotificacionMJU(Date fechaNotificacionMJU) {
		this.fechaNotificacionMJU = fechaNotificacionMJU;
	}
	
	public String getCodigoDir3OrganoJudicial() {
		return codigoDir3OrganoJudicial;
	}

	public void setCodigoDir3OrganoJudicial(String codigoDir3OrganoJudicial) {
		this.codigoDir3OrganoJudicial = codigoDir3OrganoJudicial;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public Integer getnIntentosEstado() {
		return nIntentosEstado;
	}

	public void setnIntentosEstado(Integer nIntentosEstado) {
		this.nIntentosEstado = nIntentosEstado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ObjectRespuestaEnvioJusticia [id=");
		builder.append(id);
		builder.append(", AuditoriaEsbAplicacion=");
		builder.append(auditoriaEsbAplicacion);
		builder.append(", AuditoriaEsbModulo=");
		builder.append(auditoriaEsbModulo);
		builder.append(", AuditoriaEsbServicio=");
		builder.append(auditoriaEsbServicio);
		builder.append(", AuditoriaEsbMarcaTiempo=");
		builder.append(auditoriaEsbMarcaTiempo);
		builder.append(", ack=");
		builder.append(ack);
		builder.append(", codigoEnvio=");
		builder.append(codigoEnvio);
		builder.append(", mensaje=");
		builder.append(mensaje);
		builder.append(", codigoUnidadOrganoRemitente=");
		builder.append(codigoUnidadOrganoRemitente);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", comentario=");
		builder.append(comentario);
		builder.append(", nIntentosEstado=");
		builder.append(nIntentosEstado);
		builder.append("]");
		return builder.toString();
	}
}
