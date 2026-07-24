
package es.greenaall.gos.gf.ws.response.xsd;

import es.greenaall.gos.gf.dto.xsd.PlusvaliaWS;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaObjetoPlusvaliaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaObjetoPlusvaliaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plusvalia" type="{http://dto.gf.gos.greenaall.es/xsd}PlusvaliaWS" minOccurs="0"/&gt;
 *         &lt;element name="pulsvalia" type="{http://dto.gf.gos.greenaall.es/xsd}PlusvaliaWS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaObjetoPlusvaliaResponse", propOrder = {
    "codigoRespuesta",
    "descripcion",
    "plusvalia",
    "pulsvalia"
})
public class ConsultaObjetoPlusvaliaResponse {

    @XmlElementRef(name = "codigoRespuesta", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoRespuesta;
    @XmlElementRef(name = "descripcion", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "plusvalia", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PlusvaliaWS> plusvalia;
    @XmlElementRef(name = "pulsvalia", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PlusvaliaWS> pulsvalia;

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoRespuesta(JAXBElement<String> value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad plusvalia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlusvaliaWS }{@code >}
     *     
     */
    public JAXBElement<PlusvaliaWS> getPlusvalia() {
        return plusvalia;
    }

    /**
     * Define el valor de la propiedad plusvalia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlusvaliaWS }{@code >}
     *     
     */
    public void setPlusvalia(JAXBElement<PlusvaliaWS> value) {
        this.plusvalia = value;
    }

    /**
     * Obtiene el valor de la propiedad pulsvalia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlusvaliaWS }{@code >}
     *     
     */
    public JAXBElement<PlusvaliaWS> getPulsvalia() {
        return pulsvalia;
    }

    /**
     * Define el valor de la propiedad pulsvalia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlusvaliaWS }{@code >}
     *     
     */
    public void setPulsvalia(JAXBElement<PlusvaliaWS> value) {
        this.pulsvalia = value;
    }

}
