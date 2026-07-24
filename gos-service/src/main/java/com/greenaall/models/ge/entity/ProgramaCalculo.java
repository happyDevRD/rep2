package com.greenaall.models.ge.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ge_programa_calculo")
public class ProgramaCalculo implements Serializable {

	private static final long serialVersionUID = 30033559710974570L;

	@Id
	@Column(name = "cod_progr")
	private String codProgr;

	@Column(name = "des_progr")
	private String desProgr;

	@Column(name = "modulo")
	private Short modulo;

	@Column(name = "def_progr")
	private Object defProgr;

	@Column(name = "id_gru_param")
	private Long idGruParam;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public String getCodProgr() {
		return codProgr;
	}

	public void setCodProgr(String codProgr) {
		this.codProgr = codProgr;
	}

	public String getDesProgr() {
		return desProgr;
	}

	public void setDesProgr(String desProgr) {
		this.desProgr = desProgr;
	}

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public Object getDefProgr() {
		return defProgr;
	}

	public void setDefProgr(Object defProgr) {
		this.defProgr = defProgr;
	}

	public Long getIdGruParam() {
		return idGruParam;
	}

	public void setIdGruParam(Long idGruParam) {
		this.idGruParam = idGruParam;
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

	public ProgramaCalculo() {
		super();
	}

}
