package com.greenaall.models.gf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "gf_tarifa_md")
@IdClass(GfTarifaMdPK.class)
public class GfTarifaMd implements Serializable {

	private static final long serialVersionUID = 668567979117510379L;

	@Id
	@Column(name = "id_tarif")
	private Long idTarif;

	@Id
	@Column(name = "id_grupo")
	private Long idGrupo;

	@Id
	@Column(name = "eti_gru_atrib")
	private String etiGruAtrib;

	@Column(name = "valor")
	private String valor;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
    @Temporal(TemporalType.DATE)
	private java.util.Date fecContr;

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

	public GfTarifaMd() {
		super();
	}
	
}
