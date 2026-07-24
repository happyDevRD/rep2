
package java.rmi.xsd;

import java.io.xsd.IOException;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemoteException complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemoteException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://io.java/xsd}IOException"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteException", propOrder = {
    "cause",
    "message",
    "detail"
})
public class RemoteException
    extends IOException
{

    @XmlElementRef(name = "cause", namespace = "http://rmi.java/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> cause;
    @XmlElementRef(name = "message", namespace = "http://rmi.java/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "detail", namespace = "http://rmi.java/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> detail;

    /**
     * Obtiene el valor de la propiedad cause.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getCause() {
        return cause;
    }

    /**
     * Define el valor de la propiedad cause.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setCause(JAXBElement<Object> value) {
        this.cause = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad detail.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getDetail() {
        return detail;
    }

    /**
     * Define el valor de la propiedad detail.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setDetail(JAXBElement<Object> value) {
        this.detail = value;
    }

}
