
package es.greenaall.gos.gf.dto.xsd;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OperacionWs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperacionWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAreOrige" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codForPago" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codOpeForma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codOrgAprob" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="codTipPago" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejeOpera" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="fecContr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecOpera" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecResol" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecTesor" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fiaMetal" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="idCodOpera" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idConta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idEndos" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHabil" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOpePadre" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idOpera" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idProye" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idTerce" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="impDto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impIva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impLiqui" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="impTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="indCtrInter" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indMod347" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indOpeTramite" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="indTramitar" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="natDerObl" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numChequ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numDocum" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numOpera" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numOrdin" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numResol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oficina" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ordEndos" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ordHabil" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ordTerce" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="recFinan" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipExacc" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="txtOpera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuContr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacionWs", propOrder = {
    "codAreOrige",
    "codEntid",
    "codForPago",
    "codOpeForma",
    "codOrgAprob",
    "codTipPago",
    "desEstado",
    "ejeOpera",
    "estado",
    "fecContr",
    "fecOpera",
    "fecResol",
    "fecTesor",
    "fiaMetal",
    "idCodOpera",
    "idConta",
    "idEndos",
    "idHabil",
    "idOpePadre",
    "idOpera",
    "idProye",
    "idTerce",
    "impDto",
    "impIva",
    "impLiqui",
    "impTotal",
    "indCtrInter",
    "indMod347",
    "indOpeTramite",
    "indTramitar",
    "natDerObl",
    "numChequ",
    "numDocum",
    "numOpera",
    "numOrdin",
    "numResol",
    "observaciones",
    "oficina",
    "ordEndos",
    "ordHabil",
    "ordTerce",
    "recFinan",
    "tipExacc",
    "txtOpera",
    "usuContr"
})
public class OperacionWs {

    @XmlElementRef(name = "codAreOrige", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codAreOrige;
    @XmlElementRef(name = "codEntid", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codEntid;
    @XmlElementRef(name = "codForPago", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codForPago;
    @XmlElementRef(name = "codOpeForma", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codOpeForma;
    @XmlElementRef(name = "codOrgAprob", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codOrgAprob;
    @XmlElementRef(name = "codTipPago", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codTipPago;
    @XmlElementRef(name = "desEstado", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desEstado;
    @XmlElementRef(name = "ejeOpera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ejeOpera;
    @XmlElementRef(name = "estado", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> estado;
    @XmlElementRef(name = "fecContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecContr;
    @XmlElementRef(name = "fecOpera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecOpera;
    @XmlElementRef(name = "fecResol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecResol;
    @XmlElementRef(name = "fecTesor", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fecTesor;
    @XmlElementRef(name = "fiaMetal", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> fiaMetal;
    @XmlElementRef(name = "idCodOpera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idCodOpera;
    @XmlElementRef(name = "idConta", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idConta;
    @XmlElementRef(name = "idEndos", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idEndos;
    @XmlElementRef(name = "idHabil", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHabil;
    @XmlElementRef(name = "idOpePadre", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOpePadre;
    @XmlElementRef(name = "idOpera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idOpera;
    @XmlElementRef(name = "idProye", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idProye;
    @XmlElementRef(name = "idTerce", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idTerce;
    @XmlElementRef(name = "impDto", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impDto;
    @XmlElementRef(name = "impIva", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impIva;
    @XmlElementRef(name = "impLiqui", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impLiqui;
    @XmlElementRef(name = "impTotal", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> impTotal;
    @XmlElementRef(name = "indCtrInter", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indCtrInter;
    @XmlElementRef(name = "indMod347", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indMod347;
    @XmlElementRef(name = "indOpeTramite", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indOpeTramite;
    @XmlElementRef(name = "indTramitar", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> indTramitar;
    @XmlElementRef(name = "natDerObl", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> natDerObl;
    @XmlElementRef(name = "numChequ", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numChequ;
    @XmlElementRef(name = "numDocum", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numDocum;
    @XmlElementRef(name = "numOpera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numOpera;
    @XmlElementRef(name = "numOrdin", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> numOrdin;
    @XmlElementRef(name = "numResol", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numResol;
    @XmlElementRef(name = "observaciones", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "oficina", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> oficina;
    @XmlElementRef(name = "ordEndos", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ordEndos;
    @XmlElementRef(name = "ordHabil", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ordHabil;
    @XmlElementRef(name = "ordTerce", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> ordTerce;
    @XmlElementRef(name = "recFinan", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> recFinan;
    @XmlElementRef(name = "tipExacc", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tipExacc;
    @XmlElementRef(name = "txtOpera", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> txtOpera;
    @XmlElementRef(name = "usuContr", namespace = "http://dto.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuContr;

    /**
     * Obtiene el valor de la propiedad codAreOrige.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodAreOrige() {
        return codAreOrige;
    }

    /**
     * Define el valor de la propiedad codAreOrige.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodAreOrige(JAXBElement<Short> value) {
        this.codAreOrige = value;
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
     * Obtiene el valor de la propiedad codForPago.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodForPago() {
        return codForPago;
    }

    /**
     * Define el valor de la propiedad codForPago.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodForPago(JAXBElement<Short> value) {
        this.codForPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codOpeForma.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodOpeForma() {
        return codOpeForma;
    }

    /**
     * Define el valor de la propiedad codOpeForma.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodOpeForma(JAXBElement<String> value) {
        this.codOpeForma = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrgAprob.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodOrgAprob() {
        return codOrgAprob;
    }

    /**
     * Define el valor de la propiedad codOrgAprob.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodOrgAprob(JAXBElement<Short> value) {
        this.codOrgAprob = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipPago.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodTipPago() {
        return codTipPago;
    }

    /**
     * Define el valor de la propiedad codTipPago.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodTipPago(JAXBElement<Short> value) {
        this.codTipPago = value;
    }

    /**
     * Obtiene el valor de la propiedad desEstado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesEstado() {
        return desEstado;
    }

    /**
     * Define el valor de la propiedad desEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesEstado(JAXBElement<String> value) {
        this.desEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad ejeOpera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getEjeOpera() {
        return ejeOpera;
    }

    /**
     * Define el valor de la propiedad ejeOpera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setEjeOpera(JAXBElement<Short> value) {
        this.ejeOpera = value;
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
     * Obtiene el valor de la propiedad fecOpera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecOpera() {
        return fecOpera;
    }

    /**
     * Define el valor de la propiedad fecOpera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecOpera(JAXBElement<XMLGregorianCalendar> value) {
        this.fecOpera = value;
    }

    /**
     * Obtiene el valor de la propiedad fecResol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecResol() {
        return fecResol;
    }

    /**
     * Define el valor de la propiedad fecResol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecResol(JAXBElement<XMLGregorianCalendar> value) {
        this.fecResol = value;
    }

    /**
     * Obtiene el valor de la propiedad fecTesor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFecTesor() {
        return fecTesor;
    }

    /**
     * Define el valor de la propiedad fecTesor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFecTesor(JAXBElement<XMLGregorianCalendar> value) {
        this.fecTesor = value;
    }

    /**
     * Obtiene el valor de la propiedad fiaMetal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getFiaMetal() {
        return fiaMetal;
    }

    /**
     * Define el valor de la propiedad fiaMetal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setFiaMetal(JAXBElement<Short> value) {
        this.fiaMetal = value;
    }

    /**
     * Obtiene el valor de la propiedad idCodOpera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdCodOpera() {
        return idCodOpera;
    }

    /**
     * Define el valor de la propiedad idCodOpera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdCodOpera(JAXBElement<Long> value) {
        this.idCodOpera = value;
    }

    /**
     * Obtiene el valor de la propiedad idConta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdConta() {
        return idConta;
    }

    /**
     * Define el valor de la propiedad idConta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdConta(JAXBElement<Long> value) {
        this.idConta = value;
    }

    /**
     * Obtiene el valor de la propiedad idEndos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdEndos() {
        return idEndos;
    }

    /**
     * Define el valor de la propiedad idEndos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdEndos(JAXBElement<Long> value) {
        this.idEndos = value;
    }

    /**
     * Obtiene el valor de la propiedad idHabil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHabil() {
        return idHabil;
    }

    /**
     * Define el valor de la propiedad idHabil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHabil(JAXBElement<Long> value) {
        this.idHabil = value;
    }

    /**
     * Obtiene el valor de la propiedad idOpePadre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOpePadre() {
        return idOpePadre;
    }

    /**
     * Define el valor de la propiedad idOpePadre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOpePadre(JAXBElement<Long> value) {
        this.idOpePadre = value;
    }

    /**
     * Obtiene el valor de la propiedad idOpera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdOpera() {
        return idOpera;
    }

    /**
     * Define el valor de la propiedad idOpera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdOpera(JAXBElement<Long> value) {
        this.idOpera = value;
    }

    /**
     * Obtiene el valor de la propiedad idProye.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdProye() {
        return idProye;
    }

    /**
     * Define el valor de la propiedad idProye.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdProye(JAXBElement<Long> value) {
        this.idProye = value;
    }

    /**
     * Obtiene el valor de la propiedad idTerce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdTerce() {
        return idTerce;
    }

    /**
     * Define el valor de la propiedad idTerce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdTerce(JAXBElement<Long> value) {
        this.idTerce = value;
    }

    /**
     * Obtiene el valor de la propiedad impDto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpDto() {
        return impDto;
    }

    /**
     * Define el valor de la propiedad impDto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpDto(JAXBElement<BigDecimal> value) {
        this.impDto = value;
    }

    /**
     * Obtiene el valor de la propiedad impIva.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpIva() {
        return impIva;
    }

    /**
     * Define el valor de la propiedad impIva.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpIva(JAXBElement<BigDecimal> value) {
        this.impIva = value;
    }

    /**
     * Obtiene el valor de la propiedad impLiqui.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpLiqui() {
        return impLiqui;
    }

    /**
     * Define el valor de la propiedad impLiqui.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpLiqui(JAXBElement<BigDecimal> value) {
        this.impLiqui = value;
    }

    /**
     * Obtiene el valor de la propiedad impTotal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getImpTotal() {
        return impTotal;
    }

    /**
     * Define el valor de la propiedad impTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setImpTotal(JAXBElement<BigDecimal> value) {
        this.impTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad indCtrInter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndCtrInter() {
        return indCtrInter;
    }

    /**
     * Define el valor de la propiedad indCtrInter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndCtrInter(JAXBElement<Short> value) {
        this.indCtrInter = value;
    }

    /**
     * Obtiene el valor de la propiedad indMod347.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndMod347() {
        return indMod347;
    }

    /**
     * Define el valor de la propiedad indMod347.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndMod347(JAXBElement<String> value) {
        this.indMod347 = value;
    }

    /**
     * Obtiene el valor de la propiedad indOpeTramite.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndOpeTramite() {
        return indOpeTramite;
    }

    /**
     * Define el valor de la propiedad indOpeTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndOpeTramite(JAXBElement<Short> value) {
        this.indOpeTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad indTramitar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getIndTramitar() {
        return indTramitar;
    }

    /**
     * Define el valor de la propiedad indTramitar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setIndTramitar(JAXBElement<Short> value) {
        this.indTramitar = value;
    }

    /**
     * Obtiene el valor de la propiedad natDerObl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNatDerObl() {
        return natDerObl;
    }

    /**
     * Define el valor de la propiedad natDerObl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNatDerObl(JAXBElement<Short> value) {
        this.natDerObl = value;
    }

    /**
     * Obtiene el valor de la propiedad numChequ.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumChequ() {
        return numChequ;
    }

    /**
     * Define el valor de la propiedad numChequ.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumChequ(JAXBElement<String> value) {
        this.numChequ = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocum.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumDocum() {
        return numDocum;
    }

    /**
     * Define el valor de la propiedad numDocum.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumDocum(JAXBElement<Short> value) {
        this.numDocum = value;
    }

    /**
     * Obtiene el valor de la propiedad numOpera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumOpera() {
        return numOpera;
    }

    /**
     * Define el valor de la propiedad numOpera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumOpera(JAXBElement<Integer> value) {
        this.numOpera = value;
    }

    /**
     * Obtiene el valor de la propiedad numOrdin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNumOrdin() {
        return numOrdin;
    }

    /**
     * Define el valor de la propiedad numOrdin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNumOrdin(JAXBElement<Short> value) {
        this.numOrdin = value;
    }

    /**
     * Obtiene el valor de la propiedad numResol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumResol() {
        return numResol;
    }

    /**
     * Define el valor de la propiedad numResol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumResol(JAXBElement<String> value) {
        this.numResol = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad oficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOficina() {
        return oficina;
    }

    /**
     * Define el valor de la propiedad oficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOficina(JAXBElement<Short> value) {
        this.oficina = value;
    }

    /**
     * Obtiene el valor de la propiedad ordEndos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdEndos() {
        return ordEndos;
    }

    /**
     * Define el valor de la propiedad ordEndos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdEndos(JAXBElement<Short> value) {
        this.ordEndos = value;
    }

    /**
     * Obtiene el valor de la propiedad ordHabil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdHabil() {
        return ordHabil;
    }

    /**
     * Define el valor de la propiedad ordHabil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdHabil(JAXBElement<Short> value) {
        this.ordHabil = value;
    }

    /**
     * Obtiene el valor de la propiedad ordTerce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getOrdTerce() {
        return ordTerce;
    }

    /**
     * Define el valor de la propiedad ordTerce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setOrdTerce(JAXBElement<Short> value) {
        this.ordTerce = value;
    }

    /**
     * Obtiene el valor de la propiedad recFinan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getRecFinan() {
        return recFinan;
    }

    /**
     * Define el valor de la propiedad recFinan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setRecFinan(JAXBElement<Short> value) {
        this.recFinan = value;
    }

    /**
     * Obtiene el valor de la propiedad tipExacc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTipExacc() {
        return tipExacc;
    }

    /**
     * Define el valor de la propiedad tipExacc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTipExacc(JAXBElement<Short> value) {
        this.tipExacc = value;
    }

    /**
     * Obtiene el valor de la propiedad txtOpera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTxtOpera() {
        return txtOpera;
    }

    /**
     * Define el valor de la propiedad txtOpera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTxtOpera(JAXBElement<String> value) {
        this.txtOpera = value;
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

}
