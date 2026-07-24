
package es.greenaall.gos.gf.ws.response.xsd;

import java.util.ArrayList;
import java.util.List;
import es.greenaall.gos.gf.dto.xsd.FacturaWS;
import es.greenaall.gos.gf.dto.xsd.TerceroWS;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaFacturasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaFacturasResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="factura" type="{http://dto.gf.gos.greenaall.es/xsd}FacturaWS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tercero" type="{http://dto.gf.gos.greenaall.es/xsd}TerceroWS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaFacturasResponse", propOrder = {
    "codigoRespuesta",
    "descripcion",
    "factura",
    "tercero"
})
public class ConsultaFacturasResponse {

    @XmlElementRef(name = "codigoRespuesta", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoRespuesta;
    @XmlElementRef(name = "descripcion", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElement(nillable = true)
    protected List<FacturaWS> factura;
    @XmlElementRef(name = "tercero", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TerceroWS> tercero;

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
     * Gets the value of the factura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the factura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaWS }
     * 
     * 
     */
    public List<FacturaWS> getFactura() {
        if (factura == null) {
            factura = new ArrayList<FacturaWS>();
        }
        return this.factura;
    }

    /**
     * Obtiene el valor de la propiedad tercero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerceroWS }{@code >}
     *     
     */
    public JAXBElement<TerceroWS> getTercero() {
        return tercero;
    }

    /**
     * Define el valor de la propiedad tercero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerceroWS }{@code >}
     *     
     */
    public void setTercero(JAXBElement<TerceroWS> value) {
        this.tercero = value;
    }

}
