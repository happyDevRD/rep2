
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UrbanaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UrbanaWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basLiqui" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEntDgc" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codMovim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMunic" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPosta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codProvi" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codVia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="coePropi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="derTitul" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digi1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digi2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeBase" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ejeEfect" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escalera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idFinca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisFinca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisSujPasiv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOtrDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idSujPasiv" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="kilometro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="letPriNumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letSegNumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numCargo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numCgcct" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numFicDgc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numFinDgc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numRefer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numTitul" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="planta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priNumer" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="proColec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refCatas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refe1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refe2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenciaCatastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regActiv" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="segNumer" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="sigVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supConst" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="supSuelo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipDerec" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipEnlac" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="titularidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="valCatEfect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="valCatas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="valConst" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "UrbanaWS", propOrder = {
    "basLiqui",
    "bloque",
    "codEntDgc",
    "codEntid",
    "codMovim",
    "codMunic",
    "codPosta",
    "codProvi",
    "codVia",
    "coePropi",
    "derTitul",
    "destino",
    "digi1",
    "digi2",
    "ejeBase",
    "ejeEfect",
    "entidad",
    "escalera",
    "idDomic",
    "idFinca",
    "idHisDomic",
    "idHisFinca",
    "idHisObjTribu",
    "idHisSujPasiv",
    "idObjTribu",
    "idOtrDomic",
    "idSujPasiv",
    "kilometro",
    "letPriNumer",
    "letSegNumer",
    "nomVia",
    "numCargo",
    "numCgcct",
    "numFicDgc",
    "numFinDgc",
    "numRefer",
    "numTitul",
    "planta",
    "priNumer",
    "proColec",
    "puerta",
    "refCatas",
    "refe1",
    "refe2",
    "referenciaCatastral",
    "regActiv",
    "segNumer",
    "sigVia",
    "supConst",
    "supSuelo",
    "texto",
    "tipDerec",
    "tipEnlac",
    "titularidad",
    "uso",
    "valBase",
    "valCatEfect",
    "valCatas",
    "valConst",
    "valSuelo"
})
public class UrbanaWS {

    @XmlElementRef(name = "basLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> basLiqui;
    @XmlElementRef(name = "bloque", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloque;
    @XmlElementRef(name = "codEntDgc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntDgc;
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
    @XmlElementRef(name = "codVia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codVia;
    @XmlElementRef(name = "coePropi", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> coePropi;
    @XmlElementRef(name = "derTitul", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> derTitul;
    @XmlElementRef(name = "destino", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destino;
    @XmlElementRef(name = "digi1", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> digi1;
    @XmlElementRef(name = "digi2", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> digi2;
    @XmlElementRef(name = "ejeBase", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeBase;
    @XmlElementRef(name = "ejeEfect", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeEfect;
    @XmlElementRef(name = "entidad", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entidad;
    @XmlElementRef(name = "escalera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> escalera;
    @XmlElementRef(name = "idDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomic;
    @XmlElementRef(name = "idFinca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idFinca;
    @XmlElementRef(name = "idHisDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomic;
    @XmlElementRef(name = "idHisFinca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisFinca;
    @XmlElementRef(name = "idHisObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisObjTribu;
    @XmlElementRef(name = "idHisSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisSujPasiv;
    @XmlElementRef(name = "idObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idObjTribu;
    @XmlElementRef(name = "idOtrDomic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOtrDomic;
    @XmlElementRef(name = "idSujPasiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idSujPasiv;
    @XmlElementRef(name = "kilometro", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> kilometro;
    @XmlElementRef(name = "letPriNumer", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> letPriNumer;
    @XmlElementRef(name = "letSegNumer", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> letSegNumer;
    @XmlElementRef(name = "nomVia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomVia;
    @XmlElementRef(name = "numCargo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numCargo;
    @XmlElementRef(name = "numCgcct", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCgcct;
    @XmlElementRef(name = "numFicDgc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numFicDgc;
    @XmlElementRef(name = "numFinDgc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numFinDgc;
    @XmlElementRef(name = "numRefer", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numRefer;
    @XmlElementRef(name = "numTitul", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numTitul;
    @XmlElementRef(name = "planta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planta;
    @XmlElementRef(name = "priNumer", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> priNumer;
    @XmlElementRef(name = "proColec", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proColec;
    @XmlElementRef(name = "puerta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puerta;
    @XmlElementRef(name = "refCatas", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refCatas;
    @XmlElementRef(name = "refe1", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refe1;
    @XmlElementRef(name = "refe2", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refe2;
    @XmlElementRef(name = "referenciaCatastral", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenciaCatastral;
    @XmlElementRef(name = "regActiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> regActiv;
    @XmlElementRef(name = "segNumer", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> segNumer;
    @XmlElementRef(name = "sigVia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sigVia;
    @XmlElementRef(name = "supConst", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> supConst;
    @XmlElementRef(name = "supSuelo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> supSuelo;
    @XmlElementRef(name = "texto", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> texto;
    @XmlElementRef(name = "tipDerec", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipDerec;
    @XmlElementRef(name = "tipEnlac", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipEnlac;
    @XmlElementRef(name = "titularidad", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titularidad;
    @XmlElementRef(name = "uso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uso;
    @XmlElementRef(name = "valBase", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valBase;
    @XmlElementRef(name = "valCatEfect", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valCatEfect;
    @XmlElementRef(name = "valCatas", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valCatas;
    @XmlElementRef(name = "valConst", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valConst;
    @XmlElementRef(name = "valSuelo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valSuelo;

    /**
     * Obtiene el valor de la propiedad basLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBasLiqui() {
        return basLiqui;
    }

    /**
     * Define el valor de la propiedad basLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBasLiqui(JAXBElement<BigDecimal> value) {
        this.basLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad bloque.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBloque() {
        return bloque;
    }

    /**
     * Define el valor de la propiedad bloque.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBloque(JAXBElement<String> value) {
        this.bloque = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntDgc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodEntDgc() {
        return codEntDgc;
    }

    /**
     * Define el valor de la propiedad codEntDgc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodEntDgc(JAXBElement<Short> value) {
        this.codEntDgc = value;
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
     * Obtiene el valor de la propiedad codVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodVia() {
        return codVia;
    }

    /**
     * Define el valor de la propiedad codVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodVia(JAXBElement<Integer> value) {
        this.codVia = value;
    }

    /**
     * Obtiene el valor de la propiedad coePropi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCoePropi() {
        return coePropi;
    }

    /**
     * Define el valor de la propiedad coePropi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCoePropi(JAXBElement<BigDecimal> value) {
        this.coePropi = value;
    }

    /**
     * Obtiene el valor de la propiedad derTitul.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDerTitul() {
        return derTitul;
    }

    /**
     * Define el valor de la propiedad derTitul.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDerTitul(JAXBElement<String> value) {
        this.derTitul = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestino(JAXBElement<String> value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad digi1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigi1() {
        return digi1;
    }

    /**
     * Define el valor de la propiedad digi1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigi1(JAXBElement<String> value) {
        this.digi1 = value;
    }

    /**
     * Obtiene el valor de la propiedad digi2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigi2() {
        return digi2;
    }

    /**
     * Define el valor de la propiedad digi2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigi2(JAXBElement<String> value) {
        this.digi2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeBase.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeBase() {
        return ejeBase;
    }

    /**
     * Define el valor de la propiedad ejeBase.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeBase(JAXBElement<Short> value) {
        this.ejeBase = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeEfect.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeEfect() {
        return ejeEfect;
    }

    /**
     * Define el valor de la propiedad ejeEfect.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeEfect(JAXBElement<Short> value) {
        this.ejeEfect = value;
    }

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntidad(JAXBElement<String> value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad escalera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEscalera() {
        return escalera;
    }

    /**
     * Define el valor de la propiedad escalera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEscalera(JAXBElement<String> value) {
        this.escalera = value;
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
     * Obtiene el valor de la propiedad idFinca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdFinca() {
        return idFinca;
    }

    /**
     * Define el valor de la propiedad idFinca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdFinca(JAXBElement<Long> value) {
        this.idFinca = value;
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
     * Obtiene el valor de la propiedad idHisFinca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisFinca() {
        return idHisFinca;
    }

    /**
     * Define el valor de la propiedad idHisFinca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisFinca(JAXBElement<Long> value) {
        this.idHisFinca = value;
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
     * Obtiene el valor de la propiedad idOtrDomic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOtrDomic() {
        return idOtrDomic;
    }

    /**
     * Define el valor de la propiedad idOtrDomic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOtrDomic(JAXBElement<Long> value) {
        this.idOtrDomic = value;
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
     * Obtiene el valor de la propiedad kilometro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getKilometro() {
        return kilometro;
    }

    /**
     * Define el valor de la propiedad kilometro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setKilometro(JAXBElement<BigDecimal> value) {
        this.kilometro = value;
    }

    /**
     * Obtiene el valor de la propiedad letPriNumer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLetPriNumer() {
        return letPriNumer;
    }

    /**
     * Define el valor de la propiedad letPriNumer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLetPriNumer(JAXBElement<String> value) {
        this.letPriNumer = value;
    }

    /**
     * Obtiene el valor de la propiedad letSegNumer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLetSegNumer() {
        return letSegNumer;
    }

    /**
     * Define el valor de la propiedad letSegNumer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLetSegNumer(JAXBElement<String> value) {
        this.letSegNumer = value;
    }

    /**
     * Obtiene el valor de la propiedad nomVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomVia() {
        return nomVia;
    }

    /**
     * Define el valor de la propiedad nomVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomVia(JAXBElement<String> value) {
        this.nomVia = value;
    }

    /**
     * Obtiene el valor de la propiedad numCargo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumCargo() {
        return numCargo;
    }

    /**
     * Define el valor de la propiedad numCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumCargo(JAXBElement<Short> value) {
        this.numCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad numCgcct.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCgcct() {
        return numCgcct;
    }

    /**
     * Define el valor de la propiedad numCgcct.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCgcct(JAXBElement<Integer> value) {
        this.numCgcct = value;
    }

    /**
     * Obtiene el valor de la propiedad numFicDgc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumFicDgc() {
        return numFicDgc;
    }

    /**
     * Define el valor de la propiedad numFicDgc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumFicDgc(JAXBElement<Integer> value) {
        this.numFicDgc = value;
    }

    /**
     * Obtiene el valor de la propiedad numFinDgc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumFinDgc() {
        return numFinDgc;
    }

    /**
     * Define el valor de la propiedad numFinDgc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumFinDgc(JAXBElement<Integer> value) {
        this.numFinDgc = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumRefer() {
        return numRefer;
    }

    /**
     * Define el valor de la propiedad numRefer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumRefer(JAXBElement<Integer> value) {
        this.numRefer = value;
    }

    /**
     * Obtiene el valor de la propiedad numTitul.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumTitul() {
        return numTitul;
    }

    /**
     * Define el valor de la propiedad numTitul.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumTitul(JAXBElement<Short> value) {
        this.numTitul = value;
    }

    /**
     * Obtiene el valor de la propiedad planta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlanta() {
        return planta;
    }

    /**
     * Define el valor de la propiedad planta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlanta(JAXBElement<String> value) {
        this.planta = value;
    }

    /**
     * Obtiene el valor de la propiedad priNumer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPriNumer() {
        return priNumer;
    }

    /**
     * Define el valor de la propiedad priNumer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPriNumer(JAXBElement<Short> value) {
        this.priNumer = value;
    }

    /**
     * Obtiene el valor de la propiedad proColec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProColec() {
        return proColec;
    }

    /**
     * Define el valor de la propiedad proColec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProColec(JAXBElement<String> value) {
        this.proColec = value;
    }

    /**
     * Obtiene el valor de la propiedad puerta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPuerta() {
        return puerta;
    }

    /**
     * Define el valor de la propiedad puerta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPuerta(JAXBElement<String> value) {
        this.puerta = value;
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
     * Obtiene el valor de la propiedad refe1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefe1() {
        return refe1;
    }

    /**
     * Define el valor de la propiedad refe1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefe1(JAXBElement<String> value) {
        this.refe1 = value;
    }

    /**
     * Obtiene el valor de la propiedad refe2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefe2() {
        return refe2;
    }

    /**
     * Define el valor de la propiedad refe2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefe2(JAXBElement<String> value) {
        this.refe2 = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaCatastral.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenciaCatastral() {
        return referenciaCatastral;
    }

    /**
     * Define el valor de la propiedad referenciaCatastral.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenciaCatastral(JAXBElement<String> value) {
        this.referenciaCatastral = value;
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
     * Obtiene el valor de la propiedad segNumer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSegNumer() {
        return segNumer;
    }

    /**
     * Define el valor de la propiedad segNumer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSegNumer(JAXBElement<Short> value) {
        this.segNumer = value;
    }

    /**
     * Obtiene el valor de la propiedad sigVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSigVia() {
        return sigVia;
    }

    /**
     * Define el valor de la propiedad sigVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSigVia(JAXBElement<String> value) {
        this.sigVia = value;
    }

    /**
     * Obtiene el valor de la propiedad supConst.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSupConst() {
        return supConst;
    }

    /**
     * Define el valor de la propiedad supConst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSupConst(JAXBElement<Long> value) {
        this.supConst = value;
    }

    /**
     * Obtiene el valor de la propiedad supSuelo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSupSuelo() {
        return supSuelo;
    }

    /**
     * Define el valor de la propiedad supSuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSupSuelo(JAXBElement<Long> value) {
        this.supSuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad texto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTexto() {
        return texto;
    }

    /**
     * Define el valor de la propiedad texto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTexto(JAXBElement<String> value) {
        this.texto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipDerec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipDerec() {
        return tipDerec;
    }

    /**
     * Define el valor de la propiedad tipDerec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipDerec(JAXBElement<Short> value) {
        this.tipDerec = value;
    }

    /**
     * Obtiene el valor de la propiedad tipEnlac.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipEnlac() {
        return tipEnlac;
    }

    /**
     * Define el valor de la propiedad tipEnlac.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipEnlac(JAXBElement<Short> value) {
        this.tipEnlac = value;
    }

    /**
     * Obtiene el valor de la propiedad titularidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitularidad() {
        return titularidad;
    }

    /**
     * Define el valor de la propiedad titularidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitularidad(JAXBElement<String> value) {
        this.titularidad = value;
    }

    /**
     * Obtiene el valor de la propiedad uso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUso() {
        return uso;
    }

    /**
     * Define el valor de la propiedad uso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUso(JAXBElement<String> value) {
        this.uso = value;
    }

    /**
     * Obtiene el valor de la propiedad valBase.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValBase() {
        return valBase;
    }

    /**
     * Define el valor de la propiedad valBase.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValBase(JAXBElement<BigDecimal> value) {
        this.valBase = value;
    }

    /**
     * Obtiene el valor de la propiedad valCatEfect.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValCatEfect() {
        return valCatEfect;
    }

    /**
     * Define el valor de la propiedad valCatEfect.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValCatEfect(JAXBElement<BigDecimal> value) {
        this.valCatEfect = value;
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
     * Obtiene el valor de la propiedad valConst.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValConst() {
        return valConst;
    }

    /**
     * Define el valor de la propiedad valConst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValConst(JAXBElement<BigDecimal> value) {
        this.valConst = value;
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
