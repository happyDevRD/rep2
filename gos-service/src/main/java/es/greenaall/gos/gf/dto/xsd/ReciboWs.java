
package es.greenaall.gos.gf.dto.xsd;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReciboWs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReciboWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cabecera" type="{http://dto.gf.gos.greenaall.es/xsd}ReciboCabeceraWs" minOccurs="0"/&gt;
 *         &lt;element name="conceptos" type="{http://dto.gf.gos.greenaall.es/xsd}ReciboConceptoWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReciboWs", propOrder = {
    "cabecera",
    "conceptos"
})
public class ReciboWs {

    @XmlElementRef(name = "cabecera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ReciboCabeceraWs> cabecera;
    @XmlElement(nillable = true)
    protected List<ReciboConceptoWs> conceptos;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     *     
     */
    public JAXBElement<ReciboCabeceraWs> getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     *     
     */
    public void setCabecera(JAXBElement<ReciboCabeceraWs> value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the conceptos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conceptos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReciboConceptoWs }
     * 
     * 
     */
    public List<ReciboConceptoWs> getConceptos() {
        if (conceptos == null) {
            conceptos = new ArrayList<ReciboConceptoWs>();
        }
        return this.conceptos;
    }

}
