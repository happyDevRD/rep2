
package es.greenaall.gos.gf.ws.dto.xsd;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.gf.ws.dto.xsd package. 
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

    private final static QName _TipoObjetoTributarioCodigo_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "codigo");
    private final static QName _TipoObjetoTributarioDescripcion_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "descripcion");
    private final static QName _TipoObjetoTributarioIdGrupo_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "idGrupo");
    private final static QName _TipoObjetoTributarioIdHisTipObjTribu_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "idHisTipObjTribu");
    private final static QName _TipoObjetoTributarioIdImpue_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "idImpue");
    private final static QName _TipoObjetoTributarioIdTipObjTribu_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "idTipObjTribu");
    private final static QName _TipoObjetoTributarioInfo_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "info");
    private final static QName _TipoObjetoTributarioVisWeb_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "visWeb");
    private final static QName _VolanteOutCodigoRespuesta_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "codigoRespuesta");
    private final static QName _CalcularImporteAutoliquidacionResponseImporteAutoliquidacion_QNAME = new QName("http://dto.ws.gf.gos.greenaall.es/xsd", "importeAutoliquidacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.gf.ws.dto.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArchivoOut }
     * 
     */
    public ArchivoOut createArchivoOut() {
        return new ArchivoOut();
    }

    /**
     * Create an instance of {@link AutoliquidacionInternetOut }
     * 
     */
    public AutoliquidacionInternetOut createAutoliquidacionInternetOut() {
        return new AutoliquidacionInternetOut();
    }

    /**
     * Create an instance of {@link CalcularImporteAutoliquidacionResponse }
     * 
     */
    public CalcularImporteAutoliquidacionResponse createCalcularImporteAutoliquidacionResponse() {
        return new CalcularImporteAutoliquidacionResponse();
    }

    /**
     * Create an instance of {@link NotificacionOut }
     * 
     */
    public NotificacionOut createNotificacionOut() {
        return new NotificacionOut();
    }

    /**
     * Create an instance of {@link ObjetoTributarioMdOut }
     * 
     */
    public ObjetoTributarioMdOut createObjetoTributarioMdOut() {
        return new ObjetoTributarioMdOut();
    }

    /**
     * Create an instance of {@link ObjetoTributarioOut }
     * 
     */
    public ObjetoTributarioOut createObjetoTributarioOut() {
        return new ObjetoTributarioOut();
    }

    /**
     * Create an instance of {@link ReciboOut }
     * 
     */
    public ReciboOut createReciboOut() {
        return new ReciboOut();
    }

    /**
     * Create an instance of {@link VehiculoOut }
     * 
     */
    public VehiculoOut createVehiculoOut() {
        return new VehiculoOut();
    }

    /**
     * Create an instance of {@link VolanteOut }
     * 
     */
    public VolanteOut createVolanteOut() {
        return new VolanteOut();
    }

    /**
     * Create an instance of {@link TipoObjetoTributario }
     * 
     */
    public TipoObjetoTributario createTipoObjetoTributario() {
        return new TipoObjetoTributario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigo", scope = TipoObjetoTributario.class)
    public JAXBElement<String> createTipoObjetoTributarioCodigo(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioCodigo_QNAME, String.class, TipoObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = TipoObjetoTributario.class)
    public JAXBElement<String> createTipoObjetoTributarioDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, TipoObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "idGrupo", scope = TipoObjetoTributario.class)
    public JAXBElement<Long> createTipoObjetoTributarioIdGrupo(Long value) {
        return new JAXBElement<Long>(_TipoObjetoTributarioIdGrupo_QNAME, Long.class, TipoObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "idHisTipObjTribu", scope = TipoObjetoTributario.class)
    public JAXBElement<Long> createTipoObjetoTributarioIdHisTipObjTribu(Long value) {
        return new JAXBElement<Long>(_TipoObjetoTributarioIdHisTipObjTribu_QNAME, Long.class, TipoObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "idImpue", scope = TipoObjetoTributario.class)
    public JAXBElement<Long> createTipoObjetoTributarioIdImpue(Long value) {
        return new JAXBElement<Long>(_TipoObjetoTributarioIdImpue_QNAME, Long.class, TipoObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "idTipObjTribu", scope = TipoObjetoTributario.class)
    public JAXBElement<Long> createTipoObjetoTributarioIdTipObjTribu(Long value) {
        return new JAXBElement<Long>(_TipoObjetoTributarioIdTipObjTribu_QNAME, Long.class, TipoObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "info", scope = TipoObjetoTributario.class)
    public JAXBElement<String> createTipoObjetoTributarioInfo(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioInfo_QNAME, String.class, TipoObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "visWeb", scope = TipoObjetoTributario.class)
    public JAXBElement<Short> createTipoObjetoTributarioVisWeb(Short value) {
        return new JAXBElement<Short>(_TipoObjetoTributarioVisWeb_QNAME, Short.class, TipoObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = VolanteOut.class)
    public JAXBElement<String> createVolanteOutCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, VolanteOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = VolanteOut.class)
    public JAXBElement<String> createVolanteOutDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, VolanteOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = VehiculoOut.class)
    public JAXBElement<String> createVehiculoOutCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, VehiculoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = VehiculoOut.class)
    public JAXBElement<String> createVehiculoOutDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, VehiculoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ReciboOut.class)
    public JAXBElement<String> createReciboOutCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, ReciboOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ReciboOut.class)
    public JAXBElement<String> createReciboOutDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, ReciboOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ObjetoTributarioOut.class)
    public JAXBElement<String> createObjetoTributarioOutCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, ObjetoTributarioOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ObjetoTributarioOut.class)
    public JAXBElement<String> createObjetoTributarioOutDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, ObjetoTributarioOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ObjetoTributarioMdOut.class)
    public JAXBElement<String> createObjetoTributarioMdOutCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, ObjetoTributarioMdOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ObjetoTributarioMdOut.class)
    public JAXBElement<String> createObjetoTributarioMdOutDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, ObjetoTributarioMdOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = NotificacionOut.class)
    public JAXBElement<String> createNotificacionOutCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, NotificacionOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = NotificacionOut.class)
    public JAXBElement<String> createNotificacionOutDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, NotificacionOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = CalcularImporteAutoliquidacionResponse.class)
    public JAXBElement<String> createCalcularImporteAutoliquidacionResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, CalcularImporteAutoliquidacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = CalcularImporteAutoliquidacionResponse.class)
    public JAXBElement<String> createCalcularImporteAutoliquidacionResponseDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, CalcularImporteAutoliquidacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "importeAutoliquidacion", scope = CalcularImporteAutoliquidacionResponse.class)
    public JAXBElement<Double> createCalcularImporteAutoliquidacionResponseImporteAutoliquidacion(Double value) {
        return new JAXBElement<Double>(_CalcularImporteAutoliquidacionResponseImporteAutoliquidacion_QNAME, Double.class, CalcularImporteAutoliquidacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = AutoliquidacionInternetOut.class)
    public JAXBElement<String> createAutoliquidacionInternetOutCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, AutoliquidacionInternetOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = AutoliquidacionInternetOut.class)
    public JAXBElement<String> createAutoliquidacionInternetOutDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, AutoliquidacionInternetOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ArchivoOut.class)
    public JAXBElement<String> createArchivoOutCodigoRespuesta(String value) {
        return new JAXBElement<String>(_VolanteOutCodigoRespuesta_QNAME, String.class, ArchivoOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dto.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ArchivoOut.class)
    public JAXBElement<String> createArchivoOutDescripcion(String value) {
        return new JAXBElement<String>(_TipoObjetoTributarioDescripcion_QNAME, String.class, ArchivoOut.class, value);
    }

}
