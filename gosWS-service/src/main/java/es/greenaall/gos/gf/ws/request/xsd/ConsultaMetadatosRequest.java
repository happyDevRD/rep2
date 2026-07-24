
package es.greenaall.gos.gf.ws.request.xsd;

import es.greenaall.gos.pe.dto.ws.xsd.DatosConexion;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaMetadatosRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaMetadatosRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosConexion" type="{http://ws.dto.pe.gos.greenaall.es/xsd}DatosConexion" minOccurs="0"/&gt;
 *         &lt;element name="metadatoTarifa" type="{http://request.ws.gf.gos.greenaall.es/xsd}MetadatoRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaMetadatosRequest", propOrder = {
    "datosConexion",
    "metadatoTarifa"
})
public class ConsultaMetadatosRequest {

    @XmlElementRef(name = "datosConexion", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosConexion> datosConexion;
    @XmlElementRef(name = "metadatoTarifa", namespace = "http://request.ws.gf.gos.greenaall.es/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<MetadatoRequest> metadatoTarifa;

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
     * Obtiene el valor de la propiedad metadatoTarifa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MetadatoRequest }{@code >}
     *     
     */
    public JAXBElement<MetadatoRequest> getMetadatoTarifa() {
        return metadatoTarifa;
    }

    /**
     * Define el valor de la propiedad metadatoTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MetadatoRequest }{@code >}
     *     
     */
    public void setMetadatoTarifa(JAXBElement<MetadatoRequest> value) {
        this.metadatoTarifa = value;
    }

}
