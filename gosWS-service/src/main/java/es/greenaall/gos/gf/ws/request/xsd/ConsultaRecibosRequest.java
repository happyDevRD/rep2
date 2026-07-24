
package es.greenaall.gos.gf.ws.request.xsd;

import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import es.greenaall.gos.pe.dto.ws.xsd.PersonaEntidadRequest;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaRecibosRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaRecibosRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="objetoTributario" type="{http://request.ws.gf.gos.greenaall.es/xsd}ObjetoTributarioRequest" minOccurs="0"/&gt;
 *         &lt;element name="recibo" type="{http://request.ws.gf.gos.greenaall.es/xsd}ReciboRequest" minOccurs="0"/&gt;
 *         &lt;element name="sujetoPasivo" type="{http://ws.dto.pe.gos.greenaall.es/xsd}PersonaEntidadRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaRecibosRequest", propOrder = {
    "datosConexion",
    "objetoTributario",
    "recibo",
    "sujetoPasivo"
})
public class ConsultaRecibosRequest {

    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "objetoTributario", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjetoTributarioRequest> objetoTributario;
    @XmlElementRef(name = "recibo", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ReciboRequest> recibo;
    @XmlElementRef(name = "sujetoPasivo", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonaEntidadRequest> sujetoPasivo;

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
     * Obtiene el valor de la propiedad objetoTributario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjetoTributarioRequest }{@code >}
     *     
     */
    public JAXBElement<ObjetoTributarioRequest> getObjetoTributario() {
        return objetoTributario;
    }

    /**
     * Define el valor de la propiedad objetoTributario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjetoTributarioRequest }{@code >}
     *     
     */
    public void setObjetoTributario(JAXBElement<ObjetoTributarioRequest> value) {
        this.objetoTributario = value;
    }

    /**
     * Obtiene el valor de la propiedad recibo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReciboRequest }{@code >}
     *     
     */
    public JAXBElement<ReciboRequest> getRecibo() {
        return recibo;
    }

    /**
     * Define el valor de la propiedad recibo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReciboRequest }{@code >}
     *     
     */
    public void setRecibo(JAXBElement<ReciboRequest> value) {
        this.recibo = value;
    }

    /**
     * Obtiene el valor de la propiedad sujetoPasivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     *     
     */
    public JAXBElement<PersonaEntidadRequest> getSujetoPasivo() {
        return sujetoPasivo;
    }

    /**
     * Define el valor de la propiedad sujetoPasivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     *     
     */
    public void setSujetoPasivo(JAXBElement<PersonaEntidadRequest> value) {
        this.sujetoPasivo = value;
    }

}
