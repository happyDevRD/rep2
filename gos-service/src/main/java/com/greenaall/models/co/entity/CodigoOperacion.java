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
@Table(name = "co_codigo_operacion")
public class CodigoOperacion implements Serializable {

	private static final long serialVersionUID = 1632855449862688186L;
	public static final Short CLAVE_465 = Short.valueOf("465");
	public static final Short CLAVE_500 = Short.valueOf("500");
	public static final Short CLAVE_515 = Short.valueOf("515");
	public static final Short CLAVE_600 = Short.valueOf("600");
	public static final Short CLAVE_615 = Short.valueOf("615");

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cod_opera")
	private Long idCodOpera;

	@Column(name = "id_gru_cod_opera")
	private Long idGruCodOpera;

	@Column(name = "ind_area")
	private Short indArea;

	@Column(name = "ind_agrup")
	private Short indAgrup;

	@Column(name = "cla_opera")
	private Short claOpera;

	@Column(name = "signo")
	private Short signo;

	@Column(name = "alias")
	private String alias;

	@Column(name = "ind_tip_subsi")
	private Short indTipSubsi;

	@Column(name = "des_cod_opera")
	private String desCodOpera;

	@Column(name = "id_cta_pgcp_debe")
	private Long idCtaPgcpDebe;

	@Column(name = "tip_ind_debe")
	private Short tipIndDebe;

	@Column(name = "pat_cta_debe")
	private String patCtaDebe;

	@Column(name = "id_cta_pgcp_haber")
	private Long idCtaPgcpHaber;

	@Column(name = "tip_ind_haber")
	private Short tipIndHaber;

	@Column(name = "pat_cta_haber")
	private String patCtaHaber;

	@Column(name = "id_cod_ope_enl1")
	private Long idCodOpeEnl1;

	@Column(name = "id_cod_ope_enl2")
	private Long idCodOpeEnl2;

	@Column(name = "id_cod_ope_enl3")
	private Long idCodOpeEnl3;

	@Column(name = "pat_tip_exacc")
	private String patTipExacc;

	@Column(name = "pat_rec_finan")
	private String patRecFinan;

	@Column(name = "ind_ope_manua")
	private Short indOpeManua;

	@Column(name = "ind_tip_opera")
	private Short indTipOpera;

	@Column(name = "ind_fase")
	private Short indFase;

	@Column(name = "plantilla")
	private String plantilla;

	@Column(name = "usu_contr")
	private String usuContr;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_contr")
	private Date fecContr;

	public Long getIdCodOpera() {
		return idCodOpera;
	}

	public void setIdCodOpera(Long idCodOpera) {
		this.idCodOpera = idCodOpera;
	}

	public Long getIdGruCodOpera() {
		return idGruCodOpera;
	}

	public void setIdGruCodOpera(Long idGruCodOpera) {
		this.idGruCodOpera = idGruCodOpera;
	}

	public Short getIndArea() {
		return indArea;
	}

	public void setIndArea(Short indArea) {
		this.indArea = indArea;
	}

	public Short getIndAgrup() {
		return indAgrup;
	}

	public void setIndAgrup(Short indAgrup) {
		this.indAgrup = indAgrup;
	}

	public Short getClaOpera() {
		return claOpera;
	}

	public void setClaOpera(Short claOpera) {
		this.claOpera = claOpera;
	}

	public Short getSigno() {
		return signo;
	}

	public void setSigno(Short signo) {
		this.signo = signo;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Short getIndTipSubsi() {
		return indTipSubsi;
	}

	public void setIndTipSubsi(Short indTipSubsi) {
		this.indTipSubsi = indTipSubsi;
	}

	public String getDesCodOpera() {
		return desCodOpera;
	}

	public void setDesCodOpera(String desCodOpera) {
		this.desCodOpera = desCodOpera;
	}

	public Long getIdCtaPgcpDebe() {
		return idCtaPgcpDebe;
	}

	public void setIdCtaPgcpDebe(Long idCtaPgcpDebe) {
		this.idCtaPgcpDebe = idCtaPgcpDebe;
	}

	public Short getTipIndDebe() {
		return tipIndDebe;
	}

	public void setTipIndDebe(Short tipIndDebe) {
		this.tipIndDebe = tipIndDebe;
	}

	public String getPatCtaDebe() {
		return patCtaDebe;
	}

	public void setPatCtaDebe(String patCtaDebe) {
		this.patCtaDebe = patCtaDebe;
	}

	public Long getIdCtaPgcpHaber() {
		return idCtaPgcpHaber;
	}

	public void setIdCtaPgcpHaber(Long idCtaPgcpHaber) {
		this.idCtaPgcpHaber = idCtaPgcpHaber;
	}

	public Short getTipIndHaber() {
		return tipIndHaber;
	}

	public void setTipIndHaber(Short tipIndHaber) {
		this.tipIndHaber = tipIndHaber;
	}

	public String getPatCtaHaber() {
		return patCtaHaber;
	}

	public void setPatCtaHaber(String patCtaHaber) {
		this.patCtaHaber = patCtaHaber;
	}

	public Long getIdCodOpeEnl1() {
		return idCodOpeEnl1;
	}

	public void setIdCodOpeEnl1(Long idCodOpeEnl1) {
		this.idCodOpeEnl1 = idCodOpeEnl1;
	}

	public Long getIdCodOpeEnl2() {
		return idCodOpeEnl2;
	}

	public void setIdCodOpeEnl2(Long idCodOpeEnl2) {
		this.idCodOpeEnl2 = idCodOpeEnl2;
	}

	public Long getIdCodOpeEnl3() {
		return idCodOpeEnl3;
	}

	public void setIdCodOpeEnl3(Long idCodOpeEnl3) {
		this.idCodOpeEnl3 = idCodOpeEnl3;
	}

	public String getPatTipExacc() {
		return patTipExacc;
	}

	public void setPatTipExacc(String patTipExacc) {
		this.patTipExacc = patTipExacc;
	}

	public String getPatRecFinan() {
		return patRecFinan;
	}

	public void setPatRecFinan(String patRecFinan) {
		this.patRecFinan = patRecFinan;
	}

	public Short getIndOpeManua() {
		return indOpeManua;
	}

	public void setIndOpeManua(Short indOpeManua) {
		this.indOpeManua = indOpeManua;
	}

	public Short getIndTipOpera() {
		return indTipOpera;
	}

	public void setIndTipOpera(Short indTipOpera) {
		this.indTipOpera = indTipOpera;
	}

	public Short getIndFase() {
		return indFase;
	}

	public void setIndFase(Short indFase) {
		this.indFase = indFase;
	}

	public String getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(String plantilla) {
		this.plantilla = plantilla;
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

	public CodigoOperacion() {
		super();
	}

}
