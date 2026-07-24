
package es.greenaall.gos.gf.ws.request.xsd;

import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import es.greenaall.gos.pe.dto.ws.xsd.PersonaEntidadRequest;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaObjetosTributariosRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaObjetosTributariosRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="objetoTributario" type="{http://request.ws.gf.gos.greenaall.es/xsd}ObjetoTributarioRequest" minOccurs="0"/&gt;
 *         &lt;element name="otroSujeto" type="{http://ws.dto.pe.gos.greenaall.es/xsd}PersonaEntidadRequest" minOccurs="0"/&gt;
 *         &lt;element name="sujetoPasivo" type="{http://ws.dto.pe.gos.greenaall.es/xsd}PersonaEntidadRequest" minOccurs="0"/&gt;
 *         &lt;element name="tipoObjetoTributario" type="{http://request.ws.gf.gos.greenaall.es/xsd}TipoObjetoTributarioRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaObjetosTributariosRequest", propOrder = {
    "datosConexion",
    "objetoTributario",
    "otroSujeto",
    "sujetoPasivo",
    "tipoObjetoTributario"
})
public class ConsultaObjetosTributariosRequest {

    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "objetoTributario", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjetoTributarioRequest> objetoTributario;
    @XmlElementRef(name = "otroSujeto", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonaEntidadRequest> otroSujeto;
    @XmlElementRef(name = "sujetoPasivo", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonaEntidadRequest> sujetoPasivo;
    @XmlElementRef(name = "tipoObjetoTributario", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoObjetoTributarioRequest> tipoObjetoTributario;

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
     * Obtiene el valor de la propiedad otroSujeto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     *     
     */
    public JAXBElement<PersonaEntidadRequest> getOtroSujeto() {
        return otroSujeto;
    }

    /**
     * Define el valor de la propiedad otroSujeto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonaEntidadRequest }{@code >}
     *     
     */
    public void setOtroSujeto(JAXBElement<PersonaEntidadRequest> value) {
        this.otroSujeto = value;
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

    /**
     * Obtiene el valor de la propiedad tipoObjetoTributario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoObjetoTributarioRequest }{@code >}
     *     
     */
    public JAXBElement<TipoObjetoTributarioRequest> getTipoObjetoTributario() {
        return tipoObjetoTributario;
    }

    /**
     * Define el valor de la propiedad tipoObjetoTributario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoObjetoTributarioRequest }{@code >}
     *     
     */
    public void setTipoObjetoTributario(JAXBElement<TipoObjetoTributarioRequest> value) {
        this.tipoObjetoTributario = value;
    }

}
