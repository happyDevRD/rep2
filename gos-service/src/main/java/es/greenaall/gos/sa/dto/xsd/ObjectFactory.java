
package es.greenaall.gos.sa.dto.xsd;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.sa.dto.xsd package. 
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

    private final static QName _CitaInternetWSDesCentr_QNAME = new QName("http://dto.sa.gos.greenaall.es/xsd", "desCentr");
    private final static QName _CitaInternetWSFecCita_QNAME = new QName("http://dto.sa.gos.greenaall.es/xsd", "fecCita");
    private final static QName _CitaInternetWSHorCita_QNAME = new QName("http://dto.sa.gos.greenaall.es/xsd", "horCita");
    private final static QName _CitaInternetWSIdCita_QNAME = new QName("http://dto.sa.gos.greenaall.es/xsd", "idCita");
    private final static QName _CentroWSDesDescr_QNAME = new QName("http://dto.sa.gos.greenaall.es/xsd", "desDescr");
    private final static QName _CentroWSDesServi_QNAME = new QName("http://dto.sa.gos.greenaall.es/xsd", "desServi");
    private final static QName _CentroWSDesUbici_QNAME = new QName("http://dto.sa.gos.greenaall.es/xsd", "desUbici");
    private final static QName _CentroWSIdCentr_QNAME = new QName("http://dto.sa.gos.greenaall.es/xsd", "idCentr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.sa.dto.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CentroWS }
     * 
     */
    public CentroWS createCentroWS() {
        return new CentroWS();
    }

    /**
     * Create an instance of {@link CitaInternetWS }
     * 
     */
    public CitaInternetWS createCitaInternetWS() {
        return new CitaInternetWS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "desCentr", scope = CitaInternetWS.class)
    public JAXBElement<String> createCitaInternetWSDesCentr(String value) {
        return new JAXBElement<String>(_CitaInternetWSDesCentr_QNAME, String.class, CitaInternetWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "fecCita", scope = CitaInternetWS.class)
    public JAXBElement<String> createCitaInternetWSFecCita(String value) {
        return new JAXBElement<String>(_CitaInternetWSFecCita_QNAME, String.class, CitaInternetWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "horCita", scope = CitaInternetWS.class)
    public JAXBElement<String> createCitaInternetWSHorCita(String value) {
        return new JAXBElement<String>(_CitaInternetWSHorCita_QNAME, String.class, CitaInternetWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "idCita", scope = CitaInternetWS.class)
    public JAXBElement<Long> createCitaInternetWSIdCita(Long value) {
        return new JAXBElement<Long>(_CitaInternetWSIdCita_QNAME, Long.class, CitaInternetWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "desCentr", scope = CentroWS.class)
    public JAXBElement<String> createCentroWSDesCentr(String value) {
        return new JAXBElement<String>(_CitaInternetWSDesCentr_QNAME, String.class, CentroWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "desDescr", scope = CentroWS.class)
    public JAXBElement<String> createCentroWSDesDescr(String value) {
        return new JAXBElement<String>(_CentroWSDesDescr_QNAME, String.class, CentroWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "desServi", scope = CentroWS.class)
    public JAXBElement<String> createCentroWSDesServi(String value) {
        return new JAXBElement<String>(_CentroWSDesServi_QNAME, String.class, CentroWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "desUbici", scope = CentroWS.class)
    public JAXBElement<String> createCentroWSDesUbici(String value) {
        return new JAXBElement<String>(_CentroWSDesUbici_QNAME, String.class, CentroWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.sa.gos.greenaall.es/xsd", name = "idCentr", scope = CentroWS.class)
    public JAXBElement<Long> createCentroWSIdCentr(Long value) {
        return new JAXBElement<Long>(_CentroWSIdCentr_QNAME, Long.class, CentroWS.class, value);
    }

}
