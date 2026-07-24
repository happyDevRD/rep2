
package es.greenaall.gos.gf.ws;

import es.greenaall.gos.gf.dto.xsd.LiquidacionRc;
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
 *         &lt;element name="liquidacion" type="{http://dto.gf.gos.greenaall.es/xsd}LiquidacionRc" minOccurs="0"/&gt;
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
    "liquidacion",
    "datosConexion"
})
@XmlRootElement(name = "consultarLiquidacionesTributosGUI")
public class ConsultarLiquidacionesTributosGUI {

    @XmlElementRef(name = "liquidacion", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidacionRc> liquidacion;
    @XmlElementRef(name = "datosConexion", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<DatoConexion> datosConexion;

    /**
     * Obtiene el valor de la propiedad liquidacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidacionRc }{@code >}
     *     
     */
    public JAXBElement<LiquidacionRc> getLiquidacion() {
        return liquidacion;
    }

    /**
     * Define el valor de la propiedad liquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidacionRc }{@code >}
     *     
     */
    public void setLiquidacion(JAXBElement<LiquidacionRc> value) {
        this.liquidacion = value;
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
