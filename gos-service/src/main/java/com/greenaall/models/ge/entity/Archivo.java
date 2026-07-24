package com.greenaall.models.ge.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ge_archivo")
public class Archivo implements Serializable {

	private static final long serialVersionUID = 6709657436897338894L;
	/** Constante de Estado de Archivo: emitido (1) */
	public final static Short EMITIDO = 1;
	/** Constante de Estado de Archivo: pendiente de firma (2) */
	public final static Short PENDIENTE_FIRMA = 2;
	/** Constante de Estado de Archivo: almacenado/custodiado (3) */
	public final static Short ALMACENADO_CUSTODIADO = 3;
	/** Constante de Estado de Archivo: devuelto (4) */
	public final static Short DEVUELTO = 4;
	

	/* Constantes de Tipo de Fichero */
	// TODO completar con otros valores encontrados en BD: 0, 70, otros...
	/** Constante de Tipo de Fichero: Archivo (1) */
	public final static Short TIPO_FICHERO_ARCHIVO = 1;
	/** Constante de Tipo de Fichero: Documento (2) */
	public final static Short TIPO_FICHERO_DOCUMENTO = 2;
	/** Constante de Tipo de Fichero: Anexo (3) */
	public final static Short TIPO_FICHERO_ANEXO = 3;
	/** Constante de Tipo de Fichero: Documento Electronico (4) */
	public final static Short TIPO_FICHERO_DOCUMENTO_ELECTRONICO = 4;
	public final static Short TIPO_FICHERO_JUSTIFICANTE_REGISTRO = 5;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "cod_archi")
	private Long codArchi;
	
	@Basic(optional = false)
	@Column(name = "modulo")
	private Short modulo;
	
	@Basic(optional = false)
	@Column(name = "des_archi")
	private String desArchi;
	
	@Column(name = "des_archi_flow")
	private String desArchiFlow;
	
	@Column(name = "cod_entid")
	private Short codEntid;
	
	@Basic(optional = false)
	@Column(name = "tip_fiche")
	private Short tipFiche;
	@Column(name = "cod_progr")
	private Long codProgr;
	@Column(name = "id_org_ele_ubica")
	private BigInteger idOrgEleUbica;
	@Column(name = "num_items")
	private Short numItems;
	
	@Column(name = "cod_tip_sopor")
	private Short codTipSopor;
	
	@Column(name = "cod_conju")
	private Long codConju;
	
	@Column(name = "des_docum")
	private String desDocum;
	@Column(name = "plantilla")
	private String plantilla;
	@Column(name = "fec_genera")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecGenera;
	@Column(name = "fec_ultim")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecUltim;
	@Column(name = "num_impre")
	private BigInteger numImpre;
	@Basic(optional = false)
	@Column(name = "tip_docum")
	private long tipDocum;
	@Basic(optional = false)
	@Column(name = "estado")
	private Short estado;
	@Column(name = "fec_estado")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecEstado;
	@Column(name = "id_peticion")
	private Long idPeticion;
	@Column(name = "huella")
	private String huella;
	
	@Column(name = "ind_custo")
	private Short indCusto;
	
	@Column(name = "ref_ges_docum")
	private String refGesDocum;
	
	@Lob
	@Column(name = "arc_expd", columnDefinition = "LONGBLOB")
	private byte[] arcExpd;
	
	@Column(name = "huellaCSV")
	private String huellaCSV;
	
	@Column(name = "usu_contr")
	private String usuContr;
	
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;
	
	public Archivo(Archivo a) {
		codArchi = a.codArchi;
		codConju = a.codConju;
		codEntid = a.codEntid;
		codProgr = a.codProgr;
		codTipSopor = a.codTipSopor;
		desArchi = a.desArchi;
		desDocum = a.desDocum;
		estado = a.estado;
		fecContr = a.fecContr != null ? new Date(a.fecContr.getTime()) : null;
		fecEstado = a.fecEstado != null ? new Date(a.fecEstado.getTime())
				: null;
		fecGenera = a.fecGenera != null ? new Date(a.fecGenera.getTime())
				: null;
		fecUltim = a.fecUltim != null ? new Date(a.fecUltim.getTime()) : null;
		huella = a.huella;
		idOrgEleUbica = a.idOrgEleUbica;
		idPeticion = a.idPeticion;
		indCusto = a.indCusto;
		modulo = a.modulo;
		numImpre = a.numImpre;
		numItems = a.numItems;
		plantilla = a.plantilla;
		tipDocum = a.tipDocum;
		tipFiche = a.tipFiche;
		refGesDocum = a.refGesDocum;
		usuContr = a.usuContr;
	}

	public Archivo(Long idArchivo) {
		this.codArchi = idArchivo;
	}

	public Archivo() {
		super();
	}

	public Long getCodArchi() {
		return codArchi;
	}

	public void setCodArchi(Long codArchi) {
		this.codArchi = codArchi;
	}

	public Short getModulo() {
		return modulo;
	}

	public void setModulo(Short modulo) {
		this.modulo = modulo;
	}

	public String getDesArchi() {
		return desArchi;
	}

	public void setDesArchi(String desArchi) {
		this.desArchi = desArchi;
	}

	public Short getTipFiche() {
		return tipFiche;
	}

	public void setTipFiche(Short tipFiche) {
		this.tipFiche = tipFiche;
	}

	public Long getCodProgr() {
		return codProgr;
	}

	public void setCodProgr(Long codProgr) {
		this.codProgr = codProgr;
	}

	public BigInteger getIdOrgEleUbica() {
		return idOrgEleUbica;
	}

	public void setIdOrgEleUbica(BigInteger idOrgEleUbica) {
		this.idOrgEleUbica = idOrgEleUbica;
	}

	public Short getNumItems() {
		return numItems;
	}

	public void setNumItems(Short numItems) {
		this.numItems = numItems;
	}

	public String getDesDocum() {
		return desDocum;
	}

	public void setDesDocum(String desDocum) {
		this.desDocum = desDocum;
	}

	public String getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
	}

	public Date getFecGenera() {
		return fecGenera;
	}

	public void setFecGenera(Date fecGenera) {
		this.fecGenera = fecGenera;
	}

	public Date getFecUltim() {
		return fecUltim;
	}

	public void setFecUltim(Date fecUltim) {
		this.fecUltim = fecUltim;
	}

	public BigInteger getNumImpre() {
		return numImpre;
	}

	public void setNumImpre(BigInteger numImpre) {
		this.numImpre = numImpre;
	}

	public long getTipDocum() {
		return tipDocum;
	}

	public void setTipDocum(long tipDocum) {
		this.tipDocum = tipDocum;
	}

	public Short getEstado() {
		return estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
	}

	public Date getFecEstado() {
		return fecEstado;
	}

	public void setFecEstado(Date fecEstado) {
		this.fecEstado = fecEstado;
	}

	public Long getIdPeticion() {
		return idPeticion;
	}

	public void setIdPeticion(Long idPeticion) {
		this.idPeticion = idPeticion;
	}

	public String getHuella() {
		return huella;
	}

	public void setHuella(String huella) {
		this.huella = huella;
	}

	public Short getIndCusto() {
		return indCusto;
	}

	public void setIndCusto(Short indCusto) {
		this.indCusto = indCusto;
	}

	public String getRefGesDocum() {
		return refGesDocum;
	}

	public void setRefGesDocum(String refGesDocum) {
		this.refGesDocum = refGesDocum;
	}

	public String getDesArchiFlow() {
		return desArchiFlow;
	}

	public void setDesArchiFlow(String desArchiFlow) {
		this.desArchiFlow = desArchiFlow;
	}

	public byte[] getArcExpd() {
		return arcExpd;
	}

	public void setArcExpd(byte[] arcExpd) {
		this.arcExpd = arcExpd;
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

	public Short getCodTipSopor() {
		return codTipSopor;
	}

	public void setCodTipSopor(Short codTipSopor) {
		this.codTipSopor = codTipSopor;
	}

	public Long getCodConju() {
		return codConju;
	}

	public void setCodConju(Long codConju) {
		this.codConju = codConju;
	}

	public String getHuellaCSV() {
		return huellaCSV;
	}

	public void setHuellaCSV(String huellaCSV) {
		this.huellaCSV = huellaCSV;
	}
	

}
