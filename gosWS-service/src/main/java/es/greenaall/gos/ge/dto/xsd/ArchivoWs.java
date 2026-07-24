
package es.greenaall.gos.ge.dto.xsd;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArchivoWs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArchivoWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codArchi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codConju" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codProgr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codTipSopor" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desArchi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desDocum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecEstado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecGenera" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecUltim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="huella" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idOrgEleUbica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPeticion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="indCusto" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numImpre" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numItems" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="plantilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refGesDocum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipDocum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tipFiche" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="usuContr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchivoWs", propOrder = {
    "codArchi",
    "codConju",
    "codEntid",
    "codProgr",
    "codTipSopor",
    "desArchi",
    "desDocum",
    "estado",
    "fecContr",
    "fecEstado",
    "fecGenera",
    "fecUltim",
    "huella",
    "idOrgEleUbica",
    "idPeticion",
    "indCusto",
    "modulo",
    "numImpre",
    "numItems",
    "plantilla",
    "refGesDocum",
    "tipDocum",
    "tipFiche",
    "usuContr"
})
public class ArchivoWs {

    @XmlElementRef(name = "codArchi", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codArchi;
    @XmlElementRef(name = "codConju", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codConju;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codProgr", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codProgr;
    @XmlElementRef(name = "codTipSopor", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codTipSopor;
    @XmlElementRef(name = "desArchi", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desArchi;
    @XmlElementRef(name = "desDocum", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desDocum;
    @XmlElementRef(name = "estado", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> estado;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "fecEstado", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecEstado;
    @XmlElementRef(name = "fecGenera", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecGenera;
    @XmlElementRef(name = "fecUltim", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecUltim;
    @XmlElementRef(name = "huella", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> huella;
    @XmlElementRef(name = "idOrgEleUbica", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOrgEleUbica;
    @XmlElementRef(name = "idPeticion", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idPeticion;
    @XmlElementRef(name = "indCusto", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indCusto;
    @XmlElementRef(name = "modulo", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modulo;
    @XmlElementRef(name = "numImpre", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numImpre;
    @XmlElementRef(name = "numItems", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numItems;
    @XmlElementRef(name = "plantilla", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plantilla;
    @XmlElementRef(name = "refGesDocum", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refGesDocum;
    @XmlElementRef(name = "tipDocum", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tipDocum;
    @XmlElementRef(name = "tipFiche", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipFiche;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;

    /**
     * Obtiene el valor de la propiedad codArchi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodArchi() {
        return codArchi;
    }

    /**
     * Define el valor de la propiedad codArchi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodArchi(JAXBElement<Long> value) {
        this.codArchi = value;
    }

    /**
     * Obtiene el valor de la propiedad codConju.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodConju() {
        return codConju;
    }

    /**
     * Define el valor de la propiedad codConju.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodConju(JAXBElement<Long> value) {
        this.codConju = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodEntid() {
        return codEntid;
    }

    /**
     * Define el valor de la propiedad codEntid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodEntid(JAXBElement<Short> value) {
        this.codEntid = value;
    }

    /**
     * Obtiene el valor de la propiedad codProgr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodProgr() {
        return codProgr;
    }

    /**
     * Define el valor de la propiedad codProgr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodProgr(JAXBElement<Long> value) {
        this.codProgr = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipSopor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodTipSopor() {
        return codTipSopor;
    }

    /**
     * Define el valor de la propiedad codTipSopor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodTipSopor(JAXBElement<Short> value) {
        this.codTipSopor = value;
    }

    /**
     * Obtiene el valor de la propiedad desArchi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesArchi() {
        return desArchi;
    }

    /**
     * Define el valor de la propiedad desArchi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesArchi(JAXBElement<String> value) {
        this.desArchi = value;
    }

    /**
     * Obtiene el valor de la propiedad desDocum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesDocum() {
        return desDocum;
    }

    /**
     * Define el valor de la propiedad desDocum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesDocum(JAXBElement<String> value) {
        this.desDocum = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEstado(JAXBElement<Short> value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecContr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecContr() {
        return fecContr;
    }

    /**
     * Define el valor de la propiedad fecContr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecContr(JAXBElement<XMLGregorianCalendar> value) {
        this.fecContr = value;
    }

    /**
     * Obtiene el valor de la propiedad fecEstado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecEstado() {
        return fecEstado;
    }

    /**
     * Define el valor de la propiedad fecEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecEstado(JAXBElement<XMLGregorianCalendar> value) {
        this.fecEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecGenera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecGenera() {
        return fecGenera;
    }

    /**
     * Define el valor de la propiedad fecGenera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecGenera(JAXBElement<XMLGregorianCalendar> value) {
        this.fecGenera = value;
    }

    /**
     * Obtiene el valor de la propiedad fecUltim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecUltim() {
        return fecUltim;
    }

    /**
     * Define el valor de la propiedad fecUltim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecUltim(JAXBElement<XMLGregorianCalendar> value) {
        this.fecUltim = value;
    }

    /**
     * Obtiene el valor de la propiedad huella.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHuella() {
        return huella;
    }

    /**
     * Define el valor de la propiedad huella.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHuella(JAXBElement<String> value) {
        this.huella = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrgEleUbica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOrgEleUbica() {
        return idOrgEleUbica;
    }

    /**
     * Define el valor de la propiedad idOrgEleUbica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOrgEleUbica(JAXBElement<Long> value) {
        this.idOrgEleUbica = value;
    }

    /**
     * Obtiene el valor de la propiedad idPeticion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdPeticion() {
        return idPeticion;
    }

    /**
     * Define el valor de la propiedad idPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdPeticion(JAXBElement<Long> value) {
        this.idPeticion = value;
    }

    /**
     * Obtiene el valor de la propiedad indCusto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndCusto() {
        return indCusto;
    }

    /**
     * Define el valor de la propiedad indCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndCusto(JAXBElement<Short> value) {
        this.indCusto = value;
    }

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setModulo(JAXBElement<Short> value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad numImpre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumImpre() {
        return numImpre;
    }

    /**
     * Define el valor de la propiedad numImpre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumImpre(JAXBElement<Long> value) {
        this.numImpre = value;
    }

    /**
     * Obtiene el valor de la propiedad numItems.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumItems() {
        return numItems;
    }

    /**
     * Define el valor de la propiedad numItems.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumItems(JAXBElement<Short> value) {
        this.numItems = value;
    }

    /**
     * Obtiene el valor de la propiedad plantilla.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlantilla() {
        return plantilla;
    }

    /**
     * Define el valor de la propiedad plantilla.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlantilla(JAXBElement<String> value) {
        this.plantilla = value;
    }

    /**
     * Obtiene el valor de la propiedad refGesDocum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefGesDocum() {
        return refGesDocum;
    }

    /**
     * Define el valor de la propiedad refGesDocum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefGesDocum(JAXBElement<String> value) {
        this.refGesDocum = value;
    }

    /**
     * Obtiene el valor de la propiedad tipDocum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTipDocum() {
        return tipDocum;
    }

    /**
     * Define el valor de la propiedad tipDocum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTipDocum(JAXBElement<Long> value) {
        this.tipDocum = value;
    }

    /**
     * Obtiene el valor de la propiedad tipFiche.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipFiche() {
        return tipFiche;
    }

    /**
     * Define el valor de la propiedad tipFiche.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipFiche(JAXBElement<Short> value) {
        this.tipFiche = value;
    }

    /**
     * Obtiene el valor de la propiedad usuContr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuContr() {
        return usuContr;
    }

    /**
     * Define el valor de la propiedad usuContr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuContr(JAXBElement<String> value) {
        this.usuContr = value;
    }

}
