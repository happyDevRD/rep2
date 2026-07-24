
package es.greenaall.gos.gf.ws.request.xsd;

import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AltaRegistroRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AltaRegistroRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="desProce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeExped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extracto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fichero64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forNotif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreFichero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numDocum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numExped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obsFichero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltaRegistroRequest", propOrder = {
    "apellido1",
    "apellido2",
    "cve",
    "datosConexion",
    "desProce",
    "ejeExped",
    "extracto",
    "fichero64",
    "forNotif",
    "nombre",
    "nombreFichero",
    "numDocum",
    "numExped",
    "obsFichero",
    "observaciones",
    "oficina",
    "razSocial",
    "sesion",
    "tema"
})
public class AltaRegistroRequest {

    @XmlElementRef(name = "apellido1", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1;
    @XmlElementRef(name = "apellido2", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2;
    @XmlElementRef(name = "cve", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cve;
    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "desProce", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desProce;
    @XmlElementRef(name = "ejeExped", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ejeExped;
    @XmlElementRef(name = "extracto", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extracto;
    @XmlElementRef(name = "fichero64", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fichero64;
    @XmlElementRef(name = "forNotif", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forNotif;
    @XmlElementRef(name = "nombre", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "nombreFichero", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreFichero;
    @XmlElementRef(name = "numDocum", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numDocum;
    @XmlElementRef(name = "numExped", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numExped;
    @XmlElementRef(name = "obsFichero", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obsFichero;
    @XmlElementRef(name = "observaciones", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "oficina", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficina;
    @XmlElementRef(name = "razSocial", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> razSocial;
    @XmlElementRef(name = "sesion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sesion;
    @XmlElementRef(name = "tema", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tema;

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
     * Obtiene el valor de la propiedad cve.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCve() {
        return cve;
    }

    /**
     * Define el valor de la propiedad cve.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCve(JAXBElement<String> value) {
        this.cve = value;
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
     * Obtiene el valor de la propiedad desProce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesProce() {
        return desProce;
    }

    /**
     * Define el valor de la propiedad desProce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesProce(JAXBElement<String> value) {
        this.desProce = value;
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
     * Obtiene el valor de la propiedad extracto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtracto() {
        return extracto;
    }

    /**
     * Define el valor de la propiedad extracto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtracto(JAXBElement<String> value) {
        this.extracto = value;
    }

    /**
     * Obtiene el valor de la propiedad fichero64.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFichero64() {
        return fichero64;
    }

    /**
     * Define el valor de la propiedad fichero64.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFichero64(JAXBElement<String> value) {
        this.fichero64 = value;
    }

    /**
     * Obtiene el valor de la propiedad forNotif.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForNotif() {
        return forNotif;
    }

    /**
     * Define el valor de la propiedad forNotif.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForNotif(JAXBElement<String> value) {
        this.forNotif = value;
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
     * Obtiene el valor de la propiedad nombreFichero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreFichero() {
        return nombreFichero;
    }

    /**
     * Define el valor de la propiedad nombreFichero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreFichero(JAXBElement<String> value) {
        this.nombreFichero = value;
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
     * Obtiene el valor de la propiedad numExped.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumExped() {
        return numExped;
    }

    /**
     * Define el valor de la propiedad numExped.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumExped(JAXBElement<String> value) {
        this.numExped = value;
    }

    /**
     * Obtiene el valor de la propiedad obsFichero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObsFichero() {
        return obsFichero;
    }

    /**
     * Define el valor de la propiedad obsFichero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObsFichero(JAXBElement<String> value) {
        this.obsFichero = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad oficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOficina() {
        return oficina;
    }

    /**
     * Define el valor de la propiedad oficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOficina(JAXBElement<String> value) {
        this.oficina = value;
    }

    /**
     * Obtiene el valor de la propiedad razSocial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRazSocial() {
        return razSocial;
    }

    /**
     * Define el valor de la propiedad razSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRazSocial(JAXBElement<String> value) {
        this.razSocial = value;
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
     * Obtiene el valor de la propiedad tema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTema() {
        return tema;
    }

    /**
     * Define el valor de la propiedad tema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTema(JAXBElement<String> value) {
        this.tema = value;
    }

}
