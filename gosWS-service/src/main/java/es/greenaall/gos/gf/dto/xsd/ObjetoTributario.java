
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjetoTributario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjetoTributario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claObjet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCauMovim" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codMovim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMunic" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPosta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codProvi" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeRegis" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecAlta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecMovim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecRegis" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idDomNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomBanca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomNotif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisOtro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisSujPasiv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOtro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idSujPasiv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTarObjet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="indActiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBonif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numRegis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numVia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="porBonif" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="refCatas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="regActiv" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="resDirec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tarPerso" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuContr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjetoTributario", propOrder = {
    "claObjet",
    "codCauMovim",
    "codEntid",
    "codMovim",
    "codMunic",
    "codPosta",
    "codProvi",
    "desObjTribu",
    "desVia",
    "ejeRegis",
    "fecAlta",
    "fecContr",
    "fecMovim",
    "fecRegis",
    "idDomBanca",
    "idDomNotif",
    "idDomic",
    "idHisDomBanca",
    "idHisDomNotif",
    "idHisDomic",
    "idHisObjTribu",
    "idHisOtro",
    "idHisSujPasiv",
    "idHisTipObjTribu",
    "idObjTribu",
    "idOtro",
    "idSujPasiv",
    "idTarObjet",
    "idTipObjTribu",
    "indActiv",
    "localidad",
    "numBonif",
    "numObjTribu",
    "numRegis",
    "numVia",
    "observaciones",
    "porBonif",
    "refCatas",
    "refDomic",
    "regActiv",
    "resDirec",
    "tarPerso",
    "tipVia",
    "usuContr"
})
@XmlSeeAlso({
    ObjetoTributarioRc.class
})
public class ObjetoTributario {

    @XmlElementRef(name = "claObjet", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claObjet;
    @XmlElementRef(name = "codCauMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codCauMovim;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codMovim;
    @XmlElementRef(name = "codMunic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codMunic;
    @XmlElementRef(name = "codPosta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPosta;
    @XmlElementRef(name = "codProvi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codProvi;
    @XmlElementRef(name = "desObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desObjTribu;
    @XmlElementRef(name = "desVia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desVia;
    @XmlElementRef(name = "ejeRegis", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeRegis;
    @XmlElementRef(name = "fecAlta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecAlta;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "fecMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecMovim;
    @XmlElementRef(name = "fecRegis", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecRegis;
    @XmlElementRef(name = "idDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomBanca;
    @XmlElementRef(name = "idDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomNotif;
    @XmlElementRef(name = "idDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomic;
    @XmlElementRef(name = "idHisDomBanca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomBanca;
    @XmlElementRef(name = "idHisDomNotif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomNotif;
    @XmlElementRef(name = "idHisDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomic;
    @XmlElementRef(name = "idHisObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisObjTribu;
    @XmlElementRef(name = "idHisOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisOtro;
    @XmlElementRef(name = "idHisSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisSujPasiv;
    @XmlElementRef(name = "idHisTipObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisTipObjTribu;
    @XmlElementRef(name = "idObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idObjTribu;
    @XmlElementRef(name = "idOtro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOtro;
    @XmlElementRef(name = "idSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idSujPasiv;
    @XmlElementRef(name = "idTarObjet", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idTarObjet;
    @XmlElementRef(name = "idTipObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idTipObjTribu;
    @XmlElementRef(name = "indActiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indActiv;
    @XmlElementRef(name = "localidad", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localidad;
    @XmlElementRef(name = "numBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numBonif;
    @XmlElementRef(name = "numObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numObjTribu;
    @XmlElementRef(name = "numRegis", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numRegis;
    @XmlElementRef(name = "numVia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numVia;
    @XmlElementRef(name = "observaciones", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "porBonif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> porBonif;
    @XmlElementRef(name = "refCatas", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refCatas;
    @XmlElementRef(name = "refDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> refDomic;
    @XmlElementRef(name = "regActiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> regActiv;
    @XmlElementRef(name = "resDirec", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resDirec;
    @XmlElementRef(name = "tarPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tarPerso;
    @XmlElementRef(name = "tipVia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipVia;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;

    /**
     * Obtiene el valor de la propiedad claObjet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaObjet() {
        return claObjet;
    }

    /**
     * Define el valor de la propiedad claObjet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaObjet(JAXBElement<String> value) {
        this.claObjet = value;
    }

    /**
     * Obtiene el valor de la propiedad codCauMovim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodCauMovim() {
        return codCauMovim;
    }

    /**
     * Define el valor de la propiedad codCauMovim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodCauMovim(JAXBElement<Short> value) {
        this.codCauMovim = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodEntid() {
        return codEntid;
    }

    /**
     * Define el valor de la propiedad codEntid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodEntid(JAXBElement<Short> value) {
        this.codEntid = value;
    }

    /**
     * Obtiene el valor de la propiedad codMovim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodMovim() {
        return codMovim;
    }

    /**
     * Define el valor de la propiedad codMovim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodMovim(JAXBElement<String> value) {
        this.codMovim = value;
    }

    /**
     * Obtiene el valor de la propiedad codMunic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodMunic() {
        return codMunic;
    }

    /**
     * Define el valor de la propiedad codMunic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodMunic(JAXBElement<Short> value) {
        this.codMunic = value;
    }

    /**
     * Obtiene el valor de la propiedad codPosta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPosta() {
        return codPosta;
    }

    /**
     * Define el valor de la propiedad codPosta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPosta(JAXBElement<Integer> value) {
        this.codPosta = value;
    }

    /**
     * Obtiene el valor de la propiedad codProvi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodProvi() {
        return codProvi;
    }

    /**
     * Define el valor de la propiedad codProvi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodProvi(JAXBElement<Short> value) {
        this.codProvi = value;
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
     * Obtiene el valor de la propiedad desVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesVia() {
        return desVia;
    }

    /**
     * Define el valor de la propiedad desVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesVia(JAXBElement<String> value) {
        this.desVia = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeRegis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeRegis() {
        return ejeRegis;
    }

    /**
     * Define el valor de la propiedad ejeRegis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeRegis(JAXBElement<Short> value) {
        this.ejeRegis = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAlta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecAlta() {
        return fecAlta;
    }

    /**
     * Define el valor de la propiedad fecAlta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecAlta(JAXBElement<XMLGregorianCalendar> value) {
        this.fecAlta = value;
    }

    /**
     * Obtiene el valor de la propiedad fecContr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecContr() {
        return fecContr;
    }

    /**
     * Define el valor de la propiedad fecContr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecContr(JAXBElement<XMLGregorianCalendar> value) {
        this.fecContr = value;
    }

    /**
     * Obtiene el valor de la propiedad fecMovim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecMovim() {
        return fecMovim;
    }

    /**
     * Define el valor de la propiedad fecMovim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecMovim(JAXBElement<XMLGregorianCalendar> value) {
        this.fecMovim = value;
    }

    /**
     * Obtiene el valor de la propiedad fecRegis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecRegis() {
        return fecRegis;
    }

    /**
     * Define el valor de la propiedad fecRegis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecRegis(JAXBElement<XMLGregorianCalendar> value) {
        this.fecRegis = value;
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
     * Obtiene el valor de la propiedad idDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdDomic() {
        return idDomic;
    }

    /**
     * Define el valor de la propiedad idDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdDomic(JAXBElement<Long> value) {
        this.idDomic = value;
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
     * Obtiene el valor de la propiedad idHisDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisDomic() {
        return idHisDomic;
    }

    /**
     * Define el valor de la propiedad idHisDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisDomic(JAXBElement<Long> value) {
        this.idHisDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisObjTribu() {
        return idHisObjTribu;
    }

    /**
     * Define el valor de la propiedad idHisObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisObjTribu(JAXBElement<Long> value) {
        this.idHisObjTribu = value;
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
     * Obtiene el valor de la propiedad idHisSujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisSujPasiv() {
        return idHisSujPasiv;
    }

    /**
     * Define el valor de la propiedad idHisSujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisSujPasiv(JAXBElement<Long> value) {
        this.idHisSujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisTipObjTribu() {
        return idHisTipObjTribu;
    }

    /**
     * Define el valor de la propiedad idHisTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisTipObjTribu(JAXBElement<Long> value) {
        this.idHisTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad idObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdObjTribu() {
        return idObjTribu;
    }

    /**
     * Define el valor de la propiedad idObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdObjTribu(JAXBElement<Long> value) {
        this.idObjTribu = value;
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
     * Obtiene el valor de la propiedad idSujPasiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdSujPasiv() {
        return idSujPasiv;
    }

    /**
     * Define el valor de la propiedad idSujPasiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdSujPasiv(JAXBElement<Long> value) {
        this.idSujPasiv = value;
    }

    /**
     * Obtiene el valor de la propiedad idTarObjet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdTarObjet() {
        return idTarObjet;
    }

    /**
     * Define el valor de la propiedad idTarObjet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdTarObjet(JAXBElement<Long> value) {
        this.idTarObjet = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdTipObjTribu() {
        return idTipObjTribu;
    }

    /**
     * Define el valor de la propiedad idTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdTipObjTribu(JAXBElement<Long> value) {
        this.idTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad indActiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndActiv() {
        return indActiv;
    }

    /**
     * Define el valor de la propiedad indActiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndActiv(JAXBElement<String> value) {
        this.indActiv = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalidad(JAXBElement<String> value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad numBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumBonif() {
        return numBonif;
    }

    /**
     * Define el valor de la propiedad numBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumBonif(JAXBElement<String> value) {
        this.numBonif = value;
    }

    /**
     * Obtiene el valor de la propiedad numObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumObjTribu() {
        return numObjTribu;
    }

    /**
     * Define el valor de la propiedad numObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumObjTribu(JAXBElement<Long> value) {
        this.numObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumRegis() {
        return numRegis;
    }

    /**
     * Define el valor de la propiedad numRegis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumRegis(JAXBElement<Integer> value) {
        this.numRegis = value;
    }

    /**
     * Obtiene el valor de la propiedad numVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumVia() {
        return numVia;
    }

    /**
     * Define el valor de la propiedad numVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumVia(JAXBElement<Integer> value) {
        this.numVia = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad porBonif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPorBonif() {
        return porBonif;
    }

    /**
     * Define el valor de la propiedad porBonif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPorBonif(JAXBElement<BigDecimal> value) {
        this.porBonif = value;
    }

    /**
     * Obtiene el valor de la propiedad refCatas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefCatas() {
        return refCatas;
    }

    /**
     * Define el valor de la propiedad refCatas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefCatas(JAXBElement<String> value) {
        this.refCatas = value;
    }

    /**
     * Obtiene el valor de la propiedad refDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRefDomic() {
        return refDomic;
    }

    /**
     * Define el valor de la propiedad refDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRefDomic(JAXBElement<Long> value) {
        this.refDomic = value;
    }

    /**
     * Obtiene el valor de la propiedad regActiv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRegActiv() {
        return regActiv;
    }

    /**
     * Define el valor de la propiedad regActiv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRegActiv(JAXBElement<Short> value) {
        this.regActiv = value;
    }

    /**
     * Obtiene el valor de la propiedad resDirec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResDirec() {
        return resDirec;
    }

    /**
     * Define el valor de la propiedad resDirec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResDirec(JAXBElement<String> value) {
        this.resDirec = value;
    }

    /**
     * Obtiene el valor de la propiedad tarPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTarPerso() {
        return tarPerso;
    }

    /**
     * Define el valor de la propiedad tarPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTarPerso(JAXBElement<Short> value) {
        this.tarPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipVia() {
        return tipVia;
    }

    /**
     * Define el valor de la propiedad tipVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipVia(JAXBElement<String> value) {
        this.tipVia = value;
    }

    /**
     * Obtiene el valor de la propiedad usuContr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuContr() {
        return usuContr;
    }

    /**
     * Define el valor de la propiedad usuContr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuContr(JAXBElement<String> value) {
        this.usuContr = value;
    }

}
