package com.greenaall.models.ex.dto;

import java.io.Serializable;
import java.util.Date;

public class TareaHistoricoTramiteExpedienteDto implements Serializable {

	private static final long serialVersionUID = 1345024060826962033L;
	private Long id;
	private Date fecTarea;
	private Long archivo;
	private String desArchi;
	private Long idTarea;
	private Short numTarea;
	private String usuario;
	private String desIndic;
	private String desTarea;
	private String usuContr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecTarea() {
		return fecTarea;
	}

	public void setFecTarea(Date fecTarea) {
		this.fecTarea = fecTarea;
	}

	public Long getArchivo() {
		return archivo;
	}

	public void setArchivo(Long archivo) {
		this.archivo = archivo;
	}

	public String getDesArchi() {
		return desArchi;
	}

	public void setDesArchi(String desArchi) {
		this.desArchi = desArchi;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDesIndic() {
		return desIndic;
	}

	public void setDesIndic(String desIndic) {
		this.desIndic = desIndic;
	}

	public String getDesTarea() {
		return desTarea;
	}

	public void setDesTarea(String desTarea) {
		this.desTarea = desTarea;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public Long getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(Long idTarea) {
		this.idTarea = idTarea;
	}

	public Short getNumTarea() {
		return numTarea;
	}

	public void setNumTarea(Short numTarea) {
		this.numTarea = numTarea;
	}

}
