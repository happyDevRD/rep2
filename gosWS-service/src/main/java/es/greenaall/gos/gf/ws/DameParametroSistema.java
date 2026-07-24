
package es.greenaall.gos.gf.ws;

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
 *         &lt;element name="sCodEntid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="sAnno" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="sIdioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sNumValor" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
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
    "sCodEntid",
    "sAnno",
    "sIdioma",
    "sNumValor"
})
@XmlRootElement(name = "dameParametroSistema")
public class DameParametroSistema {

    protected Short sCodEntid;
    protected Short sAnno;
    @XmlElementRef(name = "sIdioma", namespace = "http://ws.gf.gos.greenaall.es", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sIdioma;
    protected Short sNumValor;

    /**
     * Obtiene el valor de la propiedad sCodEntid.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSCodEntid() {
        return sCodEntid;
    }

    /**
     * Define el valor de la propiedad sCodEntid.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSCodEntid(Short value) {
        this.sCodEntid = value;
    }

    /**
     * Obtiene el valor de la propiedad sAnno.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSAnno() {
        return sAnno;
    }

    /**
     * Define el valor de la propiedad sAnno.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSAnno(Short value) {
        this.sAnno = value;
    }

    /**
     * Obtiene el valor de la propiedad sIdioma.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSIdioma() {
        return sIdioma;
    }

    /**
     * Define el valor de la propiedad sIdioma.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSIdioma(JAXBElement<String> value) {
        this.sIdioma = value;
    }

    /**
     * Obtiene el valor de la propiedad sNumValor.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSNumValor() {
        return sNumValor;
    }

    /**
     * Define el valor de la propiedad sNumValor.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSNumValor(Short value) {
        this.sNumValor = value;
    }

}
