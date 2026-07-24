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
@Table(name = "ge_cargo_persona")
public class CargoPersona implements Serializable{

	private static final long serialVersionUID = 6064105286494597549L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_car_perso")
    private Integer idCarPerso;
	
	@Column(name = "id_cargo")
	private Integer idCargo;
	
	@Column(name = "id_his_titular")
	private Long idHisTitular;
	
	@Column(name = "id_titular")
	private Long idTitular;
	
	@Column(name = "id_his_suple")
	private Long idHisSuple;
	
	@Column(name = "id_suple")
	private Long idSuple;

    @Column(name = "suplencia")
    private Short suplencia;

    @Column(name = "usu_contr")
    private String usuContr;

    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

	public Integer getIdCarPerso() {
		return idCarPerso;
	}

	public void setIdCarPerso(Integer idCarPerso) {
		this.idCarPerso = idCarPerso;
	}
	
	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public Long getIdHisTitular() {
		return idHisTitular;
	}

	public void setIdHisTitular(Long idHisTitular) {
		this.idHisTitular = idHisTitular;
	}

	public Long getIdTitular() {
		return idTitular;
	}

	public void setIdTitular(Long idTitular) {
		this.idTitular = idTitular;
	}

	public Long getIdHisSuple() {
		return idHisSuple;
	}

	public void setIdHisSuple(Long idHisSuple) {
		this.idHisSuple = idHisSuple;
	}

	public Long getIdSuple() {
		return idSuple;
	}

	public void setIdSuple(Long idSuple) {
		this.idSuple = idSuple;
	}

	public Short getSuplencia() {
		return suplencia;
	}

	public void setSuplencia(Short suplencia) {
		this.suplencia = suplencia;
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

	public CargoPersona() {
		super();
	}
}
