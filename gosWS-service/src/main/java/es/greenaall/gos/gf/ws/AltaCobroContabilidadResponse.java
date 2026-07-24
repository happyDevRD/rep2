
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
 *         &lt;element name="return" type="{http://response.ws.gf.gos.greenaall.es/xsd}AltaCobroContabilidadResponse" minOccurs="0"/&gt;
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
    "_return"
})
@XmlRootElement(name = "altaCobroContabilidadResponse")
public class AltaCobroContabilidadResponse {

    @XmlElementRef(name = "return", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse> _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse }{@code >}
     *     
     */
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse> getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse }{@code >}
     *     
     */
    public void setReturn(JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse> value) {
        this._return = value;
    }

}
