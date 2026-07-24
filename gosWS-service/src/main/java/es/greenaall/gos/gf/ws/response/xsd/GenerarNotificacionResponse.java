
package es.greenaall.gos.gf.ws.response.xsd;

import es.greenaall.gos.gf.dto.xsd.NotificacionWs;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GenerarNotificacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenerarNotificacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="notificacion" type="{http://dto.gf.gos.greenaall.es/xsd}NotificacionWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerarNotificacionResponse", propOrder = {
    "notificacion"
})
public class GenerarNotificacionResponse {

    @XmlElementRef(name = "notificacion", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NotificacionWs> notificacion;

    /**
     * Obtiene el valor de la propiedad notificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     *     
     */
    public JAXBElement<NotificacionWs> getNotificacion() {
        return notificacion;
    }

    /**
     * Define el valor de la propiedad notificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     *     
     */
    public void setNotificacion(JAXBElement<NotificacionWs> value) {
        this.notificacion = value;
    }

}
