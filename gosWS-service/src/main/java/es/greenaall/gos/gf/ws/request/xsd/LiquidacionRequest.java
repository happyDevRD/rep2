
package es.greenaall.gos.gf.ws.request.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LiquidacionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LiquidacionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ejeLiqui" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="idLiqui" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tipLiqui" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidacionRequest", propOrder = {
    "ejeLiqui",
    "idLiqui",
    "tipLiqui"
})
public class LiquidacionRequest {

    @XmlElementRef(name = "ejeLiqui", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeLiqui;
    @XmlElementRef(name = "idLiqui", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idLiqui;
    @XmlElementRef(name = "tipLiqui", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipLiqui;

    /**
     * Obtiene el valor de la propiedad ejeLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeLiqui() {
        return ejeLiqui;
    }

    /**
     * Define el valor de la propiedad ejeLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeLiqui(JAXBElement<Short> value) {
        this.ejeLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad idLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdLiqui() {
        return idLiqui;
    }

    /**
     * Define el valor de la propiedad idLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdLiqui(JAXBElement<Long> value) {
        this.idLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad tipLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipLiqui() {
        return tipLiqui;
    }

    /**
     * Define el valor de la propiedad tipLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipLiqui(JAXBElement<Short> value) {
        this.tipLiqui = value;
    }

}
