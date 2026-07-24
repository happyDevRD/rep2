
package es.greenaall.gos.gf.ws.response.xsd;

import java.util.ArrayList;
import java.util.List;
import es.greenaall.gos.gf.dto.xsd.AutoliquidacionInternetHWs;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AutoLiquidacionInternetHResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutoLiquidacionInternetHResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoLiquidacionInternet" type="{http://dto.gf.gos.greenaall.es/xsd}AutoliquidacionInternetHWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoLiquidacionInternetHResponse", propOrder = {
    "autoLiquidacionInternet",
    "codigoRespuesta",
    "descripcion",
    "resultado"
})
public class AutoLiquidacionInternetHResponse {

    @XmlElement(nillable = true)
    protected List<AutoliquidacionInternetHWs> autoLiquidacionInternet;
    @XmlElementRef(name = "codigoRespuesta", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoRespuesta;
    @XmlElementRef(name = "descripcion", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "resultado", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultado;

    /**
     * Gets the value of the autoLiquidacionInternet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the autoLiquidacionInternet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoLiquidacionInternet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoliquidacionInternetHWs }
     * 
     * 
     */
    public List<AutoliquidacionInternetHWs> getAutoLiquidacionInternet() {
        if (autoLiquidacionInternet == null) {
            autoLiquidacionInternet = new ArrayList<AutoliquidacionInternetHWs>();
        }
        return this.autoLiquidacionInternet;
    }

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoRespuesta(JAXBElement<String> value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultado(JAXBElement<String> value) {
        this.resultado = value;
    }

}
