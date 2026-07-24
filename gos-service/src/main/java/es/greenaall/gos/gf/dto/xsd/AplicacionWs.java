
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AplicacionWs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AplicacionWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAreOrige" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codClaEcono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codClaFunci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codClaOrgan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="creDispo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creGasta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creInici" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="crePresu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="desAgrup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desAplic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desClaEcono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desClaFunci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desClaOrgan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desTipAplic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejePresu" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idAplic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idBolsa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idClaEcono" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idClaFunci" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idClaOrgan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idConta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idCtaPgcp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="indAgrup" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indAmpli" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indAntCaja" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indArea" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indFasTerce" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indFinAfect" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indNivVinEcono" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indNivVinFunci" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indNivVinOrgan" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indPagJusti" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indProrr" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indTipAplic" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="pagEfect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="patCtaPgcp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salIniObliRecon" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "AplicacionWs", propOrder = {
    "codAreOrige",
    "codClaEcono",
    "codClaFunci",
    "codClaOrgan",
    "codEntid",
    "creDispo",
    "creGasta",
    "creInici",
    "crePresu",
    "creTotal",
    "desAgrup",
    "desAplic",
    "desArea",
    "desClaEcono",
    "desClaFunci",
    "desClaOrgan",
    "desTipAplic",
    "ejePresu",
    "fecContr",
    "idAplic",
    "idBolsa",
    "idClaEcono",
    "idClaFunci",
    "idClaOrgan",
    "idConta",
    "idCtaPgcp",
    "indAgrup",
    "indAmpli",
    "indAntCaja",
    "indArea",
    "indFasTerce",
    "indFinAfect",
    "indNivVinEcono",
    "indNivVinFunci",
    "indNivVinOrgan",
    "indPagJusti",
    "indProrr",
    "indTipAplic",
    "pagEfect",
    "patCtaPgcp",
    "salIniObliRecon",
    "usuContr"
})
public class AplicacionWs {

    @XmlElementRef(name = "codAreOrige", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codAreOrige;
    @XmlElementRef(name = "codClaEcono", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codClaEcono;
    @XmlElementRef(name = "codClaFunci", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codClaFunci;
    @XmlElementRef(name = "codClaOrgan", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codClaOrgan;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "creDispo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> creDispo;
    @XmlElementRef(name = "creGasta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> creGasta;
    @XmlElementRef(name = "creInici", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> creInici;
    @XmlElementRef(name = "crePresu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crePresu;
    @XmlElementRef(name = "creTotal", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> creTotal;
    @XmlElementRef(name = "desAgrup", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desAgrup;
    @XmlElementRef(name = "desAplic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desAplic;
    @XmlElementRef(name = "desArea", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desArea;
    @XmlElementRef(name = "desClaEcono", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desClaEcono;
    @XmlElementRef(name = "desClaFunci", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desClaFunci;
    @XmlElementRef(name = "desClaOrgan", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desClaOrgan;
    @XmlElementRef(name = "desTipAplic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desTipAplic;
    @XmlElementRef(name = "ejePresu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejePresu;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "idAplic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idAplic;
    @XmlElementRef(name = "idBolsa", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idBolsa;
    @XmlElementRef(name = "idClaEcono", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idClaEcono;
    @XmlElementRef(name = "idClaFunci", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idClaFunci;
    @XmlElementRef(name = "idClaOrgan", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idClaOrgan;
    @XmlElementRef(name = "idConta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idConta;
    @XmlElementRef(name = "idCtaPgcp", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idCtaPgcp;
    @XmlElementRef(name = "indAgrup", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indAgrup;
    @XmlElementRef(name = "indAmpli", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indAmpli;
    @XmlElementRef(name = "indAntCaja", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indAntCaja;
    @XmlElementRef(name = "indArea", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indArea;
    @XmlElementRef(name = "indFasTerce", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indFasTerce;
    @XmlElementRef(name = "indFinAfect", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indFinAfect;
    @XmlElementRef(name = "indNivVinEcono", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indNivVinEcono;
    @XmlElementRef(name = "indNivVinFunci", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indNivVinFunci;
    @XmlElementRef(name = "indNivVinOrgan", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indNivVinOrgan;
    @XmlElementRef(name = "indPagJusti", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indPagJusti;
    @XmlElementRef(name = "indProrr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indProrr;
    @XmlElementRef(name = "indTipAplic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indTipAplic;
    @XmlElementRef(name = "pagEfect", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pagEfect;
    @XmlElementRef(name = "patCtaPgcp", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> patCtaPgcp;
    @XmlElementRef(name = "salIniObliRecon", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> salIniObliRecon;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;

    /**
     * Obtiene el valor de la propiedad codAreOrige.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodAreOrige() {
        return codAreOrige;
    }

    /**
     * Define el valor de la propiedad codAreOrige.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodAreOrige(JAXBElement<Short> value) {
        this.codAreOrige = value;
    }

    /**
     * Obtiene el valor de la propiedad codClaEcono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodClaEcono() {
        return codClaEcono;
    }

    /**
     * Define el valor de la propiedad codClaEcono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodClaEcono(JAXBElement<String> value) {
        this.codClaEcono = value;
    }

    /**
     * Obtiene el valor de la propiedad codClaFunci.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodClaFunci() {
        return codClaFunci;
    }

    /**
     * Define el valor de la propiedad codClaFunci.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodClaFunci(JAXBElement<String> value) {
        this.codClaFunci = value;
    }

    /**
     * Obtiene el valor de la propiedad codClaOrgan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodClaOrgan() {
        return codClaOrgan;
    }

    /**
     * Define el valor de la propiedad codClaOrgan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodClaOrgan(JAXBElement<String> value) {
        this.codClaOrgan = value;
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
     * Obtiene el valor de la propiedad creDispo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreDispo() {
        return creDispo;
    }

    /**
     * Define el valor de la propiedad creDispo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreDispo(JAXBElement<BigDecimal> value) {
        this.creDispo = value;
    }

    /**
     * Obtiene el valor de la propiedad creGasta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreGasta() {
        return creGasta;
    }

    /**
     * Define el valor de la propiedad creGasta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreGasta(JAXBElement<BigDecimal> value) {
        this.creGasta = value;
    }

    /**
     * Obtiene el valor de la propiedad creInici.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreInici() {
        return creInici;
    }

    /**
     * Define el valor de la propiedad creInici.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreInici(JAXBElement<BigDecimal> value) {
        this.creInici = value;
    }

    /**
     * Obtiene el valor de la propiedad crePresu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrePresu() {
        return crePresu;
    }

    /**
     * Define el valor de la propiedad crePresu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrePresu(JAXBElement<BigDecimal> value) {
        this.crePresu = value;
    }

    /**
     * Obtiene el valor de la propiedad creTotal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCreTotal() {
        return creTotal;
    }

    /**
     * Define el valor de la propiedad creTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCreTotal(JAXBElement<BigDecimal> value) {
        this.creTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad desAgrup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesAgrup() {
        return desAgrup;
    }

    /**
     * Define el valor de la propiedad desAgrup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesAgrup(JAXBElement<String> value) {
        this.desAgrup = value;
    }

    /**
     * Obtiene el valor de la propiedad desAplic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesAplic() {
        return desAplic;
    }

    /**
     * Define el valor de la propiedad desAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesAplic(JAXBElement<String> value) {
        this.desAplic = value;
    }

    /**
     * Obtiene el valor de la propiedad desArea.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesArea() {
        return desArea;
    }

    /**
     * Define el valor de la propiedad desArea.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesArea(JAXBElement<String> value) {
        this.desArea = value;
    }

    /**
     * Obtiene el valor de la propiedad desClaEcono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesClaEcono() {
        return desClaEcono;
    }

    /**
     * Define el valor de la propiedad desClaEcono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesClaEcono(JAXBElement<String> value) {
        this.desClaEcono = value;
    }

    /**
     * Obtiene el valor de la propiedad desClaFunci.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesClaFunci() {
        return desClaFunci;
    }

    /**
     * Define el valor de la propiedad desClaFunci.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesClaFunci(JAXBElement<String> value) {
        this.desClaFunci = value;
    }

    /**
     * Obtiene el valor de la propiedad desClaOrgan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesClaOrgan() {
        return desClaOrgan;
    }

    /**
     * Define el valor de la propiedad desClaOrgan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesClaOrgan(JAXBElement<String> value) {
        this.desClaOrgan = value;
    }

    /**
     * Obtiene el valor de la propiedad desTipAplic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesTipAplic() {
        return desTipAplic;
    }

    /**
     * Define el valor de la propiedad desTipAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesTipAplic(JAXBElement<String> value) {
        this.desTipAplic = value;
    }

    /**
     * Obtiene el valor de la propiedad ejePresu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjePresu() {
        return ejePresu;
    }

    /**
     * Define el valor de la propiedad ejePresu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjePresu(JAXBElement<Short> value) {
        this.ejePresu = value;
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
     * Obtiene el valor de la propiedad idAplic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdAplic() {
        return idAplic;
    }

    /**
     * Define el valor de la propiedad idAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdAplic(JAXBElement<Long> value) {
        this.idAplic = value;
    }

    /**
     * Obtiene el valor de la propiedad idBolsa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdBolsa() {
        return idBolsa;
    }

    /**
     * Define el valor de la propiedad idBolsa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdBolsa(JAXBElement<Long> value) {
        this.idBolsa = value;
    }

    /**
     * Obtiene el valor de la propiedad idClaEcono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdClaEcono() {
        return idClaEcono;
    }

    /**
     * Define el valor de la propiedad idClaEcono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdClaEcono(JAXBElement<Long> value) {
        this.idClaEcono = value;
    }

    /**
     * Obtiene el valor de la propiedad idClaFunci.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdClaFunci() {
        return idClaFunci;
    }

    /**
     * Define el valor de la propiedad idClaFunci.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdClaFunci(JAXBElement<Long> value) {
        this.idClaFunci = value;
    }

    /**
     * Obtiene el valor de la propiedad idClaOrgan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdClaOrgan() {
        return idClaOrgan;
    }

    /**
     * Define el valor de la propiedad idClaOrgan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdClaOrgan(JAXBElement<Long> value) {
        this.idClaOrgan = value;
    }

    /**
     * Obtiene el valor de la propiedad idConta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdConta() {
        return idConta;
    }

    /**
     * Define el valor de la propiedad idConta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdConta(JAXBElement<Long> value) {
        this.idConta = value;
    }

    /**
     * Obtiene el valor de la propiedad idCtaPgcp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdCtaPgcp() {
        return idCtaPgcp;
    }

    /**
     * Define el valor de la propiedad idCtaPgcp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdCtaPgcp(JAXBElement<Long> value) {
        this.idCtaPgcp = value;
    }

    /**
     * Obtiene el valor de la propiedad indAgrup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndAgrup() {
        return indAgrup;
    }

    /**
     * Define el valor de la propiedad indAgrup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndAgrup(JAXBElement<Short> value) {
        this.indAgrup = value;
    }

    /**
     * Obtiene el valor de la propiedad indAmpli.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndAmpli() {
        return indAmpli;
    }

    /**
     * Define el valor de la propiedad indAmpli.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndAmpli(JAXBElement<Short> value) {
        this.indAmpli = value;
    }

    /**
     * Obtiene el valor de la propiedad indAntCaja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndAntCaja() {
        return indAntCaja;
    }

    /**
     * Define el valor de la propiedad indAntCaja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndAntCaja(JAXBElement<Short> value) {
        this.indAntCaja = value;
    }

    /**
     * Obtiene el valor de la propiedad indArea.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndArea() {
        return indArea;
    }

    /**
     * Define el valor de la propiedad indArea.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndArea(JAXBElement<Short> value) {
        this.indArea = value;
    }

    /**
     * Obtiene el valor de la propiedad indFasTerce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndFasTerce() {
        return indFasTerce;
    }

    /**
     * Define el valor de la propiedad indFasTerce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndFasTerce(JAXBElement<Short> value) {
        this.indFasTerce = value;
    }

    /**
     * Obtiene el valor de la propiedad indFinAfect.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndFinAfect() {
        return indFinAfect;
    }

    /**
     * Define el valor de la propiedad indFinAfect.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndFinAfect(JAXBElement<Short> value) {
        this.indFinAfect = value;
    }

    /**
     * Obtiene el valor de la propiedad indNivVinEcono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndNivVinEcono() {
        return indNivVinEcono;
    }

    /**
     * Define el valor de la propiedad indNivVinEcono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndNivVinEcono(JAXBElement<Short> value) {
        this.indNivVinEcono = value;
    }

    /**
     * Obtiene el valor de la propiedad indNivVinFunci.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndNivVinFunci() {
        return indNivVinFunci;
    }

    /**
     * Define el valor de la propiedad indNivVinFunci.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndNivVinFunci(JAXBElement<Short> value) {
        this.indNivVinFunci = value;
    }

    /**
     * Obtiene el valor de la propiedad indNivVinOrgan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndNivVinOrgan() {
        return indNivVinOrgan;
    }

    /**
     * Define el valor de la propiedad indNivVinOrgan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndNivVinOrgan(JAXBElement<Short> value) {
        this.indNivVinOrgan = value;
    }

    /**
     * Obtiene el valor de la propiedad indPagJusti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndPagJusti() {
        return indPagJusti;
    }

    /**
     * Define el valor de la propiedad indPagJusti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndPagJusti(JAXBElement<Short> value) {
        this.indPagJusti = value;
    }

    /**
     * Obtiene el valor de la propiedad indProrr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndProrr() {
        return indProrr;
    }

    /**
     * Define el valor de la propiedad indProrr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndProrr(JAXBElement<Short> value) {
        this.indProrr = value;
    }

    /**
     * Obtiene el valor de la propiedad indTipAplic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndTipAplic() {
        return indTipAplic;
    }

    /**
     * Define el valor de la propiedad indTipAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndTipAplic(JAXBElement<Short> value) {
        this.indTipAplic = value;
    }

    /**
     * Obtiene el valor de la propiedad pagEfect.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPagEfect() {
        return pagEfect;
    }

    /**
     * Define el valor de la propiedad pagEfect.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPagEfect(JAXBElement<BigDecimal> value) {
        this.pagEfect = value;
    }

    /**
     * Obtiene el valor de la propiedad patCtaPgcp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPatCtaPgcp() {
        return patCtaPgcp;
    }

    /**
     * Define el valor de la propiedad patCtaPgcp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPatCtaPgcp(JAXBElement<String> value) {
        this.patCtaPgcp = value;
    }

    /**
     * Obtiene el valor de la propiedad salIniObliRecon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalIniObliRecon() {
        return salIniObliRecon;
    }

    /**
     * Define el valor de la propiedad salIniObliRecon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalIniObliRecon(JAXBElement<BigDecimal> value) {
        this.salIniObliRecon = value;
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
