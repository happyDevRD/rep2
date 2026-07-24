
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfraccionWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfraccionWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apartado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calificacion" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desInfra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="infraccion" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="mesSuspe" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="norma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puntos" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipInfra" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfraccionWS", propOrder = {
    "apartado",
    "articulo",
    "calificacion",
    "desInfra",
    "importe",
    "infraccion",
    "mesSuspe",
    "norma",
    "opcion",
    "puntos",
    "tipInfra"
})
public class InfraccionWS {

    @XmlElementRef(name = "apartado", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apartado;
    @XmlElementRef(name = "articulo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> articulo;
    @XmlElementRef(name = "calificacion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> calificacion;
    @XmlElementRef(name = "desInfra", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desInfra;
    @XmlElementRef(name = "importe", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> importe;
    @XmlElementRef(name = "infraccion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> infraccion;
    @XmlElementRef(name = "mesSuspe", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> mesSuspe;
    @XmlElementRef(name = "norma", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> norma;
    @XmlElementRef(name = "opcion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opcion;
    @XmlElementRef(name = "puntos", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> puntos;
    @XmlElementRef(name = "tipInfra", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipInfra;

    /**
     * Obtiene el valor de la propiedad apartado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApartado() {
        return apartado;
    }

    /**
     * Define el valor de la propiedad apartado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApartado(JAXBElement<String> value) {
        this.apartado = value;
    }

    /**
     * Obtiene el valor de la propiedad articulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArticulo() {
        return articulo;
    }

    /**
     * Define el valor de la propiedad articulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArticulo(JAXBElement<String> value) {
        this.articulo = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCalificacion() {
        return calificacion;
    }

    /**
     * Define el valor de la propiedad calificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCalificacion(JAXBElement<Short> value) {
        this.calificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad desInfra.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesInfra() {
        return desInfra;
    }

    /**
     * Define el valor de la propiedad desInfra.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesInfra(JAXBElement<String> value) {
        this.desInfra = value;
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
     * Obtiene el valor de la propiedad infraccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getInfraccion() {
        return infraccion;
    }

    /**
     * Define el valor de la propiedad infraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setInfraccion(JAXBElement<Short> value) {
        this.infraccion = value;
    }

    /**
     * Obtiene el valor de la propiedad mesSuspe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getMesSuspe() {
        return mesSuspe;
    }

    /**
     * Define el valor de la propiedad mesSuspe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setMesSuspe(JAXBElement<Short> value) {
        this.mesSuspe = value;
    }

    /**
     * Obtiene el valor de la propiedad norma.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNorma() {
        return norma;
    }

    /**
     * Define el valor de la propiedad norma.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNorma(JAXBElement<String> value) {
        this.norma = value;
    }

    /**
     * Obtiene el valor de la propiedad opcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpcion() {
        return opcion;
    }

    /**
     * Define el valor de la propiedad opcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpcion(JAXBElement<String> value) {
        this.opcion = value;
    }

    /**
     * Obtiene el valor de la propiedad puntos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPuntos() {
        return puntos;
    }

    /**
     * Define el valor de la propiedad puntos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPuntos(JAXBElement<Short> value) {
        this.puntos = value;
    }

    /**
     * Obtiene el valor de la propiedad tipInfra.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipInfra() {
        return tipInfra;
    }

    /**
     * Define el valor de la propiedad tipInfra.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipInfra(JAXBElement<Short> value) {
        this.tipInfra = value;
    }

}
