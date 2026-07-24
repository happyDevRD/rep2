package com.greenaall.models.ad.entity;

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

/**
*
* @author jmmoyano
*/

@Entity
@Table(name = "ad_organizacion_elemento")
public class OrganizacionElemento implements Serializable {

	private static final long serialVersionUID = -3787050122064773054L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_org_eleme")
    private Long idOrgEleme;
	@Column(name = "id_organ")
    private Long idOrgan;
    @Basic(optional = false)
    @Column(name = "cad_eleme")
    private String cadEleme;
    @Basic(optional = false)
    @Column(name = "des_eleme")
    private String desEleme;
    @Basic(optional = false)
    @Column(name = "accesible")
    private boolean accesible;
    @Column(name = "organo")
    private String organo;
    @Column(name = "usu_contr")
    private String usuContr;
    @Column(name = "id_org_ele_padre")
    private Long idOrgElePadre;
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;
    
    /*
    @OneToMany(mappedBy = "idOrgElePadre")
    private List<OrganizacionElemento> adOrganizacionElementoList;
    @JoinColumn(name = "id_org_ele_padre", referencedColumnName = "id_org_eleme")
    @ManyToOne
    private OrganizacionElemento idOrgElePadre;*/

    
    public OrganizacionElemento(Long idOrgEleme){
        this.idOrgEleme=idOrgEleme;
    }


	public Long getIdOrgEleme() {
		return idOrgEleme;
	}


	public void setIdOrgEleme(Long idOrgEleme) {
		this.idOrgEleme = idOrgEleme;
	}


	public String getCadEleme() {
		return cadEleme;
	}


	public void setCadEleme(String cadEleme) {
		this.cadEleme = cadEleme;
	}


	public String getDesEleme() {
		return desEleme;
	}


	public void setDesEleme(String desEleme) {
		this.desEleme = desEleme;
	}


	public boolean isAccesible() {
		return accesible;
	}


	public void setAccesible(boolean accesible) {
		this.accesible = accesible;
	}


	public String getOrgano() {
		return organo;
	}


	public void setOrgano(String organo) {
		this.organo = organo;
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


/*	public Organizacion getIdOrgan() {
		return idOrgan;
	}


	public void setIdOrgan(Organizacion idOrgan) {
		this.idOrgan = idOrgan;
	}


	public List<OrganizacionElemento> getAdOrganizacionElementoList() {
		return adOrganizacionElementoList;
	}


	public void setAdOrganizacionElementoList(List<OrganizacionElemento> adOrganizacionElementoList) {
		this.adOrganizacionElementoList = adOrganizacionElementoList;
	}


	public OrganizacionElemento getIdOrgElePadre() {
		return idOrgElePadre;
	}


	public void setIdOrgElePadre(OrganizacionElemento idOrgElePadre) {
		this.idOrgElePadre = idOrgElePadre;
	}
*/
	

	public OrganizacionElemento() {
		super();
	}


	public Long getIdOrgElePadre() {
		return idOrgElePadre;
	}


	public void setIdOrgElePadre(Long idOrgElePadre) {
		this.idOrgElePadre = idOrgElePadre;
	}


	public Long getIdOrgan() {
		return idOrgan;
	}


	public void setIdOrgan(Long idOrgan) {
		this.idOrgan = idOrgan;
	}
    
}
