package com.greenaall.models.ad.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ad_organizacion")
public class Organizacion implements Serializable{

	private static final long serialVersionUID = -488219028661081874L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_organ")
    private Long idOrgan;
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public Long getIdOrgan() {
        return idOrgan;
    }
    public void setIdOrgan(Long idOrgan) {
        this.idOrgan = idOrgan;
    }
    public short getCodOrgan() {
        return codOrgan;
    }
    public void setCodOrgan(short codOrgan) {
        this.codOrgan = codOrgan;
    }
    public String getDesOrgan() {
        return desOrgan;
    }
    public void setDesOrgan(String desOrgan) {
        this.desOrgan = desOrgan;
    }
    public short getTipOrgan() {
        return tipOrgan;
    }
    public void setTipOrgan(short tipOrgan) {
        this.tipOrgan = tipOrgan;
    }
    public boolean isDomCodif() {
        return domCodif;
    }
    public void setDomCodif(boolean domCodif) {
        this.domCodif = domCodif;
    }
    public Integer getCodPosta() {
        return codPosta;
    }
    public void setCodPosta(Integer codPosta) {
        this.codPosta = codPosta;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
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
    public List<OrganizacionElemento> getAdOrganizacionElementoList() {
        return adOrganizacionElementoList;
    }
    public void setAdOrganizacionElementoList(List<OrganizacionElemento> adOrganizacionElementoList) {
        this.adOrganizacionElementoList = adOrganizacionElementoList;
    }
    @Basic(optional = false)
    @Column(name = "cod_organ")
    private short codOrgan;
    @Basic(optional = false)
    @Column(name = "des_organ")
    private String desOrgan;
    @Basic(optional = false)
    @Column(name = "tip_organ")
    private short tipOrgan;
    @Basic(optional = false)
    @Column(name = "dom_codif")
    private boolean domCodif;
    @Column(name = "cod_posta")
    private Integer codPosta;
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "usu_contr")
    private String usuContr;
    @Column(name = "fec_contr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecContr;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrgan")
    private List<OrganizacionElemento> adOrganizacionElementoList;

}
