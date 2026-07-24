
package es.greenaall.gos.gf.ws.request.xsd;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoObjetoTributarioRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoObjetoTributarioRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecFinWeb" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecIniWeb" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idHisTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTipObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="visWeb" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoObjetoTributarioRequest", propOrder = {
    "codTipObjTribu",
    "desTipObjTribu",
    "fecFinWeb",
    "fecIniWeb",
    "idHisTipObjTribu",
    "idTipObjTribu",
    "info",
    "modulo",
    "visWeb"
})
public class TipoObjetoTributarioRequest {

    @XmlElementRef(name = "codTipObjTribu", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTipObjTribu;
    @XmlElementRef(name = "desTipObjTribu", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desTipObjTribu;
    @XmlElementRef(name = "fecFinWeb", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecFinWeb;
    @XmlElementRef(name = "fecIniWeb", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecIniWeb;
    @XmlElementRef(name = "idHisTipObjTribu", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisTipObjTribu;
    @XmlElementRef(name = "idTipObjTribu", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idTipObjTribu;
    @XmlElementRef(name = "info", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info;
    @XmlElementRef(name = "modulo", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> modulo;
    @XmlElementRef(name = "visWeb", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> visWeb;

    /**
     * Obtiene el valor de la propiedad codTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodTipObjTribu() {
        return codTipObjTribu;
    }

    /**
     * Define el valor de la propiedad codTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodTipObjTribu(JAXBElement<String> value) {
        this.codTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad desTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesTipObjTribu() {
        return desTipObjTribu;
    }

    /**
     * Define el valor de la propiedad desTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesTipObjTribu(JAXBElement<String> value) {
        this.desTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad fecFinWeb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecFinWeb() {
        return fecFinWeb;
    }

    /**
     * Define el valor de la propiedad fecFinWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecFinWeb(JAXBElement<XMLGregorianCalendar> value) {
        this.fecFinWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad fecIniWeb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecIniWeb() {
        return fecIniWeb;
    }

    /**
     * Define el valor de la propiedad fecIniWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecIniWeb(JAXBElement<XMLGregorianCalendar> value) {
        this.fecIniWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisTipObjTribu() {
        return idHisTipObjTribu;
    }

    /**
     * Define el valor de la propiedad idHisTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisTipObjTribu(JAXBElement<Long> value) {
        this.idHisTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdTipObjTribu() {
        return idTipObjTribu;
    }

    /**
     * Define el valor de la propiedad idTipObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdTipObjTribu(JAXBElement<Long> value) {
        this.idTipObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad info.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo() {
        return info;
    }

    /**
     * Define el valor de la propiedad info.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo(JAXBElement<String> value) {
        this.info = value;
    }

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setModulo(JAXBElement<Short> value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad visWeb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getVisWeb() {
        return visWeb;
    }

    /**
     * Define el valor de la propiedad visWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setVisWeb(JAXBElement<Short> value) {
        this.visWeb = value;
    }

}
