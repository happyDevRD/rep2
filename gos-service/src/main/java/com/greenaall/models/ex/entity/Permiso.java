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
@Table(name = "ex_permiso")
public class Permiso implements Serializable{

	private static final long serialVersionUID = 5049563700097221847L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "procedimiento")
    private Long procedimiento;
	
	@Column(name = "id_tar_proce")
    private Long idTarProce;
 
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "usu_contr")
   	private String usuContr;
   	@Column(name = "fec_contr")
   	@Temporal(TemporalType.TIMESTAMP)
   	private Date fecContr;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProcedimiento() {
		return procedimiento;
	}
	public void setProcedimiento(Long procedimiento) {
		this.procedimiento = procedimiento;
	}
	public Long getIdTarProce() {
		return idTarProce;
	}
	public void setIdTarProce(Long idTarProce) {
		this.idTarProce = idTarProce;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
	public Permiso() {
		super();
	}  	
	
}
