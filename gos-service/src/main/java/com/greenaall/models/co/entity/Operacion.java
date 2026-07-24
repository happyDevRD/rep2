package com.greenaall.models.co.entity;

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
@Table(name = "co_operacion")
public class Operacion implements Serializable {

	private static final long serialVersionUID = 5031827580763887925L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_opera")
	private Long idOpera;

	@Column(name = "id_conta")
	private Long idConta;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "eje_opera")
	private Short ejeOpera;

	@Column(name = "num_opera")
	private Integer numOpera;

	@Column(name = "fec_opera")
	private java.sql.Date fecOpera;

	@Column(name = "id_cod_opera")
	private Long idCodOpera;

	@Column(name = "nat_der_obl")
	private Short natDerObl;

	@Column(name = "txt_opera")
	private String txtOpera;

	@Column(name = "oficina")
	private Short oficina;

	@Column(name = "cod_are_orige")
	private Short codAreOrige;

	@Column(name = "cod_org_aprob")
	private Short codOrgAprob;

	@Column(name = "num_resol")
	private String numResol;

	@Column(name = "fec_resol")
	private java.sql.Date fecResol;

	@Column(name = "tip_exacc")
	private Short tipExacc;

	@Column(name = "rec_finan")
	private Short recFinan;

	@Column(name = "num_docum")
	private Short numDocum;

	@Column(name = "id_terce")
	private Long idTerce;

	@Column(name = "ord_terce")
	private Short ordTerce;

	@Column(name = "id_endos")
	private Long idEndos;

	@Column(name = "ord_endos")
	private Short ordEndos;

	@Column(name = "id_habil")
	private Long idHabil;

	@Column(name = "ord_habil")
	private Short ordHabil;

	@Column(name = "cod_tip_pago")
	private Short codTipPago;

	@Column(name = "cod_for_pago")
	private Short codForPago;

	@Column(name = "num_ordin")
	private Short numOrdin;

	@Column(name = "num_chequ")
	private String numChequ;

	@Column(name = "imp_total")
	private java.math.BigDecimal impTotal;

	@Column(name = "imp_dto")
	private java.math.BigDecimal impDto;

	@Column(name = "imp_iva")
	private java.math.BigDecimal impIva;

	@Column(name = "imp_liqui")
	private java.math.BigDecimal impLiqui;

	@Column(name = "id_ope_padre")
	private Long idOpePadre;

	@Column(name = "id_proye")
	private Long idProye;

	@Column(name = "ind_ctr_inter")
	private Short indCtrInter;

	@Column(name = "ind_mod_347")
	private String indMod347;

	@Column(name = "fia_metal")
	private Short fiaMetal;

	@Column(name = "estado")
	private Short estado;

	@Column(name = "fec_tesor")
	private java.sql.Date fecTesor;
	
	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "usu_contr")
	private String usuContr;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_contr")
	private Date fecContr;

	public Long getIdOpera() {
		return idOpera;
	}

	public void setIdOpera(Long idOpera) {
		this.idOpera = idOpera;
	}

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Short getEjeOpera() {
		return ejeOpera;
	}

	public void setEjeOpera(Short ejeOpera) {
		this.ejeOpera = ejeOpera;
	}

	public Integer getNumOpera() {
		return numOpera;
	}

	public void setNumOpera(Integer numOpera) {
		this.numOpera = numOpera;
	}

	public java.sql.Date getFecOpera() {
		return fecOpera;
	}

	public void setFecOpera(java.sql.Date fecOpera) {
		this.fecOpera = fecOpera;
	}

	public Long getIdCodOpera() {
		return idCodOpera;
	}

	public void setIdCodOpera(Long idCodOpera) {
		this.idCodOpera = idCodOpera;
	}

	public Short getNatDerObl() {
		return natDerObl;
	}

	public void setNatDerObl(Short natDerObl) {
		this.natDerObl = natDerObl;
	}

	public String getTxtOpera() {
		return txtOpera;
	}

	public void setTxtOpera(String txtOpera) {
		this.txtOpera = txtOpera;
	}

	public Short getOficina() {
		return oficina;
	}

	public void setOficina(Short oficina) {
		this.oficina = oficina;
	}

	public Short getCodAreOrige() {
		return codAreOrige;
	}

	public void setCodAreOrige(Short codAreOrige) {
		this.codAreOrige = codAreOrige;
	}

	public Short getCodOrgAprob() {
		return codOrgAprob;
	}

	public void setCodOrgAprob(Short codOrgAprob) {
		this.codOrgAprob = codOrgAprob;
	}

	public String getNumResol() {
		return numResol;
	}

	public void setNumResol(String numResol) {
		this.numResol = numResol;
	}

	public java.sql.Date getFecResol() {
		return fecResol;
	}

	public void setFecResol(java.sql.Date fecResol) {
		this.fecResol = fecResol;
	}

	public Short getTipExacc() {
		return tipExacc;
	}

	public void setTipExacc(Short tipExacc) {
		this.tipExacc = tipExacc;
	}

	public Short getRecFinan() {
		return recFinan;
	}

	public void setRecFinan(Short recFinan) {
		this.recFinan = recFinan;
	}

	public Short getNumDocum() {
		return numDocum;
	}

	public void setNumDocum(Short numDocum) {
		this.numDocum = numDocum;
	}

	public Long getIdTerce() {
		return idTerce;
	}

	public void setIdTerce(Long idTerce) {
		this.idTerce = idTerce;
	}

	public Short getOrdTerce() {
		return ordTerce;
	}

	public void setOrdTerce(Short ordTerce) {
		this.ordTerce = ordTerce;
	}

	public Long getIdEndos() {
		return idEndos;
	}

	public void setIdEndos(Long idEndos) {
		this.idEndos = idEndos;
	}

	public Short getOrdEndos() {
		return ordEndos;
	}

	public void setOrdEndos(Short ordEndos) {
		this.ordEndos = ordEndos;
	}

	public Long getIdHabil() {
		return idHabil;
	}

	public void setIdHabil(Long idHabil) {
		this.idHabil = idHabil;
	}

	public Short getOrdHabil() {
		return ordHabil;
	}

	public void setOrdHabil(Short ordHabil) {
		this.ordHabil = ordHabil;
	}

	public Short getCodTipPago() {
		return codTipPago;
	}

	public void setCodTipPago(Short codTipPago) {
		this.codTipPago = codTipPago;
	}

	public Short getCodForPago() {
		return codForPago;
	}

	public void setCodForPago(Short codForPago) {
		this.codForPago = codForPago;
	}

	public Short getNumOrdin() {
		return numOrdin;
	}

	public void setNumOrdin(Short numOrdin) {
		this.numOrdin = numOrdin;
	}

	public String getNumChequ() {
		return numChequ;
	}

	public void setNumChequ(String numChequ) {
		this.numChequ = numChequ;
	}

	public java.math.BigDecimal getImpTotal() {
		return impTotal;
	}

	public void setImpTotal(java.math.BigDecimal impTotal) {
		this.impTotal = impTotal;
	}

	public java.math.BigDecimal getImpDto() {
		return impDto;
	}

	public void setImpDto(java.math.BigDecimal impDto) {
		this.impDto = impDto;
	}

	public java.math.BigDecimal getImpIva() {
		return impIva;
	}

	public void setImpIva(java.math.BigDecimal impIva) {
		this.impIva = impIva;
	}

	public java.math.BigDecimal getImpLiqui() {
		return impLiqui;
	}

	public void setImpLiqui(java.math.BigDecimal impLiqui) {
		this.impLiqui = impLiqui;
	}

	public Long getIdOpePadre() {
		return idOpePadre;
	}

	public void setIdOpePadre(Long idOpePadre) {
		this.idOpePadre = idOpePadre;
	}

	public Long getIdProye() {
		return idProye;
	}

	public void setIdProye(Long idProye) {
		this.idProye = idProye;
	}

	public Short getIndCtrInter() {
		return indCtrInter;
	}

	public void setIndCtrInter(Short indCtrInter) {
		this.indCtrInter = indCtrInter;
	}

	public String getIndMod347() {
		return indMod347;
	}

	public void setIndMod347(String indMod347) {
		this.indMod347 = indMod347;
	}

	public Short getFiaMetal() {
		return fiaMetal;
	}

	public void setFiaMetal(Short fiaMetal) {
		this.fiaMetal = fiaMetal;
	}

	public Short getEstado() {
		return estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
	}

	public java.sql.Date getFecTesor() {
		return fecTesor;
	}

	public void setFecTesor(java.sql.Date fecTesor) {
		this.fecTesor = fecTesor;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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

	public Operacion() {
		super();
	}

}
