package com.greenaall.models.ex.entity;

import java.io.Serializable;
import java.util.Date;

import com.greenaall.models.ex.entity.enums.EnumFaseExpediente;
import com.greenaall.models.ex.entity.enums.EnumTipoPlazoTarea;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ex_tarea_procedimiento")
public class TareaProcedimiento implements Serializable {

	private static final long serialVersionUID = -5946097341045843831L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "procedimiento")
	private Long procedimiento;

	@Basic(optional = false)
	private String descripcion;
	@Enumerated(EnumType.STRING)
	@Basic(optional = false)
	private EnumFaseExpediente faseTarea;
	private Short plazo;
	@Enumerated(EnumType.STRING)
	private EnumTipoPlazoTarea tipoPlazo;
	@Basic(optional = false)
	private boolean tareaAutomatica;

	@Column(name = "plantilla_defecto_modulo")
	private Short plantillaDefectoModulo;

	@Column(name = "plantilla_defecto")
	private String plantillaDefecto;

	@Column(name = "proceso_firmado_defecto")
	private Integer procesoFirmadoDefecto;

	@Column(name = "accion")
	private Short accion;

	@Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public TareaProcedimiento(Long idTareaProcedimiento) {
		this.id = idTareaProcedimiento;
	}

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public EnumFaseExpediente getFaseTarea() {
		return faseTarea;
	}

	public void setFaseTarea(EnumFaseExpediente faseTarea) {
		this.faseTarea = faseTarea;
	}

	public Short getPlazo() {
		return plazo;
	}

	public void setPlazo(Short plazo) {
		this.plazo = plazo;
	}

	public EnumTipoPlazoTarea getTipoPlazo() {
		return tipoPlazo;
	}

	public void setTipoPlazo(EnumTipoPlazoTarea tipoPlazo) {
		this.tipoPlazo = tipoPlazo;
	}

	public boolean getTareaAutomatica() {
		return tareaAutomatica;
	}

	public void setTareaAutomatica(boolean tareaAutomatica) {
		this.tareaAutomatica = tareaAutomatica;
	}

	public Short getPlantillaDefectoModulo() {
		return plantillaDefectoModulo;
	}

	public void setPlantillaDefectoModulo(Short plantillaDefectoModulo) {
		this.plantillaDefectoModulo = plantillaDefectoModulo;
	}

	public String getPlantillaDefecto() {
		return plantillaDefecto;
	}

	public void setPlantillaDefecto(String plantillaDefecto) {
		this.plantillaDefecto = plantillaDefecto;
	}

	public Integer getProcesoFirmadoDefecto() {
		return procesoFirmadoDefecto;
	}

	public void setProcesoFirmadoDefecto(Integer procesoFirmadoDefecto) {
		this.procesoFirmadoDefecto = procesoFirmadoDefecto;
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

	public Short getAccion() {
		return accion;
	}

	public void setAccion(Short accion) {
		this.accion = accion;
	}

	public TareaProcedimiento() {
		super();
	}

}
