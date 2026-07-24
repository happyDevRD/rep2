
package es.greenaall.gos.gf.ws.request.xsd;

import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import es.greenaall.gos.pe.dto.ws.xsd.PersonaEntidadRequest;
import es.greenaall.gos.ur.ws.request.xsd.DomicilioRequest;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaNotificacionesRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaNotificacionesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="domicilio" type="{http://request.ws.ur.gos.greenaall.es/xsd}DomicilioRequest" minOccurs="0"/&gt;
 *         &lt;element name="notificacion" type="{http://request.ws.gf.gos.greenaall.es/xsd}NotificacionRequest" minOccurs="0"/&gt;
 *         &lt;element name="notificado" type="{http://ws.dto.pe.gos.greenaall.es/xsd}PersonaEntidadRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaNotificacionesRequest", propOrder = {
    "datosConexion",
    "domicilio",
    "notificacion",
    "notificado"
})
public class ConsultaNotificacionesRequest {

    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "domicilio", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DomicilioRequest> domicilio;
    @XmlElementRef(name = "notificacion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NotificacionRequest> notificacion;
    @XmlElementRef(name = "notificado", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonaEntidadRequest> notificado;

    /**
     * Obtiene el valor de la propiedad datosConexion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     *     
     */
    public JAXBElement<DatosConexion> getDatosConexion() {
        return datosConexion;
    }

    /**
     * Define el valor de la propiedad datosConexion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     *     
     */
    public void setDatosConexion(JAXBElement<DatosConexion> value) {
        this.datosConexion = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomicilioRequest }{@code >}
     *     
     */
    public JAXBElement<DomicilioRequest> getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomicilioRequest }{@code >}
     *     
     */
    public void setDomicilio(JAXBElement<DomicilioRequest> value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad notificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotificacionRequest }{@code >}
     *     
     */
    public JAXBElement<NotificacionRequest> getNotificacion() {
        return notificacion;
    }

    /**
     * Define el valor de la propiedad notificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotificacionRequest }{@code >}
     *     
     */
    public void setNotificacion(JAXBElement<NotificacionRequest> value) {
        this.notificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad notificado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     *     
     */
    public JAXBElement<PersonaEntidadRequest> getNotificado() {
        return notificado;
    }

    /**
     * Define el valor de la propiedad notificado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     *     
     */
    public void setNotificado(JAXBElement<PersonaEntidadRequest> value) {
        this.notificado = value;
    }

}
