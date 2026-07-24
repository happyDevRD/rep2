
package es.greenaall.gos.gf.dto.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LpoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LpoWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeExpObra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeExped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecAproba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viviendas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LpoWS", propOrder = {
    "domicilio",
    "ejeExpObra",
    "ejeExped",
    "fecAproba",
    "viviendas"
})
public class LpoWS {

    @XmlElementRef(name = "domicilio", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilio;
    @XmlElementRef(name = "ejeExpObra", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ejeExpObra;
    @XmlElementRef(name = "ejeExped", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ejeExped;
    @XmlElementRef(name = "fecAproba", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fecAproba;
    @XmlElementRef(name = "viviendas", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> viviendas;

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
     * Obtiene el valor de la propiedad ejeExpObra.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEjeExpObra() {
        return ejeExpObra;
    }

    /**
     * Define el valor de la propiedad ejeExpObra.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEjeExpObra(JAXBElement<String> value) {
        this.ejeExpObra = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeExped.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEjeExped() {
        return ejeExped;
    }

    /**
     * Define el valor de la propiedad ejeExped.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEjeExped(JAXBElement<String> value) {
        this.ejeExped = value;
    }

    /**
     * Obtiene el valor de la propiedad fecAproba.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFecAproba() {
        return fecAproba;
    }

    /**
     * Define el valor de la propiedad fecAproba.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFecAproba(JAXBElement<String> value) {
        this.fecAproba = value;
    }

    /**
     * Obtiene el valor de la propiedad viviendas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViviendas() {
        return viviendas;
    }

    /**
     * Define el valor de la propiedad viviendas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViviendas(JAXBElement<String> value) {
        this.viviendas = value;
    }

}
