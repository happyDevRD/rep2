
package es.greenaall.gos.gf.ws.response.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AltaCobroContabilidadResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AltaCobroContabilidadResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idOpera" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltaCobroContabilidadResponse", propOrder = {
    "codigoRespuesta",
    "descripcion",
    "idOpera"
})
public class AltaCobroContabilidadResponse {

    @XmlElementRef(name = "codigoRespuesta", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoRespuesta;
    @XmlElementRef(name = "descripcion", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "idOpera", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOpera;

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
     * Obtiene el valor de la propiedad idOpera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOpera() {
        return idOpera;
    }

    /**
     * Define el valor de la propiedad idOpera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOpera(JAXBElement<Long> value) {
        this.idOpera = value;
    }

}
