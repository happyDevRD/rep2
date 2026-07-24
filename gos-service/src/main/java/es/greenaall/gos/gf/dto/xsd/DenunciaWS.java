
package es.greenaall.gos.gf.dto.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DenunciaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DenunciaWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apartado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="articulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codAgent2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desInfra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecDenun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horDenun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="norma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DenunciaWS", propOrder = {
    "apartado",
    "articulo",
    "calif",
    "codAgent",
    "codAgent2",
    "desInfra",
    "fecDenun",
    "horDenun",
    "lugar",
    "matricula",
    "norma",
    "opcion"
})
public class DenunciaWS {

    @XmlElementRef(name = "apartado", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apartado;
    @XmlElementRef(name = "articulo", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> articulo;
    @XmlElementRef(name = "calif", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calif;
    @XmlElementRef(name = "codAgent", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codAgent;
    @XmlElementRef(name = "codAgent2", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codAgent2;
    @XmlElementRef(name = "desInfra", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desInfra;
    @XmlElementRef(name = "fecDenun", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fecDenun;
    @XmlElementRef(name = "horDenun", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horDenun;
    @XmlElementRef(name = "lugar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lugar;
    @XmlElementRef(name = "matricula", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matricula;
    @XmlElementRef(name = "norma", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> norma;
    @XmlElementRef(name = "opcion", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opcion;

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
     * Obtiene el valor de la propiedad calif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalif() {
        return calif;
    }

    /**
     * Define el valor de la propiedad calif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalif(JAXBElement<String> value) {
        this.calif = value;
    }

    /**
     * Obtiene el valor de la propiedad codAgent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodAgent() {
        return codAgent;
    }

    /**
     * Define el valor de la propiedad codAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodAgent(JAXBElement<String> value) {
        this.codAgent = value;
    }

    /**
     * Obtiene el valor de la propiedad codAgent2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodAgent2() {
        return codAgent2;
    }

    /**
     * Define el valor de la propiedad codAgent2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodAgent2(JAXBElement<String> value) {
        this.codAgent2 = value;
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
     * Obtiene el valor de la propiedad fecDenun.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFecDenun() {
        return fecDenun;
    }

    /**
     * Define el valor de la propiedad fecDenun.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFecDenun(JAXBElement<String> value) {
        this.fecDenun = value;
    }

    /**
     * Obtiene el valor de la propiedad horDenun.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHorDenun() {
        return horDenun;
    }

    /**
     * Define el valor de la propiedad horDenun.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHorDenun(JAXBElement<String> value) {
        this.horDenun = value;
    }

    /**
     * Obtiene el valor de la propiedad lugar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLugar() {
        return lugar;
    }

    /**
     * Define el valor de la propiedad lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLugar(JAXBElement<String> value) {
        this.lugar = value;
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

}
