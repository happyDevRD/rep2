package com.greenaall.models.ex.entity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class AtributoExpedientePK implements Serializable {

	private static final long serialVersionUID = 6933276884473803378L;

	@Column(name = "id_grupo")
	private java.lang.Long idGrupo;
	
	@Column(name = "eti_gru_atrib")
	private String etiGruAtrib;
	
	@Column(name = "id_exped")
    private Long idExped;

	public java.lang.Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(java.lang.Long idGrupo) {
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

	public AtributoExpedientePK() {
		super();
	}
	
}
