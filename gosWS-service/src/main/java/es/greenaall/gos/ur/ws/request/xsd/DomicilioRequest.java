
package es.greenaall.gos.ur.ws.request.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DomicilioRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DomicilioRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMunic" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPosta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codProvi" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escalera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisDomic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="letVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numVia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="planta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomicilioRequest", propOrder = {
    "bloque",
    "codMunic",
    "codPosta",
    "codProvi",
    "desVia",
    "escalera",
    "idDomic",
    "idHisDomic",
    "letVia",
    "numVia",
    "planta",
    "puerta",
    "tipVia"
})
public class DomicilioRequest {

    @XmlElementRef(name = "bloque", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloque;
    @XmlElementRef(name = "codMunic", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codMunic;
    @XmlElementRef(name = "codPosta", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPosta;
    @XmlElementRef(name = "codProvi", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codProvi;
    @XmlElementRef(name = "desVia", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desVia;
    @XmlElementRef(name = "escalera", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> escalera;
    @XmlElementRef(name = "idDomic", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDomic;
    @XmlElementRef(name = "idHisDomic", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisDomic;
    @XmlElementRef(name = "letVia", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> letVia;
    @XmlElementRef(name = "numVia", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numVia;
    @XmlElementRef(name = "planta", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planta;
    @XmlElementRef(name = "puerta", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puerta;
    @XmlElementRef(name = "tipVia", namespace = "http://request.ws.ur.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipVia;

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
     * Obtiene el valor de la propiedad letVia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLetVia() {
        return letVia;
    }

    /**
     * Define el valor de la propiedad letVia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLetVia(JAXBElement<String> value) {
        this.letVia = value;
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

}
