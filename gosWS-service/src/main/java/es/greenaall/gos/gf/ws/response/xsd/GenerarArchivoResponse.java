
package es.greenaall.gos.gf.ws.response.xsd;

import es.greenaall.gos.ge.dto.xsd.ArchivoWs;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GenerarArchivoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenerarArchivoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="archivo" type="{http://dto.ge.gos.greenaall.es/xsd}ArchivoWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerarArchivoResponse", propOrder = {
    "archivo"
})
public class GenerarArchivoResponse {

    @XmlElementRef(name = "archivo", namespace = "http://response.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArchivoWs> archivo;

    /**
     * Obtiene el valor de la propiedad archivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArchivoWs }{@code >}
     *     
     */
    public JAXBElement<ArchivoWs> getArchivo() {
        return archivo;
    }

    /**
     * Define el valor de la propiedad archivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArchivoWs }{@code >}
     *     
     */
    public void setArchivo(JAXBElement<ArchivoWs> value) {
        this.archivo = value;
    }

}
