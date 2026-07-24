
package es.greenaall.gos.sa.dto.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CentroWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CentroWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="desCentr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desServi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desUbici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCentr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentroWS", propOrder = {
    "desCentr",
    "desDescr",
    "desServi",
    "desUbici",
    "idCentr"
})
public class CentroWS {

    @XmlElementRef(name = "desCentr", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCentr;
    @XmlElementRef(name = "desDescr", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desDescr;
    @XmlElementRef(name = "desServi", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desServi;
    @XmlElementRef(name = "desUbici", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desUbici;
    @XmlElementRef(name = "idCentr", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idCentr;

    /**
     * Obtiene el valor de la propiedad desCentr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesCentr() {
        return desCentr;
    }

    /**
     * Define el valor de la propiedad desCentr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesCentr(JAXBElement<String> value) {
        this.desCentr = value;
    }

    /**
     * Obtiene el valor de la propiedad desDescr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesDescr() {
        return desDescr;
    }

    /**
     * Define el valor de la propiedad desDescr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesDescr(JAXBElement<String> value) {
        this.desDescr = value;
    }

    /**
     * Obtiene el valor de la propiedad desServi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesServi() {
        return desServi;
    }

    /**
     * Define el valor de la propiedad desServi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesServi(JAXBElement<String> value) {
        this.desServi = value;
    }

    /**
     * Obtiene el valor de la propiedad desUbici.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesUbici() {
        return desUbici;
    }

    /**
     * Define el valor de la propiedad desUbici.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesUbici(JAXBElement<String> value) {
        this.desUbici = value;
    }

    /**
     * Obtiene el valor de la propiedad idCentr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdCentr() {
        return idCentr;
    }

    /**
     * Define el valor de la propiedad idCentr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdCentr(JAXBElement<Long> value) {
        this.idCentr = value;
    }

}
