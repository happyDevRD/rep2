
package es.greenaall.gos.gf.ws.request.xsd;

import es.greenaall.gos.gf.dto.xsd.NotificacionWs;
import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActualizarNotificacionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActualizarNotificacionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="notificacionRequest" type="{http://dto.gf.gos.greenaall.es/xsd}NotificacionWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualizarNotificacionRequest", propOrder = {
    "datosConexion",
    "notificacionRequest"
})
public class ActualizarNotificacionRequest {

    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "notificacionRequest", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NotificacionWs> notificacionRequest;

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
     * Obtiene el valor de la propiedad notificacionRequest.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     *     
     */
    public JAXBElement<NotificacionWs> getNotificacionRequest() {
        return notificacionRequest;
    }

    /**
     * Define el valor de la propiedad notificacionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     *     
     */
    public void setNotificacionRequest(JAXBElement<NotificacionWs> value) {
        this.notificacionRequest = value;
    }

}
