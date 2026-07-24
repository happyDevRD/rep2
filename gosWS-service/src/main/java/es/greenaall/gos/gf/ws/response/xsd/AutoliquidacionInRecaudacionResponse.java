
package es.greenaall.gos.gf.ws.response.xsd;

import es.greenaall.gos.gf.dto.xsd.AutoliquidacionInternetWs;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AutoliquidacionInRecaudacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutoliquidacionInRecaudacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoliquidacionInternet" type="{http://dto.gf.gos.greenaall.es/xsd}AutoliquidacionInternetWs" minOccurs="0"/&gt;
 *         &lt;element name="idAuto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoliquidacionInRecaudacionResponse", propOrder = {
    "autoliquidacionInternet",
    "idAuto"
})
public class AutoliquidacionInRecaudacionResponse {

    @XmlElementRef(name = "autoliquidacionInternet", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoliquidacionInternetWs> autoliquidacionInternet;
    @XmlElementRef(name = "idAuto", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idAuto;

    /**
     * Obtiene el valor de la propiedad autoliquidacionInternet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoliquidacionInternetWs }{@code >}
     *     
     */
    public JAXBElement<AutoliquidacionInternetWs> getAutoliquidacionInternet() {
        return autoliquidacionInternet;
    }

    /**
     * Define el valor de la propiedad autoliquidacionInternet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoliquidacionInternetWs }{@code >}
     *     
     */
    public void setAutoliquidacionInternet(JAXBElement<AutoliquidacionInternetWs> value) {
        this.autoliquidacionInternet = value;
    }

    /**
     * Obtiene el valor de la propiedad idAuto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdAuto() {
        return idAuto;
    }

    /**
     * Define el valor de la propiedad idAuto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdAuto(JAXBElement<Long> value) {
        this.idAuto = value;
    }

}
