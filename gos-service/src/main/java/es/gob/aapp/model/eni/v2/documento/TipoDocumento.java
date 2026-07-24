
package es.gob.aapp.model.eni.v2.documento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import es.gob.aapp.model.eni.v2.documento.contenido.TipoContenido;
import es.gob.aapp.model.eni.v2.documento.metadatos.TipoMetadatos;
import es.gob.aapp.model.eni.v2.firma.Firmas;


/**
 * <p>Java class for TipoDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://administracionelectronica.gob.es/ENI/XSD/v2.0/documento-e/contenido}contenido"/>
 *         &lt;element ref="{http://administracionelectronica.gob.es/ENI/XSD/v2.0/documento-e/metadatos}metadatos"/>
 *         &lt;element name="metadatosAdicionales" type="{http://administracionelectronica.gob.es/ENI/XSD/v2.0/documento-e}TipoMetadatosAdicionales" minOccurs="0"/>
 *         &lt;element ref="{http://administracionelectronica.gob.es/ENI/XSD/v2.0/firma}firmas" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumento", propOrder = {
    "contenido",
    "metadatos",
    "metadatosAdicionales",
    "firmas"
})
public class TipoDocumento {

    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v2.0/documento-e/contenido", required = true)
    protected TipoContenido contenido;
    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v2.0/documento-e/metadatos", required = true)
    protected TipoMetadatos metadatos;
    protected TipoMetadatosAdicionales metadatosAdicionales;
    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v2.0/firma")
    protected Firmas firmas;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the contenido property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContenido }
     *     
     */
    public TipoContenido getContenido() {
        return contenido;
    }

    /**
     * Sets the value of the contenido property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContenido }
     *     
     */
    public void setContenido(TipoContenido value) {
        this.contenido = value;
    }

    /**
     * Gets the value of the metadatos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMetadatos }
     *     
     */
    public TipoMetadatos getMetadatos() {
        return metadatos;
    }

    /**
     * Sets the value of the metadatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMetadatos }
     *     
     */
    public void setMetadatos(TipoMetadatos value) {
        this.metadatos = value;
    }

    /**
     * Gets the value of the metadatosAdicionales property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMetadatosAdicionales }
     *     
     */
    public TipoMetadatosAdicionales getMetadatosAdicionales() {
        return metadatosAdicionales;
    }

    /**
     * Sets the value of the metadatosAdicionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMetadatosAdicionales }
     *     
     */
    public void setMetadatosAdicionales(TipoMetadatosAdicionales value) {
        this.metadatosAdicionales = value;
    }

    /**
     * La firma es obligatoria para el documento administrativo electronico y para todo aquel documento electronico susceptible de ser incorporado en un expediente electronico.
     * 
     * @return
     *     possible object is
     *     {@link Firmas }
     *     
     */
    public Firmas getFirmas() {
        return firmas;
    }

    /**
     * Sets the value of the firmas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Firmas }
     *     
     */
    public void setFirmas(Firmas value) {
        this.firmas = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
