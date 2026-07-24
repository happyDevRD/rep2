
package es.greenaall.gos.ge.ws.xsd;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.ge.ws.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RespuestaActualizacionCodError_QNAME = new QName("http://ws.ge.gos.greenaall.es/xsd", "codError");
    private final static QName _RespuestaActualizacionCodigoRespuesta_QNAME = new QName("http://ws.ge.gos.greenaall.es/xsd", "codigoRespuesta");
    private final static QName _RespuestaActualizacionDesError_QNAME = new QName("http://ws.ge.gos.greenaall.es/xsd", "desError");
    private final static QName _RespuestaActualizacionDescripcion_QNAME = new QName("http://ws.ge.gos.greenaall.es/xsd", "descripcion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.ge.ws.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespuestaActualizacion }
     * 
     */
    public RespuestaActualizacion createRespuestaActualizacion() {
        return new RespuestaActualizacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.ge.gos.greenaall.es/xsd", name = "codError", scope = RespuestaActualizacion.class)
    public JAXBElement<String> createRespuestaActualizacionCodError(String value) {
        return new JAXBElement<String>(_RespuestaActualizacionCodError_QNAME, String.class, RespuestaActualizacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.ge.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = RespuestaActualizacion.class)
    public JAXBElement<String> createRespuestaActualizacionCodigoRespuesta(String value) {
        return new JAXBElement<String>(_RespuestaActualizacionCodigoRespuesta_QNAME, String.class, RespuestaActualizacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.ge.gos.greenaall.es/xsd", name = "desError", scope = RespuestaActualizacion.class)
    public JAXBElement<String> createRespuestaActualizacionDesError(String value) {
        return new JAXBElement<String>(_RespuestaActualizacionDesError_QNAME, String.class, RespuestaActualizacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.ge.gos.greenaall.es/xsd", name = "descripcion", scope = RespuestaActualizacion.class)
    public JAXBElement<String> createRespuestaActualizacionDescripcion(String value) {
        return new JAXBElement<String>(_RespuestaActualizacionDescripcion_QNAME, String.class, RespuestaActualizacion.class, value);
    }

}
