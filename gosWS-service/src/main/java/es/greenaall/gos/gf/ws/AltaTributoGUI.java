
package es.greenaall.gos.gf.ws;

import es.greenaall.gos.gf.ws.xsd.DatoConexion;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosConexion" type="{http://ws.gf.gos.greenaall.es/xsd}DatoConexion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datosConexion"
})
@XmlRootElement(name = "altaTributoGUI")
public class AltaTributoGUI {

    @XmlElementRef(name = "datosConexion", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<DatoConexion> datosConexion;

    /**
     * Obtiene el valor de la propiedad datosConexion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatoConexion }{@code >}
     *     
     */
    public JAXBElement<DatoConexion> getDatosConexion() {
        return datosConexion;
    }

    /**
     * Define el valor de la propiedad datosConexion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatoConexion }{@code >}
     *     
     */
    public void setDatosConexion(JAXBElement<DatoConexion> value) {
        this.datosConexion = value;
    }

}
