package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_tarea_historico_tramite_expediente")
public class TareaHistoricoTramiteExpediente implements Serializable {

	private static final long serialVersionUID = -7936524545958612208L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fec_tarea")
	private Date fecTarea;
	
	@Column(name = "archivo")
	private Long codArchi;
	
	@Column(name = "tarea")
	private Long tarea;

	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "descripcion_indicativa")
	private String desIndic;
	
	@Column(name = "descripcion_tarea")
	private String desTarea;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

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

	public Long getCodArchi() {
		return codArchi;
	}

	public void setCodArchi(Long codArchi) {
		this.codArchi = codArchi;
	}

	public Long getTarea() {
		return tarea;
	}

	public void setTarea(Long tarea) {
		this.tarea = tarea;
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

	public Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(Date fecContr) {
		this.fecContr = fecContr;
	}

	public TareaHistoricoTramiteExpediente() {
		super();
	}
	
}
