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
@Table(name = "ex_materia_procedimiento")
public class MateriaProcedimiento implements Serializable{

	private static final long serialVersionUID = -7293280363446723114L;
	
	@Id
	@Column(name= "id_mat_proce")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatProce;
	
	@Column(name= "descripcion")
	private String descripcion;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdMatProce() {
		return idMatProce;
	}

	public void setIdMatProce(Long idMatProce) {
		this.idMatProce = idMatProce;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public MateriaProcedimiento() {
		super();
	}
}
