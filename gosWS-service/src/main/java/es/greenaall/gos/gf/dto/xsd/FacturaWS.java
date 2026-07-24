
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="desJusGasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeGasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="face" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecJusGasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idJusGasto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="impDto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impLiqui" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numGasto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numJusExter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaWS", propOrder = {
    "desJusGasto",
    "ejeGasto",
    "estado",
    "face",
    "fecJusGasto",
    "idJusGasto",
    "impDto",
    "impIva",
    "impLiqui",
    "impTotal",
    "numGasto",
    "numJusExter"
})
public class FacturaWS {

    @XmlElementRef(name = "desJusGasto", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desJusGasto;
    @XmlElementRef(name = "ejeGasto", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ejeGasto;
    @XmlElementRef(name = "estado", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "face", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> face;
    @XmlElementRef(name = "fecJusGasto", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fecJusGasto;
    @XmlElementRef(name = "idJusGasto", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idJusGasto;
    @XmlElementRef(name = "impDto", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impDto;
    @XmlElementRef(name = "impIva", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impIva;
    @XmlElementRef(name = "impLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impLiqui;
    @XmlElementRef(name = "impTotal", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impTotal;
    @XmlElementRef(name = "numGasto", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numGasto;
    @XmlElementRef(name = "numJusExter", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numJusExter;

    /**
     * Obtiene el valor de la propiedad desJusGasto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesJusGasto() {
        return desJusGasto;
    }

    /**
     * Define el valor de la propiedad desJusGasto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesJusGasto(JAXBElement<String> value) {
        this.desJusGasto = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeGasto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEjeGasto() {
        return ejeGasto;
    }

    /**
     * Define el valor de la propiedad ejeGasto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEjeGasto(JAXBElement<String> value) {
        this.ejeGasto = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstado(JAXBElement<String> value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad face.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFace() {
        return face;
    }

    /**
     * Define el valor de la propiedad face.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFace(JAXBElement<String> value) {
        this.face = value;
    }

    /**
     * Obtiene el valor de la propiedad fecJusGasto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFecJusGasto() {
        return fecJusGasto;
    }

    /**
     * Define el valor de la propiedad fecJusGasto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFecJusGasto(JAXBElement<String> value) {
        this.fecJusGasto = value;
    }

    /**
     * Obtiene el valor de la propiedad idJusGasto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdJusGasto() {
        return idJusGasto;
    }

    /**
     * Define el valor de la propiedad idJusGasto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdJusGasto(JAXBElement<Long> value) {
        this.idJusGasto = value;
    }

    /**
     * Obtiene el valor de la propiedad impDto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpDto() {
        return impDto;
    }

    /**
     * Define el valor de la propiedad impDto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpDto(JAXBElement<BigDecimal> value) {
        this.impDto = value;
    }

    /**
     * Obtiene el valor de la propiedad impIva.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpIva() {
        return impIva;
    }

    /**
     * Define el valor de la propiedad impIva.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpIva(JAXBElement<BigDecimal> value) {
        this.impIva = value;
    }

    /**
     * Obtiene el valor de la propiedad impLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpLiqui() {
        return impLiqui;
    }

    /**
     * Define el valor de la propiedad impLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpLiqui(JAXBElement<BigDecimal> value) {
        this.impLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad impTotal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpTotal() {
        return impTotal;
    }

    /**
     * Define el valor de la propiedad impTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpTotal(JAXBElement<BigDecimal> value) {
        this.impTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad numGasto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumGasto() {
        return numGasto;
    }

    /**
     * Define el valor de la propiedad numGasto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumGasto(JAXBElement<String> value) {
        this.numGasto = value;
    }

    /**
     * Obtiene el valor de la propiedad numJusExter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumJusExter() {
        return numJusExter;
    }

    /**
     * Define el valor de la propiedad numJusExter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumJusExter(JAXBElement<String> value) {
        this.numJusExter = value;
    }

}
