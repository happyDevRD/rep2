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
@Table(name = "ge_proceso_firmado")
public class ProcesoFirmado implements Serializable{
	/* Constantes de Tipo de Firmado para Plantillas */

	private static final long serialVersionUID = 2365229355031450303L;
	/** Constante de Tipo de Firmado para una Plantilla: No Firmable */
	public static final Short TIP_FIRMA_NO_FIRMABLE = 0;
	/** Constante de Tipo de Firmado: Atendido */
	public static final Short TIP_FIRMA_ATENDIDA = 1;
	/** Constante de Tipo de Firmado: Desatendido */
	public static final Short TIP_FIRMA_DESATENDIDA = 2;
	/** Constante de Tipo de Firmado para una Plantilla: Ambos */
	public static final Short TIP_FIRMA_AMBOS = 3;

	/**
	 * Método ayudante.
	 * 
	 * @param tipoFirma
	 * @return
	 */
	public static boolean esFirmable(Short tipoFirma) {
		return TIP_FIRMA_ATENDIDA.equals(tipoFirma)
				|| TIP_FIRMA_DESATENDIDA.equals(tipoFirma)
				|| TIP_FIRMA_AMBOS.equals(tipoFirma);
	}

	/**
	 * Método ayudante.
	 * 
	 * @param tipoFirma
	 * @return
	 */
	public static boolean esDesatendido(Short tipoFirma) {
		return TIP_FIRMA_DESATENDIDA.equals(tipoFirma)
				|| TIP_FIRMA_AMBOS.equals(tipoFirma);
	}

	/**
	 * Método ayudante.
	 * 
	 * @param tipoFirma
	 * @return
	 */
	public static boolean esAtendido(Short tipoFirma) {
		return TIP_FIRMA_ATENDIDA.equals(tipoFirma)
				|| TIP_FIRMA_AMBOS.equals(tipoFirma);
	}

	/* Constantes de Control sobre Firmado Desatendido */

	/**
	 * Constante de Control sobre Firmado Desatendido: Proceso Abierto.
	 * 
	 * <p>
	 * Todos los usuarios tienen acceso
	 * </p>
	 */
	public static final Short CTRL_DESAT_ABIERTO = 0;
	/**
	 * Constante de Control sobre Firmado Desatendido: Proceso Restringido.
	 * 
	 * <p>
	 * Sólo los usuarios designados tienen acceso
	 * </p>
	 */
	public static final Short CTRL_DESAT_RESTRINGIDO = 1;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pro_firma")
    private Integer idProFirma;

    @Basic(optional = false)
    @Column(name = "tip_firma")
    private Short tipFirma;

    @Column(name = "con_desat")
    private Short conDesat;

    @Column(name = "activo")
    private Short activo;

    @Column(name = "des_circu")
    private String descripcionCircuito;
    
    @Column(name = "modulo")
    private Short modulo;

    @Column(name = "usu_contr")
    private String usuContr;

    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

    @Column(name = "cod_entid")
    private Short codEntid;
    
    @Column(name = "plantilla")
    private String plantilla;
    
    @Column(name = "salida")
    private Short salida;


    public ProcesoFirmado(Integer idProFirma) {
        this.idProFirma = idProFirma;
    }

    public ProcesoFirmado(Integer idProFirma, String descripcionCircuito) {
        this(idProFirma);
        this.descripcionCircuito = descripcionCircuito;
    }

	public ProcesoFirmado() {
		super();
	}

	public Integer getIdProFirma() {
		return idProFirma;
	}

	public void setIdProFirma(Integer idProFirma) {
		this.idProFirma = idProFirma;
	}

	public Short getTipFirma() {
		return tipFirma;
	}

	public void setTipFirma(Short tipFirma) {
		this.tipFirma = tipFirma;
	}

	public Short getConDesat() {
		return conDesat;
	}

	public void setConDesat(Short conDesat) {
		this.conDesat = conDesat;
	}

	public Short getActivo() {
		return activo;
	}

	public void setActivo(Short activo) {
		this.activo = activo;
	}

	public String getDescripcionCircuito() {
		return descripcionCircuito;
	}

	public void setDescripcionCircuito(String descripcionCircuito) {
		this.descripcionCircuito = descripcionCircuito;
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

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public String getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
	}

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public Short getSalida() {
		return salida;
	}

	public void setSalida(Short salida) {
		this.salida = salida;
	}

	
}
