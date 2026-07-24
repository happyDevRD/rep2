
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlusvaliaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlusvaliaWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claseTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coePlusv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="domicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fMovActua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fMovAnter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impAdqui" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impTrans" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="porAnual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="porValSuelo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="protocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supTribu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="superficie" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tipCalcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipGrava" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tipTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valCatas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="valSuelo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlusvaliaWS", propOrder = {
    "claseTrans",
    "coePlusv",
    "domicilio",
    "fMovActua",
    "fMovAnter",
    "impAdqui",
    "impTrans",
    "porAnual",
    "porValSuelo",
    "protocolo",
    "supTribu",
    "superficie",
    "tipCalcu",
    "tipGrava",
    "tipTrans",
    "titulo",
    "valCatas",
    "valSuelo"
})
public class PlusvaliaWS {

    @XmlElementRef(name = "claseTrans", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claseTrans;
    @XmlElementRef(name = "coePlusv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> coePlusv;
    @XmlElementRef(name = "domicilio", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilio;
    @XmlElementRef(name = "fMovActua", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fMovActua;
    @XmlElementRef(name = "fMovAnter", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fMovAnter;
    @XmlElementRef(name = "impAdqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impAdqui;
    @XmlElementRef(name = "impTrans", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impTrans;
    @XmlElementRef(name = "porAnual", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> porAnual;
    @XmlElementRef(name = "porValSuelo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> porValSuelo;
    @XmlElementRef(name = "protocolo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocolo;
    @XmlElementRef(name = "supTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> supTribu;
    @XmlElementRef(name = "superficie", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> superficie;
    @XmlElementRef(name = "tipCalcu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipCalcu;
    @XmlElementRef(name = "tipGrava", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tipGrava;
    @XmlElementRef(name = "tipTrans", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipTrans;
    @XmlElementRef(name = "titulo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titulo;
    @XmlElementRef(name = "valCatas", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valCatas;
    @XmlElementRef(name = "valSuelo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valSuelo;

    /**
     * Obtiene el valor de la propiedad claseTrans.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaseTrans() {
        return claseTrans;
    }

    /**
     * Define el valor de la propiedad claseTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaseTrans(JAXBElement<String> value) {
        this.claseTrans = value;
    }

    /**
     * Obtiene el valor de la propiedad coePlusv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCoePlusv() {
        return coePlusv;
    }

    /**
     * Define el valor de la propiedad coePlusv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCoePlusv(JAXBElement<BigDecimal> value) {
        this.coePlusv = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomicilio(JAXBElement<String> value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad fMovActua.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFMovActua() {
        return fMovActua;
    }

    /**
     * Define el valor de la propiedad fMovActua.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFMovActua(JAXBElement<String> value) {
        this.fMovActua = value;
    }

    /**
     * Obtiene el valor de la propiedad fMovAnter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFMovAnter() {
        return fMovAnter;
    }

    /**
     * Define el valor de la propiedad fMovAnter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFMovAnter(JAXBElement<String> value) {
        this.fMovAnter = value;
    }

    /**
     * Obtiene el valor de la propiedad impAdqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpAdqui() {
        return impAdqui;
    }

    /**
     * Define el valor de la propiedad impAdqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpAdqui(JAXBElement<BigDecimal> value) {
        this.impAdqui = value;
    }

    /**
     * Obtiene el valor de la propiedad impTrans.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpTrans() {
        return impTrans;
    }

    /**
     * Define el valor de la propiedad impTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpTrans(JAXBElement<BigDecimal> value) {
        this.impTrans = value;
    }

    /**
     * Obtiene el valor de la propiedad porAnual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPorAnual() {
        return porAnual;
    }

    /**
     * Define el valor de la propiedad porAnual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPorAnual(JAXBElement<BigDecimal> value) {
        this.porAnual = value;
    }

    /**
     * Obtiene el valor de la propiedad porValSuelo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPorValSuelo() {
        return porValSuelo;
    }

    /**
     * Define el valor de la propiedad porValSuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPorValSuelo(JAXBElement<BigDecimal> value) {
        this.porValSuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad protocolo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocolo() {
        return protocolo;
    }

    /**
     * Define el valor de la propiedad protocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocolo(JAXBElement<String> value) {
        this.protocolo = value;
    }

    /**
     * Obtiene el valor de la propiedad supTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSupTribu() {
        return supTribu;
    }

    /**
     * Define el valor de la propiedad supTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSupTribu(JAXBElement<BigDecimal> value) {
        this.supTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad superficie.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSuperficie() {
        return superficie;
    }

    /**
     * Define el valor de la propiedad superficie.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSuperficie(JAXBElement<BigDecimal> value) {
        this.superficie = value;
    }

    /**
     * Obtiene el valor de la propiedad tipCalcu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipCalcu() {
        return tipCalcu;
    }

    /**
     * Define el valor de la propiedad tipCalcu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipCalcu(JAXBElement<String> value) {
        this.tipCalcu = value;
    }

    /**
     * Obtiene el valor de la propiedad tipGrava.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTipGrava() {
        return tipGrava;
    }

    /**
     * Define el valor de la propiedad tipGrava.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTipGrava(JAXBElement<BigDecimal> value) {
        this.tipGrava = value;
    }

    /**
     * Obtiene el valor de la propiedad tipTrans.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipTrans() {
        return tipTrans;
    }

    /**
     * Define el valor de la propiedad tipTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipTrans(JAXBElement<String> value) {
        this.tipTrans = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitulo(JAXBElement<String> value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad valCatas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValCatas() {
        return valCatas;
    }

    /**
     * Define el valor de la propiedad valCatas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValCatas(JAXBElement<BigDecimal> value) {
        this.valCatas = value;
    }

    /**
     * Obtiene el valor de la propiedad valSuelo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValSuelo() {
        return valSuelo;
    }

    /**
     * Define el valor de la propiedad valSuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValSuelo(JAXBElement<BigDecimal> value) {
        this.valSuelo = value;
    }

}
