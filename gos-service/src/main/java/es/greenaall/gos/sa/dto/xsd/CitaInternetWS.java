
package es.greenaall.gos.sa.dto.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CitaInternetWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CitaInternetWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="desCentr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horCita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCita" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitaInternetWS", propOrder = {
    "desCentr",
    "fecCita",
    "horCita",
    "idCita"
})
public class CitaInternetWS {

    @XmlElementRef(name = "desCentr", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCentr;
    @XmlElementRef(name = "fecCita", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fecCita;
    @XmlElementRef(name = "horCita", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horCita;
    @XmlElementRef(name = "idCita", namespace = "http://dto.sa.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idCita;

    /**
     * Obtiene el valor de la propiedad desCentr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesCentr() {
        return desCentr;
    }

    /**
     * Define el valor de la propiedad desCentr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesCentr(JAXBElement<String> value) {
        this.desCentr = value;
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
     * Obtiene el valor de la propiedad idCita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdCita() {
        return idCita;
    }

    /**
     * Define el valor de la propiedad idCita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdCita(JAXBElement<Long> value) {
        this.idCita = value;
    }

}
