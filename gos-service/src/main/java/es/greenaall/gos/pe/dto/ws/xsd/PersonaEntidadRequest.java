
package es.greenaall.gos.pe.dto.ws.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonaEntidadRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonaEntidadRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosContacto" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosContacto" minOccurs="0"/&gt;
 *         &lt;element name="documentoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domicilio" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DomicilioSinCodificar" minOccurs="0"/&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="identificadorHistorico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="particula1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="particula2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumentoIdentificativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaEntidadRequest", propOrder = {
    "apellido1",
    "apellido2",
    "datosContacto",
    "documentoIdentificacion",
    "domicilio",
    "identificador",
    "identificadorHistorico",
    "nombre",
    "particula1",
    "particula2",
    "razonSocial",
    "sexo",
    "tipoDocumentoIdentificativo"
})
public class PersonaEntidadRequest {

    @XmlElementRef(name = "apellido1", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1;
    @XmlElementRef(name = "apellido2", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2;
    @XmlElementRef(name = "datosContacto", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosContacto> datosContacto;
    @XmlElementRef(name = "documentoIdentificacion", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentoIdentificacion;
    @XmlElementRef(name = "domicilio", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DomicilioSinCodificar> domicilio;
    @XmlElementRef(name = "identificador", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> identificador;
    @XmlElementRef(name = "identificadorHistorico", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> identificadorHistorico;
    @XmlElementRef(name = "nombre", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "particula1", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> particula1;
    @XmlElementRef(name = "particula2", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> particula2;
    @XmlElementRef(name = "razonSocial", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razonSocial;
    @XmlElementRef(name = "sexo", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> sexo;
    @XmlElementRef(name = "tipoDocumentoIdentificativo", namespace = "http://ws.dto.pe.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumentoIdentificativo;

    /**
     * Obtiene el valor de la propiedad apellido1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido1() {
        return apellido1;
    }

    /**
     * Define el valor de la propiedad apellido1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido1(JAXBElement<String> value) {
        this.apellido1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido2() {
        return apellido2;
    }

    /**
     * Define el valor de la propiedad apellido2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido2(JAXBElement<String> value) {
        this.apellido2 = value;
    }

    /**
     * Obtiene el valor de la propiedad datosContacto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosContacto }{@code >}
     *     
     */
    public JAXBElement<DatosContacto> getDatosContacto() {
        return datosContacto;
    }

    /**
     * Define el valor de la propiedad datosContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosContacto }{@code >}
     *     
     */
    public void setDatosContacto(JAXBElement<DatosContacto> value) {
        this.datosContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    /**
     * Define el valor de la propiedad documentoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentoIdentificacion(JAXBElement<String> value) {
        this.documentoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DomicilioSinCodificar }{@code >}
     *     
     */
    public JAXBElement<DomicilioSinCodificar> getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DomicilioSinCodificar }{@code >}
     *     
     */
    public void setDomicilio(JAXBElement<DomicilioSinCodificar> value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad identificador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdentificador() {
        return identificador;
    }

    /**
     * Define el valor de la propiedad identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdentificador(JAXBElement<Long> value) {
        this.identificador = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorHistorico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdentificadorHistorico() {
        return identificadorHistorico;
    }

    /**
     * Define el valor de la propiedad identificadorHistorico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdentificadorHistorico(JAXBElement<Long> value) {
        this.identificadorHistorico = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad particula1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParticula1() {
        return particula1;
    }

    /**
     * Define el valor de la propiedad particula1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParticula1(JAXBElement<String> value) {
        this.particula1 = value;
    }

    /**
     * Obtiene el valor de la propiedad particula2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParticula2() {
        return particula2;
    }

    /**
     * Define el valor de la propiedad particula2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParticula2(JAXBElement<String> value) {
        this.particula2 = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazonSocial(JAXBElement<String> value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setSexo(JAXBElement<Short> value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoIdentificativo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumentoIdentificativo() {
        return tipoDocumentoIdentificativo;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoIdentificativo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumentoIdentificativo(JAXBElement<String> value) {
        this.tipoDocumentoIdentificativo = value;
    }

}
