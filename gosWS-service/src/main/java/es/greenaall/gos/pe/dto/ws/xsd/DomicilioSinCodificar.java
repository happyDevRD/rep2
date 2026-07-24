
package es.greenaall.gos.pe.dto.ws.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DomicilioSinCodificar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DomicilioSinCodificar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codigoProvincia" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="dirPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="edificio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escalera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kilometro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="letra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="portal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoVial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomicilioSinCodificar", propOrder = {
    "bloque",
    "codigoMunicipio",
    "codigoPostal",
    "codigoProvincia",
    "dirPostal",
    "edificio",
    "escalera",
    "kilometro",
    "letra",
    "numero",
    "planta",
    "portal",
    "puerta",
    "tipoVial",
    "vial"
})
public class DomicilioSinCodificar {

    @XmlElementRef(name = "bloque", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloque;
    @XmlElementRef(name = "codigoMunicipio", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codigoMunicipio;
    @XmlElementRef(name = "codigoPostal", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoPostal;
    @XmlElementRef(name = "codigoProvincia", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codigoProvincia;
    @XmlElementRef(name = "dirPostal", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dirPostal;
    @XmlElementRef(name = "edificio", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> edificio;
    @XmlElementRef(name = "escalera", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> escalera;
    @XmlElementRef(name = "kilometro", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kilometro;
    @XmlElementRef(name = "letra", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> letra;
    @XmlElementRef(name = "numero", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numero;
    @XmlElementRef(name = "planta", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planta;
    @XmlElementRef(name = "portal", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portal;
    @XmlElementRef(name = "puerta", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puerta;
    @XmlElementRef(name = "tipoVial", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoVial;
    @XmlElementRef(name = "vial", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vial;

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
     * Obtiene el valor de la propiedad codigoMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define el valor de la propiedad codigoMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodigoMunicipio(JAXBElement<Short> value) {
        this.codigoMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoPostal(JAXBElement<Integer> value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodigoProvincia() {
        return codigoProvincia;
    }

    /**
     * Define el valor de la propiedad codigoProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodigoProvincia(JAXBElement<Short> value) {
        this.codigoProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad dirPostal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirPostal() {
        return dirPostal;
    }

    /**
     * Define el valor de la propiedad dirPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirPostal(JAXBElement<String> value) {
        this.dirPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad edificio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEdificio() {
        return edificio;
    }

    /**
     * Define el valor de la propiedad edificio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEdificio(JAXBElement<String> value) {
        this.edificio = value;
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
     * Obtiene el valor de la propiedad kilometro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKilometro() {
        return kilometro;
    }

    /**
     * Define el valor de la propiedad kilometro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKilometro(JAXBElement<String> value) {
        this.kilometro = value;
    }

    /**
     * Obtiene el valor de la propiedad letra.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLetra() {
        return letra;
    }

    /**
     * Define el valor de la propiedad letra.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLetra(JAXBElement<String> value) {
        this.letra = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumero(JAXBElement<String> value) {
        this.numero = value;
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
     * Obtiene el valor de la propiedad portal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortal() {
        return portal;
    }

    /**
     * Define el valor de la propiedad portal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortal(JAXBElement<String> value) {
        this.portal = value;
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
     * Obtiene el valor de la propiedad tipoVial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoVial() {
        return tipoVial;
    }

    /**
     * Define el valor de la propiedad tipoVial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoVial(JAXBElement<String> value) {
        this.tipoVial = value;
    }

    /**
     * Obtiene el valor de la propiedad vial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVial() {
        return vial;
    }

    /**
     * Define el valor de la propiedad vial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVial(JAXBElement<String> value) {
        this.vial = value;
    }

}
