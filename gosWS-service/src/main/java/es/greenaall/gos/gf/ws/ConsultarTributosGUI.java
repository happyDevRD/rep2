
package es.greenaall.gos.gf.ws;

import es.greenaall.gos.gf.dto.xsd.ObjetoTributarioRc;
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
 *         &lt;element name="objetoTributario" type="{http://dto.gf.gos.greenaall.es/xsd}ObjetoTributarioRc" minOccurs="0"/&gt;
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
    "objetoTributario",
    "datosConexion"
})
@XmlRootElement(name = "consultarTributosGUI")
public class ConsultarTributosGUI {

    @XmlElementRef(name = "objetoTributario", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjetoTributarioRc> objetoTributario;
    @XmlElementRef(name = "datosConexion", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<DatoConexion> datosConexion;

    /**
     * Obtiene el valor de la propiedad objetoTributario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjetoTributarioRc }{@code >}
     *     
     */
    public JAXBElement<ObjetoTributarioRc> getObjetoTributario() {
        return objetoTributario;
    }

    /**
     * Define el valor de la propiedad objetoTributario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjetoTributarioRc }{@code >}
     *     
     */
    public void setObjetoTributario(JAXBElement<ObjetoTributarioRc> value) {
        this.objetoTributario = value;
    }

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
