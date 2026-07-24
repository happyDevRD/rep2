
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LiquidacionRc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LiquidacionRc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.gf.gos.greenaall.es/xsd}Liquidacion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCuentDomBanca" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="codEntidDomBanca" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codImpue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMunDomNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPosDomNotif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codProDomNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codSucurDomBanca" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desBonif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desEntidDomBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desImpue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMotiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMunDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desOrgAprob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desProDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desRepPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desSucurDomBanca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digContrDomBanca" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="dirPosDomNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeAutol" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeImpue" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeLiquiDesde" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeLiquiHasta" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejePaseRecau" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="estRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecLiqDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecLiqHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecNotif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecRecNotif" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idDomNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisOtro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOtro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="liqNotif" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="modRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nifPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nifRepPropi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numAutol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numLiquiDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numLiquiHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numNotif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numPaseRecau" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numRecib" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numRemes" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="perImpos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidacionRc", propOrder = {
    "codCuentDomBanca",
    "codEntidDomBanca",
    "codImpue",
    "codMunDomNotif",
    "codPosDomNotif",
    "codProDomNotif",
    "codSucurDomBanca",
    "desBonif",
    "desEntid",
    "desEntidDomBanca",
    "desImpue",
    "desMotiv",
    "desMunDomNotif",
    "desObjTribu",
    "desOrgAprob",
    "desProDomNotif",
    "desPropi",
    "desRepPropi",
    "desSucurDomBanca",
    "digContrDomBanca",
    "dirPosDomNotif",
    "ejeAutol",
    "ejeImpue",
    "ejeLiquiDesde",
    "ejeLiquiHasta",
    "ejeNotif",
    "ejePaseRecau",
    "ejeRecib",
    "estRecib",
    "fecLiqDesde",
    "fecLiqHasta",
    "fecNotif",
    "fecRecNotif",
    "idDomBanca",
    "idDomNotif",
    "idHisDomBanca",
    "idHisDomNotif",
    "idHisOtro",
    "idOtro",
    "liqNotif",
    "modRecib",
    "nifPropi",
    "nifRepPropi",
    "numAutol",
    "numLiquiDesde",
    "numLiquiHasta",
    "numNotif",
    "numPaseRecau",
    "numRecib",
    "numRemes",
    "perImpos"
})
public class LiquidacionRc
    extends Liquidacion
{

    @XmlElementRef(name = "codCuentDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> codCuentDomBanca;
    @XmlElementRef(name = "codEntidDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntidDomBanca;
    @XmlElementRef(name = "codImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codImpue;
    @XmlElementRef(name = "codMunDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codMunDomNotif;
    @XmlElementRef(name = "codPosDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPosDomNotif;
    @XmlElementRef(name = "codProDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codProDomNotif;
    @XmlElementRef(name = "codSucurDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codSucurDomBanca;
    @XmlElementRef(name = "desBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desBonif;
    @XmlElementRef(name = "desEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntid;
    @XmlElementRef(name = "desEntidDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEntidDomBanca;
    @XmlElementRef(name = "desImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desImpue;
    @XmlElementRef(name = "desMotiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMotiv;
    @XmlElementRef(name = "desMunDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMunDomNotif;
    @XmlElementRef(name = "desObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desObjTribu;
    @XmlElementRef(name = "desOrgAprob", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desOrgAprob;
    @XmlElementRef(name = "desProDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desProDomNotif;
    @XmlElementRef(name = "desPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desPropi;
    @XmlElementRef(name = "desRepPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desRepPropi;
    @XmlElementRef(name = "desSucurDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSucurDomBanca;
    @XmlElementRef(name = "digContrDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> digContrDomBanca;
    @XmlElementRef(name = "dirPosDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirPosDomNotif;
    @XmlElementRef(name = "ejeAutol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeAutol;
    @XmlElementRef(name = "ejeImpue", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeImpue;
    @XmlElementRef(name = "ejeLiquiDesde", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeLiquiDesde;
    @XmlElementRef(name = "ejeLiquiHasta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeLiquiHasta;
    @XmlElementRef(name = "ejeNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeNotif;
    @XmlElementRef(name = "ejePaseRecau", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejePaseRecau;
    @XmlElementRef(name = "ejeRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeRecib;
    @XmlElementRef(name = "estRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> estRecib;
    @XmlElementRef(name = "fecLiqDesde", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecLiqDesde;
    @XmlElementRef(name = "fecLiqHasta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecLiqHasta;
    @XmlElementRef(name = "fecNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecNotif;
    @XmlElementRef(name = "fecRecNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecRecNotif;
    @XmlElementRef(name = "idDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomBanca;
    @XmlElementRef(name = "idDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomNotif;
    @XmlElementRef(name = "idHisDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomBanca;
    @XmlElementRef(name = "idHisDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomNotif;
    @XmlElementRef(name = "idHisOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisOtro;
    @XmlElementRef(name = "idOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOtro;
    @XmlElementRef(name = "liqNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> liqNotif;
    @XmlElementRef(name = "modRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modRecib;
    @XmlElementRef(name = "nifPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nifPropi;
    @XmlElementRef(name = "nifRepPropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nifRepPropi;
    @XmlElementRef(name = "numAutol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numAutol;
    @XmlElementRef(name = "numLiquiDesde", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numLiquiDesde;
    @XmlElementRef(name = "numLiquiHasta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numLiquiHasta;
    @XmlElementRef(name = "numNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numNotif;
    @XmlElementRef(name = "numPaseRecau", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numPaseRecau;
    @XmlElementRef(name = "numRecib", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numRecib;
    @XmlElementRef(name = "numRemes", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numRemes;
    @XmlElementRef(name = "perImpos", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perImpos;

    /**
     * Obtiene el valor de la propiedad codCuentDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCodCuentDomBanca() {
        return codCuentDomBanca;
    }

    /**
     * Define el valor de la propiedad codCuentDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCodCuentDomBanca(JAXBElement<BigDecimal> value) {
        this.codCuentDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntidDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodEntidDomBanca() {
        return codEntidDomBanca;
    }

    /**
     * Define el valor de la propiedad codEntidDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodEntidDomBanca(JAXBElement<Short> value) {
        this.codEntidDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad codImpue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodImpue() {
        return codImpue;
    }

    /**
     * Define el valor de la propiedad codImpue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodImpue(JAXBElement<String> value) {
        this.codImpue = value;
    }

    /**
     * Obtiene el valor de la propiedad codMunDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodMunDomNotif() {
        return codMunDomNotif;
    }

    /**
     * Define el valor de la propiedad codMunDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodMunDomNotif(JAXBElement<Short> value) {
        this.codMunDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad codPosDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPosDomNotif() {
        return codPosDomNotif;
    }

    /**
     * Define el valor de la propiedad codPosDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPosDomNotif(JAXBElement<Integer> value) {
        this.codPosDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad codProDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodProDomNotif() {
        return codProDomNotif;
    }

    /**
     * Define el valor de la propiedad codProDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodProDomNotif(JAXBElement<Short> value) {
        this.codProDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad codSucurDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodSucurDomBanca() {
        return codSucurDomBanca;
    }

    /**
     * Define el valor de la propiedad codSucurDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodSucurDomBanca(JAXBElement<Short> value) {
        this.codSucurDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad desBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesBonif() {
        return desBonif;
    }

    /**
     * Define el valor de la propiedad desBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesBonif(JAXBElement<String> value) {
        this.desBonif = value;
    }

    /**
     * Obtiene el valor de la propiedad desEntid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEntid() {
        return desEntid;
    }

    /**
     * Define el valor de la propiedad desEntid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEntid(JAXBElement<String> value) {
        this.desEntid = value;
    }

    /**
     * Obtiene el valor de la propiedad desEntidDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEntidDomBanca() {
        return desEntidDomBanca;
    }

    /**
     * Define el valor de la propiedad desEntidDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEntidDomBanca(JAXBElement<String> value) {
        this.desEntidDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad desImpue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesImpue() {
        return desImpue;
    }

    /**
     * Define el valor de la propiedad desImpue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesImpue(JAXBElement<String> value) {
        this.desImpue = value;
    }

    /**
     * Obtiene el valor de la propiedad desMotiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesMotiv() {
        return desMotiv;
    }

    /**
     * Define el valor de la propiedad desMotiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesMotiv(JAXBElement<String> value) {
        this.desMotiv = value;
    }

    /**
     * Obtiene el valor de la propiedad desMunDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesMunDomNotif() {
        return desMunDomNotif;
    }

    /**
     * Define el valor de la propiedad desMunDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesMunDomNotif(JAXBElement<String> value) {
        this.desMunDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad desObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesObjTribu() {
        return desObjTribu;
    }

    /**
     * Define el valor de la propiedad desObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesObjTribu(JAXBElement<String> value) {
        this.desObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad desOrgAprob.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesOrgAprob() {
        return desOrgAprob;
    }

    /**
     * Define el valor de la propiedad desOrgAprob.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesOrgAprob(JAXBElement<String> value) {
        this.desOrgAprob = value;
    }

    /**
     * Obtiene el valor de la propiedad desProDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesProDomNotif() {
        return desProDomNotif;
    }

    /**
     * Define el valor de la propiedad desProDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesProDomNotif(JAXBElement<String> value) {
        this.desProDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad desPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesPropi() {
        return desPropi;
    }

    /**
     * Define el valor de la propiedad desPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesPropi(JAXBElement<String> value) {
        this.desPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad desRepPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesRepPropi() {
        return desRepPropi;
    }

    /**
     * Define el valor de la propiedad desRepPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesRepPropi(JAXBElement<String> value) {
        this.desRepPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad desSucurDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesSucurDomBanca() {
        return desSucurDomBanca;
    }

    /**
     * Define el valor de la propiedad desSucurDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesSucurDomBanca(JAXBElement<String> value) {
        this.desSucurDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad digContrDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDigContrDomBanca() {
        return digContrDomBanca;
    }

    /**
     * Define el valor de la propiedad digContrDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDigContrDomBanca(JAXBElement<Short> value) {
        this.digContrDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad dirPosDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirPosDomNotif() {
        return dirPosDomNotif;
    }

    /**
     * Define el valor de la propiedad dirPosDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirPosDomNotif(JAXBElement<String> value) {
        this.dirPosDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeAutol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeAutol() {
        return ejeAutol;
    }

    /**
     * Define el valor de la propiedad ejeAutol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeAutol(JAXBElement<Short> value) {
        this.ejeAutol = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeImpue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeImpue() {
        return ejeImpue;
    }

    /**
     * Define el valor de la propiedad ejeImpue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeImpue(JAXBElement<Short> value) {
        this.ejeImpue = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeLiquiDesde.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeLiquiDesde() {
        return ejeLiquiDesde;
    }

    /**
     * Define el valor de la propiedad ejeLiquiDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeLiquiDesde(JAXBElement<Short> value) {
        this.ejeLiquiDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeLiquiHasta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeLiquiHasta() {
        return ejeLiquiHasta;
    }

    /**
     * Define el valor de la propiedad ejeLiquiHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeLiquiHasta(JAXBElement<Short> value) {
        this.ejeLiquiHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeNotif() {
        return ejeNotif;
    }

    /**
     * Define el valor de la propiedad ejeNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeNotif(JAXBElement<Short> value) {
        this.ejeNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad ejePaseRecau.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjePaseRecau() {
        return ejePaseRecau;
    }

    /**
     * Define el valor de la propiedad ejePaseRecau.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjePaseRecau(JAXBElement<Short> value) {
        this.ejePaseRecau = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeRecib() {
        return ejeRecib;
    }

    /**
     * Define el valor de la propiedad ejeRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeRecib(JAXBElement<Short> value) {
        this.ejeRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad estRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEstRecib() {
        return estRecib;
    }

    /**
     * Define el valor de la propiedad estRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEstRecib(JAXBElement<Short> value) {
        this.estRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad fecLiqDesde.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecLiqDesde() {
        return fecLiqDesde;
    }

    /**
     * Define el valor de la propiedad fecLiqDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecLiqDesde(JAXBElement<XMLGregorianCalendar> value) {
        this.fecLiqDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fecLiqHasta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecLiqHasta() {
        return fecLiqHasta;
    }

    /**
     * Define el valor de la propiedad fecLiqHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecLiqHasta(JAXBElement<XMLGregorianCalendar> value) {
        this.fecLiqHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fecNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecNotif() {
        return fecNotif;
    }

    /**
     * Define el valor de la propiedad fecNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecNotif(JAXBElement<XMLGregorianCalendar> value) {
        this.fecNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad fecRecNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecRecNotif() {
        return fecRecNotif;
    }

    /**
     * Define el valor de la propiedad fecRecNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecRecNotif(JAXBElement<XMLGregorianCalendar> value) {
        this.fecRecNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad idDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdDomBanca() {
        return idDomBanca;
    }

    /**
     * Define el valor de la propiedad idDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdDomBanca(JAXBElement<Long> value) {
        this.idDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad idDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdDomNotif() {
        return idDomNotif;
    }

    /**
     * Define el valor de la propiedad idDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdDomNotif(JAXBElement<Long> value) {
        this.idDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisDomBanca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisDomBanca() {
        return idHisDomBanca;
    }

    /**
     * Define el valor de la propiedad idHisDomBanca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisDomBanca(JAXBElement<Long> value) {
        this.idHisDomBanca = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisDomNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisDomNotif() {
        return idHisDomNotif;
    }

    /**
     * Define el valor de la propiedad idHisDomNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisDomNotif(JAXBElement<Long> value) {
        this.idHisDomNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisOtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisOtro() {
        return idHisOtro;
    }

    /**
     * Define el valor de la propiedad idHisOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisOtro(JAXBElement<Long> value) {
        this.idHisOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad idOtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOtro() {
        return idOtro;
    }

    /**
     * Define el valor de la propiedad idOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOtro(JAXBElement<Long> value) {
        this.idOtro = value;
    }

    /**
     * Obtiene el valor de la propiedad liqNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getLiqNotif() {
        return liqNotif;
    }

    /**
     * Define el valor de la propiedad liqNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setLiqNotif(JAXBElement<Short> value) {
        this.liqNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad modRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getModRecib() {
        return modRecib;
    }

    /**
     * Define el valor de la propiedad modRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setModRecib(JAXBElement<Short> value) {
        this.modRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad nifPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNifPropi() {
        return nifPropi;
    }

    /**
     * Define el valor de la propiedad nifPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNifPropi(JAXBElement<String> value) {
        this.nifPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad nifRepPropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNifRepPropi() {
        return nifRepPropi;
    }

    /**
     * Define el valor de la propiedad nifRepPropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNifRepPropi(JAXBElement<String> value) {
        this.nifRepPropi = value;
    }

    /**
     * Obtiene el valor de la propiedad numAutol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumAutol() {
        return numAutol;
    }

    /**
     * Define el valor de la propiedad numAutol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumAutol(JAXBElement<String> value) {
        this.numAutol = value;
    }

    /**
     * Obtiene el valor de la propiedad numLiquiDesde.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumLiquiDesde() {
        return numLiquiDesde;
    }

    /**
     * Define el valor de la propiedad numLiquiDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumLiquiDesde(JAXBElement<String> value) {
        this.numLiquiDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad numLiquiHasta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumLiquiHasta() {
        return numLiquiHasta;
    }

    /**
     * Define el valor de la propiedad numLiquiHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumLiquiHasta(JAXBElement<String> value) {
        this.numLiquiHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad numNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumNotif() {
        return numNotif;
    }

    /**
     * Define el valor de la propiedad numNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumNotif(JAXBElement<Integer> value) {
        this.numNotif = value;
    }

    /**
     * Obtiene el valor de la propiedad numPaseRecau.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumPaseRecau() {
        return numPaseRecau;
    }

    /**
     * Define el valor de la propiedad numPaseRecau.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumPaseRecau(JAXBElement<Integer> value) {
        this.numPaseRecau = value;
    }

    /**
     * Obtiene el valor de la propiedad numRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumRecib() {
        return numRecib;
    }

    /**
     * Define el valor de la propiedad numRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumRecib(JAXBElement<Integer> value) {
        this.numRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad numRemes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumRemes() {
        return numRemes;
    }

    /**
     * Define el valor de la propiedad numRemes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumRemes(JAXBElement<Short> value) {
        this.numRemes = value;
    }

    /**
     * Obtiene el valor de la propiedad perImpos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerImpos() {
        return perImpos;
    }

    /**
     * Define el valor de la propiedad perImpos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerImpos(JAXBElement<String> value) {
        this.perImpos = value;
    }

}
