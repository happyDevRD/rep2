
package es.greenaall.gos.ge.dto.xsd;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Usuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actAudit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ambito" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="bloqueo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="cambioPas" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codGrupo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codPerfi" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="controlHor" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="controlIp" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="datConfi" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecBloqu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecVenPassw" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecVenUsuar" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idHisPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idPerso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nivAcces" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numUsuar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuContr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usuario", propOrder = {
    "actAudit",
    "ambito",
    "bloqueo",
    "cambioPas",
    "codEntid",
    "codGrupo",
    "codPerfi",
    "controlHor",
    "controlIp",
    "datConfi",
    "desUsuario",
    "fecBloqu",
    "fecContr",
    "fecVenPassw",
    "fecVenUsuar",
    "idHisPerso",
    "idPerso",
    "nivAcces",
    "numUsuar",
    "password",
    "usuContr",
    "usuario"
})
public class Usuario {

    @XmlElementRef(name = "actAudit", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> actAudit;
    @XmlElementRef(name = "ambito", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ambito;
    @XmlElementRef(name = "bloqueo", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> bloqueo;
    @XmlElementRef(name = "cambioPas", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> cambioPas;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codGrupo", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codGrupo;
    @XmlElementRef(name = "codPerfi", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codPerfi;
    @XmlElementRef(name = "controlHor", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> controlHor;
    @XmlElementRef(name = "controlIp", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> controlIp;
    @XmlElementRef(name = "datConfi", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> datConfi;
    @XmlElementRef(name = "desUsuario", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desUsuario;
    @XmlElementRef(name = "fecBloqu", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecBloqu;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "fecVenPassw", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecVenPassw;
    @XmlElementRef(name = "fecVenUsuar", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecVenUsuar;
    @XmlElementRef(name = "idHisPerso", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisPerso;
    @XmlElementRef(name = "idPerso", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idPerso;
    @XmlElementRef(name = "nivAcces", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> nivAcces;
    @XmlElementRef(name = "numUsuar", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numUsuar;
    @XmlElementRef(name = "password", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;
    @XmlElementRef(name = "usuario", namespace = "http://dto.ge.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuario;

    /**
     * Obtiene el valor de la propiedad actAudit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getActAudit() {
        return actAudit;
    }

    /**
     * Define el valor de la propiedad actAudit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setActAudit(JAXBElement<Short> value) {
        this.actAudit = value;
    }

    /**
     * Obtiene el valor de la propiedad ambito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getAmbito() {
        return ambito;
    }

    /**
     * Define el valor de la propiedad ambito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setAmbito(JAXBElement<Short> value) {
        this.ambito = value;
    }

    /**
     * Obtiene el valor de la propiedad bloqueo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getBloqueo() {
        return bloqueo;
    }

    /**
     * Define el valor de la propiedad bloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setBloqueo(JAXBElement<Short> value) {
        this.bloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad cambioPas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCambioPas() {
        return cambioPas;
    }

    /**
     * Define el valor de la propiedad cambioPas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCambioPas(JAXBElement<Short> value) {
        this.cambioPas = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodEntid() {
        return codEntid;
    }

    /**
     * Define el valor de la propiedad codEntid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodEntid(JAXBElement<Short> value) {
        this.codEntid = value;
    }

    /**
     * Obtiene el valor de la propiedad codGrupo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodGrupo() {
        return codGrupo;
    }

    /**
     * Define el valor de la propiedad codGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodGrupo(JAXBElement<Short> value) {
        this.codGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad codPerfi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodPerfi() {
        return codPerfi;
    }

    /**
     * Define el valor de la propiedad codPerfi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodPerfi(JAXBElement<Short> value) {
        this.codPerfi = value;
    }

    /**
     * Obtiene el valor de la propiedad controlHor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getControlHor() {
        return controlHor;
    }

    /**
     * Define el valor de la propiedad controlHor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setControlHor(JAXBElement<Short> value) {
        this.controlHor = value;
    }

    /**
     * Obtiene el valor de la propiedad controlIp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getControlIp() {
        return controlIp;
    }

    /**
     * Define el valor de la propiedad controlIp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setControlIp(JAXBElement<Short> value) {
        this.controlIp = value;
    }

    /**
     * Obtiene el valor de la propiedad datConfi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getDatConfi() {
        return datConfi;
    }

    /**
     * Define el valor de la propiedad datConfi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setDatConfi(JAXBElement<Short> value) {
        this.datConfi = value;
    }

    /**
     * Obtiene el valor de la propiedad desUsuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesUsuario() {
        return desUsuario;
    }

    /**
     * Define el valor de la propiedad desUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesUsuario(JAXBElement<String> value) {
        this.desUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad fecBloqu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecBloqu() {
        return fecBloqu;
    }

    /**
     * Define el valor de la propiedad fecBloqu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecBloqu(JAXBElement<XMLGregorianCalendar> value) {
        this.fecBloqu = value;
    }

    /**
     * Obtiene el valor de la propiedad fecContr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecContr() {
        return fecContr;
    }

    /**
     * Define el valor de la propiedad fecContr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecContr(JAXBElement<XMLGregorianCalendar> value) {
        this.fecContr = value;
    }

    /**
     * Obtiene el valor de la propiedad fecVenPassw.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecVenPassw() {
        return fecVenPassw;
    }

    /**
     * Define el valor de la propiedad fecVenPassw.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecVenPassw(JAXBElement<XMLGregorianCalendar> value) {
        this.fecVenPassw = value;
    }

    /**
     * Obtiene el valor de la propiedad fecVenUsuar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecVenUsuar() {
        return fecVenUsuar;
    }

    /**
     * Define el valor de la propiedad fecVenUsuar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecVenUsuar(JAXBElement<XMLGregorianCalendar> value) {
        this.fecVenUsuar = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisPerso() {
        return idHisPerso;
    }

    /**
     * Define el valor de la propiedad idHisPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisPerso(JAXBElement<Long> value) {
        this.idHisPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad idPerso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdPerso() {
        return idPerso;
    }

    /**
     * Define el valor de la propiedad idPerso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdPerso(JAXBElement<Long> value) {
        this.idPerso = value;
    }

    /**
     * Obtiene el valor de la propiedad nivAcces.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNivAcces() {
        return nivAcces;
    }

    /**
     * Define el valor de la propiedad nivAcces.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNivAcces(JAXBElement<Short> value) {
        this.nivAcces = value;
    }

    /**
     * Obtiene el valor de la propiedad numUsuar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumUsuar() {
        return numUsuar;
    }

    /**
     * Define el valor de la propiedad numUsuar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumUsuar(JAXBElement<Short> value) {
        this.numUsuar = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad usuContr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuContr() {
        return usuContr;
    }

    /**
     * Define el valor de la propiedad usuContr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuContr(JAXBElement<String> value) {
        this.usuContr = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuario(JAXBElement<String> value) {
        this.usuario = value;
    }

}
