
package es.gob.aapp.model.eni.v2.documento.contenido;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoReferenciaExterna complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoReferenciaExterna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="ValorHuella" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FuncionResumen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoReferenciaExterna", propOrder = {
    "referencia",
    "valorHuella",
    "funcionResumen"
})
public class TipoReferenciaExterna {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String referencia;
    @XmlElement(name = "ValorHuella", required = true)
    protected String valorHuella;
    @XmlElement(name = "FuncionResumen", required = true)
    protected String funcionResumen;

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the valorHuella property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorHuella() {
        return valorHuella;
    }

    /**
     * Sets the value of the valorHuella property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorHuella(String value) {
        this.valorHuella = value;
    }

    /**
     * Gets the value of the funcionResumen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncionResumen() {
        return funcionResumen;
    }

    /**
     * Sets the value of the funcionResumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncionResumen(String value) {
        this.funcionResumen = value;
    }

}
