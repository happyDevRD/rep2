
package es.greenaall.gos.ge.ws.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaActualizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaActualizacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaActualizacion", propOrder = {
    "codError",
    "codigoRespuesta",
    "desError",
    "descripcion"
})
public class RespuestaActualizacion {

    @XmlElementRef(name = "codError", namespace = "http://ws.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codError;
    @XmlElementRef(name = "codigoRespuesta", namespace = "http://ws.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoRespuesta;
    @XmlElementRef(name = "desError", namespace = "http://ws.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desError;
    @XmlElementRef(name = "descripcion", namespace = "http://ws.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;

    /**
     * Obtiene el valor de la propiedad codError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodError() {
        return codError;
    }

    /**
     * Define el valor de la propiedad codError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodError(JAXBElement<String> value) {
        this.codError = value;
    }

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
     * Obtiene el valor de la propiedad desError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesError() {
        return desError;
    }

    /**
     * Define el valor de la propiedad desError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesError(JAXBElement<String> value) {
        this.desError = value;
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

}
