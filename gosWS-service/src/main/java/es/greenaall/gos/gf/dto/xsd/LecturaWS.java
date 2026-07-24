
package es.greenaall.gos.gf.dto.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LecturaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LecturaWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acumulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consumo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desIncid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecLectu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lecActua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valLectu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LecturaWS", propOrder = {
    "acumulado",
    "conReal",
    "consumo",
    "desIncid",
    "fecLectu",
    "lecActua",
    "valLectu"
})
public class LecturaWS {

    @XmlElementRef(name = "acumulado", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acumulado;
    @XmlElementRef(name = "conReal", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> conReal;
    @XmlElementRef(name = "consumo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumo;
    @XmlElementRef(name = "desIncid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desIncid;
    @XmlElementRef(name = "fecLectu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fecLectu;
    @XmlElementRef(name = "lecActua", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lecActua;
    @XmlElementRef(name = "valLectu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valLectu;

    /**
     * Obtiene el valor de la propiedad acumulado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcumulado() {
        return acumulado;
    }

    /**
     * Define el valor de la propiedad acumulado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcumulado(JAXBElement<String> value) {
        this.acumulado = value;
    }

    /**
     * Obtiene el valor de la propiedad conReal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConReal() {
        return conReal;
    }

    /**
     * Define el valor de la propiedad conReal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConReal(JAXBElement<String> value) {
        this.conReal = value;
    }

    /**
     * Obtiene el valor de la propiedad consumo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumo() {
        return consumo;
    }

    /**
     * Define el valor de la propiedad consumo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumo(JAXBElement<String> value) {
        this.consumo = value;
    }

    /**
     * Obtiene el valor de la propiedad desIncid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesIncid() {
        return desIncid;
    }

    /**
     * Define el valor de la propiedad desIncid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesIncid(JAXBElement<String> value) {
        this.desIncid = value;
    }

    /**
     * Obtiene el valor de la propiedad fecLectu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFecLectu() {
        return fecLectu;
    }

    /**
     * Define el valor de la propiedad fecLectu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFecLectu(JAXBElement<String> value) {
        this.fecLectu = value;
    }

    /**
     * Obtiene el valor de la propiedad lecActua.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLecActua() {
        return lecActua;
    }

    /**
     * Define el valor de la propiedad lecActua.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLecActua(JAXBElement<String> value) {
        this.lecActua = value;
    }

    /**
     * Obtiene el valor de la propiedad valLectu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValLectu() {
        return valLectu;
    }

    /**
     * Define el valor de la propiedad valLectu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValLectu(JAXBElement<String> value) {
        this.valLectu = value;
    }

}
