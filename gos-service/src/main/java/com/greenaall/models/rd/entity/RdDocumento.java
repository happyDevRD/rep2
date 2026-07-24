package com.greenaall.models.rd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
*
* @author jmmoyano
*/

@Entity
@Table(name = "rd_documento")
public class RdDocumento implements Serializable{

	private static final long serialVersionUID = -1485664794785332437L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_his_docum")
	private Long idHisDocum;

	@Column(name = "id_docum")
	private Long idDocum;
	
	@Column(name = "cod_entid")
    private Short codEntid;

	@Column(name = "cod_regis")
    private String codRegis;
   
    @Basic(optional = false)
    @Column(name = "tip_docum")
    private Short tipDocum;
    
    @Basic(optional = false)
    @Column(name = "eje_regis")
    private Short ejeRegis;
    
    @Basic(optional = false)
    @Column(name = "num_regis")
    private Integer numRegis;
    
    @Basic(optional = false)
    @Column(name = "fec_varia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecVaria;
    
    @Basic(optional = false)
    @Column(name = "reg_activ")
    private Short regActiv;
    
    @Basic(optional = false)
    @Column(name = "cod_movim")
    private String codMovim;
    
    @Basic(optional = false)
    @Column(name = "fec_regis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegis;
    
    @Basic(optional = false)
    @Column(name = "id_regis")
    private Long idRegis;
    
    @Basic(optional = false)
    @Column(name = "id_his_regis")
    private Long idHisRegis;
    
    @Column(name = "usu_regis")
    private String usuRegis;
    
    @Column(name = "id_org_ele_orige")
    private Long idOrgEleOrige;

    @Basic(optional = false)
    @Column(name = "estado")
    private Short estado;
    
    @Basic(optional = false)
    @Column(name = "en_libro")
    private Short enLibro;
    
    @Column(name = "fec_docum")
    @Temporal(TemporalType.DATE)
    private Date fecDocum;
    
    @Column(name = "extracto")
    private String extracto;
    
    @Column(name = "observaciones")
    private String observaciones;
    
    @Column(name = "cod_tema")
    private String codTema;
    
    @Column(name="cod_tip_escri")
    private Short codTipEscri;
    
    @Column(name="cod_tip_trans")
    private Short codTipTrans;
    
    @Column(name = "num_trans")
    private String numTrans;
    
    @Column(name = "resolucion")
    private String resolucion;
    
    @Column(name = "fec_resol")
    @Temporal(TemporalType.DATE)
    private Date fecResol;
    
    @Column(name = "aut_resol")
    private String autResol;
    
    @Column(name = "ent_exter")
    private String entExter;
    
    @Column(name = "ref_exter")
    private String refExter;
    
    @Column(name = "fec_exter")
    @Temporal(TemporalType.DATE)
    private Date fecExter;
    
    @Column(name = "eje_exped")
    private Short ejeExped;
    
    @Column(name = "num_exped")
    private String numExped;
    
    @Column(name = "uid_orige")
    private String uidOrige;
    
    @Column(name = "num_gesti")
    private Long numGesti;
    
    @Column(name = "des_fic_regis")
    private String desFicRegis;
    
    @Column(name = "id_his_prese")
    private Long idHisPrese;
	
	@Column(name = "id_prese")
	private Long idPrese;
    
    @Column(name = "int_texto")
    private String intTexto;
    
    @Column(name = "fec_traba")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecTraba;
    
    @Column(name = "num_reg_orige")
    private Integer numRegOrige;
    
    @Column(name = "eje_reg_orige")
    private Short ejeRegOrige;
    
    @Column(name = "fec_reg_orige")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecRegOrige;
    
    @Column(name = "tip_docum_orige")
    private Short tipDocumOrige;
    
    @Column(name = "id_exped")
    private Long idExped;
    
    @Column(name = "id_proce")
    private Long idProce;
    
    @Column(name = "num_exp_flow")
    private Long numExpFlow;
    
    @Column(name = "num_ext_exped")
    private String numExtExped;
    
    @Column(name = "tra_peso")
    private Short traPeso;
    
    @Column(name = "acuse")
    private Short acuse;
    
    @Column(name = "tip_reemb")
    private Short tipReemb;

    @Column(name = "importe")
    private BigDecimal importe;
    
    @Column(name = "pais")
    private String pais;
    
    @Column(name = "id_his_dom_banca")
    private Long idHisDomBanca;
	
	@Column(name = "id_dom_banca")
	private Long idDomBanca;
    
    @Column(name = "ind_doc_remit")
    private Short indDocRemit;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellidos")
    private String apellidos;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "cod_provi")
    private Short codProvi;
    
    @Column(name = "cod_munic")
    private Short codMunic;
    
    @Column(name = "cod_posta")
    private Integer codPosta;
    
    @Column(name = "cod_bar_corre")
    private String codBarCorre;
    
    @Column(name = "id_his_reg_inici")
    private Long idHisRegInici;
    
    @Column(name = "id_reg_inici")
    private Long idRegInici;
    
    @Column(name = "usu_reg_inici")
    private String usuRegInici;
    
    @Column(name = "tip_prese")
    private Short tipPrese;
    
    @Column(name = "for_notif")
    private Short forNotif;
    
    @Lob
    @Column(name = "timestamp")
    private byte[] timestamp;
    
    @Column(name = "usu_contr")
    private String usuContr;
    
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;

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

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public String getCodRegis() {
		return codRegis;
	}

	public void setCodRegis(String codRegis) {
		this.codRegis = codRegis;
	}

	public Short getTipDocum() {
		return tipDocum;
	}

	public void setTipDocum(Short tipDocum) {
		this.tipDocum = tipDocum;
	}

	public Short getEjeRegis() {
		return ejeRegis;
	}

	public void setEjeRegis(Short ejeRegis) {
		this.ejeRegis = ejeRegis;
	}

	public Integer getNumRegis() {
		return numRegis;
	}

	public void setNumRegis(Integer numRegis) {
		this.numRegis = numRegis;
	}

	public Date getFecVaria() {
		return fecVaria;
	}

	public void setFecVaria(Date fecVaria) {
		this.fecVaria = fecVaria;
	}

	public Short getRegActiv() {
		return regActiv;
	}

	public void setRegActiv(Short regActiv) {
		this.regActiv = regActiv;
	}

	public String getCodMovim() {
		return codMovim;
	}

	public void setCodMovim(String codMovim) {
		this.codMovim = codMovim;
	}

	public Date getFecRegis() {
		return fecRegis;
	}

	public void setFecRegis(Date fecRegis) {
		this.fecRegis = fecRegis;
	}

	public Long getIdRegis() {
		return idRegis;
	}

	public void setIdRegis(Long idRegis) {
		this.idRegis = idRegis;
	}

	public Long getIdHisRegis() {
		return idHisRegis;
	}

	public void setIdHisRegis(Long idHisRegis) {
		this.idHisRegis = idHisRegis;
	}

	public String getUsuRegis() {
		return usuRegis;
	}

	public void setUsuRegis(String usuRegis) {
		this.usuRegis = usuRegis;
	}

	public Long getIdOrgEleOrige() {
		return idOrgEleOrige;
	}

	public void setIdOrgEleOrige(Long idOrgEleOrige) {
		this.idOrgEleOrige = idOrgEleOrige;
	}

	public Short getEstado() {
		return estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
	}

	public Short getEnLibro() {
		return enLibro;
	}

	public void setEnLibro(Short enLibro) {
		this.enLibro = enLibro;
	}

	public Date getFecDocum() {
		return fecDocum;
	}

	public void setFecDocum(Date fecDocum) {
		this.fecDocum = fecDocum;
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

	public String getCodTema() {
		return codTema;
	}

	public void setCodTema(String codTema) {
		this.codTema = codTema;
	}

	public Short getCodTipEscri() {
		return codTipEscri;
	}

	public void setCodTipEscri(Short codTipEscri) {
		this.codTipEscri = codTipEscri;
	}

	public Short getCodTipTrans() {
		return codTipTrans;
	}

	public void setCodTipTrans(Short codTipTrans) {
		this.codTipTrans = codTipTrans;
	}

	public String getNumTrans() {
		return numTrans;
	}

	public void setNumTrans(String numTrans) {
		this.numTrans = numTrans;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public Date getFecResol() {
		return fecResol;
	}

	public void setFecResol(Date fecResol) {
		this.fecResol = fecResol;
	}

	public String getAutResol() {
		return autResol;
	}

	public void setAutResol(String autResol) {
		this.autResol = autResol;
	}

	public String getEntExter() {
		return entExter;
	}

	public void setEntExter(String entExter) {
		this.entExter = entExter;
	}

	public String getRefExter() {
		return refExter;
	}

	public void setRefExter(String refExter) {
		this.refExter = refExter;
	}

	public Date getFecExter() {
		return fecExter;
	}

	public void setFecExter(Date fecExter) {
		this.fecExter = fecExter;
	}

	public Short getEjeExped() {
		return ejeExped;
	}

	public void setEjeExped(Short ejeExped) {
		this.ejeExped = ejeExped;
	}

	public String getNumExped() {
		return numExped;
	}

	public void setNumExped(String numExped) {
		this.numExped = numExped;
	}

	public String getUidOrige() {
		return uidOrige;
	}

	public void setUidOrige(String uidOrige) {
		this.uidOrige = uidOrige;
	}

	public Long getNumGesti() {
		return numGesti;
	}

	public void setNumGesti(Long numGesti) {
		this.numGesti = numGesti;
	}

	public String getDesFicRegis() {
		return desFicRegis;
	}

	public void setDesFicRegis(String desFicRegis) {
		this.desFicRegis = desFicRegis;
	}

	public Long getIdHisPrese() {
		return idHisPrese;
	}

	public void setIdHisPrese(Long idHisPrese) {
		this.idHisPrese = idHisPrese;
	}

	public Long getIdPrese() {
		return idPrese;
	}

	public void setIdPrese(Long idPrese) {
		this.idPrese = idPrese;
	}

	public String getIntTexto() {
		return intTexto;
	}

	public void setIntTexto(String intTexto) {
		this.intTexto = intTexto;
	}

	public Date getFecTraba() {
		return fecTraba;
	}

	public void setFecTraba(Date fecTraba) {
		this.fecTraba = fecTraba;
	}

	public Integer getNumRegOrige() {
		return numRegOrige;
	}

	public void setNumRegOrige(Integer numRegOrige) {
		this.numRegOrige = numRegOrige;
	}

	public Short getEjeRegOrige() {
		return ejeRegOrige;
	}

	public void setEjeRegOrige(Short ejeRegOrige) {
		this.ejeRegOrige = ejeRegOrige;
	}

	public Date getFecRegOrige() {
		return fecRegOrige;
	}

	public void setFecRegOrige(Date fecRegOrige) {
		this.fecRegOrige = fecRegOrige;
	}

	public Short getTipDocumOrige() {
		return tipDocumOrige;
	}

	public void setTipDocumOrige(Short tipDocumOrige) {
		this.tipDocumOrige = tipDocumOrige;
	}

	public Long getIdExped() {
		return idExped;
	}

	public void setIdExped(Long idExped) {
		this.idExped = idExped;
	}

	public Long getIdProce() {
		return idProce;
	}

	public void setIdProce(Long idProce) {
		this.idProce = idProce;
	}

	public Long getNumExpFlow() {
		return numExpFlow;
	}

	public void setNumExpFlow(Long numExpFlow) {
		this.numExpFlow = numExpFlow;
	}

	public String getNumExtExped() {
		return numExtExped;
	}

	public void setNumExtExped(String numExtExped) {
		this.numExtExped = numExtExped;
	}

	public Short getTraPeso() {
		return traPeso;
	}

	public void setTraPeso(Short traPeso) {
		this.traPeso = traPeso;
	}

	public Short getAcuse() {
		return acuse;
	}

	public void setAcuse(Short acuse) {
		this.acuse = acuse;
	}

	public Short getTipReemb() {
		return tipReemb;
	}

	public void setTipReemb(Short tipReemb) {
		this.tipReemb = tipReemb;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Long getIdHisDomBanca() {
		return idHisDomBanca;
	}

	public void setIdHisDomBanca(Long idHisDomBanca) {
		this.idHisDomBanca = idHisDomBanca;
	}

	public Long getIdDomBanca() {
		return idDomBanca;
	}

	public void setIdDomBanca(Long idDomBanca) {
		this.idDomBanca = idDomBanca;
	}

	public Short getIndDocRemit() {
		return indDocRemit;
	}

	public void setIndDocRemit(Short indDocRemit) {
		this.indDocRemit = indDocRemit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodPosta() {
		return codPosta;
	}

	public void setCodPosta(Integer codPosta) {
		this.codPosta = codPosta;
	}

	public String getCodBarCorre() {
		return codBarCorre;
	}

	public void setCodBarCorre(String codBarCorre) {
		this.codBarCorre = codBarCorre;
	}

	public Long getIdHisRegInici() {
		return idHisRegInici;
	}

	public void setIdHisRegInici(Long idHisRegInici) {
		this.idHisRegInici = idHisRegInici;
	}

	public Long getIdRegInici() {
		return idRegInici;
	}

	public void setIdRegInici(Long idRegInici) {
		this.idRegInici = idRegInici;
	}

	public String getUsuRegInici() {
		return usuRegInici;
	}

	public void setUsuRegInici(String usuRegInici) {
		this.usuRegInici = usuRegInici;
	}

	public Short getTipPrese() {
		return tipPrese;
	}

	public void setTipPrese(Short tipPrese) {
		this.tipPrese = tipPrese;
	}

	public Short getForNotif() {
		return forNotif;
	}

	public void setForNotif(Short forNotif) {
		this.forNotif = forNotif;
	}

	public byte[] getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(byte[] timestamp) {
		this.timestamp = timestamp;
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

	public Short getCodProvi() {
		return codProvi;
	}

	public void setCodProvi(Short codProvi) {
		this.codProvi = codProvi;
	}

	public Short getCodMunic() {
		return codMunic;
	}

	public void setCodMunic(Short codMunic) {
		this.codMunic = codMunic;
	}

	public RdDocumento() {
		super();
	}
      
}
