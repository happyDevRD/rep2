package com.greenaall.models.ge.entity;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ge_cargo_firma")
public class CargoFirma implements Serializable {

	private static final long serialVersionUID = -2940401803560499324L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_cargo")
	private Integer idCargo;
	
	@Column(name = "cod_cargo")
	private Short codCargo;
	
	@Column(name = "cod_entid")
	private Short codEntid;
	
	@Column(name = "id_car_defec")
	private Integer idCarDefec;

	@Column(name = "car_plata")
	private String carPlata;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public Short getCodCargo() {
		return codCargo;
	}

	public void setCodCargo(Short codCargo) {
		this.codCargo = codCargo;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Integer getIdCarDefec() {
		return idCarDefec;
	}

	public void setIdCarDefec(Integer idCarDefec) {
		this.idCarDefec = idCarDefec;
	}

	public String getCarPlata() {
		return carPlata;
	}

	public void setCarPlata(String carPlata) {
		this.carPlata = carPlata;
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

	public CargoFirma() {
		super();
	}
	
}
