
package es.greenaall.gos.gf.ws;

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
 *         &lt;element name="RemoteException" type="{http://rmi.java/xsd}RemoteException" minOccurs="0"/&gt;
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
    "remoteException"
})
@XmlRootElement(name = "RemoteException")
public class RemoteException {

    @XmlElementRef(name = "RemoteException", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<java.rmi.xsd.RemoteException> remoteException;

    /**
     * Obtiene el valor de la propiedad remoteException.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.rmi.xsd.RemoteException }{@code >}
     *     
     */
    public JAXBElement<java.rmi.xsd.RemoteException> getRemoteException() {
        return remoteException;
    }

    /**
     * Define el valor de la propiedad remoteException.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.rmi.xsd.RemoteException }{@code >}
     *     
     */
    public void setRemoteException(JAXBElement<java.rmi.xsd.RemoteException> value) {
        this.remoteException = value;
    }

}
