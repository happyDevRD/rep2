
package es.greenaall.gos.gf.ws.xsd;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.gf.ws.xsd package. 
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

    private final static QName _DatoConexionEntidad_QNAME = new QName("http://ws.gf.gos.greenaall.es/xsd", "entidad");
    private final static QName _DatoConexionMunicipio_QNAME = new QName("http://ws.gf.gos.greenaall.es/xsd", "municipio");
    private final static QName _DatoConexionPassword_QNAME = new QName("http://ws.gf.gos.greenaall.es/xsd", "password");
    private final static QName _DatoConexionUsuario_QNAME = new QName("http://ws.gf.gos.greenaall.es/xsd", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.gf.ws.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatoConexion }
     * 
     */
    public DatoConexion createDatoConexion() {
        return new DatoConexion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es/xsd", name = "entidad", scope = DatoConexion.class)
    public JAXBElement<String> createDatoConexionEntidad(String value) {
        return new JAXBElement<String>(_DatoConexionEntidad_QNAME, String.class, DatoConexion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es/xsd", name = "municipio", scope = DatoConexion.class)
    public JAXBElement<String> createDatoConexionMunicipio(String value) {
        return new JAXBElement<String>(_DatoConexionMunicipio_QNAME, String.class, DatoConexion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es/xsd", name = "password", scope = DatoConexion.class)
    public JAXBElement<String> createDatoConexionPassword(String value) {
        return new JAXBElement<String>(_DatoConexionPassword_QNAME, String.class, DatoConexion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es/xsd", name = "usuario", scope = DatoConexion.class)
    public JAXBElement<String> createDatoConexionUsuario(String value) {
        return new JAXBElement<String>(_DatoConexionUsuario_QNAME, String.class, DatoConexion.class, value);
    }

}
