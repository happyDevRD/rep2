
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
 *         &lt;element name="CtrError" type="{http://excepciones.comun.util.greenaall.es/xsd}CtrError" minOccurs="0"/&gt;
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
    "ctrError"
})
@XmlRootElement(name = "CtrError")
public class CtrError {

    @XmlElementRef(name = "CtrError", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<es.greenaall.util.comun.excepciones.xsd.CtrError> ctrError;

    /**
     * Obtiene el valor de la propiedad ctrError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link es.greenaall.util.comun.excepciones.xsd.CtrError }{@code >}
     *     
     */
    public JAXBElement<es.greenaall.util.comun.excepciones.xsd.CtrError> getCtrError() {
        return ctrError;
    }

    /**
     * Define el valor de la propiedad ctrError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link es.greenaall.util.comun.excepciones.xsd.CtrError }{@code >}
     *     
     */
    public void setCtrError(JAXBElement<es.greenaall.util.comun.excepciones.xsd.CtrError> value) {
        this.ctrError = value;
    }

}
