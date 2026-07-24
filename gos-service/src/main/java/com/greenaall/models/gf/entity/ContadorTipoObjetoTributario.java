package com.greenaall.models.gf.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "gf_con_tip_obj_tribu")
public class ContadorTipoObjetoTributario implements Serializable {

	private static final long serialVersionUID = 5894934300441446629L;

	@Id
	@Column(name = "id_tip_obj_tribu")
	private Long idTipObjTribu;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "contador")
	private Long contador;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdTipObjTribu() {
		return idTipObjTribu;
	}

	public void setIdTipObjTribu(Long idTipObjTribu) {
		this.idTipObjTribu = idTipObjTribu;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Long getContador() {
		return contador;
	}

	public void setContador(Long contador) {
		this.contador = contador;
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

	public ContadorTipoObjetoTributario() {
		super();
	}

}
