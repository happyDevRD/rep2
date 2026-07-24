package com.greenaall.models.co.entity;

import java.io.Serializable;
import java.sql.Blob;
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
@Table(name = "co_contabilidad")
public class Contabilidad implements Serializable {

	private static final long serialVersionUID = -3116208303029535398L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conta")
	private Long idConta;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "eje_conta")
	private Short ejeConta;

	@Column(name = "ind_estad")
	private Short indEstad;

	@Column(name = "ind_est_aprobacion")
	private Short indEstAprobacion;

	@Column(name = "ind_acces")
	private Short indAcces;

	@Column(name = "rot_conta")
	private String rotConta;

	@Column(name = "logotipo")
	private Blob logotipo;

	@Column(name = "id_con_orige")
	private Long idConOrige;

	@Column(name = "apl_orige")
	private Short aplOrige;

	@Column(name = "ind_ges_desce")
	private Short indGesDesce;

	@Column(name = "ind_con_ori_cerr")
	private Short indConOriCerr;

	@Column(name = "cod_con_exter")
	private Short codConExter;

	@Column(name = "id_con_matri")
	private Long idConMatri;

	@Column(name = "id_gru_cla_organ")
	private Long idGruClaOrgan;

	@Column(name = "id_gru_cla_funci")
	private Long idGruClaFunci;

	@Column(name = "id_gru_cla_econo")
	private Long idGruClaEcono;

	@Column(name = "id_gru_cta_pgcp")
	private Long idGruCtaPgcp;

	@Column(name = "id_gru_cod_opera")
	private Long idGruCodOpera;

	@Column(name = "ind_model")
	private Short indModel;

	@Column(name = "ind_regio")
	private Short indRegio;

	@Column(name = "usu_contr")
	private String usuContr;

	@Temporal(TemporalType.DATE)
	@Column(name = "fec_contr")
	private Date fecContr;

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

	public Short getEjeConta() {
		return ejeConta;
	}

	public void setEjeConta(Short ejeConta) {
		this.ejeConta = ejeConta;
	}

	public Short getIndEstad() {
		return indEstad;
	}

	public void setIndEstad(Short indEstad) {
		this.indEstad = indEstad;
	}

	public Short getIndEstAprobacion() {
		return indEstAprobacion;
	}

	public void setIndEstAprobacion(Short indEstAprobacion) {
		this.indEstAprobacion = indEstAprobacion;
	}

	public Short getIndAcces() {
		return indAcces;
	}

	public void setIndAcces(Short indAcces) {
		this.indAcces = indAcces;
	}

	public String getRotConta() {
		return rotConta;
	}

	public void setRotConta(String rotConta) {
		this.rotConta = rotConta;
	}

	public Blob  getLogotipo() {
		return logotipo;
	}

	public void setLogotipo(Blob  logotipo) {
		this.logotipo = logotipo;
	}

	public Long getIdConOrige() {
		return idConOrige;
	}

	public void setIdConOrige(Long idConOrige) {
		this.idConOrige = idConOrige;
	}

	public Short getAplOrige() {
		return aplOrige;
	}

	public void setAplOrige(Short aplOrige) {
		this.aplOrige = aplOrige;
	}

	public Short getIndGesDesce() {
		return indGesDesce;
	}

	public void setIndGesDesce(Short indGesDesce) {
		this.indGesDesce = indGesDesce;
	}

	public Short getIndConOriCerr() {
		return indConOriCerr;
	}

	public void setIndConOriCerr(Short indConOriCerr) {
		this.indConOriCerr = indConOriCerr;
	}

	public Short getCodConExter() {
		return codConExter;
	}

	public void setCodConExter(Short codConExter) {
		this.codConExter = codConExter;
	}

	public Long getIdConMatri() {
		return idConMatri;
	}

	public void setIdConMatri(Long idConMatri) {
		this.idConMatri = idConMatri;
	}

	public Long getIdGruClaOrgan() {
		return idGruClaOrgan;
	}

	public void setIdGruClaOrgan(Long idGruClaOrgan) {
		this.idGruClaOrgan = idGruClaOrgan;
	}

	public Long getIdGruClaFunci() {
		return idGruClaFunci;
	}

	public void setIdGruClaFunci(Long idGruClaFunci) {
		this.idGruClaFunci = idGruClaFunci;
	}

	public Long getIdGruClaEcono() {
		return idGruClaEcono;
	}

	public void setIdGruClaEcono(Long idGruClaEcono) {
		this.idGruClaEcono = idGruClaEcono;
	}

	public Long getIdGruCtaPgcp() {
		return idGruCtaPgcp;
	}

	public void setIdGruCtaPgcp(Long idGruCtaPgcp) {
		this.idGruCtaPgcp = idGruCtaPgcp;
	}

	public Long getIdGruCodOpera() {
		return idGruCodOpera;
	}

	public void setIdGruCodOpera(Long idGruCodOpera) {
		this.idGruCodOpera = idGruCodOpera;
	}

	public Short getIndModel() {
		return indModel;
	}

	public void setIndModel(Short indModel) {
		this.indModel = indModel;
	}

	public Short getIndRegio() {
		return indRegio;
	}

	public void setIndRegio(Short indRegio) {
		this.indRegio = indRegio;
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

	public Contabilidad() {
		super();
	}
	
}
