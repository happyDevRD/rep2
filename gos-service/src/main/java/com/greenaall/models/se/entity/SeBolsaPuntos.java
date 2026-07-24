package com.greenaall.models.se.entity;

import java.io.Serializable;
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
@Table(name = "se_bolsa_puntos")
public class SeBolsaPuntos implements Serializable {

	private static final long serialVersionUID = -2478012277765671272L;
	public static final Short TIPO_SESION_PLENO = Short.valueOf("1");
    public static final Short TIPO_SESION_JUNTA_GOBIERNO = Short.valueOf("2");
    public static final Short TIPO_SESION_COMISION_INFORMATIVA = Short.valueOf("3");
    public static final Short TIPO_SESION_NO_APARECE = Short.valueOf("4");
    public static final Short TIPO_SESION_PLENO_Y_COMISION_INFORMATIVA = Short.valueOf("5");    

    public static final Short PRIORIDAD_BAJA = Short.valueOf("0");
    public static final Short PRIORIDAD_MEDIA = Short.valueOf("1");
    public static final Short PRIORIDAD_ALTA = Short.valueOf("2");
    public static final Short PRIORIDAD_MUY_ALTA = Short.valueOf("3");

    public static final Short ESTADO_SOLICITADO = Short.valueOf("0");

    public static final Short TIPO_PUNTO_PROPUESTA = Short.valueOf("0");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_his_bolsa")
    private Long idHisBolsa;
    
    @Basic(optional = false)
    @Column(name = "cod_entid")
    private Short codEntid;
    
  
    @Basic(optional = false)
    @Column(name = "fec_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecAlta;
    
    @Column(name = "fec_prefe")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecPrefe;
    
    @Column(name = "fec_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecFinal;
    
    @Column(name = "extracto")
    private String extracto;
    
    @Column(name = "observaciones")
    private String observaciones;
    
    @Column(name = "id_org_eleme")
    private Long idOrgEleme;
    
    @Column(name = "usuario")
    private String usuario;
    
    @Column(name = "cod_archi")
    private Long codArchi;
    
    @Column(name = "ind_tratado")
    private Short indTratado;
    
    @Column(name = "exp_motiv")
    private String expMotiv;
    
    @Lob
    @Column(name = "dictamen")
    private String dictamen;
    
    @Column(name = "ref_exped")
    private String refExped;
    
    @Column(name = "fec_max_resol")
    @Temporal(TemporalType.DATE)
    private Date fecMaxResol;
    
    @Column(name = "tip_sesio")
    private Short tipSesio;
    
    @Column(name = "prioridad")
    private Short prioridad;
    
    @Column(name = "des_prior")
    private String desPrior;
    
    @Column(name = "mot_exclu")
    private String motExclu;
    
    @Column(name = "id_his_docum")
    private Long idHisDocum;
    
    @Column(name = "id_docum")
    private Long idDocum;
    
    @Column(name = "estado")
    private Short estado;
    
    @Column(name = "tip_punto")
    private Short tipPunto;
    
    @Column(name = "usu_contr")
    private String usuContr;
    
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

	public Long getIdHisBolsa() {
		return idHisBolsa;
	}

	public void setIdHisBolsa(Long idHisBolsa) {
		this.idHisBolsa = idHisBolsa;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Date getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}

	public Date getFecPrefe() {
		return fecPrefe;
	}

	public void setFecPrefe(Date fecPrefe) {
		this.fecPrefe = fecPrefe;
	}

	public Date getFecFinal() {
		return fecFinal;
	}

	public void setFecFinal(Date fecFinal) {
		this.fecFinal = fecFinal;
	}

	public String getExtracto() {
		return extracto;
	}

	public void setExtracto(String extracto) {
		this.extracto = extracto;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getIdOrgEleme() {
		return idOrgEleme;
	}

	public void setIdOrgEleme(Long idOrgEleme) {
		this.idOrgEleme = idOrgEleme;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Short getIndTratado() {
		return indTratado;
	}

	public void setIndTratado(Short indTratado) {
		this.indTratado = indTratado;
	}

	public String getExpMotiv() {
		return expMotiv;
	}

	public void setExpMotiv(String expMotiv) {
		this.expMotiv = expMotiv;
	}

	public String getDictamen() {
		return dictamen;
	}

	public void setDictamen(String dictamen) {
		this.dictamen = dictamen;
	}

	public String getRefExped() {
		return refExped;
	}

	public void setRefExped(String refExped) {
		this.refExped = refExped;
	}

	public Date getFecMaxResol() {
		return fecMaxResol;
	}

	public void setFecMaxResol(Date fecMaxResol) {
		this.fecMaxResol = fecMaxResol;
	}

	public Short getTipSesio() {
		return tipSesio;
	}

	public void setTipSesio(Short tipSesio) {
		this.tipSesio = tipSesio;
	}

	public Short getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Short prioridad) {
		this.prioridad = prioridad;
	}

	public String getDesPrior() {
		return desPrior;
	}

	public void setDesPrior(String desPrior) {
		this.desPrior = desPrior;
	}

	public String getMotExclu() {
		return motExclu;
	}

	public void setMotExclu(String motExclu) {
		this.motExclu = motExclu;
	}

	public Long getIdHisDocum() {
		return idHisDocum;
	}

	public void setIdHisDocum(Long idHisDocum) {
		this.idHisDocum = idHisDocum;
	}

	public Long getIdDocum() {
		return idDocum;
	}

	public void setIdDocum(Long idDocum) {
		this.idDocum = idDocum;
	}

	public Short getEstado() {
		return estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
	}

	public Short getTipPunto() {
		return tipPunto;
	}

	public void setTipPunto(Short tipPunto) {
		this.tipPunto = tipPunto;
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
	
	public Long getCodArchi() {
		return codArchi;
	}

	public void setCodArchi(Long codArchi) {
		this.codArchi = codArchi;
	}

	public SeBolsaPuntos() {
		super();
	}
    
}