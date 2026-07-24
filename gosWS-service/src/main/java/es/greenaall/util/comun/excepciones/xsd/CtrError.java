
package es.greenaall.util.comun.excepciones.xsd;

import java.util.ArrayList;
import java.util.List;
import es.greenaall.gos.gf.ws.Exception;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CtrError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CtrError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.gf.gos.greenaall.es}Exception"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dtoEncontrado" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exception" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="linea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoExcepcion" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="bSoloMensaje" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtrError", propOrder = {
    "rest"
})
public class CtrError
    extends Exception
{

    @XmlElementRefs({
        @XmlElementRef(name = "dtoEncontrado", namespace = "http://excepciones.comun.util.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "error", namespace = "http://excepciones.comun.util.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exception", namespace = "http://excepciones.comun.util.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "linea", namespace = "http://excepciones.comun.util.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "message", namespace = "http://excepciones.comun.util.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tipoExcepcion", namespace = "http://excepciones.comun.util.greenaall.es/xsd", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bSoloMensaje", namespace = "http://excepciones.comun.util.greenaall.es/xsd", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Exception" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 1173 de http://10.234.253.178:8080/GestionTributos/services/GestionTributos?wsdl
     * línea 1607 de http://10.234.253.178:8080/GestionTributos/services/GestionTributos?wsdl
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Short }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
