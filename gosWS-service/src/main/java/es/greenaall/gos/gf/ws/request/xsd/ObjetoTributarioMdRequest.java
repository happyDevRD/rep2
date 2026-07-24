
package es.greenaall.gos.gf.ws.request.xsd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjetoTributarioMdRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjetoTributarioMdRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idGrupo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idHisObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idObjTribu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjetoTributarioMdRequest", propOrder = {
    "idGrupo",
    "idHisObjTribu",
    "idObjTribu"
})
public class ObjetoTributarioMdRequest {

    @XmlElementRef(name = "idGrupo", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idGrupo;
    @XmlElementRef(name = "idHisObjTribu", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idHisObjTribu;
    @XmlElementRef(name = "idObjTribu", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idObjTribu;

    /**
     * Obtiene el valor de la propiedad idGrupo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdGrupo() {
        return idGrupo;
    }

    /**
     * Define el valor de la propiedad idGrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdGrupo(JAXBElement<Long> value) {
        this.idGrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad idHisObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdHisObjTribu() {
        return idHisObjTribu;
    }

    /**
     * Define el valor de la propiedad idHisObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdHisObjTribu(JAXBElement<Long> value) {
        this.idHisObjTribu = value;
    }

    /**
     * Obtiene el valor de la propiedad idObjTribu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdObjTribu() {
        return idObjTribu;
    }

    /**
     * Define el valor de la propiedad idObjTribu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdObjTribu(JAXBElement<Long> value) {
        this.idObjTribu = value;
    }

}
