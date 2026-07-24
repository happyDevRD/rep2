
package es.greenaall.gos.ge.dto.xsd;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetadatoGrupoAtributo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MetadatoGrupoAtributo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="desGruAtrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etiGruAtrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="filtrable" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="idAtrib" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idGrupo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="modificable" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numOrdPanta" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="requerido" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="reservado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="usuContr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valInici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valMaxim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valMinim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visWeb" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadatoGrupoAtributo", propOrder = {
    "desGruAtrib",
    "etiGruAtrib",
    "fecContr",
    "filtrable",
    "idAtrib",
    "idGrupo",
    "modificable",
    "numOrdPanta",
    "requerido",
    "reservado",
    "usuContr",
    "valInici",
    "valMaxim",
    "valMinim",
    "visWeb",
    "visible"
})
public class MetadatoGrupoAtributo {

    @XmlElementRef(name = "desGruAtrib", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desGruAtrib;
    @XmlElementRef(name = "etiGruAtrib", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etiGruAtrib;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "filtrable", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> filtrable;
    @XmlElementRef(name = "idAtrib", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idAtrib;
    @XmlElementRef(name = "idGrupo", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idGrupo;
    @XmlElementRef(name = "modificable", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modificable;
    @XmlElementRef(name = "numOrdPanta", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numOrdPanta;
    @XmlElementRef(name = "requerido", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> requerido;
    @XmlElementRef(name = "reservado", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> reservado;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;
    @XmlElementRef(name = "valInici", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valInici;
    @XmlElementRef(name = "valMaxim", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valMaxim;
    @XmlElementRef(name = "valMinim", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valMinim;
    @XmlElementRef(name = "visWeb", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> visWeb;
    @XmlElementRef(name = "visible", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> visible;

    /**
     * Obtiene el valor de la propiedad desGruAtrib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesGruAtrib() {
        return desGruAtrib;
    }

    /**
     * Define el valor de la propiedad desGruAtrib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesGruAtrib(JAXBElement<String> value) {
        this.desGruAtrib = value;
    }

    /**
     * Obtiene el valor de la propiedad etiGruAtrib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtiGruAtrib() {
        return etiGruAtrib;
    }

    /**
     * Define el valor de la propiedad etiGruAtrib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtiGruAtrib(JAXBElement<String> value) {
        this.etiGruAtrib = value;
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
     * Obtiene el valor de la propiedad filtrable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFiltrable() {
        return filtrable;
    }

    /**
     * Define el valor de la propiedad filtrable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFiltrable(JAXBElement<Short> value) {
        this.filtrable = value;
    }

    /**
     * Obtiene el valor de la propiedad idAtrib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdAtrib() {
        return idAtrib;
    }

    /**
     * Define el valor de la propiedad idAtrib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdAtrib(JAXBElement<Long> value) {
        this.idAtrib = value;
    }

    /**
     * Obtiene el valor de la propiedad idGrupo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdGrupo() {
        return idGrupo;
    }

    /**
     * Define el valor de la propiedad idGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdGrupo(JAXBElement<Long> value) {
        this.idGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad modificable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getModificable() {
        return modificable;
    }

    /**
     * Define el valor de la propiedad modificable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setModificable(JAXBElement<Short> value) {
        this.modificable = value;
    }

    /**
     * Obtiene el valor de la propiedad numOrdPanta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumOrdPanta() {
        return numOrdPanta;
    }

    /**
     * Define el valor de la propiedad numOrdPanta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumOrdPanta(JAXBElement<Short> value) {
        this.numOrdPanta = value;
    }

    /**
     * Obtiene el valor de la propiedad requerido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRequerido() {
        return requerido;
    }

    /**
     * Define el valor de la propiedad requerido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRequerido(JAXBElement<Short> value) {
        this.requerido = value;
    }

    /**
     * Obtiene el valor de la propiedad reservado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getReservado() {
        return reservado;
    }

    /**
     * Define el valor de la propiedad reservado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setReservado(JAXBElement<Short> value) {
        this.reservado = value;
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

    /**
     * Obtiene el valor de la propiedad valInici.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValInici() {
        return valInici;
    }

    /**
     * Define el valor de la propiedad valInici.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValInici(JAXBElement<String> value) {
        this.valInici = value;
    }

    /**
     * Obtiene el valor de la propiedad valMaxim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValMaxim() {
        return valMaxim;
    }

    /**
     * Define el valor de la propiedad valMaxim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValMaxim(JAXBElement<String> value) {
        this.valMaxim = value;
    }

    /**
     * Obtiene el valor de la propiedad valMinim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValMinim() {
        return valMinim;
    }

    /**
     * Define el valor de la propiedad valMinim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValMinim(JAXBElement<String> value) {
        this.valMinim = value;
    }

    /**
     * Obtiene el valor de la propiedad visWeb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getVisWeb() {
        return visWeb;
    }

    /**
     * Define el valor de la propiedad visWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setVisWeb(JAXBElement<Short> value) {
        this.visWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad visible.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getVisible() {
        return visible;
    }

    /**
     * Define el valor de la propiedad visible.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setVisible(JAXBElement<Short> value) {
        this.visible = value;
    }

}
