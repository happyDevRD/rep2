package com.greenaall.models.ge.entity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class MetadatoGrupoAtributoPK implements Serializable{

	private static final long serialVersionUID = 7143591063010132710L;

	@Column(name = "id_grupo")
	private java.lang.Long idGrupo;
	
	@Column(name = "eti_gru_atrib")
	private String etiGruAtrib;

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

	public MetadatoGrupoAtributoPK() {
		super();
	}
	
}
