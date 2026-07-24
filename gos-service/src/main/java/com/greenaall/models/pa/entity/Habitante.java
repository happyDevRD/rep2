package com.greenaall.models.pa.entity;

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
@IdClass(HabitantePK.class)
@Table(name = "pa_habitante")
public class Habitante implements Serializable  {

	private static final long serialVersionUID = 829310662851993122L;
	public final static Integer MUJER = Integer.valueOf(6);
	public final static Integer HOMBRE = Integer.valueOf(1);
	public final static Integer PROCEDENCIA_INICIAL = Integer.valueOf(1);
	public final static Integer PROCEDENCIA_USUARIO = Integer.valueOf(2);
	public final static Integer PROCEDENCIA_INE = Integer.valueOf(3);
	public final static Short SHORT_PROTEGIDO = Short.valueOf("0");
	public final static Integer INTEGER_PROTEGIDO = Integer.valueOf(0);
	public final static java.sql.Date DATE_PROTEGIDO = java.sql.Date.valueOf("1800-01-01");
	public static final Integer TARJETA_RESIDENCIA = Integer.valueOf(3);
	public static final Short RESIDENCIA_PERMANENTE = Short.valueOf("1");
	public static final Integer DATOS_PROTEGIDOS = Integer.valueOf(1);
	public static final Short BLOQUEO_LOPD = Short.valueOf("1");
	public static final Short ACCESO_DATOS_RESTRINGIDOS = Short.valueOf("1");
	public static final Short NO_ACCESO_DATOS_RESTRINGIDOS = Short.valueOf("0");

	@Id
	@Column(name = "id_his_habit")
	private Long idHisHabit;

	@Id
	@Column(name = "id_habit")
	private Long idHabit;

	@Column(name = "fec_movim")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecMovim;

	@Column(name = "cod_movim")
	private String codMovim;

	@Column(name = "cau_movim")
	private Short cauMovim;

	@Column(name = "reg_activ")
	private Short regActiv;

	@Column(name = "cod_entid")
	private Short codEntid;

	@Column(name = "distrito")
	private Short distrito;

	@Column(name = "seccion")
	private String seccion;

	@Column(name = "num_hoj_padro")
	private String numHojPadro;

	@Column(name = "num_famil")
	private Integer numFamil;

	@Column(name = "num_orden")
	private Integer numOrden;

	@Column(name = "cod_paren")
	private Integer codParen;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "particula1")
	private String particula1;

	@Column(name = "apellido1")
	private String apellido1;

	@Column(name = "particula2")
	private String particula2;

	@Column(name = "apellido2")
	private String apellido2;

	@Column(name = "tip_docum")
	private Integer tipDocum;

	@Column(name = "num_docum")
	private String numDocum;

	@Column(name = "doc_previo")
	private String docPrevio;

	@Column(name = "fec_con_docum")
	private java.sql.Date fecConDocum;

	@Column(name = "fec_cad_docum")
	private java.sql.Date fecCadDocum;

	@Column(name = "dur_tar_resid")
	private Integer durTarResid;

	@Column(name = "sexo")
	private Integer sexo;

	@Column(name = "est_civil")
	private Integer estCivil;

	@Column(name = "nia")
	private String nia;

	@Column(name = "nie")
	private String nie;

	@Column(name = "cod_niv_instr")
	private Integer codNivInstr;

	@Column(name = "cod_estud")
	private String codEstud;

	@Column(name = "cod_cno")
	private String codCno;

	@Column(name = "nacionalidad")
	private Short nacionalidad;

	@Column(name = "sit_resid")
	private Integer sitResid;

	@Column(name = "fec_nacim")
	private java.sql.Date fecNacim;

	@Column(name = "pai_nacim")
	private Integer paiNacim;

	@Column(name = "pro_nacim")
	private Short proNacim;

	@Column(name = "mun_nacim")
	private Short munNacim;

	@Column(name = "pai_pro_desti")
	private Short paiProDesti;

	@Column(name = "pro_pro_desti")
	private Short proProDesti;

	@Column(name = "mun_pro_desti")
	private Short munProDesti;

	@Column(name = "pai_con_pro_desti")
	private Short paiConProDesti;

	@Column(name = "con_pro_desti")
	private Short conProDesti;

	@Column(name = "id_his_domic")
	private Long idHisDomic;

	@Column(name = "id_domic")
	private Long idDomic;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "email")
	private String email;

	@Column(name = "fac_repre")
	private Integer facRepre;

	@Column(name = "niv_acces")
	private Integer nivAcces;

	@Column(name = "fec_real")
	private Date fecReal;

	@Column(name = "fec_padro")
	private java.sql.Date fecPadro;

	@Column(name = "fec_envio")
	private java.sql.Date fecEnvio;

	@Column(name = "tar_perma")
	private Short tarPerma;

	@Column(name = "fec_renov")
	private java.sql.Date fecRenov;

	@Column(name = "pro_movim")
	private Integer proMovim;

	@Column(name = "anotaciones")
	private String anotaciones;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "cod_conju")
	private Long codConju;

	@Column(name = "ind_conse")
	private Integer indConse;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Long getIdHisHabit() {
		return idHisHabit;
	}

	public void setIdHisHabit(Long idHisHabit) {
		this.idHisHabit = idHisHabit;
	}

	public Long getIdHabit() {
		return idHabit;
	}

	public void setIdHabit(Long idHabit) {
		this.idHabit = idHabit;
	}

	public Date getFecMovim() {
		return fecMovim;
	}

	public void setFecMovim(Date fecMovim) {
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

	public Short getRegActiv() {
		return regActiv;
	}

	public void setRegActiv(Short regActiv) {
		this.regActiv = regActiv;
	}

	public Short getCodEntid() {
		return codEntid;
	}

	public void setCodEntid(Short codEntid) {
		this.codEntid = codEntid;
	}

	public Short getDistrito() {
		return distrito;
	}

	public void setDistrito(Short distrito) {
		this.distrito = distrito;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getNumHojPadro() {
		return numHojPadro;
	}

	public void setNumHojPadro(String numHojPadro) {
		this.numHojPadro = numHojPadro;
	}

	public Integer getNumFamil() {
		return numFamil;
	}

	public void setNumFamil(Integer numFamil) {
		this.numFamil = numFamil;
	}

	public Integer getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(Integer numOrden) {
		this.numOrden = numOrden;
	}

	public Integer getCodParen() {
		return codParen;
	}

	public void setCodParen(Integer codParen) {
		this.codParen = codParen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getParticula1() {
		return particula1;
	}

	public void setParticula1(String particula1) {
		this.particula1 = particula1;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getParticula2() {
		return particula2;
	}

	public void setParticula2(String particula2) {
		this.particula2 = particula2;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Integer getTipDocum() {
		return tipDocum;
	}

	public void setTipDocum(Integer tipDocum) {
		this.tipDocum = tipDocum;
	}

	public String getNumDocum() {
		return numDocum;
	}

	public void setNumDocum(String numDocum) {
		this.numDocum = numDocum;
	}

	public String getDocPrevio() {
		return docPrevio;
	}

	public void setDocPrevio(String docPrevio) {
		this.docPrevio = docPrevio;
	}

	public java.sql.Date getFecConDocum() {
		return fecConDocum;
	}

	public void setFecConDocum(java.sql.Date fecConDocum) {
		this.fecConDocum = fecConDocum;
	}

	public java.sql.Date getFecCadDocum() {
		return fecCadDocum;
	}

	public void setFecCadDocum(java.sql.Date fecCadDocum) {
		this.fecCadDocum = fecCadDocum;
	}

	public Integer getDurTarResid() {
		return durTarResid;
	}

	public void setDurTarResid(Integer durTarResid) {
		this.durTarResid = durTarResid;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Integer getEstCivil() {
		return estCivil;
	}

	public void setEstCivil(Integer estCivil) {
		this.estCivil = estCivil;
	}

	public String getNia() {
		return nia;
	}

	public void setNia(String nia) {
		this.nia = nia;
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public Integer getCodNivInstr() {
		return codNivInstr;
	}

	public void setCodNivInstr(Integer codNivInstr) {
		this.codNivInstr = codNivInstr;
	}

	public String getCodEstud() {
		return codEstud;
	}

	public void setCodEstud(String codEstud) {
		this.codEstud = codEstud;
	}

	public String getCodCno() {
		return codCno;
	}

	public void setCodCno(String codCno) {
		this.codCno = codCno;
	}

	public Short getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Short nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Integer getSitResid() {
		return sitResid;
	}

	public void setSitResid(Integer sitResid) {
		this.sitResid = sitResid;
	}

	public java.sql.Date getFecNacim() {
		return fecNacim;
	}

	public void setFecNacim(java.sql.Date fecNacim) {
		this.fecNacim = fecNacim;
	}

	public Integer getPaiNacim() {
		return paiNacim;
	}

	public void setPaiNacim(Integer paiNacim) {
		this.paiNacim = paiNacim;
	}

	public Short getProNacim() {
		return proNacim;
	}

	public void setProNacim(Short proNacim) {
		this.proNacim = proNacim;
	}

	public Short getMunNacim() {
		return munNacim;
	}

	public void setMunNacim(Short munNacim) {
		this.munNacim = munNacim;
	}

	public Short getPaiProDesti() {
		return paiProDesti;
	}

	public void setPaiProDesti(Short paiProDesti) {
		this.paiProDesti = paiProDesti;
	}

	public Short getProProDesti() {
		return proProDesti;
	}

	public void setProProDesti(Short proProDesti) {
		this.proProDesti = proProDesti;
	}

	public Short getMunProDesti() {
		return munProDesti;
	}

	public void setMunProDesti(Short munProDesti) {
		this.munProDesti = munProDesti;
	}

	public Short getPaiConProDesti() {
		return paiConProDesti;
	}

	public void setPaiConProDesti(Short paiConProDesti) {
		this.paiConProDesti = paiConProDesti;
	}

	public Short getConProDesti() {
		return conProDesti;
	}

	public void setConProDesti(Short conProDesti) {
		this.conProDesti = conProDesti;
	}

	public Long getIdHisDomic() {
		return idHisDomic;
	}

	public void setIdHisDomic(Long idHisDomic) {
		this.idHisDomic = idHisDomic;
	}

	public Long getIdDomic() {
		return idDomic;
	}

	public void setIdDomic(Long idDomic) {
		this.idDomic = idDomic;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getFacRepre() {
		return facRepre;
	}

	public void setFacRepre(Integer facRepre) {
		this.facRepre = facRepre;
	}

	public Integer getNivAcces() {
		return nivAcces;
	}

	public void setNivAcces(Integer nivAcces) {
		this.nivAcces = nivAcces;
	}

	public Date getFecReal() {
		return fecReal;
	}

	public void setFecReal(Date fecReal) {
		this.fecReal = fecReal;
	}

	public java.sql.Date getFecPadro() {
		return fecPadro;
	}

	public void setFecPadro(java.sql.Date fecPadro) {
		this.fecPadro = fecPadro;
	}

	public java.sql.Date getFecEnvio() {
		return fecEnvio;
	}

	public void setFecEnvio(java.sql.Date fecEnvio) {
		this.fecEnvio = fecEnvio;
	}

	public Short getTarPerma() {
		return tarPerma;
	}

	public void setTarPerma(Short tarPerma) {
		this.tarPerma = tarPerma;
	}

	public java.sql.Date getFecRenov() {
		return fecRenov;
	}

	public void setFecRenov(java.sql.Date fecRenov) {
		this.fecRenov = fecRenov;
	}

	public Integer getProMovim() {
		return proMovim;
	}

	public void setProMovim(Integer proMovim) {
		this.proMovim = proMovim;
	}

	public String getAnotaciones() {
		return anotaciones;
	}

	public void setAnotaciones(String anotaciones) {
		this.anotaciones = anotaciones;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getCodConju() {
		return codConju;
	}

	public void setCodConju(Long codConju) {
		this.codConju = codConju;
	}

	public Integer getIndConse() {
		return indConse;
	}

	public void setIndConse(Integer indConse) {
		this.indConse = indConse;
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

}
