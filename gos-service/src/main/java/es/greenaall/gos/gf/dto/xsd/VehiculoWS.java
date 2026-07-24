
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VehiculoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VehiculoWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codMovim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPosta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codTipVehic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desPerEntid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dirPosta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idHisObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisVehic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idVehic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matForma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mma" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBasti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numDocum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numModel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numUnida" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="parque" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regActiv" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tara" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiculoWS", propOrder = {
    "codEntid",
    "codMovim",
    "codPosta",
    "codTipVehic",
    "color",
    "desPerEntid",
    "dirPosta",
    "idHisObjTribu",
    "idHisPerso",
    "idHisVehic",
    "idObjTribu",
    "idPerso",
    "idVehic",
    "marca",
    "matForma",
    "matricula",
    "mma",
    "modelo",
    "municipio",
    "numBasti",
    "numDocum",
    "numModel",
    "numUnida",
    "parque",
    "provincia",
    "regActiv",
    "tara",
    "unidad"
})
public class VehiculoWS {

    @XmlElementRef(name = "codEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codMovim", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codMovim;
    @XmlElementRef(name = "codPosta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPosta;
    @XmlElementRef(name = "codTipVehic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTipVehic;
    @XmlElementRef(name = "color", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> color;
    @XmlElementRef(name = "desPerEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desPerEntid;
    @XmlElementRef(name = "dirPosta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirPosta;
    @XmlElementRef(name = "idHisObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisObjTribu;
    @XmlElementRef(name = "idHisPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisPerso;
    @XmlElementRef(name = "idHisVehic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisVehic;
    @XmlElementRef(name = "idObjTribu", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idObjTribu;
    @XmlElementRef(name = "idPerso", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idPerso;
    @XmlElementRef(name = "idVehic", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idVehic;
    @XmlElementRef(name = "marca", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marca;
    @XmlElementRef(name = "matForma", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matForma;
    @XmlElementRef(name = "matricula", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matricula;
    @XmlElementRef(name = "mma", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mma;
    @XmlElementRef(name = "modelo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modelo;
    @XmlElementRef(name = "municipio", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> municipio;
    @XmlElementRef(name = "numBasti", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numBasti;
    @XmlElementRef(name = "numDocum", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numDocum;
    @XmlElementRef(name = "numModel", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numModel;
    @XmlElementRef(name = "numUnida", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> numUnida;
    @XmlElementRef(name = "parque", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> parque;
    @XmlElementRef(name = "provincia", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provincia;
    @XmlElementRef(name = "regActiv", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> regActiv;
    @XmlElementRef(name = "tara", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tara;
    @XmlElementRef(name = "unidad", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidad;

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
     * Obtiene el valor de la propiedad codTipVehic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodTipVehic() {
        return codTipVehic;
    }

    /**
     * Define el valor de la propiedad codTipVehic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodTipVehic(JAXBElement<String> value) {
        this.codTipVehic = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setColor(JAXBElement<String> value) {
        this.color = value;
    }

    /**
     * Obtiene el valor de la propiedad desPerEntid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesPerEntid() {
        return desPerEntid;
    }

    /**
     * Define el valor de la propiedad desPerEntid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesPerEntid(JAXBElement<String> value) {
        this.desPerEntid = value;
    }

    /**
     * Obtiene el valor de la propiedad dirPosta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirPosta() {
        return dirPosta;
    }

    /**
     * Define el valor de la propiedad dirPosta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirPosta(JAXBElement<String> value) {
        this.dirPosta = value;
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
     * Obtiene el valor de la propiedad idHisPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisPerso() {
        return idHisPerso;
    }

    /**
     * Define el valor de la propiedad idHisPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisPerso(JAXBElement<Long> value) {
        this.idHisPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisVehic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisVehic() {
        return idHisVehic;
    }

    /**
     * Define el valor de la propiedad idHisVehic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisVehic(JAXBElement<Long> value) {
        this.idHisVehic = value;
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
     * Obtiene el valor de la propiedad idPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdPerso() {
        return idPerso;
    }

    /**
     * Define el valor de la propiedad idPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdPerso(JAXBElement<Long> value) {
        this.idPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad idVehic.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdVehic() {
        return idVehic;
    }

    /**
     * Define el valor de la propiedad idVehic.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdVehic(JAXBElement<Long> value) {
        this.idVehic = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarca(JAXBElement<String> value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad matForma.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatForma() {
        return matForma;
    }

    /**
     * Define el valor de la propiedad matForma.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatForma(JAXBElement<String> value) {
        this.matForma = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatricula(JAXBElement<String> value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad mma.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMma() {
        return mma;
    }

    /**
     * Define el valor de la propiedad mma.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMma(JAXBElement<Integer> value) {
        this.mma = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModelo(JAXBElement<String> value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMunicipio(JAXBElement<String> value) {
        this.municipio = value;
    }

    /**
     * Obtiene el valor de la propiedad numBasti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumBasti() {
        return numBasti;
    }

    /**
     * Define el valor de la propiedad numBasti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumBasti(JAXBElement<String> value) {
        this.numBasti = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumDocum() {
        return numDocum;
    }

    /**
     * Define el valor de la propiedad numDocum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumDocum(JAXBElement<String> value) {
        this.numDocum = value;
    }

    /**
     * Obtiene el valor de la propiedad numModel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumModel() {
        return numModel;
    }

    /**
     * Define el valor de la propiedad numModel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumModel(JAXBElement<Integer> value) {
        this.numModel = value;
    }

    /**
     * Obtiene el valor de la propiedad numUnida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumUnida() {
        return numUnida;
    }

    /**
     * Define el valor de la propiedad numUnida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumUnida(JAXBElement<BigDecimal> value) {
        this.numUnida = value;
    }

    /**
     * Obtiene el valor de la propiedad parque.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getParque() {
        return parque;
    }

    /**
     * Define el valor de la propiedad parque.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setParque(JAXBElement<Short> value) {
        this.parque = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvincia(JAXBElement<String> value) {
        this.provincia = value;
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
     * Obtiene el valor de la propiedad tara.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTara() {
        return tara;
    }

    /**
     * Define el valor de la propiedad tara.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTara(JAXBElement<Integer> value) {
        this.tara = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidad(JAXBElement<String> value) {
        this.unidad = value;
    }

}
