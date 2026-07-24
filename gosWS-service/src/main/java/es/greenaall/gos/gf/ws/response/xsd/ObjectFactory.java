
package es.greenaall.gos.gf.ws.response.xsd;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import es.greenaall.gos.ge.dto.xsd.ArchivoWs;
import es.greenaall.gos.ge.dto.xsd.Usuario;
import es.greenaall.gos.gf.dto.xsd.AbonadoWS;
import es.greenaall.gos.gf.dto.xsd.AgenteWS;
import es.greenaall.gos.gf.dto.xsd.AutoliquidacionInternetWs;
import es.greenaall.gos.gf.dto.xsd.DenunciaWS;
import es.greenaall.gos.gf.dto.xsd.IaeWS;
import es.greenaall.gos.gf.dto.xsd.IcioWS;
import es.greenaall.gos.gf.dto.xsd.LpoWS;
import es.greenaall.gos.gf.dto.xsd.NotificacionWs;
import es.greenaall.gos.gf.dto.xsd.ObjetoTributarioMd;
import es.greenaall.gos.gf.dto.xsd.ObjetoTributarioWs;
import es.greenaall.gos.gf.dto.xsd.PlusWS;
import es.greenaall.gos.gf.dto.xsd.PlusvaliaWS;
import es.greenaall.gos.gf.dto.xsd.ReciboCabeceraWs;
import es.greenaall.gos.gf.dto.xsd.ReciboConcepto;
import es.greenaall.gos.gf.dto.xsd.RusticaWS;
import es.greenaall.gos.gf.dto.xsd.SepulturaWS;
import es.greenaall.gos.gf.dto.xsd.TerceroWS;
import es.greenaall.gos.gf.dto.xsd.UrbanaWS;
import es.greenaall.gos.gf.dto.xsd.VehiculoWS;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.gf.ws.response.xsd package. 
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

    private final static QName _ValidarUsuarioGosResponseCodigoRespuesta_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "codigoRespuesta");
    private final static QName _ValidarUsuarioGosResponseDescripcion_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "descripcion");
    private final static QName _ValidarUsuarioGosResponseUsuario_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "usuario");
    private final static QName _ValidarAgentePoliciaResponseAgente_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "agente");
    private final static QName _FicheroTeuResponseFicheroBase64_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "ficheroBase64");
    private final static QName _ConsultaTerritorioResponseMunicipio_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "municipio");
    private final static QName _ConsultaTerritorioResponseProvincia_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "provincia");
    private final static QName _ConsultaObjetoVehiculoResponseVehiculos_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "vehiculos");
    private final static QName _ConsultaObjetoUrbanaResponseFinca_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "finca");
    private final static QName _ConsultaObjetoRusticaResponseParcela_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "parcela");
    private final static QName _ConsultaObjetoPlusvaliaResponsePlusvalia_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "plusvalia");
    private final static QName _ConsultaObjetoPlusvaliaResponsePulsvalia_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "pulsvalia");
    private final static QName _ConsultaObjetoPlusResponsePlus_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "plus");
    private final static QName _ConsultaObjetoMultaResponseDenuncia_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "denuncia");
    private final static QName _ConsultaObjetoLpoResponseOcupacion_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "ocupacion");
    private final static QName _ConsultaObjetoIcioResponseObra_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "obra");
    private final static QName _ConsultaObjetoIaeResponseActividad_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "actividad");
    private final static QName _ConsultaObjetoCementerioResponseSepultura_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "sepultura");
    private final static QName _ConsultaObjetoAguaResponseAbonado_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "abonado");
    private final static QName _ConsultaFacturasResponseTercero_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "tercero");
    private final static QName _ConsultaAutoLiquidacionResponseResultado_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "resultado");
    private final static QName _AltaRegistroResponseFecRegis_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "fecRegis");
    private final static QName _AltaRegistroResponseNumRegis_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "numRegis");
    private final static QName _AltaCobroContabilidadResponseIdOpera_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "idOpera");
    private final static QName _ActualizarReciboResponseReciboCabecera_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "reciboCabecera");
    private final static QName _ActualizarNotificacionResponseNotificacion_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "notificacion");
    private final static QName _GenerarReciboResponseReciboConcepto_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "reciboConcepto");
    private final static QName _GenerarObjetoTributarioResponseObjetoTributario_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "objetoTributario");
    private final static QName _GenerarObjetoTributarioMdResponseObjetoTributarioMd_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "objetoTributarioMd");
    private final static QName _AutoliquidacionInRecaudacionResponseAutoliquidacionInternet_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "autoliquidacionInternet");
    private final static QName _AutoliquidacionInRecaudacionResponseIdAuto_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "idAuto");
    private final static QName _GenerarArchivoResponseArchivo_QNAME = new QName("http://response.ws.gf.gos.greenaall.es/xsd", "archivo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.gf.ws.response.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerarArchivoResponse }
     * 
     */
    public GenerarArchivoResponse createGenerarArchivoResponse() {
        return new GenerarArchivoResponse();
    }

    /**
     * Create an instance of {@link AutoliquidacionInRecaudacionResponse }
     * 
     */
    public AutoliquidacionInRecaudacionResponse createAutoliquidacionInRecaudacionResponse() {
        return new AutoliquidacionInRecaudacionResponse();
    }

    /**
     * Create an instance of {@link GenerarNotificacionResponse }
     * 
     */
    public GenerarNotificacionResponse createGenerarNotificacionResponse() {
        return new GenerarNotificacionResponse();
    }

    /**
     * Create an instance of {@link GenerarObjetoTributarioMdResponse }
     * 
     */
    public GenerarObjetoTributarioMdResponse createGenerarObjetoTributarioMdResponse() {
        return new GenerarObjetoTributarioMdResponse();
    }

    /**
     * Create an instance of {@link GenerarObjetoTributarioResponse }
     * 
     */
    public GenerarObjetoTributarioResponse createGenerarObjetoTributarioResponse() {
        return new GenerarObjetoTributarioResponse();
    }

    /**
     * Create an instance of {@link GenerarReciboResponse }
     * 
     */
    public GenerarReciboResponse createGenerarReciboResponse() {
        return new GenerarReciboResponse();
    }

    /**
     * Create an instance of {@link ActualizarNotificacionResponse }
     * 
     */
    public ActualizarNotificacionResponse createActualizarNotificacionResponse() {
        return new ActualizarNotificacionResponse();
    }

    /**
     * Create an instance of {@link ActualizarReciboInternet2Response }
     * 
     */
    public ActualizarReciboInternet2Response createActualizarReciboInternet2Response() {
        return new ActualizarReciboInternet2Response();
    }

    /**
     * Create an instance of {@link ActualizarReciboInternetResponse }
     * 
     */
    public ActualizarReciboInternetResponse createActualizarReciboInternetResponse() {
        return new ActualizarReciboInternetResponse();
    }

    /**
     * Create an instance of {@link ActualizarReciboResponse }
     * 
     */
    public ActualizarReciboResponse createActualizarReciboResponse() {
        return new ActualizarReciboResponse();
    }

    /**
     * Create an instance of {@link AltaCitaInternetResponse }
     * 
     */
    public AltaCitaInternetResponse createAltaCitaInternetResponse() {
        return new AltaCitaInternetResponse();
    }

    /**
     * Create an instance of {@link AltaCobroContabilidadResponse }
     * 
     */
    public AltaCobroContabilidadResponse createAltaCobroContabilidadResponse() {
        return new AltaCobroContabilidadResponse();
    }

    /**
     * Create an instance of {@link AltaRegistroResponse }
     * 
     */
    public AltaRegistroResponse createAltaRegistroResponse() {
        return new AltaRegistroResponse();
    }

    /**
     * Create an instance of {@link AnularCitaInternetResponse }
     * 
     */
    public AnularCitaInternetResponse createAnularCitaInternetResponse() {
        return new AnularCitaInternetResponse();
    }

    /**
     * Create an instance of {@link AutoLiquidacionInternetHResponse }
     * 
     */
    public AutoLiquidacionInternetHResponse createAutoLiquidacionInternetHResponse() {
        return new AutoLiquidacionInternetHResponse();
    }

    /**
     * Create an instance of {@link ConsultaAplicacionesResponse }
     * 
     */
    public ConsultaAplicacionesResponse createConsultaAplicacionesResponse() {
        return new ConsultaAplicacionesResponse();
    }

    /**
     * Create an instance of {@link ConsultaArchivoResponse }
     * 
     */
    public ConsultaArchivoResponse createConsultaArchivoResponse() {
        return new ConsultaArchivoResponse();
    }

    /**
     * Create an instance of {@link ConsultaAutoLiquidacionInternetResponse }
     * 
     */
    public ConsultaAutoLiquidacionInternetResponse createConsultaAutoLiquidacionInternetResponse() {
        return new ConsultaAutoLiquidacionInternetResponse();
    }

    /**
     * Create an instance of {@link ConsultaAutoLiquidacionResponse }
     * 
     */
    public ConsultaAutoLiquidacionResponse createConsultaAutoLiquidacionResponse() {
        return new ConsultaAutoLiquidacionResponse();
    }

    /**
     * Create an instance of {@link ConsultaCentrosHorarioResponse }
     * 
     */
    public ConsultaCentrosHorarioResponse createConsultaCentrosHorarioResponse() {
        return new ConsultaCentrosHorarioResponse();
    }

    /**
     * Create an instance of {@link ConsultaCentrosResponse }
     * 
     */
    public ConsultaCentrosResponse createConsultaCentrosResponse() {
        return new ConsultaCentrosResponse();
    }

    /**
     * Create an instance of {@link ConsultaCitaInternetResponse }
     * 
     */
    public ConsultaCitaInternetResponse createConsultaCitaInternetResponse() {
        return new ConsultaCitaInternetResponse();
    }

    /**
     * Create an instance of {@link ConsultaExpedienteResponse }
     * 
     */
    public ConsultaExpedienteResponse createConsultaExpedienteResponse() {
        return new ConsultaExpedienteResponse();
    }

    /**
     * Create an instance of {@link ConsultaFacturasResponse }
     * 
     */
    public ConsultaFacturasResponse createConsultaFacturasResponse() {
        return new ConsultaFacturasResponse();
    }

    /**
     * Create an instance of {@link ConsultaFestivosResponse }
     * 
     */
    public ConsultaFestivosResponse createConsultaFestivosResponse() {
        return new ConsultaFestivosResponse();
    }

    /**
     * Create an instance of {@link ConsultaInfraccionesResponse }
     * 
     */
    public ConsultaInfraccionesResponse createConsultaInfraccionesResponse() {
        return new ConsultaInfraccionesResponse();
    }

    /**
     * Create an instance of {@link ConsultaJustificantesGastosResponse }
     * 
     */
    public ConsultaJustificantesGastosResponse createConsultaJustificantesGastosResponse() {
        return new ConsultaJustificantesGastosResponse();
    }

    /**
     * Create an instance of {@link ConsultaLiquidacionesResponse }
     * 
     */
    public ConsultaLiquidacionesResponse createConsultaLiquidacionesResponse() {
        return new ConsultaLiquidacionesResponse();
    }

    /**
     * Create an instance of {@link ConsultaMateriaProcedimientosResponse }
     * 
     */
    public ConsultaMateriaProcedimientosResponse createConsultaMateriaProcedimientosResponse() {
        return new ConsultaMateriaProcedimientosResponse();
    }

    /**
     * Create an instance of {@link ConsultaMetadatosGrupoAtribResponse }
     * 
     */
    public ConsultaMetadatosGrupoAtribResponse createConsultaMetadatosGrupoAtribResponse() {
        return new ConsultaMetadatosGrupoAtribResponse();
    }

    /**
     * Create an instance of {@link ConsultaMetadatosResponse }
     * 
     */
    public ConsultaMetadatosResponse createConsultaMetadatosResponse() {
        return new ConsultaMetadatosResponse();
    }

    /**
     * Create an instance of {@link ConsultaNotificacionesResponse }
     * 
     */
    public ConsultaNotificacionesResponse createConsultaNotificacionesResponse() {
        return new ConsultaNotificacionesResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoAguaResponse }
     * 
     */
    public ConsultaObjetoAguaResponse createConsultaObjetoAguaResponse() {
        return new ConsultaObjetoAguaResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoCementerioResponse }
     * 
     */
    public ConsultaObjetoCementerioResponse createConsultaObjetoCementerioResponse() {
        return new ConsultaObjetoCementerioResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoIaeResponse }
     * 
     */
    public ConsultaObjetoIaeResponse createConsultaObjetoIaeResponse() {
        return new ConsultaObjetoIaeResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoIcioResponse }
     * 
     */
    public ConsultaObjetoIcioResponse createConsultaObjetoIcioResponse() {
        return new ConsultaObjetoIcioResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoLpoResponse }
     * 
     */
    public ConsultaObjetoLpoResponse createConsultaObjetoLpoResponse() {
        return new ConsultaObjetoLpoResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoMdResponse }
     * 
     */
    public ConsultaObjetoMdResponse createConsultaObjetoMdResponse() {
        return new ConsultaObjetoMdResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoMultaResponse }
     * 
     */
    public ConsultaObjetoMultaResponse createConsultaObjetoMultaResponse() {
        return new ConsultaObjetoMultaResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoPlusResponse }
     * 
     */
    public ConsultaObjetoPlusResponse createConsultaObjetoPlusResponse() {
        return new ConsultaObjetoPlusResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoPlusvaliaResponse }
     * 
     */
    public ConsultaObjetoPlusvaliaResponse createConsultaObjetoPlusvaliaResponse() {
        return new ConsultaObjetoPlusvaliaResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoRusticaResponse }
     * 
     */
    public ConsultaObjetoRusticaResponse createConsultaObjetoRusticaResponse() {
        return new ConsultaObjetoRusticaResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoUrbanaResponse }
     * 
     */
    public ConsultaObjetoUrbanaResponse createConsultaObjetoUrbanaResponse() {
        return new ConsultaObjetoUrbanaResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoVehiculoResponse }
     * 
     */
    public ConsultaObjetoVehiculoResponse createConsultaObjetoVehiculoResponse() {
        return new ConsultaObjetoVehiculoResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetosTributariosResponse }
     * 
     */
    public ConsultaObjetosTributariosResponse createConsultaObjetosTributariosResponse() {
        return new ConsultaObjetosTributariosResponse();
    }

    /**
     * Create an instance of {@link ConsultaOperacionesResponse }
     * 
     */
    public ConsultaOperacionesResponse createConsultaOperacionesResponse() {
        return new ConsultaOperacionesResponse();
    }

    /**
     * Create an instance of {@link ConsultaOrdenanzaFiscalResponse }
     * 
     */
    public ConsultaOrdenanzaFiscalResponse createConsultaOrdenanzaFiscalResponse() {
        return new ConsultaOrdenanzaFiscalResponse();
    }

    /**
     * Create an instance of {@link ConsultaProcedimientosResponse }
     * 
     */
    public ConsultaProcedimientosResponse createConsultaProcedimientosResponse() {
        return new ConsultaProcedimientosResponse();
    }

    /**
     * Create an instance of {@link ConsultaRecibosResponse }
     * 
     */
    public ConsultaRecibosResponse createConsultaRecibosResponse() {
        return new ConsultaRecibosResponse();
    }

    /**
     * Create an instance of {@link ConsultaTerritorioResponse }
     * 
     */
    public ConsultaTerritorioResponse createConsultaTerritorioResponse() {
        return new ConsultaTerritorioResponse();
    }

    /**
     * Create an instance of {@link ConsultaTiposObjetosTributariosResponse }
     * 
     */
    public ConsultaTiposObjetosTributariosResponse createConsultaTiposObjetosTributariosResponse() {
        return new ConsultaTiposObjetosTributariosResponse();
    }

    /**
     * Create an instance of {@link ConsultaTramitacionResponse }
     * 
     */
    public ConsultaTramitacionResponse createConsultaTramitacionResponse() {
        return new ConsultaTramitacionResponse();
    }

    /**
     * Create an instance of {@link ConsultaVehiculosResponse }
     * 
     */
    public ConsultaVehiculosResponse createConsultaVehiculosResponse() {
        return new ConsultaVehiculosResponse();
    }

    /**
     * Create an instance of {@link DescargarArchivoServidorResponse }
     * 
     */
    public DescargarArchivoServidorResponse createDescargarArchivoServidorResponse() {
        return new DescargarArchivoServidorResponse();
    }

    /**
     * Create an instance of {@link DesconexionAutoLiquidacionesResponse }
     * 
     */
    public DesconexionAutoLiquidacionesResponse createDesconexionAutoLiquidacionesResponse() {
        return new DesconexionAutoLiquidacionesResponse();
    }

    /**
     * Create an instance of {@link EnvioCorreoResponse }
     * 
     */
    public EnvioCorreoResponse createEnvioCorreoResponse() {
        return new EnvioCorreoResponse();
    }

    /**
     * Create an instance of {@link FicheroTeuResponse }
     * 
     */
    public FicheroTeuResponse createFicheroTeuResponse() {
        return new FicheroTeuResponse();
    }

    /**
     * Create an instance of {@link ValidarAgentePoliciaResponse }
     * 
     */
    public ValidarAgentePoliciaResponse createValidarAgentePoliciaResponse() {
        return new ValidarAgentePoliciaResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuarioGosResponse }
     * 
     */
    public ValidarUsuarioGosResponse createValidarUsuarioGosResponse() {
        return new ValidarUsuarioGosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ValidarUsuarioGosResponse.class)
    public JAXBElement<String> createValidarUsuarioGosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ValidarUsuarioGosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ValidarUsuarioGosResponse.class)
    public JAXBElement<String> createValidarUsuarioGosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ValidarUsuarioGosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "usuario", scope = ValidarUsuarioGosResponse.class)
    public JAXBElement<Usuario> createValidarUsuarioGosResponseUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_ValidarUsuarioGosResponseUsuario_QNAME, Usuario.class, ValidarUsuarioGosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgenteWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgenteWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "agente", scope = ValidarAgentePoliciaResponse.class)
    public JAXBElement<AgenteWS> createValidarAgentePoliciaResponseAgente(AgenteWS value) {
        return new JAXBElement<AgenteWS>(_ValidarAgentePoliciaResponseAgente_QNAME, AgenteWS.class, ValidarAgentePoliciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ValidarAgentePoliciaResponse.class)
    public JAXBElement<String> createValidarAgentePoliciaResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ValidarAgentePoliciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ValidarAgentePoliciaResponse.class)
    public JAXBElement<String> createValidarAgentePoliciaResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ValidarAgentePoliciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = FicheroTeuResponse.class)
    public JAXBElement<String> createFicheroTeuResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, FicheroTeuResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = FicheroTeuResponse.class)
    public JAXBElement<String> createFicheroTeuResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, FicheroTeuResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "ficheroBase64", scope = FicheroTeuResponse.class)
    public JAXBElement<String> createFicheroTeuResponseFicheroBase64(String value) {
        return new JAXBElement<String>(_FicheroTeuResponseFicheroBase64_QNAME, String.class, FicheroTeuResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = EnvioCorreoResponse.class)
    public JAXBElement<String> createEnvioCorreoResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, EnvioCorreoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = EnvioCorreoResponse.class)
    public JAXBElement<String> createEnvioCorreoResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, EnvioCorreoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = DesconexionAutoLiquidacionesResponse.class)
    public JAXBElement<String> createDesconexionAutoLiquidacionesResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, DesconexionAutoLiquidacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = DesconexionAutoLiquidacionesResponse.class)
    public JAXBElement<String> createDesconexionAutoLiquidacionesResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, DesconexionAutoLiquidacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = DescargarArchivoServidorResponse.class)
    public JAXBElement<String> createDescargarArchivoServidorResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, DescargarArchivoServidorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = DescargarArchivoServidorResponse.class)
    public JAXBElement<String> createDescargarArchivoServidorResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, DescargarArchivoServidorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "ficheroBase64", scope = DescargarArchivoServidorResponse.class)
    public JAXBElement<String> createDescargarArchivoServidorResponseFicheroBase64(String value) {
        return new JAXBElement<String>(_FicheroTeuResponseFicheroBase64_QNAME, String.class, DescargarArchivoServidorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaVehiculosResponse.class)
    public JAXBElement<String> createConsultaVehiculosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaVehiculosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaVehiculosResponse.class)
    public JAXBElement<String> createConsultaVehiculosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaVehiculosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaTramitacionResponse.class)
    public JAXBElement<String> createConsultaTramitacionResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaTramitacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaTramitacionResponse.class)
    public JAXBElement<String> createConsultaTramitacionResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaTramitacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaTiposObjetosTributariosResponse.class)
    public JAXBElement<String> createConsultaTiposObjetosTributariosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaTiposObjetosTributariosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaTiposObjetosTributariosResponse.class)
    public JAXBElement<String> createConsultaTiposObjetosTributariosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaTiposObjetosTributariosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaTerritorioResponse.class)
    public JAXBElement<String> createConsultaTerritorioResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaTerritorioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaTerritorioResponse.class)
    public JAXBElement<String> createConsultaTerritorioResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaTerritorioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "municipio", scope = ConsultaTerritorioResponse.class)
    public JAXBElement<String> createConsultaTerritorioResponseMunicipio(String value) {
        return new JAXBElement<String>(_ConsultaTerritorioResponseMunicipio_QNAME, String.class, ConsultaTerritorioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "provincia", scope = ConsultaTerritorioResponse.class)
    public JAXBElement<String> createConsultaTerritorioResponseProvincia(String value) {
        return new JAXBElement<String>(_ConsultaTerritorioResponseProvincia_QNAME, String.class, ConsultaTerritorioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaRecibosResponse.class)
    public JAXBElement<String> createConsultaRecibosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaRecibosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaRecibosResponse.class)
    public JAXBElement<String> createConsultaRecibosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaRecibosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaProcedimientosResponse.class)
    public JAXBElement<String> createConsultaProcedimientosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaProcedimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaProcedimientosResponse.class)
    public JAXBElement<String> createConsultaProcedimientosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaProcedimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaOrdenanzaFiscalResponse.class)
    public JAXBElement<String> createConsultaOrdenanzaFiscalResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaOrdenanzaFiscalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaOrdenanzaFiscalResponse.class)
    public JAXBElement<String> createConsultaOrdenanzaFiscalResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaOrdenanzaFiscalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaOperacionesResponse.class)
    public JAXBElement<String> createConsultaOperacionesResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaOperacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaOperacionesResponse.class)
    public JAXBElement<String> createConsultaOperacionesResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaOperacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetosTributariosResponse.class)
    public JAXBElement<String> createConsultaObjetosTributariosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetosTributariosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetosTributariosResponse.class)
    public JAXBElement<String> createConsultaObjetosTributariosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetosTributariosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoVehiculoResponse.class)
    public JAXBElement<String> createConsultaObjetoVehiculoResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoVehiculoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoVehiculoResponse.class)
    public JAXBElement<String> createConsultaObjetoVehiculoResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoVehiculoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiculoWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "vehiculos", scope = ConsultaObjetoVehiculoResponse.class)
    public JAXBElement<VehiculoWS> createConsultaObjetoVehiculoResponseVehiculos(VehiculoWS value) {
        return new JAXBElement<VehiculoWS>(_ConsultaObjetoVehiculoResponseVehiculos_QNAME, VehiculoWS.class, ConsultaObjetoVehiculoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoUrbanaResponse.class)
    public JAXBElement<String> createConsultaObjetoUrbanaResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoUrbanaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoUrbanaResponse.class)
    public JAXBElement<String> createConsultaObjetoUrbanaResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoUrbanaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrbanaWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UrbanaWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "finca", scope = ConsultaObjetoUrbanaResponse.class)
    public JAXBElement<UrbanaWS> createConsultaObjetoUrbanaResponseFinca(UrbanaWS value) {
        return new JAXBElement<UrbanaWS>(_ConsultaObjetoUrbanaResponseFinca_QNAME, UrbanaWS.class, ConsultaObjetoUrbanaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoRusticaResponse.class)
    public JAXBElement<String> createConsultaObjetoRusticaResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoRusticaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoRusticaResponse.class)
    public JAXBElement<String> createConsultaObjetoRusticaResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoRusticaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RusticaWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RusticaWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "parcela", scope = ConsultaObjetoRusticaResponse.class)
    public JAXBElement<RusticaWS> createConsultaObjetoRusticaResponseParcela(RusticaWS value) {
        return new JAXBElement<RusticaWS>(_ConsultaObjetoRusticaResponseParcela_QNAME, RusticaWS.class, ConsultaObjetoRusticaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoPlusvaliaResponse.class)
    public JAXBElement<String> createConsultaObjetoPlusvaliaResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoPlusvaliaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoPlusvaliaResponse.class)
    public JAXBElement<String> createConsultaObjetoPlusvaliaResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoPlusvaliaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusvaliaWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlusvaliaWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "plusvalia", scope = ConsultaObjetoPlusvaliaResponse.class)
    public JAXBElement<PlusvaliaWS> createConsultaObjetoPlusvaliaResponsePlusvalia(PlusvaliaWS value) {
        return new JAXBElement<PlusvaliaWS>(_ConsultaObjetoPlusvaliaResponsePlusvalia_QNAME, PlusvaliaWS.class, ConsultaObjetoPlusvaliaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusvaliaWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlusvaliaWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "pulsvalia", scope = ConsultaObjetoPlusvaliaResponse.class)
    public JAXBElement<PlusvaliaWS> createConsultaObjetoPlusvaliaResponsePulsvalia(PlusvaliaWS value) {
        return new JAXBElement<PlusvaliaWS>(_ConsultaObjetoPlusvaliaResponsePulsvalia_QNAME, PlusvaliaWS.class, ConsultaObjetoPlusvaliaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoPlusResponse.class)
    public JAXBElement<String> createConsultaObjetoPlusResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoPlusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoPlusResponse.class)
    public JAXBElement<String> createConsultaObjetoPlusResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoPlusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlusWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "plus", scope = ConsultaObjetoPlusResponse.class)
    public JAXBElement<PlusWS> createConsultaObjetoPlusResponsePlus(PlusWS value) {
        return new JAXBElement<PlusWS>(_ConsultaObjetoPlusResponsePlus_QNAME, PlusWS.class, ConsultaObjetoPlusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoMultaResponse.class)
    public JAXBElement<String> createConsultaObjetoMultaResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoMultaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DenunciaWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DenunciaWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "denuncia", scope = ConsultaObjetoMultaResponse.class)
    public JAXBElement<DenunciaWS> createConsultaObjetoMultaResponseDenuncia(DenunciaWS value) {
        return new JAXBElement<DenunciaWS>(_ConsultaObjetoMultaResponseDenuncia_QNAME, DenunciaWS.class, ConsultaObjetoMultaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoMultaResponse.class)
    public JAXBElement<String> createConsultaObjetoMultaResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoMultaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoMdResponse.class)
    public JAXBElement<String> createConsultaObjetoMdResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoMdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoMdResponse.class)
    public JAXBElement<String> createConsultaObjetoMdResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoMdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoLpoResponse.class)
    public JAXBElement<String> createConsultaObjetoLpoResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoLpoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoLpoResponse.class)
    public JAXBElement<String> createConsultaObjetoLpoResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoLpoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LpoWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LpoWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "ocupacion", scope = ConsultaObjetoLpoResponse.class)
    public JAXBElement<LpoWS> createConsultaObjetoLpoResponseOcupacion(LpoWS value) {
        return new JAXBElement<LpoWS>(_ConsultaObjetoLpoResponseOcupacion_QNAME, LpoWS.class, ConsultaObjetoLpoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoIcioResponse.class)
    public JAXBElement<String> createConsultaObjetoIcioResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoIcioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoIcioResponse.class)
    public JAXBElement<String> createConsultaObjetoIcioResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoIcioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IcioWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IcioWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "obra", scope = ConsultaObjetoIcioResponse.class)
    public JAXBElement<IcioWS> createConsultaObjetoIcioResponseObra(IcioWS value) {
        return new JAXBElement<IcioWS>(_ConsultaObjetoIcioResponseObra_QNAME, IcioWS.class, ConsultaObjetoIcioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IaeWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IaeWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "actividad", scope = ConsultaObjetoIaeResponse.class)
    public JAXBElement<IaeWS> createConsultaObjetoIaeResponseActividad(IaeWS value) {
        return new JAXBElement<IaeWS>(_ConsultaObjetoIaeResponseActividad_QNAME, IaeWS.class, ConsultaObjetoIaeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoIaeResponse.class)
    public JAXBElement<String> createConsultaObjetoIaeResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoIaeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoIaeResponse.class)
    public JAXBElement<String> createConsultaObjetoIaeResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoIaeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoCementerioResponse.class)
    public JAXBElement<String> createConsultaObjetoCementerioResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoCementerioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoCementerioResponse.class)
    public JAXBElement<String> createConsultaObjetoCementerioResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoCementerioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SepulturaWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SepulturaWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "sepultura", scope = ConsultaObjetoCementerioResponse.class)
    public JAXBElement<SepulturaWS> createConsultaObjetoCementerioResponseSepultura(SepulturaWS value) {
        return new JAXBElement<SepulturaWS>(_ConsultaObjetoCementerioResponseSepultura_QNAME, SepulturaWS.class, ConsultaObjetoCementerioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbonadoWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbonadoWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "abonado", scope = ConsultaObjetoAguaResponse.class)
    public JAXBElement<AbonadoWS> createConsultaObjetoAguaResponseAbonado(AbonadoWS value) {
        return new JAXBElement<AbonadoWS>(_ConsultaObjetoAguaResponseAbonado_QNAME, AbonadoWS.class, ConsultaObjetoAguaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaObjetoAguaResponse.class)
    public JAXBElement<String> createConsultaObjetoAguaResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaObjetoAguaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaObjetoAguaResponse.class)
    public JAXBElement<String> createConsultaObjetoAguaResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaObjetoAguaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaNotificacionesResponse.class)
    public JAXBElement<String> createConsultaNotificacionesResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaNotificacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaNotificacionesResponse.class)
    public JAXBElement<String> createConsultaNotificacionesResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaNotificacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaMetadatosResponse.class)
    public JAXBElement<String> createConsultaMetadatosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaMetadatosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaMetadatosResponse.class)
    public JAXBElement<String> createConsultaMetadatosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaMetadatosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaMetadatosGrupoAtribResponse.class)
    public JAXBElement<String> createConsultaMetadatosGrupoAtribResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaMetadatosGrupoAtribResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaMetadatosGrupoAtribResponse.class)
    public JAXBElement<String> createConsultaMetadatosGrupoAtribResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaMetadatosGrupoAtribResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaMateriaProcedimientosResponse.class)
    public JAXBElement<String> createConsultaMateriaProcedimientosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaMateriaProcedimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaMateriaProcedimientosResponse.class)
    public JAXBElement<String> createConsultaMateriaProcedimientosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaMateriaProcedimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaLiquidacionesResponse.class)
    public JAXBElement<String> createConsultaLiquidacionesResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaLiquidacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaLiquidacionesResponse.class)
    public JAXBElement<String> createConsultaLiquidacionesResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaLiquidacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaJustificantesGastosResponse.class)
    public JAXBElement<String> createConsultaJustificantesGastosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaJustificantesGastosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaJustificantesGastosResponse.class)
    public JAXBElement<String> createConsultaJustificantesGastosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaJustificantesGastosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaInfraccionesResponse.class)
    public JAXBElement<String> createConsultaInfraccionesResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaInfraccionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaInfraccionesResponse.class)
    public JAXBElement<String> createConsultaInfraccionesResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaInfraccionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaFestivosResponse.class)
    public JAXBElement<String> createConsultaFestivosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaFestivosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaFestivosResponse.class)
    public JAXBElement<String> createConsultaFestivosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaFestivosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaFacturasResponse.class)
    public JAXBElement<String> createConsultaFacturasResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaFacturasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaFacturasResponse.class)
    public JAXBElement<String> createConsultaFacturasResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaFacturasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerceroWS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TerceroWS }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "tercero", scope = ConsultaFacturasResponse.class)
    public JAXBElement<TerceroWS> createConsultaFacturasResponseTercero(TerceroWS value) {
        return new JAXBElement<TerceroWS>(_ConsultaFacturasResponseTercero_QNAME, TerceroWS.class, ConsultaFacturasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaExpedienteResponse.class)
    public JAXBElement<String> createConsultaExpedienteResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaExpedienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaExpedienteResponse.class)
    public JAXBElement<String> createConsultaExpedienteResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaExpedienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaCitaInternetResponse.class)
    public JAXBElement<String> createConsultaCitaInternetResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaCitaInternetResponse.class)
    public JAXBElement<String> createConsultaCitaInternetResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaCentrosResponse.class)
    public JAXBElement<String> createConsultaCentrosResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaCentrosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaCentrosResponse.class)
    public JAXBElement<String> createConsultaCentrosResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaCentrosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaCentrosHorarioResponse.class)
    public JAXBElement<String> createConsultaCentrosHorarioResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaCentrosHorarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaCentrosHorarioResponse.class)
    public JAXBElement<String> createConsultaCentrosHorarioResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaCentrosHorarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaAutoLiquidacionResponse.class)
    public JAXBElement<String> createConsultaAutoLiquidacionResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaAutoLiquidacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaAutoLiquidacionResponse.class)
    public JAXBElement<String> createConsultaAutoLiquidacionResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaAutoLiquidacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "resultado", scope = ConsultaAutoLiquidacionResponse.class)
    public JAXBElement<String> createConsultaAutoLiquidacionResponseResultado(String value) {
        return new JAXBElement<String>(_ConsultaAutoLiquidacionResponseResultado_QNAME, String.class, ConsultaAutoLiquidacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaAutoLiquidacionInternetResponse.class)
    public JAXBElement<String> createConsultaAutoLiquidacionInternetResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaAutoLiquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaAutoLiquidacionInternetResponse.class)
    public JAXBElement<String> createConsultaAutoLiquidacionInternetResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaAutoLiquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "resultado", scope = ConsultaAutoLiquidacionInternetResponse.class)
    public JAXBElement<String> createConsultaAutoLiquidacionInternetResponseResultado(String value) {
        return new JAXBElement<String>(_ConsultaAutoLiquidacionResponseResultado_QNAME, String.class, ConsultaAutoLiquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaArchivoResponse.class)
    public JAXBElement<String> createConsultaArchivoResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaArchivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaArchivoResponse.class)
    public JAXBElement<String> createConsultaArchivoResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaArchivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ConsultaAplicacionesResponse.class)
    public JAXBElement<String> createConsultaAplicacionesResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ConsultaAplicacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ConsultaAplicacionesResponse.class)
    public JAXBElement<String> createConsultaAplicacionesResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ConsultaAplicacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = AutoLiquidacionInternetHResponse.class)
    public JAXBElement<String> createAutoLiquidacionInternetHResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, AutoLiquidacionInternetHResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = AutoLiquidacionInternetHResponse.class)
    public JAXBElement<String> createAutoLiquidacionInternetHResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, AutoLiquidacionInternetHResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "resultado", scope = AutoLiquidacionInternetHResponse.class)
    public JAXBElement<String> createAutoLiquidacionInternetHResponseResultado(String value) {
        return new JAXBElement<String>(_ConsultaAutoLiquidacionResponseResultado_QNAME, String.class, AutoLiquidacionInternetHResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = AnularCitaInternetResponse.class)
    public JAXBElement<String> createAnularCitaInternetResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, AnularCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = AnularCitaInternetResponse.class)
    public JAXBElement<String> createAnularCitaInternetResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, AnularCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = AltaRegistroResponse.class)
    public JAXBElement<String> createAltaRegistroResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, AltaRegistroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = AltaRegistroResponse.class)
    public JAXBElement<String> createAltaRegistroResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, AltaRegistroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "fecRegis", scope = AltaRegistroResponse.class)
    public JAXBElement<XMLGregorianCalendar> createAltaRegistroResponseFecRegis(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AltaRegistroResponseFecRegis_QNAME, XMLGregorianCalendar.class, AltaRegistroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "numRegis", scope = AltaRegistroResponse.class)
    public JAXBElement<String> createAltaRegistroResponseNumRegis(String value) {
        return new JAXBElement<String>(_AltaRegistroResponseNumRegis_QNAME, String.class, AltaRegistroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = AltaCobroContabilidadResponse.class)
    public JAXBElement<String> createAltaCobroContabilidadResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, AltaCobroContabilidadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = AltaCobroContabilidadResponse.class)
    public JAXBElement<String> createAltaCobroContabilidadResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, AltaCobroContabilidadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "idOpera", scope = AltaCobroContabilidadResponse.class)
    public JAXBElement<Long> createAltaCobroContabilidadResponseIdOpera(Long value) {
        return new JAXBElement<Long>(_AltaCobroContabilidadResponseIdOpera_QNAME, Long.class, AltaCobroContabilidadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = AltaCitaInternetResponse.class)
    public JAXBElement<String> createAltaCitaInternetResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, AltaCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = AltaCitaInternetResponse.class)
    public JAXBElement<String> createAltaCitaInternetResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, AltaCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ActualizarReciboResponse.class)
    public JAXBElement<String> createActualizarReciboResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ActualizarReciboResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ActualizarReciboResponse.class)
    public JAXBElement<String> createActualizarReciboResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ActualizarReciboResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "reciboCabecera", scope = ActualizarReciboResponse.class)
    public JAXBElement<ReciboCabeceraWs> createActualizarReciboResponseReciboCabecera(ReciboCabeceraWs value) {
        return new JAXBElement<ReciboCabeceraWs>(_ActualizarReciboResponseReciboCabecera_QNAME, ReciboCabeceraWs.class, ActualizarReciboResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ActualizarReciboInternetResponse.class)
    public JAXBElement<String> createActualizarReciboInternetResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ActualizarReciboInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ActualizarReciboInternetResponse.class)
    public JAXBElement<String> createActualizarReciboInternetResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ActualizarReciboInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ActualizarReciboInternet2Response.class)
    public JAXBElement<String> createActualizarReciboInternet2ResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ActualizarReciboInternet2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ActualizarReciboInternet2Response.class)
    public JAXBElement<String> createActualizarReciboInternet2ResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ActualizarReciboInternet2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "codigoRespuesta", scope = ActualizarNotificacionResponse.class)
    public JAXBElement<String> createActualizarNotificacionResponseCodigoRespuesta(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseCodigoRespuesta_QNAME, String.class, ActualizarNotificacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "descripcion", scope = ActualizarNotificacionResponse.class)
    public JAXBElement<String> createActualizarNotificacionResponseDescripcion(String value) {
        return new JAXBElement<String>(_ValidarUsuarioGosResponseDescripcion_QNAME, String.class, ActualizarNotificacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "notificacion", scope = ActualizarNotificacionResponse.class)
    public JAXBElement<NotificacionWs> createActualizarNotificacionResponseNotificacion(NotificacionWs value) {
        return new JAXBElement<NotificacionWs>(_ActualizarNotificacionResponseNotificacion_QNAME, NotificacionWs.class, ActualizarNotificacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboCabeceraWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "reciboCabecera", scope = GenerarReciboResponse.class)
    public JAXBElement<ReciboCabeceraWs> createGenerarReciboResponseReciboCabecera(ReciboCabeceraWs value) {
        return new JAXBElement<ReciboCabeceraWs>(_ActualizarReciboResponseReciboCabecera_QNAME, ReciboCabeceraWs.class, GenerarReciboResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboConcepto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboConcepto }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "reciboConcepto", scope = GenerarReciboResponse.class)
    public JAXBElement<ReciboConcepto> createGenerarReciboResponseReciboConcepto(ReciboConcepto value) {
        return new JAXBElement<ReciboConcepto>(_GenerarReciboResponseReciboConcepto_QNAME, ReciboConcepto.class, GenerarReciboResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "objetoTributario", scope = GenerarObjetoTributarioResponse.class)
    public JAXBElement<ObjetoTributarioWs> createGenerarObjetoTributarioResponseObjetoTributario(ObjetoTributarioWs value) {
        return new JAXBElement<ObjetoTributarioWs>(_GenerarObjetoTributarioResponseObjetoTributario_QNAME, ObjetoTributarioWs.class, GenerarObjetoTributarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioMd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioMd }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "objetoTributarioMd", scope = GenerarObjetoTributarioMdResponse.class)
    public JAXBElement<ObjetoTributarioMd> createGenerarObjetoTributarioMdResponseObjetoTributarioMd(ObjetoTributarioMd value) {
        return new JAXBElement<ObjetoTributarioMd>(_GenerarObjetoTributarioMdResponseObjetoTributarioMd_QNAME, ObjetoTributarioMd.class, GenerarObjetoTributarioMdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificacionWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "notificacion", scope = GenerarNotificacionResponse.class)
    public JAXBElement<NotificacionWs> createGenerarNotificacionResponseNotificacion(NotificacionWs value) {
        return new JAXBElement<NotificacionWs>(_ActualizarNotificacionResponseNotificacion_QNAME, NotificacionWs.class, GenerarNotificacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "autoliquidacionInternet", scope = AutoliquidacionInRecaudacionResponse.class)
    public JAXBElement<AutoliquidacionInternetWs> createAutoliquidacionInRecaudacionResponseAutoliquidacionInternet(AutoliquidacionInternetWs value) {
        return new JAXBElement<AutoliquidacionInternetWs>(_AutoliquidacionInRecaudacionResponseAutoliquidacionInternet_QNAME, AutoliquidacionInternetWs.class, AutoliquidacionInRecaudacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "idAuto", scope = AutoliquidacionInRecaudacionResponse.class)
    public JAXBElement<Long> createAutoliquidacionInRecaudacionResponseIdAuto(Long value) {
        return new JAXBElement<Long>(_AutoliquidacionInRecaudacionResponseIdAuto_QNAME, Long.class, AutoliquidacionInRecaudacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchivoWs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArchivoWs }{@code >}
     */
    @XmlElementDecl(namespace = "http://response.ws.gf.gos.greenaall.es/xsd", name = "archivo", scope = GenerarArchivoResponse.class)
    public JAXBElement<ArchivoWs> createGenerarArchivoResponseArchivo(ArchivoWs value) {
        return new JAXBElement<ArchivoWs>(_GenerarArchivoResponseArchivo_QNAME, ArchivoWs.class, GenerarArchivoResponse.class, value);
    }

}
