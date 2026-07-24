package com.greenaall.models.gf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;

public class GfTarifaMdPK implements Serializable {

	private static final long serialVersionUID = 1825867231139780878L;

	@Column(name = "id_tarif")
	private Long idTarif;

	@Column(name = "id_grupo")
	private Long idGrupo;

	@Column(name = "eti_gru_atrib")
	private String etiGruAtrib;

	public Long getIdTarif() {
		return idTarif;
	}

	public void setIdTarif(Long idTarif) {
		this.idTarif = idTarif;
	}

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

	public GfTarifaMdPK() {
		super();
	}

}
