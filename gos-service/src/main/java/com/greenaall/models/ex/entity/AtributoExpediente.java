package com.greenaall.models.ex.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_atributo_expediente")
@IdClass(AtributoExpedientePK.class)
public class AtributoExpediente implements Serializable{

	private static final long serialVersionUID = 8080534375804597819L;

	@Id
	@Column(name = "id_grupo")
    private Long idGrupo;
	
	@Id
	@Column(name = "eti_gru_atrib")
	private String etiGruAtrib;
	
	@Id
	@Column(name = "id_exped")
    private Long idExped;

	@Column(name = "valor")
	private String valor;
	
	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
    @Temporal(TemporalType.DATE)
	private java.util.Date fecContr;

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getEtiGruAtrib() {
		return etiGruAtrib;
	}

	public void setEtiGruAtrib(String etiGruAtrib) {
		this.etiGruAtrib = etiGruAtrib;
	}

	public Long getIdExped() {
		return idExped;
	}

	public void setIdExped(Long idExped) {
		this.idExped = idExped;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public java.util.Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(java.util.Date fecContr) {
		this.fecContr = fecContr;
	}

	public AtributoExpediente() {
		super();
	}

}
