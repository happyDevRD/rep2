package com.greenaall.models.pe.entity;

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
@Table(name = "pe_modelo_teu")
public class ModeloTeu implements Serializable {

	private static final long serialVersionUID = 7213577829413436602L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_model")
	private Long idModel;

	@Column(name = "est_activ")
	private Short estActiv;

	@Column(name = "des_model")
	private String desModel;

	@Column(name = "tit_model")
	private String titModel;

	@Column(name = "tex_legal")
	private String texLegal;

	@Column(name = "tex_legal_idioma")
	private String texLegalIdioma;

	@Column(name = "camp01")
	private String camp01;

	@Column(name = "camp02")
	private String camp02;

	@Column(name = "camp03")
	private String camp03;

	@Column(name = "camp04")
	private String camp04;

	@Column(name = "camp05")
	private String camp05;

	@Column(name = "camp06")
	private String camp06;

	@Column(name = "camp07")
	private String camp07;

	@Column(name = "camp08")
	private String camp08;

	@Column(name = "camp09")
	private String camp09;

	@Column(name = "camp10")
	private String camp10;

	@Column(name = "camp11")
	private String camp11;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdModel() {
		return idModel;
	}

	public void setIdModel(Long idModel) {
		this.idModel = idModel;
	}

	public Short getEstActiv() {
		return estActiv;
	}

	public void setEstActiv(Short estActiv) {
		this.estActiv = estActiv;
	}

	public String getDesModel() {
		return desModel;
	}

	public void setDesModel(String desModel) {
		this.desModel = desModel;
	}

	public String getTitModel() {
		return titModel;
	}

	public void setTitModel(String titModel) {
		this.titModel = titModel;
	}

	public String getTexLegal() {
		return texLegal;
	}

	public void setTexLegal(String texLegal) {
		this.texLegal = texLegal;
	}

	public String getTexLegalIdioma() {
		return texLegalIdioma;
	}

	public void setTexLegalIdioma(String texLegalIdioma) {
		this.texLegalIdioma = texLegalIdioma;
	}

	public String getCamp01() {
		return camp01;
	}

	public void setCamp01(String camp01) {
		this.camp01 = camp01;
	}

	public String getCamp02() {
		return camp02;
	}

	public void setCamp02(String camp02) {
		this.camp02 = camp02;
	}

	public String getCamp03() {
		return camp03;
	}

	public void setCamp03(String camp03) {
		this.camp03 = camp03;
	}

	public String getCamp04() {
		return camp04;
	}

	public void setCamp04(String camp04) {
		this.camp04 = camp04;
	}

	public String getCamp05() {
		return camp05;
	}

	public void setCamp05(String camp05) {
		this.camp05 = camp05;
	}

	public String getCamp06() {
		return camp06;
	}

	public void setCamp06(String camp06) {
		this.camp06 = camp06;
	}

	public String getCamp07() {
		return camp07;
	}

	public void setCamp07(String camp07) {
		this.camp07 = camp07;
	}

	public String getCamp08() {
		return camp08;
	}

	public void setCamp08(String camp08) {
		this.camp08 = camp08;
	}

	public String getCamp09() {
		return camp09;
	}

	public void setCamp09(String camp09) {
		this.camp09 = camp09;
	}

	public String getCamp10() {
		return camp10;
	}

	public void setCamp10(String camp10) {
		this.camp10 = camp10;
	}

	public String getCamp11() {
		return camp11;
	}

	public void setCamp11(String camp11) {
		this.camp11 = camp11;
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

	public ModeloTeu() {
		super();
	}
		
}
