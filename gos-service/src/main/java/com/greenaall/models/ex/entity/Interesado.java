package com.greenaall.models.ex.entity;

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
@Table(name = "ex_interesado")
public class Interesado implements Serializable {

	private static final long serialVersionUID = 3396264608571368619L;
	public static final Short FORMA_NOTIFICACION_PAPEL = Short.valueOf("0"); // correo postal
	public static final Short FORMA_NOTIFICACION_TELEMATICA = Short.valueOf("1"); // email
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "id_his_perso")
	private Long idHisPerso;
	
	@Column(name = "id_perso")
	private Long idPerso;

	@Column(name = "id_his_repre")
	private Long idHisRepre;
	
	@Column(name = "id_repre")
	private Long idRepre;

	@Column(name = "expediente")
	private Long expediente;

	@Basic(optional = false)
	@Column(name = "principal", columnDefinition = "default 0")
	private short principal;

	@Basic(optional = true)
	@Column(name = "for_notif")
	private short forNotif;

	@Basic(optional = true)
	@Column(name = "email_notif")
	private String emailNotif;

	@Column(name = "id_his_dom_notif")
	private Long idHisDomNotif;

	@Column(name = "id_dom_notif")
	private Long idDomNotif;
	
	@Column(name = "usu_contr")
	private String usuContr;
	@Column(name = "fec_contr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecContr;

	public Interesado() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getIdHisRepre() {
		return idHisRepre;
	}

	public void setIdHisRepre(Long idHisRepre) {
		this.idHisRepre = idHisRepre;
	}

	public Long getIdRepre() {
		return idRepre;
	}

	public void setIdRepre(Long idRepre) {
		this.idRepre = idRepre;
	}

	public Long getExpediente() {
		return expediente;
	}

	public void setExpediente(Long expediente) {
		this.expediente = expediente;
	}

	public short getPrincipal() {
		return principal;
	}

	public void setPrincipal(short principal) {
		this.principal = principal;
	}

	public short getForNotif() {
		return forNotif;
	}

	public void setForNotif(short forNotif) {
		this.forNotif = forNotif;
	}

	public String getEmailNotif() {
		return emailNotif;
	}

	public void setEmailNotif(String emailNotif) {
		this.emailNotif = emailNotif;
	}

	public Long getIdHisDomNotif() {
		return idHisDomNotif;
	}

	public void setIdHisDomNotif(Long idHisDomNotif) {
		this.idHisDomNotif = idHisDomNotif;
	}

	public Long getIdDomNotif() {
		return idDomNotif;
	}

	public void setIdDomNotif(Long idDomNotif) {
		this.idDomNotif = idDomNotif;
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
