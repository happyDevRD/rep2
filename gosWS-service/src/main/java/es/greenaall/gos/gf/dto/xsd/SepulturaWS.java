
package es.greenaall.gos.gf.dto.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SepulturaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SepulturaWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cementerio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSepul" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desSepul" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecVenci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="situacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipConce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipSepul" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SepulturaWS", propOrder = {
    "cementerio",
    "codSepul",
    "desSepul",
    "fecVenci",
    "situacion",
    "tipConce",
    "tipSepul",
    "ubicacion"
})
public class SepulturaWS {

    @XmlElementRef(name = "cementerio", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cementerio;
    @XmlElementRef(name = "codSepul", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSepul;
    @XmlElementRef(name = "desSepul", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSepul;
    @XmlElementRef(name = "fecVenci", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fecVenci;
    @XmlElementRef(name = "situacion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> situacion;
    @XmlElementRef(name = "tipConce", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipConce;
    @XmlElementRef(name = "tipSepul", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipSepul;
    @XmlElementRef(name = "ubicacion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ubicacion;

    /**
     * Obtiene el valor de la propiedad cementerio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCementerio() {
        return cementerio;
    }

    /**
     * Define el valor de la propiedad cementerio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCementerio(JAXBElement<String> value) {
        this.cementerio = value;
    }

    /**
     * Obtiene el valor de la propiedad codSepul.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSepul() {
        return codSepul;
    }

    /**
     * Define el valor de la propiedad codSepul.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSepul(JAXBElement<String> value) {
        this.codSepul = value;
    }

    /**
     * Obtiene el valor de la propiedad desSepul.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesSepul() {
        return desSepul;
    }

    /**
     * Define el valor de la propiedad desSepul.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesSepul(JAXBElement<String> value) {
        this.desSepul = value;
    }

    /**
     * Obtiene el valor de la propiedad fecVenci.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFecVenci() {
        return fecVenci;
    }

    /**
     * Define el valor de la propiedad fecVenci.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFecVenci(JAXBElement<String> value) {
        this.fecVenci = value;
    }

    /**
     * Obtiene el valor de la propiedad situacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSituacion() {
        return situacion;
    }

    /**
     * Define el valor de la propiedad situacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSituacion(JAXBElement<String> value) {
        this.situacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipConce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipConce() {
        return tipConce;
    }

    /**
     * Define el valor de la propiedad tipConce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipConce(JAXBElement<String> value) {
        this.tipConce = value;
    }

    /**
     * Obtiene el valor de la propiedad tipSepul.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipSepul() {
        return tipSepul;
    }

    /**
     * Define el valor de la propiedad tipSepul.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipSepul(JAXBElement<String> value) {
        this.tipSepul = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUbicacion(JAXBElement<String> value) {
        this.ubicacion = value;
    }

}
