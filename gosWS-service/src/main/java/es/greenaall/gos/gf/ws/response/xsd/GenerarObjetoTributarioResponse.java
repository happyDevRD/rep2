
package es.greenaall.gos.gf.ws.response.xsd;

import es.greenaall.gos.gf.dto.xsd.ObjetoTributarioWs;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GenerarObjetoTributarioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenerarObjetoTributarioResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objetoTributario" type="{http://dto.gf.gos.greenaall.es/xsd}ObjetoTributarioWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerarObjetoTributarioResponse", propOrder = {
    "objetoTributario"
})
public class GenerarObjetoTributarioResponse {

    @XmlElementRef(name = "objetoTributario", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjetoTributarioWs> objetoTributario;

    /**
     * Obtiene el valor de la propiedad objetoTributario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjetoTributarioWs }{@code >}
     *     
     */
    public JAXBElement<ObjetoTributarioWs> getObjetoTributario() {
        return objetoTributario;
    }

    /**
     * Define el valor de la propiedad objetoTributario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjetoTributarioWs }{@code >}
     *     
     */
    public void setObjetoTributario(JAXBElement<ObjetoTributarioWs> value) {
        this.objetoTributario = value;
    }

}
