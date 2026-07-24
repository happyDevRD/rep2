
package es.greenaall.gos.gf.ws.response.xsd;

import es.greenaall.gos.gf.dto.xsd.ReciboCabeceraWs;
import es.greenaall.gos.gf.dto.xsd.ReciboConcepto;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GenerarReciboResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenerarReciboResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reciboCabecera" type="{http://dto.gf.gos.greenaall.es/xsd}ReciboCabeceraWs" minOccurs="0"/&gt;
 *         &lt;element name="reciboConcepto" type="{http://dto.gf.gos.greenaall.es/xsd}ReciboConcepto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerarReciboResponse", propOrder = {
    "reciboCabecera",
    "reciboConcepto"
})
public class GenerarReciboResponse {

    @XmlElementRef(name = "reciboCabecera", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ReciboCabeceraWs> reciboCabecera;
    @XmlElementRef(name = "reciboConcepto", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ReciboConcepto> reciboConcepto;

    /**
     * Obtiene el valor de la propiedad reciboCabecera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     *     
     */
    public JAXBElement<ReciboCabeceraWs> getReciboCabecera() {
        return reciboCabecera;
    }

    /**
     * Define el valor de la propiedad reciboCabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     *     
     */
    public void setReciboCabecera(JAXBElement<ReciboCabeceraWs> value) {
        this.reciboCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad reciboConcepto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReciboConcepto }{@code >}
     *     
     */
    public JAXBElement<ReciboConcepto> getReciboConcepto() {
        return reciboConcepto;
    }

    /**
     * Define el valor de la propiedad reciboConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReciboConcepto }{@code >}
     *     
     */
    public void setReciboConcepto(JAXBElement<ReciboConcepto> value) {
        this.reciboConcepto = value;
    }

}
