package com.greenaall.models.ve.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@IdClass(VehiculoPK.class)
@Table(name = "ve_vehiculo")
public class Vehiculo implements Serializable {

	private static final long serialVersionUID = -623008270581909217L;

	@Id
	@Column(name = "id_his_vehic")
	private Long idHisVehic;

	@Id
	@Column(name = "id_vehic")
	private Long idVehic;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "num_vehic")
	private Integer numVehic;

	@Column(name = "fec_movim")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecMovim;

	@Column(name = "cod_movim")
	private String codMovim;

	@Column(name = "cod_cau_movim")
	private Short cauMovim;

	@Column(name = "reg_activ")
	private boolean regActiv;

	@Column(name = "parque")
	private Short parque;

	@Column(name = "fec_mat")
	private java.sql.Date fecMat;

	@Column(name = "matricula")
	private String matricula;

	@Column(name = "mat_forma")
	private String matForma;

	@Column(name = "num_basti")
	private String numBasti;

	@Column(name = "num_model")
	private Integer numModel;

	@Column(name = "servicio")
	private String servicio;

	@Column(name = "fec_alta")
	private java.sql.Date fecAlta;

	@Column(name = "fec_liqui")
	private java.sql.Date fecLiqui;

	@Column(name = "cod_tip_vehic")
	private String codTipVehic;

	@Column(name = "num_unida")
	private java.math.BigDecimal numUnida;

	@Column(name = "num_bonif")
	private String numBonif;

	@Column(name = "por_bonif")
	private java.math.BigDecimal porBonif;

	@Column(name = "fec_bonif")
	private java.sql.Date fecBonif;

	@Column(name = "fec_fin_bonif")
	private java.sql.Date fecFinBonif;

	@Column(name = "org_bonif")
	private String orgBonif;

	@Column(name = "fun_bonif")
	private String funBonif;

	@Column(name = "id_his_perso")
	private Long idHisPerso;

	@Column(name = "id_perso")
	private Long idPerso;

	@Column(name = "id_org_eleme")
	private Long idOrgEleme;

	@Column(name = "provincia")
	private Short provincia;

	@Column(name = "municipio")
	private Short municipio;

	@Column(name = "pueblo")
	private String pueblo;

	@Column(name = "calle")
	private String calle;

	@Column(name = "cod_posta")
	private Integer codPosta;

	@Column(name = "color")
	private String color;

	@Column(name = "tara")
	private Integer tara;

	@Column(name = "mma")
	private Integer mma;

	@Column(name = "cla_segur")
	private String claSegur;

	@Column(name = "cod_com_segur")
	private Integer codComSegur;

	@Column(name = "num_poliz")
	private String numPoliz;

	@Column(name = "fec_segur")
	private java.sql.Date fecSegur;

	@Column(name = "fec_venci")
	private java.sql.Date fecVenci;

	@Column(name = "id_his_tomad")
	private Long idHisTomad;

	@Column(name = "id_tomad")
	private Long idTomad;

	@Column(name = "cod_conju")
	private Long codConju;

	@Column(name = "cod_archi")
	private Long codArchi;

	@Column(name = "cod_progr")
	private Long codProgr;

	@Column(name = "id_his_obj_tribu")
	private Long idHisObjTribu;

	@Column(name = "id_obj_tribu")
	private Long idObjTribu;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "mom")
	private Integer mom;

	@Column(name = "carga")
	private Integer carga;

	@Column(name = "cat_elect")
	private String catElect;

	@Column(name = "aut_elect")
	private Integer autElect;

	@Column(name = "cla_ambie")
	private String claAmbie;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdHisVehic() {
		return idHisVehic;
	}

	public void setIdHisVehic(Long idHisVehic) {
		this.idHisVehic = idHisVehic;
	}

	public Long getIdVehic() {
		return idVehic;
	}

	public void setIdVehic(Long idVehic) {
		this.idVehic = idVehic;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Integer getNumVehic() {
		return numVehic;
	}

	public void setNumVehic(Integer numVehic) {
		this.numVehic = numVehic;
	}

	public java.util.Date getFecMovim() {
		return fecMovim;
	}

	public void setFecMovim(java.util.Date fecMovim) {
		this.fecMovim = fecMovim;
	}

	public String getCodMovim() {
		return codMovim;
	}

	public void setCodMovim(String codMovim) {
		this.codMovim = codMovim;
	}

	public Short getCauMovim() {
		return cauMovim;
	}

	public void setCauMovim(Short cauMovim) {
		this.cauMovim = cauMovim;
	}

	public boolean isRegActiv() {
		return regActiv;
	}

	public void setRegActiv(boolean regActiv) {
		this.regActiv = regActiv;
	}

	public Short getParque() {
		return parque;
	}

	public void setParque(Short parque) {
		this.parque = parque;
	}

	public java.sql.Date getFecMat() {
		return fecMat;
	}

	public void setFecMat(java.sql.Date fecMat) {
		this.fecMat = fecMat;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatForma() {
		return matForma;
	}

	public void setMatForma(String matForma) {
		this.matForma = matForma;
	}

	public String getNumBasti() {
		return numBasti;
	}

	public void setNumBasti(String numBasti) {
		this.numBasti = numBasti;
	}

	public Integer getNumModel() {
		return numModel;
	}

	public void setNumModel(Integer numModel) {
		this.numModel = numModel;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public java.sql.Date getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(java.sql.Date fecAlta) {
		this.fecAlta = fecAlta;
	}

	public java.sql.Date getFecLiqui() {
		return fecLiqui;
	}

	public void setFecLiqui(java.sql.Date fecLiqui) {
		this.fecLiqui = fecLiqui;
	}

	public String getCodTipVehic() {
		return codTipVehic;
	}

	public void setCodTipVehic(String codTipVehic) {
		this.codTipVehic = codTipVehic;
	}

	public java.math.BigDecimal getNumUnida() {
		return numUnida;
	}

	public void setNumUnida(java.math.BigDecimal numUnida) {
		this.numUnida = numUnida;
	}

	public String getNumBonif() {
		return numBonif;
	}

	public void setNumBonif(String numBonif) {
		this.numBonif = numBonif;
	}

	public java.math.BigDecimal getPorBonif() {
		return porBonif;
	}

	public void setPorBonif(java.math.BigDecimal porBonif) {
		this.porBonif = porBonif;
	}

	public java.sql.Date getFecBonif() {
		return fecBonif;
	}

	public void setFecBonif(java.sql.Date fecBonif) {
		this.fecBonif = fecBonif;
	}

	public java.sql.Date getFecFinBonif() {
		return fecFinBonif;
	}

	public void setFecFinBonif(java.sql.Date fecFinBonif) {
		this.fecFinBonif = fecFinBonif;
	}

	public String getOrgBonif() {
		return orgBonif;
	}

	public void setOrgBonif(String orgBonif) {
		this.orgBonif = orgBonif;
	}

	public String getFunBonif() {
		return funBonif;
	}

	public void setFunBonif(String funBonif) {
		this.funBonif = funBonif;
	}

	public Long getIdHisPerso() {
		return idHisPerso;
	}

	public void setIdHisPerso(Long idHisPerso) {
		this.idHisPerso = idHisPerso;
	}

	public Long getIdPerso() {
		return idPerso;
	}

	public void setIdPerso(Long idPerso) {
		this.idPerso = idPerso;
	}

	public Long getIdOrgEleme() {
		return idOrgEleme;
	}

	public void setIdOrgEleme(Long idOrgEleme) {
		this.idOrgEleme = idOrgEleme;
	}

	public Short getProvincia() {
		return provincia;
	}

	public void setProvincia(Short provincia) {
		this.provincia = provincia;
	}

	public Short getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Short municipio) {
		this.municipio = municipio;
	}

	public String getPueblo() {
		return pueblo;
	}

	public void setPueblo(String pueblo) {
		this.pueblo = pueblo;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getCodPosta() {
		return codPosta;
	}

	public void setCodPosta(Integer codPosta) {
		this.codPosta = codPosta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getTara() {
		return tara;
	}

	public void setTara(Integer tara) {
		this.tara = tara;
	}

	public Integer getMma() {
		return mma;
	}

	public void setMma(Integer mma) {
		this.mma = mma;
	}

	public String getClaSegur() {
		return claSegur;
	}

	public void setClaSegur(String claSegur) {
		this.claSegur = claSegur;
	}

	public Integer getCodComSegur() {
		return codComSegur;
	}

	public void setCodComSegur(Integer codComSegur) {
		this.codComSegur = codComSegur;
	}

	public String getNumPoliz() {
		return numPoliz;
	}

	public void setNumPoliz(String numPoliz) {
		this.numPoliz = numPoliz;
	}

	public java.sql.Date getFecSegur() {
		return fecSegur;
	}

	public void setFecSegur(java.sql.Date fecSegur) {
		this.fecSegur = fecSegur;
	}

	public java.sql.Date getFecVenci() {
		return fecVenci;
	}

	public void setFecVenci(java.sql.Date fecVenci) {
		this.fecVenci = fecVenci;
	}

	public Long getIdHisTomad() {
		return idHisTomad;
	}

	public void setIdHisTomad(Long idHisTomad) {
		this.idHisTomad = idHisTomad;
	}

	public Long getIdTomad() {
		return idTomad;
	}

	public void setIdTomad(Long idTomad) {
		this.idTomad = idTomad;
	}

	public Long getCodConju() {
		return codConju;
	}

	public void setCodConju(Long codConju) {
		this.codConju = codConju;
	}

	public Long getCodArchi() {
		return codArchi;
	}

	public void setCodArchi(Long codArchi) {
		this.codArchi = codArchi;
	}

	public Long getCodProgr() {
		return codProgr;
	}

	public void setCodProgr(Long codProgr) {
		this.codProgr = codProgr;
	}

	public Long getIdHisObjTribu() {
		return idHisObjTribu;
	}

	public void setIdHisObjTribu(Long idHisObjTribu) {
		this.idHisObjTribu = idHisObjTribu;
	}

	public Long getIdObjTribu() {
		return idObjTribu;
	}

	public void setIdObjTribu(Long idObjTribu) {
		this.idObjTribu = idObjTribu;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getMom() {
		return mom;
	}

	public void setMom(Integer mom) {
		this.mom = mom;
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}

	public String getCatElect() {
		return catElect;
	}

	public void setCatElect(String catElect) {
		this.catElect = catElect;
	}

	public Integer getAutElect() {
		return autElect;
	}

	public void setAutElect(Integer autElect) {
		this.autElect = autElect;
	}

	public String getClaAmbie() {
		return claAmbie;
	}

	public void setClaAmbie(String claAmbie) {
		this.claAmbie = claAmbie;
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

	public Vehiculo() {
		super();
	}

}
