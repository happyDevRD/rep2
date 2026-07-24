
package es.greenaall.util.comun.excepciones.xsd;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.util.comun.excepciones.xsd package. 
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

    private final static QName _CtrErrorDtoEncontrado_QNAME = new QName("http://excepciones.comun.util.greenaall.es/xsd", "dtoEncontrado");
    private final static QName _CtrErrorError_QNAME = new QName("http://excepciones.comun.util.greenaall.es/xsd", "error");
    private final static QName _CtrErrorException_QNAME = new QName("http://excepciones.comun.util.greenaall.es/xsd", "exception");
    private final static QName _CtrErrorLinea_QNAME = new QName("http://excepciones.comun.util.greenaall.es/xsd", "linea");
    private final static QName _CtrErrorMessage_QNAME = new QName("http://excepciones.comun.util.greenaall.es/xsd", "message");
    private final static QName _CtrErrorTipoExcepcion_QNAME = new QName("http://excepciones.comun.util.greenaall.es/xsd", "tipoExcepcion");
    private final static QName _CtrErrorBSoloMensaje_QNAME = new QName("http://excepciones.comun.util.greenaall.es/xsd", "bSoloMensaje");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.util.comun.excepciones.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CtrError }
     * 
     */
    public CtrError createCtrError() {
        return new CtrError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://excepciones.comun.util.greenaall.es/xsd", name = "dtoEncontrado", scope = CtrError.class)
    public JAXBElement<Object> createCtrErrorDtoEncontrado(Object value) {
        return new JAXBElement<Object>(_CtrErrorDtoEncontrado_QNAME, Object.class, CtrError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://excepciones.comun.util.greenaall.es/xsd", name = "error", scope = CtrError.class)
    public JAXBElement<String> createCtrErrorError(String value) {
        return new JAXBElement<String>(_CtrErrorError_QNAME, String.class, CtrError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://excepciones.comun.util.greenaall.es/xsd", name = "exception", scope = CtrError.class)
    public JAXBElement<Object> createCtrErrorException(Object value) {
        return new JAXBElement<Object>(_CtrErrorException_QNAME, Object.class, CtrError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://excepciones.comun.util.greenaall.es/xsd", name = "linea", scope = CtrError.class)
    public JAXBElement<String> createCtrErrorLinea(String value) {
        return new JAXBElement<String>(_CtrErrorLinea_QNAME, String.class, CtrError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://excepciones.comun.util.greenaall.es/xsd", name = "message", scope = CtrError.class)
    public JAXBElement<String> createCtrErrorMessage(String value) {
        return new JAXBElement<String>(_CtrErrorMessage_QNAME, String.class, CtrError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://excepciones.comun.util.greenaall.es/xsd", name = "tipoExcepcion", scope = CtrError.class)
    public JAXBElement<Short> createCtrErrorTipoExcepcion(Short value) {
        return new JAXBElement<Short>(_CtrErrorTipoExcepcion_QNAME, Short.class, CtrError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://excepciones.comun.util.greenaall.es/xsd", name = "bSoloMensaje", scope = CtrError.class)
    public JAXBElement<Boolean> createCtrErrorBSoloMensaje(Boolean value) {
        return new JAXBElement<Boolean>(_CtrErrorBSoloMensaje_QNAME, Boolean.class, CtrError.class, value);
    }

}
