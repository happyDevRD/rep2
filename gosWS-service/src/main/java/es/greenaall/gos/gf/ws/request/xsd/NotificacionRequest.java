
package es.greenaall.gos.gf.ws.request.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotificacionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotificacionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codArchi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="codArchiAcuse" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ejeNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="idNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numNotif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="situacion" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificacionRequest", propOrder = {
    "codArchi",
    "codArchiAcuse",
    "ejeNotif",
    "idNotif",
    "numNotif",
    "situacion"
})
public class NotificacionRequest {

    @XmlElementRef(name = "codArchi", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codArchi;
    @XmlElementRef(name = "codArchiAcuse", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> codArchiAcuse;
    @XmlElementRef(name = "ejeNotif", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeNotif;
    @XmlElementRef(name = "idNotif", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idNotif;
    @XmlElementRef(name = "numNotif", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numNotif;
    @XmlElementRef(name = "situacion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> situacion;

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
     * Obtiene el valor de la propiedad codArchiAcuse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCodArchiAcuse() {
        return codArchiAcuse;
    }

    /**
     * Define el valor de la propiedad codArchiAcuse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCodArchiAcuse(JAXBElement<Long> value) {
        this.codArchiAcuse = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeNotif() {
        return ejeNotif;
    }

    /**
     * Define el valor de la propiedad ejeNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeNotif(JAXBElement<Short> value) {
        this.ejeNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad idNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdNotif() {
        return idNotif;
    }

    /**
     * Define el valor de la propiedad idNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdNotif(JAXBElement<Long> value) {
        this.idNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad numNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumNotif() {
        return numNotif;
    }

    /**
     * Define el valor de la propiedad numNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumNotif(JAXBElement<Integer> value) {
        this.numNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad situacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSituacion() {
        return situacion;
    }

    /**
     * Define el valor de la propiedad situacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSituacion(JAXBElement<Short> value) {
        this.situacion = value;
    }

}
