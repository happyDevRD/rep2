
package es.greenaall.gos.gf.ws.request.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AutoliquidacionesInternetRecaudacionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutoliquidacionesInternetRecaudacionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPostaInter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codPostaRepre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="corInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="dirInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dirRepre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dniCifRepre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeRecib" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecProceso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idAuto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisRecib" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idImpue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idRecib" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="modPerte" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="movInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="movil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="munInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="munRepre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreRepre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numRecib" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proRepre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoliquidacionesInternetRecaudacionRequest", propOrder = {
    "codEntid",
    "codPostaInter",
    "codPostaRepre",
    "corInter",
    "correo",
    "datosConexion",
    "dirInter",
    "dirRepre",
    "dniCifRepre",
    "ejeRecib",
    "estado",
    "fecProceso",
    "idAuto",
    "idHisPerso",
    "idHisRecib",
    "idImpue",
    "idPerso",
    "idRecib",
    "importe",
    "modPerte",
    "movInter",
    "movil",
    "munInter",
    "munRepre",
    "nombreRepre",
    "numRecib",
    "orden",
    "proInter",
    "proRepre",
    "sesion",
    "telInter",
    "telefono",
    "tipoObjeto"
})
public class AutoliquidacionesInternetRecaudacionRequest {

    @XmlElementRef(name = "codEntid", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codPostaInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPostaInter;
    @XmlElementRef(name = "codPostaRepre", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPostaRepre;
    @XmlElementRef(name = "corInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corInter;
    @XmlElementRef(name = "correo", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correo;
    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "dirInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirInter;
    @XmlElementRef(name = "dirRepre", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirRepre;
    @XmlElementRef(name = "dniCifRepre", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dniCifRepre;
    @XmlElementRef(name = "ejeRecib", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeRecib;
    @XmlElementRef(name = "estado", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> estado;
    @XmlElementRef(name = "fecProceso", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecProceso;
    @XmlElementRef(name = "idAuto", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idAuto;
    @XmlElementRef(name = "idHisPerso", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisPerso;
    @XmlElementRef(name = "idHisRecib", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisRecib;
    @XmlElementRef(name = "idImpue", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idImpue;
    @XmlElementRef(name = "idPerso", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idPerso;
    @XmlElementRef(name = "idRecib", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idRecib;
    @XmlElementRef(name = "importe", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> importe;
    @XmlElementRef(name = "modPerte", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modPerte;
    @XmlElementRef(name = "movInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> movInter;
    @XmlElementRef(name = "movil", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> movil;
    @XmlElementRef(name = "munInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> munInter;
    @XmlElementRef(name = "munRepre", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> munRepre;
    @XmlElementRef(name = "nombreRepre", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreRepre;
    @XmlElementRef(name = "numRecib", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numRecib;
    @XmlElementRef(name = "orden", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orden;
    @XmlElementRef(name = "proInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proInter;
    @XmlElementRef(name = "proRepre", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proRepre;
    @XmlElementRef(name = "sesion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sesion;
    @XmlElementRef(name = "telInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telInter;
    @XmlElementRef(name = "telefono", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono;
    @XmlElementRef(name = "tipoObjeto", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoObjeto;

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
     * Obtiene el valor de la propiedad codPostaInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPostaInter() {
        return codPostaInter;
    }

    /**
     * Define el valor de la propiedad codPostaInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPostaInter(JAXBElement<Integer> value) {
        this.codPostaInter = value;
    }

    /**
     * Obtiene el valor de la propiedad codPostaRepre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPostaRepre() {
        return codPostaRepre;
    }

    /**
     * Define el valor de la propiedad codPostaRepre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPostaRepre(JAXBElement<Integer> value) {
        this.codPostaRepre = value;
    }

    /**
     * Obtiene el valor de la propiedad corInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorInter() {
        return corInter;
    }

    /**
     * Define el valor de la propiedad corInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorInter(JAXBElement<String> value) {
        this.corInter = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorreo(JAXBElement<String> value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad datosConexion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     *     
     */
    public JAXBElement<DatosConexion> getDatosConexion() {
        return datosConexion;
    }

    /**
     * Define el valor de la propiedad datosConexion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosConexion }{@code >}
     *     
     */
    public void setDatosConexion(JAXBElement<DatosConexion> value) {
        this.datosConexion = value;
    }

    /**
     * Obtiene el valor de la propiedad dirInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirInter() {
        return dirInter;
    }

    /**
     * Define el valor de la propiedad dirInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirInter(JAXBElement<String> value) {
        this.dirInter = value;
    }

    /**
     * Obtiene el valor de la propiedad dirRepre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirRepre() {
        return dirRepre;
    }

    /**
     * Define el valor de la propiedad dirRepre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirRepre(JAXBElement<String> value) {
        this.dirRepre = value;
    }

    /**
     * Obtiene el valor de la propiedad dniCifRepre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDniCifRepre() {
        return dniCifRepre;
    }

    /**
     * Define el valor de la propiedad dniCifRepre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDniCifRepre(JAXBElement<String> value) {
        this.dniCifRepre = value;
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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEstado(JAXBElement<Short> value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecProceso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecProceso() {
        return fecProceso;
    }

    /**
     * Define el valor de la propiedad fecProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecProceso(JAXBElement<XMLGregorianCalendar> value) {
        this.fecProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idAuto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdAuto() {
        return idAuto;
    }

    /**
     * Define el valor de la propiedad idAuto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdAuto(JAXBElement<Long> value) {
        this.idAuto = value;
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
     * Obtiene el valor de la propiedad idHisRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisRecib() {
        return idHisRecib;
    }

    /**
     * Define el valor de la propiedad idHisRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisRecib(JAXBElement<Long> value) {
        this.idHisRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad idImpue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdImpue() {
        return idImpue;
    }

    /**
     * Define el valor de la propiedad idImpue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdImpue(JAXBElement<Long> value) {
        this.idImpue = value;
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
     * Obtiene el valor de la propiedad idRecib.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdRecib() {
        return idRecib;
    }

    /**
     * Define el valor de la propiedad idRecib.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdRecib(JAXBElement<Long> value) {
        this.idRecib = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImporte(JAXBElement<BigDecimal> value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad modPerte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getModPerte() {
        return modPerte;
    }

    /**
     * Define el valor de la propiedad modPerte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setModPerte(JAXBElement<Short> value) {
        this.modPerte = value;
    }

    /**
     * Obtiene el valor de la propiedad movInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMovInter() {
        return movInter;
    }

    /**
     * Define el valor de la propiedad movInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMovInter(JAXBElement<String> value) {
        this.movInter = value;
    }

    /**
     * Obtiene el valor de la propiedad movil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMovil() {
        return movil;
    }

    /**
     * Define el valor de la propiedad movil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMovil(JAXBElement<String> value) {
        this.movil = value;
    }

    /**
     * Obtiene el valor de la propiedad munInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMunInter() {
        return munInter;
    }

    /**
     * Define el valor de la propiedad munInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMunInter(JAXBElement<String> value) {
        this.munInter = value;
    }

    /**
     * Obtiene el valor de la propiedad munRepre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMunRepre() {
        return munRepre;
    }

    /**
     * Define el valor de la propiedad munRepre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMunRepre(JAXBElement<String> value) {
        this.munRepre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRepre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreRepre() {
        return nombreRepre;
    }

    /**
     * Define el valor de la propiedad nombreRepre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreRepre(JAXBElement<String> value) {
        this.nombreRepre = value;
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
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrden(JAXBElement<String> value) {
        this.orden = value;
    }

    /**
     * Obtiene el valor de la propiedad proInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProInter() {
        return proInter;
    }

    /**
     * Define el valor de la propiedad proInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProInter(JAXBElement<String> value) {
        this.proInter = value;
    }

    /**
     * Obtiene el valor de la propiedad proRepre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProRepre() {
        return proRepre;
    }

    /**
     * Define el valor de la propiedad proRepre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProRepre(JAXBElement<String> value) {
        this.proRepre = value;
    }

    /**
     * Obtiene el valor de la propiedad sesion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSesion() {
        return sesion;
    }

    /**
     * Define el valor de la propiedad sesion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSesion(JAXBElement<String> value) {
        this.sesion = value;
    }

    /**
     * Obtiene el valor de la propiedad telInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelInter() {
        return telInter;
    }

    /**
     * Define el valor de la propiedad telInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelInter(JAXBElement<String> value) {
        this.telInter = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefono(JAXBElement<String> value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoObjeto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoObjeto() {
        return tipoObjeto;
    }

    /**
     * Define el valor de la propiedad tipoObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoObjeto(JAXBElement<String> value) {
        this.tipoObjeto = value;
    }

}
