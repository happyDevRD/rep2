package com.greenaall.models.ge.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

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
@Table(name = "ge_peticion_firma")
public class PeticionFirma implements Serializable {

	public static final String PLATAFORMA_PORTAFIRMA_NOMBRE = "Portafirma";
	public static final String PLATAFORMA_EFIRMA_NOMBRE = "e-firma";

	public static final Short PROCESO_CODIGO_VARIACION = 22;

	public static final Short PLATAFORMA_EFIRMA = 1;
	public static final Short PLATAFORMA_PORTAFIRMA = 2;

	public static final Short PETICION_ESTADO_VIVO = 1;
	public static final Short PETICION_ESTADO_CONCLUIDO = 2;
	public static final Short PETICION_ESTADO_ERROR = 3;

	public static final Short EFIRMA_ESTADO_PENDIENTE = 0;
	public static final Short EFIRMA_ESTADO_FIRMADO = 3;
	public static final Short EFIRMA_ESTADO_DEVUELTO = 4;
	public static final Short EFIRMA_ESTADO_NO_ENVIADO = -1;

	public static final Short PORTAFIRMA_ESTADO_PENDIENTE = 0;
	public static final Short PORTAFIRMA_ESTADO_NUEVO = 1;
	public static final Short PORTAFIRMA_ESTADO_LEIDO = 2;
	public static final Short PORTAFIRMA_ESTADO_EN_ESPERA = 3;
	public static final Short PORTAFIRMA_ESTADO_ENCOLADO = 4;
	public static final Short PORTAFIRMA_ESTADO_FIRMADO = 5;
	public static final Short PORTAFIRMA_ESTADO_DEVUELTO = 6;
	public static final Short PORTAFIRMA_ESTADO_CADUCADO = 7;
	public static final Short PORTAFIRMA_ESTADO_PREFIRMADO = 8;
	public static final Short PORTAFIRMA_ESTADO_NOTIFICADO = 9;
	public static final Short PORTAFIRMA_ESTADO_NO_NOTIFI = 10;
	public static final Short PORTAFIRMA_ESTADO_VISTOBUENO = 11;
	public static final Short PORTAFIRMA_ESTADO_NO_ENVIADO = -1;

	public static final Short[] EFIRMA_PETICION_CONCLUIDO = new Short[] { EFIRMA_ESTADO_FIRMADO, //
			EFIRMA_ESTADO_DEVUELTO //
	};

	public static final Short[] EFIRMA_PETICION_ERROR = new Short[] { EFIRMA_ESTADO_NO_ENVIADO //
	};

	public static final Short[] EFIRMA_ESTADOS_PETICION_VIVO = new Short[] { EFIRMA_ESTADO_PENDIENTE //
	};

	public static final Short[] PORTAFIRMA_ESTADOS_PETICION_CONCLUIDO = new Short[] { PORTAFIRMA_ESTADO_CADUCADO, //
			PORTAFIRMA_ESTADO_DEVUELTO, //
			PORTAFIRMA_ESTADO_FIRMADO, //
			PORTAFIRMA_ESTADO_VISTOBUENO //
	};

	public static final Short[] PORTAFIRMA_ESTADOS_PETICION_VIVO = new Short[] { PORTAFIRMA_ESTADO_NUEVO, //
			PORTAFIRMA_ESTADO_EN_ESPERA, //
			PORTAFIRMA_ESTADO_ENCOLADO, //
			PORTAFIRMA_ESTADO_LEIDO, //
			PORTAFIRMA_ESTADO_NO_NOTIFI, //
			PORTAFIRMA_ESTADO_NOTIFICADO //
	};

	public static final Short[] PORTAFIRMA_PETICION_ERROR = new Short[] { PORTAFIRMA_ESTADO_NO_ENVIADO //
	};

	public static List<Short> getEstadosPeticion(Short plataforma, Short peticionEstado) {

		if (plataforma.equals(PLATAFORMA_EFIRMA)) {
			if (peticionEstado.equals(PETICION_ESTADO_VIVO)) {
				return Arrays.asList(EFIRMA_ESTADOS_PETICION_VIVO);
			} else if (peticionEstado.equals(PETICION_ESTADO_CONCLUIDO)) {
				return Arrays.asList(EFIRMA_PETICION_CONCLUIDO);
			} else if (peticionEstado.equals(PETICION_ESTADO_ERROR)) {
				return Arrays.asList(EFIRMA_PETICION_ERROR);
			}
		} else if (plataforma.equals(PLATAFORMA_PORTAFIRMA)) {
			if (peticionEstado.equals(PETICION_ESTADO_VIVO)) {
				return Arrays.asList(PORTAFIRMA_ESTADOS_PETICION_VIVO);
			} else if (peticionEstado.equals(PETICION_ESTADO_CONCLUIDO)) {
				return Arrays.asList(PORTAFIRMA_ESTADOS_PETICION_CONCLUIDO);
			} else if (peticionEstado.equals(PETICION_ESTADO_ERROR)) {
				return Arrays.asList(PORTAFIRMA_PETICION_ERROR);
			}
		}

		return null;
	}

	private static final long serialVersionUID = -1553683728470724114L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_peticion")
	private Long idPeticion;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "peticionario")
	private String peticionario;

	@Column(name = "plataforma")
	private Short plataforma;

	@Column(name = "tip_firma")
	private Short tipFirma;

	@Column(name = "id_pet_plata")
	private String idPetPlata;

	@Column(name = "referencia")
	private String referencia;

	@Column(name = "asunto")
	private String asunto;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "fec_peticion")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecPeticion;

	@Column(name = "fec_inicio")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecInicio;

	@Column(name = "fec_fin")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecFin;

	@Column(name = "fec_estado")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecEstado;

	@Column(name = "estado")
	private Short estado;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecContr;

	public Long getIdPeticion() {
		return idPeticion;
	}

	public void setIdPeticion(Long idPeticion) {
		this.idPeticion = idPeticion;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public String getPeticionario() {
		return peticionario;
	}

	public void setPeticionario(String peticionario) {
		this.peticionario = peticionario;
	}

	public Short getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Short plataforma) {
		this.plataforma = plataforma;
	}

	public Short getTipFirma() {
		return tipFirma;
	}

	public void setTipFirma(Short tipFirma) {
		this.tipFirma = tipFirma;
	}

	public String getIdPetPlata() {
		return idPetPlata;
	}

	public void setIdPetPlata(String idPetPlata) {
		this.idPetPlata = idPetPlata;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public java.util.Date getFecPeticion() {
		return fecPeticion;
	}

	public void setFecPeticion(java.util.Date fecPeticion) {
		this.fecPeticion = fecPeticion;
	}

	public java.util.Date getFecInicio() {
		return fecInicio;
	}

	public void setFecInicio(java.util.Date fecInicio) {
		this.fecInicio = fecInicio;
	}

	public java.util.Date getFecFin() {
		return fecFin;
	}

	public void setFecFin(java.util.Date fecFin) {
		this.fecFin = fecFin;
	}

	public java.util.Date getFecEstado() {
		return fecEstado;
	}

	public void setFecEstado(java.util.Date fecEstado) {
		this.fecEstado = fecEstado;
	}

	public Short getEstado() {
		return estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
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

	public PeticionFirma() {
		super();
	}
	
//	private Short estPeticion;

	/*
	 * Atributos de busqueda
	 */
/*	private boolean usoBusqueda = false;
	private Short estPetBusqueda;
	private java.util.Date fecDesdeEstado;
	private java.util.Date fecDesdePetic;
	private java.util.Date fecHastaEstado;
	private java.util.Date fecHastaPetic;
	private java.util.Date fecDesdeInicio;
	private java.util.Date fecHastaInicio;
	private java.util.Date fecDesdeFin;
	private java.util.Date fecHastaFin;*/

/*	public PeticionFirma(PeticionFirma peticion) {
		usoBusqueda = peticion.usoBusqueda;
		idPeticion = peticion.idPeticion;
		codEntid = peticion.codEntid;
		peticionario = peticion.peticionario;
		plataforma = peticion.plataforma;
		tipFirma = peticion.tipFirma;
		idPetPlata = peticion.idPetPlata;
		referencia = peticion.referencia;
		asunto = peticion.asunto;
		observaciones = peticion.observaciones;
		fecInicio = peticion.fecInicio == null ? null : new Date(peticion.fecInicio.getTime());
		fecFin = peticion.fecFin == null ? null : new Date(peticion.fecFin.getTime());
		fecPeticion = peticion.fecPeticion == null ? null : new Date(peticion.fecPeticion.getTime());
		fecEstado = peticion.fecEstado == null ? null : new Date(peticion.fecEstado.getTime());
		estado = peticion.estado;
		usuContr = peticion.usuContr;
		fecContr = peticion.fecContr == null ? null : new Date(peticion.fecContr.getTime());
		estPeticion = peticion.estPeticion;
		estPetBusqueda = peticion.estPetBusqueda;
		fecDesdeEstado = peticion.fecDesdeEstado == null ? null : new Date(peticion.fecDesdeEstado.getTime());
		fecDesdePetic = peticion.fecDesdePetic == null ? null : new Date(peticion.fecDesdePetic.getTime());
		fecHastaEstado = peticion.fecHastaEstado == null ? null : new Date(peticion.fecHastaEstado.getTime());
		fecHastaPetic = peticion.fecHastaPetic == null ? null : new Date(peticion.fecHastaPetic.getTime());
		fecDesdeInicio = peticion.fecDesdeInicio == null ? null : new Date(peticion.fecDesdeInicio.getTime());
		fecHastaInicio = peticion.fecHastaInicio == null ? null : new Date(peticion.fecHastaInicio.getTime());
		fecDesdeFin = peticion.fecDesdeFin == null ? null : new Date(peticion.fecDesdeFin.getTime());
		fecHastaFin = peticion.fecHastaFin == null ? null : new Date(peticion.fecHastaFin.getTime());
	}*/
}
