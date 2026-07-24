
package es.greenaall.gos.gf.ws.request.xsd;

import javax.xml.datatype.XMLGregorianCalendar;
import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaActualizacionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaActualizacionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idDoc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPeticion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tagsDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tagsPeticion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaActualizacionRequest", propOrder = {
    "datosConexion",
    "estado",
    "fecha",
    "idDoc",
    "idPeticion",
    "tagsDoc",
    "tagsPeticion"
})
public class RespuestaActualizacionRequest {

    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "estado", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> estado;
    @XmlElementRef(name = "fecha", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecha;
    @XmlElementRef(name = "idDoc", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idDoc;
    @XmlElementRef(name = "idPeticion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idPeticion;
    @XmlElementRef(name = "tagsDoc", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tagsDoc;
    @XmlElementRef(name = "tagsPeticion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tagsPeticion;

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
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecha(JAXBElement<XMLGregorianCalendar> value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdDoc() {
        return idDoc;
    }

    /**
     * Define el valor de la propiedad idDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdDoc(JAXBElement<Long> value) {
        this.idDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad idPeticion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdPeticion() {
        return idPeticion;
    }

    /**
     * Define el valor de la propiedad idPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdPeticion(JAXBElement<Long> value) {
        this.idPeticion = value;
    }

    /**
     * Obtiene el valor de la propiedad tagsDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTagsDoc() {
        return tagsDoc;
    }

    /**
     * Define el valor de la propiedad tagsDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTagsDoc(JAXBElement<String> value) {
        this.tagsDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tagsPeticion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTagsPeticion() {
        return tagsPeticion;
    }

    /**
     * Define el valor de la propiedad tagsPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTagsPeticion(JAXBElement<String> value) {
        this.tagsPeticion = value;
    }

}
