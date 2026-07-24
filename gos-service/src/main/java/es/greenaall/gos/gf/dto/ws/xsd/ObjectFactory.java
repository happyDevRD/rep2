
package es.greenaall.gos.gf.dto.ws.xsd;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.gf.dto.ws.xsd package. 
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

    private final static QName _VariableCodigo_QNAME = new QName("http://ws.dto.gf.gos.greenaall.es/xsd", "codigo");
    private final static QName _VariableDescripcion_QNAME = new QName("http://ws.dto.gf.gos.greenaall.es/xsd", "descripcion");
    private final static QName _VariableMaximo_QNAME = new QName("http://ws.dto.gf.gos.greenaall.es/xsd", "maximo");
    private final static QName _VariableMinimo_QNAME = new QName("http://ws.dto.gf.gos.greenaall.es/xsd", "minimo");
    private final static QName _VariableObligatorio_QNAME = new QName("http://ws.dto.gf.gos.greenaall.es/xsd", "obligatorio");
    private final static QName _VariableTipoValor_QNAME = new QName("http://ws.dto.gf.gos.greenaall.es/xsd", "tipoValor");
    private final static QName _VariableValor_QNAME = new QName("http://ws.dto.gf.gos.greenaall.es/xsd", "valor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.gf.dto.ws.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Variable }
     * 
     */
    public Variable createVariable() {
        return new Variable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.dto.gf.gos.greenaall.es/xsd", name = "codigo", scope = Variable.class)
    public JAXBElement<String> createVariableCodigo(String value) {
        return new JAXBElement<String>(_VariableCodigo_QNAME, String.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.dto.gf.gos.greenaall.es/xsd", name = "descripcion", scope = Variable.class)
    public JAXBElement<String> createVariableDescripcion(String value) {
        return new JAXBElement<String>(_VariableDescripcion_QNAME, String.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.dto.gf.gos.greenaall.es/xsd", name = "maximo", scope = Variable.class)
    public JAXBElement<String> createVariableMaximo(String value) {
        return new JAXBElement<String>(_VariableMaximo_QNAME, String.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.dto.gf.gos.greenaall.es/xsd", name = "minimo", scope = Variable.class)
    public JAXBElement<String> createVariableMinimo(String value) {
        return new JAXBElement<String>(_VariableMinimo_QNAME, String.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.dto.gf.gos.greenaall.es/xsd", name = "obligatorio", scope = Variable.class)
    public JAXBElement<String> createVariableObligatorio(String value) {
        return new JAXBElement<String>(_VariableObligatorio_QNAME, String.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.dto.gf.gos.greenaall.es/xsd", name = "tipoValor", scope = Variable.class)
    public JAXBElement<String> createVariableTipoValor(String value) {
        return new JAXBElement<String>(_VariableTipoValor_QNAME, String.class, Variable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.dto.gf.gos.greenaall.es/xsd", name = "valor", scope = Variable.class)
    public JAXBElement<String> createVariableValor(String value) {
        return new JAXBElement<String>(_VariableValor_QNAME, String.class, Variable.class, value);
    }

}
