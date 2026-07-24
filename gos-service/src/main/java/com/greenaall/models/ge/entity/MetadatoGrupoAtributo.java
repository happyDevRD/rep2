package com.greenaall.models.ge.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ge_metadato_grupo_atrib")
@IdClass(MetadatoGrupoAtributoPK.class)
public class MetadatoGrupoAtributo implements Serializable {

	private static final long serialVersionUID = 8296227824020074449L;

	@Id
	@Column(name = "id_grupo")
	private Long idGrupo;

	@Id
	@Column(name = "eti_gru_atrib")
	private String etiGruAtrib;

	@Column(name = "id_atrib")
	private Long idAtrib;

	@Column(name = "des_gru_atrib")
	private String desGruAtrib;

	@Column(name = "reservado")
	private Short reservado;

	@Column(name = "requerido")
	private Short requerido;

	@Column(name = "modificable")
	private Short modificable;

	@Column(name = "visible")
	private Short visible;

	@Column(name = "filtrable")
	private Short filtrable;

	@Column(name = "num_ord_panta")
	private Short numOrdPanta;

	@Column(name = "val_inici")
	private String valInici;

	@Column(name = "val_minim")
	private String valMinim;

	@Column(name = "val_maxim")
	private String valMaxim;

	@Column(name = "vis_web")
	private java.lang.Short visWeb;

	@Column(name = "usu_contr")
	private String usuContr;

	@Column(name = "fec_contr")
    @Temporal(TemporalType.DATE)
	private java.util.Date fecContr;

	public java.lang.Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(java.lang.Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getEtiGruAtrib() {
		return etiGruAtrib;
	}

	public void setEtiGruAtrib(String etiGruAtrib) {
		this.etiGruAtrib = etiGruAtrib;
	}

	public java.lang.Long getIdAtrib() {
		return idAtrib;
	}

	public void setIdAtrib(java.lang.Long idAtrib) {
		this.idAtrib = idAtrib;
	}

	public String getDesGruAtrib() {
		return desGruAtrib;
	}

	public void setDesGruAtrib(String desGruAtrib) {
		this.desGruAtrib = desGruAtrib;
	}

	public Short getReservado() {
		return reservado;
	}

	public void setReservado(Short reservado) {
		this.reservado = reservado;
	}

	public Short getRequerido() {
		return requerido;
	}

	public void setRequerido(Short requerido) {
		this.requerido = requerido;
	}

	public Short getModificable() {
		return modificable;
	}

	public void setModificable(Short modificable) {
		this.modificable = modificable;
	}

	public Short getVisible() {
		return visible;
	}

	public void setVisible(Short visible) {
		this.visible = visible;
	}

	public Short getFiltrable() {
		return filtrable;
	}

	public void setFiltrable(Short filtrable) {
		this.filtrable = filtrable;
	}

	public Short getNumOrdPanta() {
		return numOrdPanta;
	}

	public void setNumOrdPanta(Short numOrdPanta) {
		this.numOrdPanta = numOrdPanta;
	}

	public String getValInici() {
		return valInici;
	}

	public void setValInici(String valInici) {
		this.valInici = valInici;
	}

	public String getValMinim() {
		return valMinim;
	}

	public void setValMinim(String valMinim) {
		this.valMinim = valMinim;
	}

	public String getValMaxim() {
		return valMaxim;
	}

	public void setValMaxim(String valMaxim) {
		this.valMaxim = valMaxim;
	}

	public java.lang.Short getVisWeb() {
		return visWeb;
	}

	public void setVisWeb(java.lang.Short visWeb) {
		this.visWeb = visWeb;
	}

	public String getUsuContr() {
		return usuContr;
	}

	public void setUsuContr(String usuContr) {
		this.usuContr = usuContr;
	}

	public java.util.Date getFecContr() {
		return fecContr;
	}

	public void setFecContr(java.util.Date fecContr) {
		this.fecContr = fecContr;
	}

	public MetadatoGrupoAtributo() {
		super();
	}
}
