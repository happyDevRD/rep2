
package es.greenaall.gos.gf.ws.request.xsd;

import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AltaCitaInternetRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AltaCitaInternetRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCentr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="movInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telInter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltaCitaInternetRequest", propOrder = {
    "apellido1",
    "apellido2",
    "corInter",
    "datosConexion",
    "documento",
    "fecCita",
    "horCita",
    "idCentr",
    "movInter",
    "nombre",
    "telInter"
})
public class AltaCitaInternetRequest {

    @XmlElementRef(name = "apellido1", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1;
    @XmlElementRef(name = "apellido2", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2;
    @XmlElementRef(name = "corInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corInter;
    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "documento", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documento;
    @XmlElementRef(name = "fecCita", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fecCita;
    @XmlElementRef(name = "horCita", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horCita;
    @XmlElementRef(name = "idCentr", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idCentr;
    @XmlElementRef(name = "movInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> movInter;
    @XmlElementRef(name = "nombre", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "telInter", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telInter;

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
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumento(JAXBElement<String> value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad fecCita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFecCita() {
        return fecCita;
    }

    /**
     * Define el valor de la propiedad fecCita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFecCita(JAXBElement<String> value) {
        this.fecCita = value;
    }

    /**
     * Obtiene el valor de la propiedad horCita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHorCita() {
        return horCita;
    }

    /**
     * Define el valor de la propiedad horCita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHorCita(JAXBElement<String> value) {
        this.horCita = value;
    }

    /**
     * Obtiene el valor de la propiedad idCentr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdCentr() {
        return idCentr;
    }

    /**
     * Define el valor de la propiedad idCentr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdCentr(JAXBElement<Long> value) {
        this.idCentr = value;
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

}
