
package es.greenaall.gos.gf.ws.response.xsd;

import es.greenaall.gos.gf.dto.xsd.ObjetoTributarioMd;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GenerarObjetoTributarioMdResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenerarObjetoTributarioMdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objetoTributarioMd" type="{http://dto.gf.gos.greenaall.es/xsd}ObjetoTributarioMd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerarObjetoTributarioMdResponse", propOrder = {
    "objetoTributarioMd"
})
public class GenerarObjetoTributarioMdResponse {

    @XmlElementRef(name = "objetoTributarioMd", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjetoTributarioMd> objetoTributarioMd;

    /**
     * Obtiene el valor de la propiedad objetoTributarioMd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjetoTributarioMd }{@code >}
     *     
     */
    public JAXBElement<ObjetoTributarioMd> getObjetoTributarioMd() {
        return objetoTributarioMd;
    }

    /**
     * Define el valor de la propiedad objetoTributarioMd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjetoTributarioMd }{@code >}
     *     
     */
    public void setObjetoTributarioMd(JAXBElement<ObjetoTributarioMd> value) {
        this.objetoTributarioMd = value;
    }

}
