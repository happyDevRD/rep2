
package es.greenaall.gos.gf.ws;

import es.greenaall.gos.gf.ws.request.xsd.ConsultaFestivosRequest;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://request.ws.gf.gos.greenaall.es/xsd}ConsultaFestivosRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "consultaFestivos")
public class ConsultaFestivos {

    @XmlElementRef(name = "request", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultaFestivosRequest> request;

    /**
     * Obtiene el valor de la propiedad request.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultaFestivosRequest }{@code >}
     *     
     */
    public JAXBElement<ConsultaFestivosRequest> getRequest() {
        return request;
    }

    /**
     * Define el valor de la propiedad request.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultaFestivosRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<ConsultaFestivosRequest> value) {
        this.request = value;
    }

}
