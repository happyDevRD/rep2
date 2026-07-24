
package es.greenaall.gos.gf.ws.request.xsd;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para JusGastosRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JusGastosRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fecJusExtFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecJusExtInici" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idConta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JusGastosRequest", propOrder = {
    "fecJusExtFin",
    "fecJusExtInici",
    "idConta"
})
public class JusGastosRequest {

    @XmlElementRef(name = "fecJusExtFin", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecJusExtFin;
    @XmlElementRef(name = "fecJusExtInici", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecJusExtInici;
    @XmlElementRef(name = "idConta", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idConta;

    /**
     * Obtiene el valor de la propiedad fecJusExtFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecJusExtFin() {
        return fecJusExtFin;
    }

    /**
     * Define el valor de la propiedad fecJusExtFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecJusExtFin(JAXBElement<XMLGregorianCalendar> value) {
        this.fecJusExtFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fecJusExtInici.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecJusExtInici() {
        return fecJusExtInici;
    }

    /**
     * Define el valor de la propiedad fecJusExtInici.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecJusExtInici(JAXBElement<XMLGregorianCalendar> value) {
        this.fecJusExtInici = value;
    }

    /**
     * Obtiene el valor de la propiedad idConta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdConta() {
        return idConta;
    }

    /**
     * Define el valor de la propiedad idConta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdConta(JAXBElement<Long> value) {
        this.idConta = value;
    }

}
