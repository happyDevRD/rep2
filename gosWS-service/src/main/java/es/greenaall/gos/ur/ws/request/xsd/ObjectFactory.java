
package es.greenaall.gos.ur.ws.request.xsd;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.ur.ws.request.xsd package. 
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

    private final static QName _DomicilioRequestBloque_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "bloque");
    private final static QName _DomicilioRequestCodMunic_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "codMunic");
    private final static QName _DomicilioRequestCodPosta_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "codPosta");
    private final static QName _DomicilioRequestCodProvi_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "codProvi");
    private final static QName _DomicilioRequestDesVia_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "desVia");
    private final static QName _DomicilioRequestEscalera_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "escalera");
    private final static QName _DomicilioRequestIdDomic_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "idDomic");
    private final static QName _DomicilioRequestIdHisDomic_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "idHisDomic");
    private final static QName _DomicilioRequestLetVia_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "letVia");
    private final static QName _DomicilioRequestNumVia_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "numVia");
    private final static QName _DomicilioRequestPlanta_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "planta");
    private final static QName _DomicilioRequestPuerta_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "puerta");
    private final static QName _DomicilioRequestTipVia_QNAME = new QName("http://request.ws.ur.gos.greenaall.es/xsd", "tipVia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.ur.ws.request.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DomicilioRequest }
     * 
     */
    public DomicilioRequest createDomicilioRequest() {
        return new DomicilioRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "bloque", scope = DomicilioRequest.class)
    public JAXBElement<String> createDomicilioRequestBloque(String value) {
        return new JAXBElement<String>(_DomicilioRequestBloque_QNAME, String.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "codMunic", scope = DomicilioRequest.class)
    public JAXBElement<Short> createDomicilioRequestCodMunic(Short value) {
        return new JAXBElement<Short>(_DomicilioRequestCodMunic_QNAME, Short.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "codPosta", scope = DomicilioRequest.class)
    public JAXBElement<Integer> createDomicilioRequestCodPosta(Integer value) {
        return new JAXBElement<Integer>(_DomicilioRequestCodPosta_QNAME, Integer.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "codProvi", scope = DomicilioRequest.class)
    public JAXBElement<Short> createDomicilioRequestCodProvi(Short value) {
        return new JAXBElement<Short>(_DomicilioRequestCodProvi_QNAME, Short.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "desVia", scope = DomicilioRequest.class)
    public JAXBElement<String> createDomicilioRequestDesVia(String value) {
        return new JAXBElement<String>(_DomicilioRequestDesVia_QNAME, String.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "escalera", scope = DomicilioRequest.class)
    public JAXBElement<String> createDomicilioRequestEscalera(String value) {
        return new JAXBElement<String>(_DomicilioRequestEscalera_QNAME, String.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "idDomic", scope = DomicilioRequest.class)
    public JAXBElement<Long> createDomicilioRequestIdDomic(Long value) {
        return new JAXBElement<Long>(_DomicilioRequestIdDomic_QNAME, Long.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "idHisDomic", scope = DomicilioRequest.class)
    public JAXBElement<Long> createDomicilioRequestIdHisDomic(Long value) {
        return new JAXBElement<Long>(_DomicilioRequestIdHisDomic_QNAME, Long.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "letVia", scope = DomicilioRequest.class)
    public JAXBElement<String> createDomicilioRequestLetVia(String value) {
        return new JAXBElement<String>(_DomicilioRequestLetVia_QNAME, String.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "numVia", scope = DomicilioRequest.class)
    public JAXBElement<Integer> createDomicilioRequestNumVia(Integer value) {
        return new JAXBElement<Integer>(_DomicilioRequestNumVia_QNAME, Integer.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "planta", scope = DomicilioRequest.class)
    public JAXBElement<String> createDomicilioRequestPlanta(String value) {
        return new JAXBElement<String>(_DomicilioRequestPlanta_QNAME, String.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "puerta", scope = DomicilioRequest.class)
    public JAXBElement<String> createDomicilioRequestPuerta(String value) {
        return new JAXBElement<String>(_DomicilioRequestPuerta_QNAME, String.class, DomicilioRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://request.ws.ur.gos.greenaall.es/xsd", name = "tipVia", scope = DomicilioRequest.class)
    public JAXBElement<String> createDomicilioRequestTipVia(String value) {
        return new JAXBElement<String>(_DomicilioRequestTipVia_QNAME, String.class, DomicilioRequest.class, value);
    }

}
