
package es.greenaall.gos.gf.ws;

import javax.xml.namespace.QName;
import es.greenaall.gos.ge.ws.xsd.RespuestaActualizacion;
import es.greenaall.gos.gf.dto.xsd.LiquidacionRc;
import es.greenaall.gos.gf.dto.xsd.ObjetoTributarioRc;
import es.greenaall.gos.gf.ws.dto.xsd.ArchivoOut;
import es.greenaall.gos.gf.ws.dto.xsd.AutoliquidacionInternetOut;
import es.greenaall.gos.gf.ws.dto.xsd.CalcularImporteAutoliquidacionResponse;
import es.greenaall.gos.gf.ws.dto.xsd.NotificacionOut;
import es.greenaall.gos.gf.ws.dto.xsd.ObjetoTributarioMdOut;
import es.greenaall.gos.gf.ws.dto.xsd.ObjetoTributarioOut;
import es.greenaall.gos.gf.ws.dto.xsd.ReciboOut;
import es.greenaall.gos.gf.ws.dto.xsd.VehiculoOut;
import es.greenaall.gos.gf.ws.dto.xsd.VolanteOut;
import es.greenaall.gos.gf.ws.request.xsd.ActualizarNotificacionRequest;
import es.greenaall.gos.gf.ws.request.xsd.ActualizarReciboInternet2Request;
import es.greenaall.gos.gf.ws.request.xsd.ActualizarReciboInternetRequest;
import es.greenaall.gos.gf.ws.request.xsd.ActualizarReciboPTRequest;
import es.greenaall.gos.gf.ws.request.xsd.ActualizarReciboRequest;
import es.greenaall.gos.gf.ws.request.xsd.AltaCitaInternetRequest;
import es.greenaall.gos.gf.ws.request.xsd.AltaRegistroRequest;
import es.greenaall.gos.gf.ws.request.xsd.AnularCitaInternetRequest;
import es.greenaall.gos.gf.ws.request.xsd.AutoLiquidacionInternetHRequest;
import es.greenaall.gos.gf.ws.request.xsd.AutoliquidacionInternetRequest;
import es.greenaall.gos.gf.ws.request.xsd.AutoliquidacionesInternetRecaudacionRequest;
import es.greenaall.gos.gf.ws.request.xsd.CobroContabilidadRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaAplicacionesRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaArchivoRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaAutoLiquidacionInternetRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaAutoLiquidacionRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaCentrosHorarioRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaCentrosRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaCitaInternetRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaFacturaRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaFestivosRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaInfraccionesRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaJustificantesGastosRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaLiquidacionesRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaMetadatosGrupoAtribRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaMetadatosRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaModalidadProcedimientosRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaNotificacionesRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoAguaRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoCementerioRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoIaeRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoIcioRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoLpoRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoMdRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoMultaRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoPlusRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoPlusvaliaRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoRusticaRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoUrbanaRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetoVehiculoRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaObjetosTributariosRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaOperacionesRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaOrdenanzaFiscalRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaProcedimientosRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaRecibosRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaTerritorioRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaTipoObjetoTributarioRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaTramitacionRequest;
import es.greenaall.gos.gf.ws.request.xsd.ConsultaVehiculosRequest;
import es.greenaall.gos.gf.ws.request.xsd.DescargarArchivoServidorRequest;
import es.greenaall.gos.gf.ws.request.xsd.DesconexionAutoLiquidacioneRequest;
import es.greenaall.gos.gf.ws.request.xsd.EnvioCorreoRequest;
import es.greenaall.gos.gf.ws.request.xsd.FicheroTeuRequest;
import es.greenaall.gos.gf.ws.request.xsd.GenerarArchivoRequest;
import es.greenaall.gos.gf.ws.request.xsd.GenerarNotificacionRequest;
import es.greenaall.gos.gf.ws.request.xsd.GenerarObjetoTributarioMdRequest;
import es.greenaall.gos.gf.ws.request.xsd.GenerarObjetoTributarioRequest;
import es.greenaall.gos.gf.ws.request.xsd.GenerarReciboRequest;
import es.greenaall.gos.gf.ws.request.xsd.GenerarVehiculoRequest;
import es.greenaall.gos.gf.ws.request.xsd.GenerarVolanteImagenRequest;
import es.greenaall.gos.gf.ws.request.xsd.GenerarVolanteRequest;
import es.greenaall.gos.gf.ws.request.xsd.RespuestaActualizacionRequest;
import es.greenaall.gos.gf.ws.request.xsd.ValidaAgentePoliciaRequest;
import es.greenaall.gos.gf.ws.request.xsd.ValidarUsuarioGosRequest;
import es.greenaall.gos.gf.ws.response.xsd.AutoLiquidacionInternetHResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaAplicacionesResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaAutoLiquidacionInternetResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaCentrosHorarioResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaCentrosResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaJustificantesGastosResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaMateriaProcedimientosResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoAguaResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoCementerioResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoIaeResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoIcioResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoLpoResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoMultaResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoPlusResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoPlusvaliaResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoRusticaResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoUrbanaResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoVehiculoResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaOperacionesResponse;
import es.greenaall.gos.gf.ws.response.xsd.ConsultaOrdenanzaFiscalResponse;
import es.greenaall.gos.gf.ws.response.xsd.DescargarArchivoServidorResponse;
import es.greenaall.gos.gf.ws.response.xsd.FicheroTeuResponse;
import es.greenaall.gos.gf.ws.xsd.DatoConexion;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.greenaall.gos.gf.ws package. 
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

    private final static QName _RemoteExceptionRemoteException_QNAME = new QName("http://ws.gf.gos.greenaall.es", "RemoteException");
    private final static QName _ActualizarEstadoDocumentoRequest_QNAME = new QName("http://ws.gf.gos.greenaall.es", "request");
    private final static QName _ActualizarEstadoDocumentoResponseReturn_QNAME = new QName("http://ws.gf.gos.greenaall.es", "return");
    private final static QName _AltaTributoGUIDatosConexion_QNAME = new QName("http://ws.gf.gos.greenaall.es", "datosConexion");
    private final static QName _ConsultarLiquidacionesTributosGUILiquidacion_QNAME = new QName("http://ws.gf.gos.greenaall.es", "liquidacion");
    private final static QName _ConsultarTributosGUIObjetoTributario_QNAME = new QName("http://ws.gf.gos.greenaall.es", "objetoTributario");
    private final static QName _CtrErrorCtrError_QNAME = new QName("http://ws.gf.gos.greenaall.es", "CtrError");
    private final static QName _DameParametroSistemaSIdioma_QNAME = new QName("http://ws.gf.gos.greenaall.es", "sIdioma");
    private final static QName _ExceptionException_QNAME = new QName("http://ws.gf.gos.greenaall.es", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.greenaall.gos.gf.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.RemoteException }
     * 
     */
    public es.greenaall.gos.gf.ws.RemoteException createRemoteException() {
        return new es.greenaall.gos.gf.ws.RemoteException();
    }

    /**
     * Create an instance of {@link ActualizarEstadoDocumento }
     * 
     */
    public ActualizarEstadoDocumento createActualizarEstadoDocumento() {
        return new ActualizarEstadoDocumento();
    }

    /**
     * Create an instance of {@link ActualizarEstadoDocumentoResponse }
     * 
     */
    public ActualizarEstadoDocumentoResponse createActualizarEstadoDocumentoResponse() {
        return new ActualizarEstadoDocumentoResponse();
    }

    /**
     * Create an instance of {@link AltaArchivo }
     * 
     */
    public AltaArchivo createAltaArchivo() {
        return new AltaArchivo();
    }

    /**
     * Create an instance of {@link AltaArchivoResponse }
     * 
     */
    public AltaArchivoResponse createAltaArchivoResponse() {
        return new AltaArchivoResponse();
    }

    /**
     * Create an instance of {@link ActualizarAutoliquidacionInternet }
     * 
     */
    public ActualizarAutoliquidacionInternet createActualizarAutoliquidacionInternet() {
        return new ActualizarAutoliquidacionInternet();
    }

    /**
     * Create an instance of {@link ActualizarAutoliquidacionInternetResponse }
     * 
     */
    public ActualizarAutoliquidacionInternetResponse createActualizarAutoliquidacionInternetResponse() {
        return new ActualizarAutoliquidacionInternetResponse();
    }

    /**
     * Create an instance of {@link AltaAutoliquidacionInternet }
     * 
     */
    public AltaAutoliquidacionInternet createAltaAutoliquidacionInternet() {
        return new AltaAutoliquidacionInternet();
    }

    /**
     * Create an instance of {@link AltaAutoliquidacionInternetResponse }
     * 
     */
    public AltaAutoliquidacionInternetResponse createAltaAutoliquidacionInternetResponse() {
        return new AltaAutoliquidacionInternetResponse();
    }

    /**
     * Create an instance of {@link BorrarAutoliquidacionInternet }
     * 
     */
    public BorrarAutoliquidacionInternet createBorrarAutoliquidacionInternet() {
        return new BorrarAutoliquidacionInternet();
    }

    /**
     * Create an instance of {@link BorrarAutoliquidacionInternetResponse }
     * 
     */
    public BorrarAutoliquidacionInternetResponse createBorrarAutoliquidacionInternetResponse() {
        return new BorrarAutoliquidacionInternetResponse();
    }

    /**
     * Create an instance of {@link AutoliquidacionInternet }
     * 
     */
    public AutoliquidacionInternet createAutoliquidacionInternet() {
        return new AutoliquidacionInternet();
    }

    /**
     * Create an instance of {@link AutoliquidacionInternetResponse }
     * 
     */
    public AutoliquidacionInternetResponse createAutoliquidacionInternetResponse() {
        return new AutoliquidacionInternetResponse();
    }

    /**
     * Create an instance of {@link AltaNotificacion }
     * 
     */
    public AltaNotificacion createAltaNotificacion() {
        return new AltaNotificacion();
    }

    /**
     * Create an instance of {@link AltaNotificacionResponse }
     * 
     */
    public AltaNotificacionResponse createAltaNotificacionResponse() {
        return new AltaNotificacionResponse();
    }

    /**
     * Create an instance of {@link AltaObjetoTributarioMd }
     * 
     */
    public AltaObjetoTributarioMd createAltaObjetoTributarioMd() {
        return new AltaObjetoTributarioMd();
    }

    /**
     * Create an instance of {@link AltaObjetoTributarioMdResponse }
     * 
     */
    public AltaObjetoTributarioMdResponse createAltaObjetoTributarioMdResponse() {
        return new AltaObjetoTributarioMdResponse();
    }

    /**
     * Create an instance of {@link AltaObjetoTributario }
     * 
     */
    public AltaObjetoTributario createAltaObjetoTributario() {
        return new AltaObjetoTributario();
    }

    /**
     * Create an instance of {@link AltaObjetoTributarioResponse }
     * 
     */
    public AltaObjetoTributarioResponse createAltaObjetoTributarioResponse() {
        return new AltaObjetoTributarioResponse();
    }

    /**
     * Create an instance of {@link AltaRecibo }
     * 
     */
    public AltaRecibo createAltaRecibo() {
        return new AltaRecibo();
    }

    /**
     * Create an instance of {@link AltaReciboResponse }
     * 
     */
    public AltaReciboResponse createAltaReciboResponse() {
        return new AltaReciboResponse();
    }

    /**
     * Create an instance of {@link AltaVehiculo }
     * 
     */
    public AltaVehiculo createAltaVehiculo() {
        return new AltaVehiculo();
    }

    /**
     * Create an instance of {@link AltaVehiculoResponse }
     * 
     */
    public AltaVehiculoResponse createAltaVehiculoResponse() {
        return new AltaVehiculoResponse();
    }

    /**
     * Create an instance of {@link AltaVolante }
     * 
     */
    public AltaVolante createAltaVolante() {
        return new AltaVolante();
    }

    /**
     * Create an instance of {@link AltaVolanteResponse }
     * 
     */
    public AltaVolanteResponse createAltaVolanteResponse() {
        return new AltaVolanteResponse();
    }

    /**
     * Create an instance of {@link AltaVolanteImagen }
     * 
     */
    public AltaVolanteImagen createAltaVolanteImagen() {
        return new AltaVolanteImagen();
    }

    /**
     * Create an instance of {@link AltaVolanteImagenResponse }
     * 
     */
    public AltaVolanteImagenResponse createAltaVolanteImagenResponse() {
        return new AltaVolanteImagenResponse();
    }

    /**
     * Create an instance of {@link ActualizarNotificacion }
     * 
     */
    public ActualizarNotificacion createActualizarNotificacion() {
        return new ActualizarNotificacion();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ActualizarNotificacionResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ActualizarNotificacionResponse createActualizarNotificacionResponse() {
        return new es.greenaall.gos.gf.ws.ActualizarNotificacionResponse();
    }

    /**
     * Create an instance of {@link ActualizarReciboInternet2 }
     * 
     */
    public ActualizarReciboInternet2 createActualizarReciboInternet2() {
        return new ActualizarReciboInternet2();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ActualizarReciboInternet2Response }
     * 
     */
    public es.greenaall.gos.gf.ws.ActualizarReciboInternet2Response createActualizarReciboInternet2Response() {
        return new es.greenaall.gos.gf.ws.ActualizarReciboInternet2Response();
    }

    /**
     * Create an instance of {@link ActualizarReciboInternet }
     * 
     */
    public ActualizarReciboInternet createActualizarReciboInternet() {
        return new ActualizarReciboInternet();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ActualizarReciboInternetResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ActualizarReciboInternetResponse createActualizarReciboInternetResponse() {
        return new es.greenaall.gos.gf.ws.ActualizarReciboInternetResponse();
    }

    /**
     * Create an instance of {@link ActualizarRecibo }
     * 
     */
    public ActualizarRecibo createActualizarRecibo() {
        return new ActualizarRecibo();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ActualizarReciboResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ActualizarReciboResponse createActualizarReciboResponse() {
        return new es.greenaall.gos.gf.ws.ActualizarReciboResponse();
    }

    /**
     * Create an instance of {@link ActualizarReciboPT }
     * 
     */
    public ActualizarReciboPT createActualizarReciboPT() {
        return new ActualizarReciboPT();
    }

    /**
     * Create an instance of {@link ActualizarReciboPTResponse }
     * 
     */
    public ActualizarReciboPTResponse createActualizarReciboPTResponse() {
        return new ActualizarReciboPTResponse();
    }

    /**
     * Create an instance of {@link AltaCitaInternet }
     * 
     */
    public AltaCitaInternet createAltaCitaInternet() {
        return new AltaCitaInternet();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.AltaCitaInternetResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.AltaCitaInternetResponse createAltaCitaInternetResponse() {
        return new es.greenaall.gos.gf.ws.AltaCitaInternetResponse();
    }

    /**
     * Create an instance of {@link AltaCobroContabilidad }
     * 
     */
    public AltaCobroContabilidad createAltaCobroContabilidad() {
        return new AltaCobroContabilidad();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.AltaCobroContabilidadResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.AltaCobroContabilidadResponse createAltaCobroContabilidadResponse() {
        return new es.greenaall.gos.gf.ws.AltaCobroContabilidadResponse();
    }

    /**
     * Create an instance of {@link AltaRegistro }
     * 
     */
    public AltaRegistro createAltaRegistro() {
        return new AltaRegistro();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.AltaRegistroResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.AltaRegistroResponse createAltaRegistroResponse() {
        return new es.greenaall.gos.gf.ws.AltaRegistroResponse();
    }

    /**
     * Create an instance of {@link AltaRegistroEfirma }
     * 
     */
    public AltaRegistroEfirma createAltaRegistroEfirma() {
        return new AltaRegistroEfirma();
    }

    /**
     * Create an instance of {@link AltaRegistroEfirmaResponse }
     * 
     */
    public AltaRegistroEfirmaResponse createAltaRegistroEfirmaResponse() {
        return new AltaRegistroEfirmaResponse();
    }

    /**
     * Create an instance of {@link AnularCitaInternet }
     * 
     */
    public AnularCitaInternet createAnularCitaInternet() {
        return new AnularCitaInternet();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.AnularCitaInternetResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.AnularCitaInternetResponse createAnularCitaInternetResponse() {
        return new es.greenaall.gos.gf.ws.AnularCitaInternetResponse();
    }

    /**
     * Create an instance of {@link ObtenerAutoliquidacionInternet }
     * 
     */
    public ObtenerAutoliquidacionInternet createObtenerAutoliquidacionInternet() {
        return new ObtenerAutoliquidacionInternet();
    }

    /**
     * Create an instance of {@link ObtenerAutoliquidacionInternetResponse }
     * 
     */
    public ObtenerAutoliquidacionInternetResponse createObtenerAutoliquidacionInternetResponse() {
        return new ObtenerAutoliquidacionInternetResponse();
    }

    /**
     * Create an instance of {@link ConsultaAplicacionMen }
     * 
     */
    public ConsultaAplicacionMen createConsultaAplicacionMen() {
        return new ConsultaAplicacionMen();
    }

    /**
     * Create an instance of {@link ConsultaAplicacionMenResponse }
     * 
     */
    public ConsultaAplicacionMenResponse createConsultaAplicacionMenResponse() {
        return new ConsultaAplicacionMenResponse();
    }

    /**
     * Create an instance of {@link ConsultaArchivo }
     * 
     */
    public ConsultaArchivo createConsultaArchivo() {
        return new ConsultaArchivo();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaArchivoResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaArchivoResponse createConsultaArchivoResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaArchivoResponse();
    }

    /**
     * Create an instance of {@link ConsultaAutoliquidacionInternet }
     * 
     */
    public ConsultaAutoliquidacionInternet createConsultaAutoliquidacionInternet() {
        return new ConsultaAutoliquidacionInternet();
    }

    /**
     * Create an instance of {@link ConsultaAutoliquidacionInternetResponse }
     * 
     */
    public ConsultaAutoliquidacionInternetResponse createConsultaAutoliquidacionInternetResponse() {
        return new ConsultaAutoliquidacionInternetResponse();
    }

    /**
     * Create an instance of {@link ConsultaAutoLiquidacion }
     * 
     */
    public ConsultaAutoLiquidacion createConsultaAutoLiquidacion() {
        return new ConsultaAutoLiquidacion();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaAutoLiquidacionResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaAutoLiquidacionResponse createConsultaAutoLiquidacionResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaAutoLiquidacionResponse();
    }

    /**
     * Create an instance of {@link DameCentrosHorario }
     * 
     */
    public DameCentrosHorario createDameCentrosHorario() {
        return new DameCentrosHorario();
    }

    /**
     * Create an instance of {@link DameCentrosHorarioResponse }
     * 
     */
    public DameCentrosHorarioResponse createDameCentrosHorarioResponse() {
        return new DameCentrosHorarioResponse();
    }

    /**
     * Create an instance of {@link DameCentrosCita }
     * 
     */
    public DameCentrosCita createDameCentrosCita() {
        return new DameCentrosCita();
    }

    /**
     * Create an instance of {@link DameCentrosCitaResponse }
     * 
     */
    public DameCentrosCitaResponse createDameCentrosCitaResponse() {
        return new DameCentrosCitaResponse();
    }

    /**
     * Create an instance of {@link ConsultaCitaInternet }
     * 
     */
    public ConsultaCitaInternet createConsultaCitaInternet() {
        return new ConsultaCitaInternet();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaCitaInternetResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaCitaInternetResponse createConsultaCitaInternetResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaCitaInternetResponse();
    }

    /**
     * Create an instance of {@link ConsultaExpediente }
     * 
     */
    public ConsultaExpediente createConsultaExpediente() {
        return new ConsultaExpediente();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaExpedienteResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaExpedienteResponse createConsultaExpedienteResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaExpedienteResponse();
    }

    /**
     * Create an instance of {@link ConsultaFacturas }
     * 
     */
    public ConsultaFacturas createConsultaFacturas() {
        return new ConsultaFacturas();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaFacturasResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaFacturasResponse createConsultaFacturasResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaFacturasResponse();
    }

    /**
     * Create an instance of {@link ConsultaFestivos }
     * 
     */
    public ConsultaFestivos createConsultaFestivos() {
        return new ConsultaFestivos();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaFestivosResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaFestivosResponse createConsultaFestivosResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaFestivosResponse();
    }

    /**
     * Create an instance of {@link ConsultaInfracciones }
     * 
     */
    public ConsultaInfracciones createConsultaInfracciones() {
        return new ConsultaInfracciones();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaInfraccionesResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaInfraccionesResponse createConsultaInfraccionesResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaInfraccionesResponse();
    }

    /**
     * Create an instance of {@link ConsultaJusGastosMen }
     * 
     */
    public ConsultaJusGastosMen createConsultaJusGastosMen() {
        return new ConsultaJusGastosMen();
    }

    /**
     * Create an instance of {@link ConsultaJusGastosMenResponse }
     * 
     */
    public ConsultaJusGastosMenResponse createConsultaJusGastosMenResponse() {
        return new ConsultaJusGastosMenResponse();
    }

    /**
     * Create an instance of {@link ConsultaLiquidaciones }
     * 
     */
    public ConsultaLiquidaciones createConsultaLiquidaciones() {
        return new ConsultaLiquidaciones();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaLiquidacionesResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaLiquidacionesResponse createConsultaLiquidacionesResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaLiquidacionesResponse();
    }

    /**
     * Create an instance of {@link ConsultaModalidadProcedimientos }
     * 
     */
    public ConsultaModalidadProcedimientos createConsultaModalidadProcedimientos() {
        return new ConsultaModalidadProcedimientos();
    }

    /**
     * Create an instance of {@link ConsultaModalidadProcedimientosResponse }
     * 
     */
    public ConsultaModalidadProcedimientosResponse createConsultaModalidadProcedimientosResponse() {
        return new ConsultaModalidadProcedimientosResponse();
    }

    /**
     * Create an instance of {@link ConsultaMetadatosGrupoAtrib }
     * 
     */
    public ConsultaMetadatosGrupoAtrib createConsultaMetadatosGrupoAtrib() {
        return new ConsultaMetadatosGrupoAtrib();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaMetadatosGrupoAtribResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaMetadatosGrupoAtribResponse createConsultaMetadatosGrupoAtribResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaMetadatosGrupoAtribResponse();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaMetadatosResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaMetadatosResponse createConsultaMetadatosResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaMetadatosResponse();
    }

    /**
     * Create an instance of {@link ConsultaMetadatosResponseResponse }
     * 
     */
    public ConsultaMetadatosResponseResponse createConsultaMetadatosResponseResponse() {
        return new ConsultaMetadatosResponseResponse();
    }

    /**
     * Create an instance of {@link ConsultaNotificaciones }
     * 
     */
    public ConsultaNotificaciones createConsultaNotificaciones() {
        return new ConsultaNotificaciones();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaNotificacionesResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaNotificacionesResponse createConsultaNotificacionesResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaNotificacionesResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboAgua }
     * 
     */
    public ConsultaReciboAgua createConsultaReciboAgua() {
        return new ConsultaReciboAgua();
    }

    /**
     * Create an instance of {@link ConsultaReciboAguaResponse }
     * 
     */
    public ConsultaReciboAguaResponse createConsultaReciboAguaResponse() {
        return new ConsultaReciboAguaResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboCementerio }
     * 
     */
    public ConsultaReciboCementerio createConsultaReciboCementerio() {
        return new ConsultaReciboCementerio();
    }

    /**
     * Create an instance of {@link ConsultaReciboCementerioResponse }
     * 
     */
    public ConsultaReciboCementerioResponse createConsultaReciboCementerioResponse() {
        return new ConsultaReciboCementerioResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboIae }
     * 
     */
    public ConsultaReciboIae createConsultaReciboIae() {
        return new ConsultaReciboIae();
    }

    /**
     * Create an instance of {@link ConsultaReciboIaeResponse }
     * 
     */
    public ConsultaReciboIaeResponse createConsultaReciboIaeResponse() {
        return new ConsultaReciboIaeResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboIcio }
     * 
     */
    public ConsultaReciboIcio createConsultaReciboIcio() {
        return new ConsultaReciboIcio();
    }

    /**
     * Create an instance of {@link ConsultaReciboIcioResponse }
     * 
     */
    public ConsultaReciboIcioResponse createConsultaReciboIcioResponse() {
        return new ConsultaReciboIcioResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboLpo }
     * 
     */
    public ConsultaReciboLpo createConsultaReciboLpo() {
        return new ConsultaReciboLpo();
    }

    /**
     * Create an instance of {@link ConsultaReciboLpoResponse }
     * 
     */
    public ConsultaReciboLpoResponse createConsultaReciboLpoResponse() {
        return new ConsultaReciboLpoResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetoMd }
     * 
     */
    public ConsultaObjetoMd createConsultaObjetoMd() {
        return new ConsultaObjetoMd();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaObjetoMdResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaObjetoMdResponse createConsultaObjetoMdResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaObjetoMdResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboMulta }
     * 
     */
    public ConsultaReciboMulta createConsultaReciboMulta() {
        return new ConsultaReciboMulta();
    }

    /**
     * Create an instance of {@link ConsultaReciboMultaResponse }
     * 
     */
    public ConsultaReciboMultaResponse createConsultaReciboMultaResponse() {
        return new ConsultaReciboMultaResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboPlus }
     * 
     */
    public ConsultaReciboPlus createConsultaReciboPlus() {
        return new ConsultaReciboPlus();
    }

    /**
     * Create an instance of {@link ConsultaReciboPlusResponse }
     * 
     */
    public ConsultaReciboPlusResponse createConsultaReciboPlusResponse() {
        return new ConsultaReciboPlusResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboPlusvalia }
     * 
     */
    public ConsultaReciboPlusvalia createConsultaReciboPlusvalia() {
        return new ConsultaReciboPlusvalia();
    }

    /**
     * Create an instance of {@link ConsultaReciboPlusvaliaResponse }
     * 
     */
    public ConsultaReciboPlusvaliaResponse createConsultaReciboPlusvaliaResponse() {
        return new ConsultaReciboPlusvaliaResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboRustica }
     * 
     */
    public ConsultaReciboRustica createConsultaReciboRustica() {
        return new ConsultaReciboRustica();
    }

    /**
     * Create an instance of {@link ConsultaReciboRusticaResponse }
     * 
     */
    public ConsultaReciboRusticaResponse createConsultaReciboRusticaResponse() {
        return new ConsultaReciboRusticaResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboUrbana }
     * 
     */
    public ConsultaReciboUrbana createConsultaReciboUrbana() {
        return new ConsultaReciboUrbana();
    }

    /**
     * Create an instance of {@link ConsultaReciboUrbanaResponse }
     * 
     */
    public ConsultaReciboUrbanaResponse createConsultaReciboUrbanaResponse() {
        return new ConsultaReciboUrbanaResponse();
    }

    /**
     * Create an instance of {@link ConsultaReciboVehiculo }
     * 
     */
    public ConsultaReciboVehiculo createConsultaReciboVehiculo() {
        return new ConsultaReciboVehiculo();
    }

    /**
     * Create an instance of {@link ConsultaReciboVehiculoResponse }
     * 
     */
    public ConsultaReciboVehiculoResponse createConsultaReciboVehiculoResponse() {
        return new ConsultaReciboVehiculoResponse();
    }

    /**
     * Create an instance of {@link ConsultaObjetosTributarios }
     * 
     */
    public ConsultaObjetosTributarios createConsultaObjetosTributarios() {
        return new ConsultaObjetosTributarios();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaObjetosTributariosResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaObjetosTributariosResponse createConsultaObjetosTributariosResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaObjetosTributariosResponse();
    }

    /**
     * Create an instance of {@link ConsultaOperacionMen }
     * 
     */
    public ConsultaOperacionMen createConsultaOperacionMen() {
        return new ConsultaOperacionMen();
    }

    /**
     * Create an instance of {@link ConsultaOperacionMenResponse }
     * 
     */
    public ConsultaOperacionMenResponse createConsultaOperacionMenResponse() {
        return new ConsultaOperacionMenResponse();
    }

    /**
     * Create an instance of {@link ConsultaOrdenazaFiscal }
     * 
     */
    public ConsultaOrdenazaFiscal createConsultaOrdenazaFiscal() {
        return new ConsultaOrdenazaFiscal();
    }

    /**
     * Create an instance of {@link ConsultaOrdenazaFiscalResponse }
     * 
     */
    public ConsultaOrdenazaFiscalResponse createConsultaOrdenazaFiscalResponse() {
        return new ConsultaOrdenazaFiscalResponse();
    }

    /**
     * Create an instance of {@link ConsultaProcedimientos }
     * 
     */
    public ConsultaProcedimientos createConsultaProcedimientos() {
        return new ConsultaProcedimientos();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaProcedimientosResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaProcedimientosResponse createConsultaProcedimientosResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaProcedimientosResponse();
    }

    /**
     * Create an instance of {@link ConsultaRecibos }
     * 
     */
    public ConsultaRecibos createConsultaRecibos() {
        return new ConsultaRecibos();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaRecibosResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaRecibosResponse createConsultaRecibosResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaRecibosResponse();
    }

    /**
     * Create an instance of {@link ConsultaTerritorio }
     * 
     */
    public ConsultaTerritorio createConsultaTerritorio() {
        return new ConsultaTerritorio();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaTerritorioResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaTerritorioResponse createConsultaTerritorioResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaTerritorioResponse();
    }

    /**
     * Create an instance of {@link ConsultaTiposObjetosTributarios }
     * 
     */
    public ConsultaTiposObjetosTributarios createConsultaTiposObjetosTributarios() {
        return new ConsultaTiposObjetosTributarios();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaTiposObjetosTributariosResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaTiposObjetosTributariosResponse createConsultaTiposObjetosTributariosResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaTiposObjetosTributariosResponse();
    }

    /**
     * Create an instance of {@link ConsultaTramitacion }
     * 
     */
    public ConsultaTramitacion createConsultaTramitacion() {
        return new ConsultaTramitacion();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaTramitacionResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaTramitacionResponse createConsultaTramitacionResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaTramitacionResponse();
    }

    /**
     * Create an instance of {@link ConsultaVehiculos }
     * 
     */
    public ConsultaVehiculos createConsultaVehiculos() {
        return new ConsultaVehiculos();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ConsultaVehiculosResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ConsultaVehiculosResponse createConsultaVehiculosResponse() {
        return new es.greenaall.gos.gf.ws.ConsultaVehiculosResponse();
    }

    /**
     * Create an instance of {@link DescargarArchivo }
     * 
     */
    public DescargarArchivo createDescargarArchivo() {
        return new DescargarArchivo();
    }

    /**
     * Create an instance of {@link DescargarArchivoResponse }
     * 
     */
    public DescargarArchivoResponse createDescargarArchivoResponse() {
        return new DescargarArchivoResponse();
    }

    /**
     * Create an instance of {@link DesconexionAutoLiquidaciones }
     * 
     */
    public DesconexionAutoLiquidaciones createDesconexionAutoLiquidaciones() {
        return new DesconexionAutoLiquidaciones();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.DesconexionAutoLiquidacionesResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.DesconexionAutoLiquidacionesResponse createDesconexionAutoLiquidacionesResponse() {
        return new es.greenaall.gos.gf.ws.DesconexionAutoLiquidacionesResponse();
    }

    /**
     * Create an instance of {@link EnvioCorreo }
     * 
     */
    public EnvioCorreo createEnvioCorreo() {
        return new EnvioCorreo();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.EnvioCorreoResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.EnvioCorreoResponse createEnvioCorreoResponse() {
        return new es.greenaall.gos.gf.ws.EnvioCorreoResponse();
    }

    /**
     * Create an instance of {@link GenerarTEU }
     * 
     */
    public GenerarTEU createGenerarTEU() {
        return new GenerarTEU();
    }

    /**
     * Create an instance of {@link GenerarTEUResponse }
     * 
     */
    public GenerarTEUResponse createGenerarTEUResponse() {
        return new GenerarTEUResponse();
    }

    /**
     * Create an instance of {@link ValidarAgentePolicia }
     * 
     */
    public ValidarAgentePolicia createValidarAgentePolicia() {
        return new ValidarAgentePolicia();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ValidarAgentePoliciaResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ValidarAgentePoliciaResponse createValidarAgentePoliciaResponse() {
        return new es.greenaall.gos.gf.ws.ValidarAgentePoliciaResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuarioGos }
     * 
     */
    public ValidarUsuarioGos createValidarUsuarioGos() {
        return new ValidarUsuarioGos();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.ValidarUsuarioGosResponse }
     * 
     */
    public es.greenaall.gos.gf.ws.ValidarUsuarioGosResponse createValidarUsuarioGosResponse() {
        return new es.greenaall.gos.gf.ws.ValidarUsuarioGosResponse();
    }

    /**
     * Create an instance of {@link AltaTributoGUI }
     * 
     */
    public AltaTributoGUI createAltaTributoGUI() {
        return new AltaTributoGUI();
    }

    /**
     * Create an instance of {@link AltaTributoGUIResponse }
     * 
     */
    public AltaTributoGUIResponse createAltaTributoGUIResponse() {
        return new AltaTributoGUIResponse();
    }

    /**
     * Create an instance of {@link ConsultarLiquidacionesTributosGUI }
     * 
     */
    public ConsultarLiquidacionesTributosGUI createConsultarLiquidacionesTributosGUI() {
        return new ConsultarLiquidacionesTributosGUI();
    }

    /**
     * Create an instance of {@link ConsultarLiquidacionesTributosGUIResponse }
     * 
     */
    public ConsultarLiquidacionesTributosGUIResponse createConsultarLiquidacionesTributosGUIResponse() {
        return new ConsultarLiquidacionesTributosGUIResponse();
    }

    /**
     * Create an instance of {@link ConsultarTributosGUI }
     * 
     */
    public ConsultarTributosGUI createConsultarTributosGUI() {
        return new ConsultarTributosGUI();
    }

    /**
     * Create an instance of {@link ConsultarTributosGUIResponse }
     * 
     */
    public ConsultarTributosGUIResponse createConsultarTributosGUIResponse() {
        return new ConsultarTributosGUIResponse();
    }

    /**
     * Create an instance of {@link es.greenaall.gos.gf.ws.CtrError }
     * 
     */
    public es.greenaall.gos.gf.ws.CtrError createCtrError() {
        return new es.greenaall.gos.gf.ws.CtrError();
    }

    /**
     * Create an instance of {@link DameParametroSistema }
     * 
     */
    public DameParametroSistema createDameParametroSistema() {
        return new DameParametroSistema();
    }

    /**
     * Create an instance of {@link DameParametroSistemaResponse }
     * 
     */
    public DameParametroSistemaResponse createDameParametroSistemaResponse() {
        return new DameParametroSistemaResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.rmi.xsd.RemoteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link java.rmi.xsd.RemoteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "RemoteException", scope = es.greenaall.gos.gf.ws.RemoteException.class)
    public JAXBElement<java.rmi.xsd.RemoteException> createRemoteExceptionRemoteException(java.rmi.xsd.RemoteException value) {
        return new JAXBElement<java.rmi.xsd.RemoteException>(_RemoteExceptionRemoteException_QNAME, java.rmi.xsd.RemoteException.class, es.greenaall.gos.gf.ws.RemoteException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaActualizacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaActualizacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ActualizarEstadoDocumento.class)
    public JAXBElement<RespuestaActualizacionRequest> createActualizarEstadoDocumentoRequest(RespuestaActualizacionRequest value) {
        return new JAXBElement<RespuestaActualizacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, RespuestaActualizacionRequest.class, ActualizarEstadoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaActualizacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaActualizacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ActualizarEstadoDocumentoResponse.class)
    public JAXBElement<RespuestaActualizacion> createActualizarEstadoDocumentoResponseReturn(RespuestaActualizacion value) {
        return new JAXBElement<RespuestaActualizacion>(_ActualizarEstadoDocumentoResponseReturn_QNAME, RespuestaActualizacion.class, ActualizarEstadoDocumentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarArchivoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarArchivoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaArchivo.class)
    public JAXBElement<GenerarArchivoRequest> createAltaArchivoRequest(GenerarArchivoRequest value) {
        return new JAXBElement<GenerarArchivoRequest>(_ActualizarEstadoDocumentoRequest_QNAME, GenerarArchivoRequest.class, AltaArchivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchivoOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArchivoOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaArchivoResponse.class)
    public JAXBElement<ArchivoOut> createAltaArchivoResponseReturn(ArchivoOut value) {
        return new JAXBElement<ArchivoOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ArchivoOut.class, AltaArchivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoliquidacionesInternetRecaudacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoliquidacionesInternetRecaudacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ActualizarAutoliquidacionInternet.class)
    public JAXBElement<AutoliquidacionesInternetRecaudacionRequest> createActualizarAutoliquidacionInternetRequest(AutoliquidacionesInternetRecaudacionRequest value) {
        return new JAXBElement<AutoliquidacionesInternetRecaudacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AutoliquidacionesInternetRecaudacionRequest.class, ActualizarAutoliquidacionInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ActualizarAutoliquidacionInternetResponse.class)
    public JAXBElement<AutoliquidacionInternetOut> createActualizarAutoliquidacionInternetResponseReturn(AutoliquidacionInternetOut value) {
        return new JAXBElement<AutoliquidacionInternetOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, AutoliquidacionInternetOut.class, ActualizarAutoliquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoliquidacionesInternetRecaudacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoliquidacionesInternetRecaudacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaAutoliquidacionInternet.class)
    public JAXBElement<AutoliquidacionesInternetRecaudacionRequest> createAltaAutoliquidacionInternetRequest(AutoliquidacionesInternetRecaudacionRequest value) {
        return new JAXBElement<AutoliquidacionesInternetRecaudacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AutoliquidacionesInternetRecaudacionRequest.class, AltaAutoliquidacionInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaAutoliquidacionInternetResponse.class)
    public JAXBElement<AutoliquidacionInternetOut> createAltaAutoliquidacionInternetResponseReturn(AutoliquidacionInternetOut value) {
        return new JAXBElement<AutoliquidacionInternetOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, AutoliquidacionInternetOut.class, AltaAutoliquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoliquidacionesInternetRecaudacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoliquidacionesInternetRecaudacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = BorrarAutoliquidacionInternet.class)
    public JAXBElement<AutoliquidacionesInternetRecaudacionRequest> createBorrarAutoliquidacionInternetRequest(AutoliquidacionesInternetRecaudacionRequest value) {
        return new JAXBElement<AutoliquidacionesInternetRecaudacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AutoliquidacionesInternetRecaudacionRequest.class, BorrarAutoliquidacionInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = BorrarAutoliquidacionInternetResponse.class)
    public JAXBElement<AutoliquidacionInternetOut> createBorrarAutoliquidacionInternetResponseReturn(AutoliquidacionInternetOut value) {
        return new JAXBElement<AutoliquidacionInternetOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, AutoliquidacionInternetOut.class, BorrarAutoliquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoliquidacionInternetRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AutoliquidacionInternet.class)
    public JAXBElement<AutoliquidacionInternetRequest> createAutoliquidacionInternetRequest(AutoliquidacionInternetRequest value) {
        return new JAXBElement<AutoliquidacionInternetRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AutoliquidacionInternetRequest.class, AutoliquidacionInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularImporteAutoliquidacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularImporteAutoliquidacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AutoliquidacionInternetResponse.class)
    public JAXBElement<CalcularImporteAutoliquidacionResponse> createAutoliquidacionInternetResponseReturn(CalcularImporteAutoliquidacionResponse value) {
        return new JAXBElement<CalcularImporteAutoliquidacionResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, CalcularImporteAutoliquidacionResponse.class, AutoliquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarNotificacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarNotificacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaNotificacion.class)
    public JAXBElement<GenerarNotificacionRequest> createAltaNotificacionRequest(GenerarNotificacionRequest value) {
        return new JAXBElement<GenerarNotificacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, GenerarNotificacionRequest.class, AltaNotificacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificacionOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificacionOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaNotificacionResponse.class)
    public JAXBElement<NotificacionOut> createAltaNotificacionResponseReturn(NotificacionOut value) {
        return new JAXBElement<NotificacionOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, NotificacionOut.class, AltaNotificacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarObjetoTributarioMdRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarObjetoTributarioMdRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaObjetoTributarioMd.class)
    public JAXBElement<GenerarObjetoTributarioMdRequest> createAltaObjetoTributarioMdRequest(GenerarObjetoTributarioMdRequest value) {
        return new JAXBElement<GenerarObjetoTributarioMdRequest>(_ActualizarEstadoDocumentoRequest_QNAME, GenerarObjetoTributarioMdRequest.class, AltaObjetoTributarioMd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioMdOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioMdOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaObjetoTributarioMdResponse.class)
    public JAXBElement<ObjetoTributarioMdOut> createAltaObjetoTributarioMdResponseReturn(ObjetoTributarioMdOut value) {
        return new JAXBElement<ObjetoTributarioMdOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ObjetoTributarioMdOut.class, AltaObjetoTributarioMdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarObjetoTributarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarObjetoTributarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaObjetoTributario.class)
    public JAXBElement<GenerarObjetoTributarioRequest> createAltaObjetoTributarioRequest(GenerarObjetoTributarioRequest value) {
        return new JAXBElement<GenerarObjetoTributarioRequest>(_ActualizarEstadoDocumentoRequest_QNAME, GenerarObjetoTributarioRequest.class, AltaObjetoTributario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaObjetoTributarioResponse.class)
    public JAXBElement<ObjetoTributarioOut> createAltaObjetoTributarioResponseReturn(ObjetoTributarioOut value) {
        return new JAXBElement<ObjetoTributarioOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ObjetoTributarioOut.class, AltaObjetoTributarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarReciboRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarReciboRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaRecibo.class)
    public JAXBElement<GenerarReciboRequest> createAltaReciboRequest(GenerarReciboRequest value) {
        return new JAXBElement<GenerarReciboRequest>(_ActualizarEstadoDocumentoRequest_QNAME, GenerarReciboRequest.class, AltaRecibo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReciboOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReciboOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaReciboResponse.class)
    public JAXBElement<ReciboOut> createAltaReciboResponseReturn(ReciboOut value) {
        return new JAXBElement<ReciboOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ReciboOut.class, AltaReciboResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarVehiculoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarVehiculoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaVehiculo.class)
    public JAXBElement<GenerarVehiculoRequest> createAltaVehiculoRequest(GenerarVehiculoRequest value) {
        return new JAXBElement<GenerarVehiculoRequest>(_ActualizarEstadoDocumentoRequest_QNAME, GenerarVehiculoRequest.class, AltaVehiculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiculoOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiculoOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaVehiculoResponse.class)
    public JAXBElement<VehiculoOut> createAltaVehiculoResponseReturn(VehiculoOut value) {
        return new JAXBElement<VehiculoOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, VehiculoOut.class, AltaVehiculoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarVolanteRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarVolanteRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaVolante.class)
    public JAXBElement<GenerarVolanteRequest> createAltaVolanteRequest(GenerarVolanteRequest value) {
        return new JAXBElement<GenerarVolanteRequest>(_ActualizarEstadoDocumentoRequest_QNAME, GenerarVolanteRequest.class, AltaVolante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolanteOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolanteOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaVolanteResponse.class)
    public JAXBElement<VolanteOut> createAltaVolanteResponseReturn(VolanteOut value) {
        return new JAXBElement<VolanteOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, VolanteOut.class, AltaVolanteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarVolanteImagenRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarVolanteImagenRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaVolanteImagen.class)
    public JAXBElement<GenerarVolanteImagenRequest> createAltaVolanteImagenRequest(GenerarVolanteImagenRequest value) {
        return new JAXBElement<GenerarVolanteImagenRequest>(_ActualizarEstadoDocumentoRequest_QNAME, GenerarVolanteImagenRequest.class, AltaVolanteImagen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolanteOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolanteOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaVolanteImagenResponse.class)
    public JAXBElement<VolanteOut> createAltaVolanteImagenResponseReturn(VolanteOut value) {
        return new JAXBElement<VolanteOut>(_ActualizarEstadoDocumentoResponseReturn_QNAME, VolanteOut.class, AltaVolanteImagenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarNotificacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarNotificacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ActualizarNotificacion.class)
    public JAXBElement<ActualizarNotificacionRequest> createActualizarNotificacionRequest(ActualizarNotificacionRequest value) {
        return new JAXBElement<ActualizarNotificacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ActualizarNotificacionRequest.class, ActualizarNotificacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarNotificacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarNotificacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ActualizarNotificacionResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarNotificacionResponse> createActualizarNotificacionResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ActualizarNotificacionResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarNotificacionResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ActualizarNotificacionResponse.class, es.greenaall.gos.gf.ws.ActualizarNotificacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarReciboInternet2Request }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarReciboInternet2Request }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ActualizarReciboInternet2 .class)
    public JAXBElement<ActualizarReciboInternet2Request> createActualizarReciboInternet2Request(ActualizarReciboInternet2Request value) {
        return new JAXBElement<ActualizarReciboInternet2Request>(_ActualizarEstadoDocumentoRequest_QNAME, ActualizarReciboInternet2Request.class, ActualizarReciboInternet2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternet2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternet2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ActualizarReciboInternet2Response.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternet2Response> createActualizarReciboInternet2ResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternet2Response value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternet2Response>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternet2Response.class, es.greenaall.gos.gf.ws.ActualizarReciboInternet2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarReciboInternetRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarReciboInternetRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ActualizarReciboInternet.class)
    public JAXBElement<ActualizarReciboInternetRequest> createActualizarReciboInternetRequest(ActualizarReciboInternetRequest value) {
        return new JAXBElement<ActualizarReciboInternetRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ActualizarReciboInternetRequest.class, ActualizarReciboInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ActualizarReciboInternetResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternetResponse> createActualizarReciboInternetResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternetResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternetResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboInternetResponse.class, es.greenaall.gos.gf.ws.ActualizarReciboInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarReciboRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarReciboRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ActualizarRecibo.class)
    public JAXBElement<ActualizarReciboRequest> createActualizarReciboRequest(ActualizarReciboRequest value) {
        return new JAXBElement<ActualizarReciboRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ActualizarReciboRequest.class, ActualizarRecibo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ActualizarReciboResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse> createActualizarReciboResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse.class, es.greenaall.gos.gf.ws.ActualizarReciboResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarReciboPTRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarReciboPTRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ActualizarReciboPT.class)
    public JAXBElement<ActualizarReciboPTRequest> createActualizarReciboPTRequest(ActualizarReciboPTRequest value) {
        return new JAXBElement<ActualizarReciboPTRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ActualizarReciboPTRequest.class, ActualizarReciboPT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ActualizarReciboPTResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse> createActualizarReciboPTResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ActualizarReciboResponse.class, ActualizarReciboPTResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaCitaInternetRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaCitaInternetRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaCitaInternet.class)
    public JAXBElement<AltaCitaInternetRequest> createAltaCitaInternetRequest(AltaCitaInternetRequest value) {
        return new JAXBElement<AltaCitaInternetRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AltaCitaInternetRequest.class, AltaCitaInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaCitaInternetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaCitaInternetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.AltaCitaInternetResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaCitaInternetResponse> createAltaCitaInternetResponseReturn(es.greenaall.gos.gf.ws.response.xsd.AltaCitaInternetResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaCitaInternetResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.AltaCitaInternetResponse.class, es.greenaall.gos.gf.ws.AltaCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CobroContabilidadRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CobroContabilidadRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaCobroContabilidad.class)
    public JAXBElement<CobroContabilidadRequest> createAltaCobroContabilidadRequest(CobroContabilidadRequest value) {
        return new JAXBElement<CobroContabilidadRequest>(_ActualizarEstadoDocumentoRequest_QNAME, CobroContabilidadRequest.class, AltaCobroContabilidad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.AltaCobroContabilidadResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse> createAltaCobroContabilidadResponseReturn(es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.AltaCobroContabilidadResponse.class, es.greenaall.gos.gf.ws.AltaCobroContabilidadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaRegistroRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaRegistroRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaRegistro.class)
    public JAXBElement<AltaRegistroRequest> createAltaRegistroRequest(AltaRegistroRequest value) {
        return new JAXBElement<AltaRegistroRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AltaRegistroRequest.class, AltaRegistro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.AltaRegistroResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse> createAltaRegistroResponseReturn(es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse.class, es.greenaall.gos.gf.ws.AltaRegistroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaRegistroRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaRegistroRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AltaRegistroEfirma.class)
    public JAXBElement<AltaRegistroRequest> createAltaRegistroEfirmaRequest(AltaRegistroRequest value) {
        return new JAXBElement<AltaRegistroRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AltaRegistroRequest.class, AltaRegistroEfirma.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaRegistroEfirmaResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse> createAltaRegistroEfirmaResponseReturn(es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.AltaRegistroResponse.class, AltaRegistroEfirmaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularCitaInternetRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnularCitaInternetRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = AnularCitaInternet.class)
    public JAXBElement<AnularCitaInternetRequest> createAnularCitaInternetRequest(AnularCitaInternetRequest value) {
        return new JAXBElement<AnularCitaInternetRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AnularCitaInternetRequest.class, AnularCitaInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AnularCitaInternetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.AnularCitaInternetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.AnularCitaInternetResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AnularCitaInternetResponse> createAnularCitaInternetResponseReturn(es.greenaall.gos.gf.ws.response.xsd.AnularCitaInternetResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.AnularCitaInternetResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.AnularCitaInternetResponse.class, es.greenaall.gos.gf.ws.AnularCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoLiquidacionInternetHRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoLiquidacionInternetHRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ObtenerAutoliquidacionInternet.class)
    public JAXBElement<AutoLiquidacionInternetHRequest> createObtenerAutoliquidacionInternetRequest(AutoLiquidacionInternetHRequest value) {
        return new JAXBElement<AutoLiquidacionInternetHRequest>(_ActualizarEstadoDocumentoRequest_QNAME, AutoLiquidacionInternetHRequest.class, ObtenerAutoliquidacionInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoLiquidacionInternetHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutoLiquidacionInternetHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ObtenerAutoliquidacionInternetResponse.class)
    public JAXBElement<AutoLiquidacionInternetHResponse> createObtenerAutoliquidacionInternetResponseReturn(AutoLiquidacionInternetHResponse value) {
        return new JAXBElement<AutoLiquidacionInternetHResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, AutoLiquidacionInternetHResponse.class, ObtenerAutoliquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaAplicacionesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaAplicacionesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaAplicacionMen.class)
    public JAXBElement<ConsultaAplicacionesRequest> createConsultaAplicacionMenRequest(ConsultaAplicacionesRequest value) {
        return new JAXBElement<ConsultaAplicacionesRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaAplicacionesRequest.class, ConsultaAplicacionMen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaAplicacionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaAplicacionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaAplicacionMenResponse.class)
    public JAXBElement<ConsultaAplicacionesResponse> createConsultaAplicacionMenResponseReturn(ConsultaAplicacionesResponse value) {
        return new JAXBElement<ConsultaAplicacionesResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaAplicacionesResponse.class, ConsultaAplicacionMenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaArchivoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaArchivoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaArchivo.class)
    public JAXBElement<ConsultaArchivoRequest> createConsultaArchivoRequest(ConsultaArchivoRequest value) {
        return new JAXBElement<ConsultaArchivoRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaArchivoRequest.class, ConsultaArchivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaArchivoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaArchivoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaArchivoResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaArchivoResponse> createConsultaArchivoResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaArchivoResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaArchivoResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaArchivoResponse.class, es.greenaall.gos.gf.ws.ConsultaArchivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaAutoLiquidacionInternetRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaAutoLiquidacionInternetRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaAutoliquidacionInternet.class)
    public JAXBElement<ConsultaAutoLiquidacionInternetRequest> createConsultaAutoliquidacionInternetRequest(ConsultaAutoLiquidacionInternetRequest value) {
        return new JAXBElement<ConsultaAutoLiquidacionInternetRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaAutoLiquidacionInternetRequest.class, ConsultaAutoliquidacionInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaAutoLiquidacionInternetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaAutoLiquidacionInternetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaAutoliquidacionInternetResponse.class)
    public JAXBElement<ConsultaAutoLiquidacionInternetResponse> createConsultaAutoliquidacionInternetResponseReturn(ConsultaAutoLiquidacionInternetResponse value) {
        return new JAXBElement<ConsultaAutoLiquidacionInternetResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaAutoLiquidacionInternetResponse.class, ConsultaAutoliquidacionInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaAutoLiquidacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaAutoLiquidacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaAutoLiquidacion.class)
    public JAXBElement<ConsultaAutoLiquidacionRequest> createConsultaAutoLiquidacionRequest(ConsultaAutoLiquidacionRequest value) {
        return new JAXBElement<ConsultaAutoLiquidacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaAutoLiquidacionRequest.class, ConsultaAutoLiquidacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaAutoLiquidacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaAutoLiquidacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaAutoLiquidacionResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaAutoLiquidacionResponse> createConsultaAutoLiquidacionResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaAutoLiquidacionResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaAutoLiquidacionResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaAutoLiquidacionResponse.class, es.greenaall.gos.gf.ws.ConsultaAutoLiquidacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCentrosHorarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaCentrosHorarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = DameCentrosHorario.class)
    public JAXBElement<ConsultaCentrosHorarioRequest> createDameCentrosHorarioRequest(ConsultaCentrosHorarioRequest value) {
        return new JAXBElement<ConsultaCentrosHorarioRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaCentrosHorarioRequest.class, DameCentrosHorario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCentrosHorarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaCentrosHorarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = DameCentrosHorarioResponse.class)
    public JAXBElement<ConsultaCentrosHorarioResponse> createDameCentrosHorarioResponseReturn(ConsultaCentrosHorarioResponse value) {
        return new JAXBElement<ConsultaCentrosHorarioResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaCentrosHorarioResponse.class, DameCentrosHorarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCentrosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaCentrosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = DameCentrosCita.class)
    public JAXBElement<ConsultaCentrosRequest> createDameCentrosCitaRequest(ConsultaCentrosRequest value) {
        return new JAXBElement<ConsultaCentrosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaCentrosRequest.class, DameCentrosCita.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCentrosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaCentrosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = DameCentrosCitaResponse.class)
    public JAXBElement<ConsultaCentrosResponse> createDameCentrosCitaResponseReturn(ConsultaCentrosResponse value) {
        return new JAXBElement<ConsultaCentrosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaCentrosResponse.class, DameCentrosCitaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCitaInternetRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaCitaInternetRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaCitaInternet.class)
    public JAXBElement<ConsultaCitaInternetRequest> createConsultaCitaInternetRequest(ConsultaCitaInternetRequest value) {
        return new JAXBElement<ConsultaCitaInternetRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaCitaInternetRequest.class, ConsultaCitaInternet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaCitaInternetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaCitaInternetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaCitaInternetResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaCitaInternetResponse> createConsultaCitaInternetResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaCitaInternetResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaCitaInternetResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaCitaInternetResponse.class, es.greenaall.gos.gf.ws.ConsultaCitaInternetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaTramitacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaTramitacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaExpediente.class)
    public JAXBElement<ConsultaTramitacionRequest> createConsultaExpedienteRequest(ConsultaTramitacionRequest value) {
        return new JAXBElement<ConsultaTramitacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaTramitacionRequest.class, ConsultaExpediente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaExpedienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaExpedienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaExpedienteResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaExpedienteResponse> createConsultaExpedienteResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaExpedienteResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaExpedienteResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaExpedienteResponse.class, es.greenaall.gos.gf.ws.ConsultaExpedienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFacturaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaFacturaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaFacturas.class)
    public JAXBElement<ConsultaFacturaRequest> createConsultaFacturasRequest(ConsultaFacturaRequest value) {
        return new JAXBElement<ConsultaFacturaRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaFacturaRequest.class, ConsultaFacturas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaFacturasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaFacturasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaFacturasResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaFacturasResponse> createConsultaFacturasResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaFacturasResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaFacturasResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaFacturasResponse.class, es.greenaall.gos.gf.ws.ConsultaFacturasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFestivosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaFestivosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaFestivos.class)
    public JAXBElement<ConsultaFestivosRequest> createConsultaFestivosRequest(ConsultaFestivosRequest value) {
        return new JAXBElement<ConsultaFestivosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaFestivosRequest.class, ConsultaFestivos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaFestivosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaFestivosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaFestivosResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaFestivosResponse> createConsultaFestivosResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaFestivosResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaFestivosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaFestivosResponse.class, es.greenaall.gos.gf.ws.ConsultaFestivosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaInfraccionesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaInfraccionesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaInfracciones.class)
    public JAXBElement<ConsultaInfraccionesRequest> createConsultaInfraccionesRequest(ConsultaInfraccionesRequest value) {
        return new JAXBElement<ConsultaInfraccionesRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaInfraccionesRequest.class, ConsultaInfracciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaInfraccionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaInfraccionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaInfraccionesResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaInfraccionesResponse> createConsultaInfraccionesResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaInfraccionesResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaInfraccionesResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaInfraccionesResponse.class, es.greenaall.gos.gf.ws.ConsultaInfraccionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaJustificantesGastosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaJustificantesGastosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaJusGastosMen.class)
    public JAXBElement<ConsultaJustificantesGastosRequest> createConsultaJusGastosMenRequest(ConsultaJustificantesGastosRequest value) {
        return new JAXBElement<ConsultaJustificantesGastosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaJustificantesGastosRequest.class, ConsultaJusGastosMen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaJustificantesGastosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaJustificantesGastosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaJusGastosMenResponse.class)
    public JAXBElement<ConsultaJustificantesGastosResponse> createConsultaJusGastosMenResponseReturn(ConsultaJustificantesGastosResponse value) {
        return new JAXBElement<ConsultaJustificantesGastosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaJustificantesGastosResponse.class, ConsultaJusGastosMenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaLiquidacionesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaLiquidacionesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaLiquidaciones.class)
    public JAXBElement<ConsultaLiquidacionesRequest> createConsultaLiquidacionesRequest(ConsultaLiquidacionesRequest value) {
        return new JAXBElement<ConsultaLiquidacionesRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaLiquidacionesRequest.class, ConsultaLiquidaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaLiquidacionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaLiquidacionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaLiquidacionesResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaLiquidacionesResponse> createConsultaLiquidacionesResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaLiquidacionesResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaLiquidacionesResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaLiquidacionesResponse.class, es.greenaall.gos.gf.ws.ConsultaLiquidacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaModalidadProcedimientosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaModalidadProcedimientosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaModalidadProcedimientos.class)
    public JAXBElement<ConsultaModalidadProcedimientosRequest> createConsultaModalidadProcedimientosRequest(ConsultaModalidadProcedimientosRequest value) {
        return new JAXBElement<ConsultaModalidadProcedimientosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaModalidadProcedimientosRequest.class, ConsultaModalidadProcedimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMateriaProcedimientosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaMateriaProcedimientosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaModalidadProcedimientosResponse.class)
    public JAXBElement<ConsultaMateriaProcedimientosResponse> createConsultaModalidadProcedimientosResponseReturn(ConsultaMateriaProcedimientosResponse value) {
        return new JAXBElement<ConsultaMateriaProcedimientosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaMateriaProcedimientosResponse.class, ConsultaModalidadProcedimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMetadatosGrupoAtribRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaMetadatosGrupoAtribRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaMetadatosGrupoAtrib.class)
    public JAXBElement<ConsultaMetadatosGrupoAtribRequest> createConsultaMetadatosGrupoAtribRequest(ConsultaMetadatosGrupoAtribRequest value) {
        return new JAXBElement<ConsultaMetadatosGrupoAtribRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaMetadatosGrupoAtribRequest.class, ConsultaMetadatosGrupoAtrib.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosGrupoAtribResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosGrupoAtribResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaMetadatosGrupoAtribResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosGrupoAtribResponse> createConsultaMetadatosGrupoAtribResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosGrupoAtribResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosGrupoAtribResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosGrupoAtribResponse.class, es.greenaall.gos.gf.ws.ConsultaMetadatosGrupoAtribResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMetadatosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaMetadatosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = es.greenaall.gos.gf.ws.ConsultaMetadatosResponse.class)
    public JAXBElement<ConsultaMetadatosRequest> createConsultaMetadatosResponseRequest(ConsultaMetadatosRequest value) {
        return new JAXBElement<ConsultaMetadatosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaMetadatosRequest.class, es.greenaall.gos.gf.ws.ConsultaMetadatosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaMetadatosResponseResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosResponse> createConsultaMetadatosResponseResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaMetadatosResponse.class, ConsultaMetadatosResponseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaNotificacionesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaNotificacionesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaNotificaciones.class)
    public JAXBElement<ConsultaNotificacionesRequest> createConsultaNotificacionesRequest(ConsultaNotificacionesRequest value) {
        return new JAXBElement<ConsultaNotificacionesRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaNotificacionesRequest.class, ConsultaNotificaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaNotificacionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaNotificacionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaNotificacionesResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaNotificacionesResponse> createConsultaNotificacionesResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaNotificacionesResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaNotificacionesResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaNotificacionesResponse.class, es.greenaall.gos.gf.ws.ConsultaNotificacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoAguaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoAguaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboAgua.class)
    public JAXBElement<ConsultaObjetoAguaRequest> createConsultaReciboAguaRequest(ConsultaObjetoAguaRequest value) {
        return new JAXBElement<ConsultaObjetoAguaRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoAguaRequest.class, ConsultaReciboAgua.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoAguaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoAguaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboAguaResponse.class)
    public JAXBElement<ConsultaObjetoAguaResponse> createConsultaReciboAguaResponseReturn(ConsultaObjetoAguaResponse value) {
        return new JAXBElement<ConsultaObjetoAguaResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoAguaResponse.class, ConsultaReciboAguaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoCementerioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoCementerioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboCementerio.class)
    public JAXBElement<ConsultaObjetoCementerioRequest> createConsultaReciboCementerioRequest(ConsultaObjetoCementerioRequest value) {
        return new JAXBElement<ConsultaObjetoCementerioRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoCementerioRequest.class, ConsultaReciboCementerio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoCementerioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoCementerioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboCementerioResponse.class)
    public JAXBElement<ConsultaObjetoCementerioResponse> createConsultaReciboCementerioResponseReturn(ConsultaObjetoCementerioResponse value) {
        return new JAXBElement<ConsultaObjetoCementerioResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoCementerioResponse.class, ConsultaReciboCementerioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoIaeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoIaeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboIae.class)
    public JAXBElement<ConsultaObjetoIaeRequest> createConsultaReciboIaeRequest(ConsultaObjetoIaeRequest value) {
        return new JAXBElement<ConsultaObjetoIaeRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoIaeRequest.class, ConsultaReciboIae.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoIaeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoIaeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboIaeResponse.class)
    public JAXBElement<ConsultaObjetoIaeResponse> createConsultaReciboIaeResponseReturn(ConsultaObjetoIaeResponse value) {
        return new JAXBElement<ConsultaObjetoIaeResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoIaeResponse.class, ConsultaReciboIaeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoIcioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoIcioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboIcio.class)
    public JAXBElement<ConsultaObjetoIcioRequest> createConsultaReciboIcioRequest(ConsultaObjetoIcioRequest value) {
        return new JAXBElement<ConsultaObjetoIcioRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoIcioRequest.class, ConsultaReciboIcio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoIcioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoIcioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboIcioResponse.class)
    public JAXBElement<ConsultaObjetoIcioResponse> createConsultaReciboIcioResponseReturn(ConsultaObjetoIcioResponse value) {
        return new JAXBElement<ConsultaObjetoIcioResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoIcioResponse.class, ConsultaReciboIcioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoLpoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoLpoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboLpo.class)
    public JAXBElement<ConsultaObjetoLpoRequest> createConsultaReciboLpoRequest(ConsultaObjetoLpoRequest value) {
        return new JAXBElement<ConsultaObjetoLpoRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoLpoRequest.class, ConsultaReciboLpo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoLpoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoLpoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboLpoResponse.class)
    public JAXBElement<ConsultaObjetoLpoResponse> createConsultaReciboLpoResponseReturn(ConsultaObjetoLpoResponse value) {
        return new JAXBElement<ConsultaObjetoLpoResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoLpoResponse.class, ConsultaReciboLpoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoMdRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoMdRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaObjetoMd.class)
    public JAXBElement<ConsultaObjetoMdRequest> createConsultaObjetoMdRequest(ConsultaObjetoMdRequest value) {
        return new JAXBElement<ConsultaObjetoMdRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoMdRequest.class, ConsultaObjetoMd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoMdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoMdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaObjetoMdResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoMdResponse> createConsultaObjetoMdResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoMdResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoMdResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetoMdResponse.class, es.greenaall.gos.gf.ws.ConsultaObjetoMdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoMultaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoMultaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboMulta.class)
    public JAXBElement<ConsultaObjetoMultaRequest> createConsultaReciboMultaRequest(ConsultaObjetoMultaRequest value) {
        return new JAXBElement<ConsultaObjetoMultaRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoMultaRequest.class, ConsultaReciboMulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoMultaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoMultaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboMultaResponse.class)
    public JAXBElement<ConsultaObjetoMultaResponse> createConsultaReciboMultaResponseReturn(ConsultaObjetoMultaResponse value) {
        return new JAXBElement<ConsultaObjetoMultaResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoMultaResponse.class, ConsultaReciboMultaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoPlusRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoPlusRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboPlus.class)
    public JAXBElement<ConsultaObjetoPlusRequest> createConsultaReciboPlusRequest(ConsultaObjetoPlusRequest value) {
        return new JAXBElement<ConsultaObjetoPlusRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoPlusRequest.class, ConsultaReciboPlus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoPlusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoPlusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboPlusResponse.class)
    public JAXBElement<ConsultaObjetoPlusResponse> createConsultaReciboPlusResponseReturn(ConsultaObjetoPlusResponse value) {
        return new JAXBElement<ConsultaObjetoPlusResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoPlusResponse.class, ConsultaReciboPlusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoPlusvaliaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoPlusvaliaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboPlusvalia.class)
    public JAXBElement<ConsultaObjetoPlusvaliaRequest> createConsultaReciboPlusvaliaRequest(ConsultaObjetoPlusvaliaRequest value) {
        return new JAXBElement<ConsultaObjetoPlusvaliaRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoPlusvaliaRequest.class, ConsultaReciboPlusvalia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoPlusvaliaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoPlusvaliaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboPlusvaliaResponse.class)
    public JAXBElement<ConsultaObjetoPlusvaliaResponse> createConsultaReciboPlusvaliaResponseReturn(ConsultaObjetoPlusvaliaResponse value) {
        return new JAXBElement<ConsultaObjetoPlusvaliaResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoPlusvaliaResponse.class, ConsultaReciboPlusvaliaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoRusticaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoRusticaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboRustica.class)
    public JAXBElement<ConsultaObjetoRusticaRequest> createConsultaReciboRusticaRequest(ConsultaObjetoRusticaRequest value) {
        return new JAXBElement<ConsultaObjetoRusticaRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoRusticaRequest.class, ConsultaReciboRustica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoRusticaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoRusticaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboRusticaResponse.class)
    public JAXBElement<ConsultaObjetoRusticaResponse> createConsultaReciboRusticaResponseReturn(ConsultaObjetoRusticaResponse value) {
        return new JAXBElement<ConsultaObjetoRusticaResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoRusticaResponse.class, ConsultaReciboRusticaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoUrbanaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoUrbanaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboUrbana.class)
    public JAXBElement<ConsultaObjetoUrbanaRequest> createConsultaReciboUrbanaRequest(ConsultaObjetoUrbanaRequest value) {
        return new JAXBElement<ConsultaObjetoUrbanaRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoUrbanaRequest.class, ConsultaReciboUrbana.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoUrbanaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoUrbanaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboUrbanaResponse.class)
    public JAXBElement<ConsultaObjetoUrbanaResponse> createConsultaReciboUrbanaResponseReturn(ConsultaObjetoUrbanaResponse value) {
        return new JAXBElement<ConsultaObjetoUrbanaResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoUrbanaResponse.class, ConsultaReciboUrbanaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoVehiculoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoVehiculoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaReciboVehiculo.class)
    public JAXBElement<ConsultaObjetoVehiculoRequest> createConsultaReciboVehiculoRequest(ConsultaObjetoVehiculoRequest value) {
        return new JAXBElement<ConsultaObjetoVehiculoRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetoVehiculoRequest.class, ConsultaReciboVehiculo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoVehiculoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetoVehiculoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaReciboVehiculoResponse.class)
    public JAXBElement<ConsultaObjetoVehiculoResponse> createConsultaReciboVehiculoResponseReturn(ConsultaObjetoVehiculoResponse value) {
        return new JAXBElement<ConsultaObjetoVehiculoResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaObjetoVehiculoResponse.class, ConsultaReciboVehiculoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaObjetosTributariosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaObjetosTributariosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaObjetosTributarios.class)
    public JAXBElement<ConsultaObjetosTributariosRequest> createConsultaObjetosTributariosRequest(ConsultaObjetosTributariosRequest value) {
        return new JAXBElement<ConsultaObjetosTributariosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaObjetosTributariosRequest.class, ConsultaObjetosTributarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetosTributariosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetosTributariosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaObjetosTributariosResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetosTributariosResponse> createConsultaObjetosTributariosResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetosTributariosResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetosTributariosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaObjetosTributariosResponse.class, es.greenaall.gos.gf.ws.ConsultaObjetosTributariosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaOperacionesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaOperacionesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaOperacionMen.class)
    public JAXBElement<ConsultaOperacionesRequest> createConsultaOperacionMenRequest(ConsultaOperacionesRequest value) {
        return new JAXBElement<ConsultaOperacionesRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaOperacionesRequest.class, ConsultaOperacionMen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaOperacionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaOperacionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaOperacionMenResponse.class)
    public JAXBElement<ConsultaOperacionesResponse> createConsultaOperacionMenResponseReturn(ConsultaOperacionesResponse value) {
        return new JAXBElement<ConsultaOperacionesResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaOperacionesResponse.class, ConsultaOperacionMenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaOrdenanzaFiscalRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaOrdenanzaFiscalRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaOrdenazaFiscal.class)
    public JAXBElement<ConsultaOrdenanzaFiscalRequest> createConsultaOrdenazaFiscalRequest(ConsultaOrdenanzaFiscalRequest value) {
        return new JAXBElement<ConsultaOrdenanzaFiscalRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaOrdenanzaFiscalRequest.class, ConsultaOrdenazaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaOrdenanzaFiscalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaOrdenanzaFiscalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultaOrdenazaFiscalResponse.class)
    public JAXBElement<ConsultaOrdenanzaFiscalResponse> createConsultaOrdenazaFiscalResponseReturn(ConsultaOrdenanzaFiscalResponse value) {
        return new JAXBElement<ConsultaOrdenanzaFiscalResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, ConsultaOrdenanzaFiscalResponse.class, ConsultaOrdenazaFiscalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaProcedimientosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaProcedimientosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaProcedimientos.class)
    public JAXBElement<ConsultaProcedimientosRequest> createConsultaProcedimientosRequest(ConsultaProcedimientosRequest value) {
        return new JAXBElement<ConsultaProcedimientosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaProcedimientosRequest.class, ConsultaProcedimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaProcedimientosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaProcedimientosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaProcedimientosResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaProcedimientosResponse> createConsultaProcedimientosResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaProcedimientosResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaProcedimientosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaProcedimientosResponse.class, es.greenaall.gos.gf.ws.ConsultaProcedimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaRecibosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaRecibosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaRecibos.class)
    public JAXBElement<ConsultaRecibosRequest> createConsultaRecibosRequest(ConsultaRecibosRequest value) {
        return new JAXBElement<ConsultaRecibosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaRecibosRequest.class, ConsultaRecibos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaRecibosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaRecibosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaRecibosResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaRecibosResponse> createConsultaRecibosResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaRecibosResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaRecibosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaRecibosResponse.class, es.greenaall.gos.gf.ws.ConsultaRecibosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaTerritorioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaTerritorioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaTerritorio.class)
    public JAXBElement<ConsultaTerritorioRequest> createConsultaTerritorioRequest(ConsultaTerritorioRequest value) {
        return new JAXBElement<ConsultaTerritorioRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaTerritorioRequest.class, ConsultaTerritorio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaTerritorioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaTerritorioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaTerritorioResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaTerritorioResponse> createConsultaTerritorioResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaTerritorioResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaTerritorioResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaTerritorioResponse.class, es.greenaall.gos.gf.ws.ConsultaTerritorioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaTipoObjetoTributarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaTipoObjetoTributarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaTiposObjetosTributarios.class)
    public JAXBElement<ConsultaTipoObjetoTributarioRequest> createConsultaTiposObjetosTributariosRequest(ConsultaTipoObjetoTributarioRequest value) {
        return new JAXBElement<ConsultaTipoObjetoTributarioRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaTipoObjetoTributarioRequest.class, ConsultaTiposObjetosTributarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaTiposObjetosTributariosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaTiposObjetosTributariosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaTiposObjetosTributariosResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaTiposObjetosTributariosResponse> createConsultaTiposObjetosTributariosResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaTiposObjetosTributariosResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaTiposObjetosTributariosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaTiposObjetosTributariosResponse.class, es.greenaall.gos.gf.ws.ConsultaTiposObjetosTributariosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaTramitacionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaTramitacionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaTramitacion.class)
    public JAXBElement<ConsultaTramitacionRequest> createConsultaTramitacionRequest(ConsultaTramitacionRequest value) {
        return new JAXBElement<ConsultaTramitacionRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaTramitacionRequest.class, ConsultaTramitacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaTramitacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaTramitacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaTramitacionResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaTramitacionResponse> createConsultaTramitacionResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaTramitacionResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaTramitacionResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaTramitacionResponse.class, es.greenaall.gos.gf.ws.ConsultaTramitacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaVehiculosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaVehiculosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ConsultaVehiculos.class)
    public JAXBElement<ConsultaVehiculosRequest> createConsultaVehiculosRequest(ConsultaVehiculosRequest value) {
        return new JAXBElement<ConsultaVehiculosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ConsultaVehiculosRequest.class, ConsultaVehiculos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaVehiculosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ConsultaVehiculosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ConsultaVehiculosResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaVehiculosResponse> createConsultaVehiculosResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ConsultaVehiculosResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ConsultaVehiculosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ConsultaVehiculosResponse.class, es.greenaall.gos.gf.ws.ConsultaVehiculosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarArchivoServidorRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DescargarArchivoServidorRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = DescargarArchivo.class)
    public JAXBElement<DescargarArchivoServidorRequest> createDescargarArchivoRequest(DescargarArchivoServidorRequest value) {
        return new JAXBElement<DescargarArchivoServidorRequest>(_ActualizarEstadoDocumentoRequest_QNAME, DescargarArchivoServidorRequest.class, DescargarArchivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarArchivoServidorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DescargarArchivoServidorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = DescargarArchivoResponse.class)
    public JAXBElement<DescargarArchivoServidorResponse> createDescargarArchivoResponseReturn(DescargarArchivoServidorResponse value) {
        return new JAXBElement<DescargarArchivoServidorResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, DescargarArchivoServidorResponse.class, DescargarArchivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesconexionAutoLiquidacioneRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DesconexionAutoLiquidacioneRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = DesconexionAutoLiquidaciones.class)
    public JAXBElement<DesconexionAutoLiquidacioneRequest> createDesconexionAutoLiquidacionesRequest(DesconexionAutoLiquidacioneRequest value) {
        return new JAXBElement<DesconexionAutoLiquidacioneRequest>(_ActualizarEstadoDocumentoRequest_QNAME, DesconexionAutoLiquidacioneRequest.class, DesconexionAutoLiquidaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.DesconexionAutoLiquidacionesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.DesconexionAutoLiquidacionesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.DesconexionAutoLiquidacionesResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.DesconexionAutoLiquidacionesResponse> createDesconexionAutoLiquidacionesResponseReturn(es.greenaall.gos.gf.ws.response.xsd.DesconexionAutoLiquidacionesResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.DesconexionAutoLiquidacionesResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.DesconexionAutoLiquidacionesResponse.class, es.greenaall.gos.gf.ws.DesconexionAutoLiquidacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvioCorreoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvioCorreoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = EnvioCorreo.class)
    public JAXBElement<EnvioCorreoRequest> createEnvioCorreoRequest(EnvioCorreoRequest value) {
        return new JAXBElement<EnvioCorreoRequest>(_ActualizarEstadoDocumentoRequest_QNAME, EnvioCorreoRequest.class, EnvioCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.EnvioCorreoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.EnvioCorreoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.EnvioCorreoResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.EnvioCorreoResponse> createEnvioCorreoResponseReturn(es.greenaall.gos.gf.ws.response.xsd.EnvioCorreoResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.EnvioCorreoResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.EnvioCorreoResponse.class, es.greenaall.gos.gf.ws.EnvioCorreoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FicheroTeuRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FicheroTeuRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = GenerarTEU.class)
    public JAXBElement<FicheroTeuRequest> createGenerarTEURequest(FicheroTeuRequest value) {
        return new JAXBElement<FicheroTeuRequest>(_ActualizarEstadoDocumentoRequest_QNAME, FicheroTeuRequest.class, GenerarTEU.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FicheroTeuResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FicheroTeuResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = GenerarTEUResponse.class)
    public JAXBElement<FicheroTeuResponse> createGenerarTEUResponseReturn(FicheroTeuResponse value) {
        return new JAXBElement<FicheroTeuResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, FicheroTeuResponse.class, GenerarTEUResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaAgentePoliciaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidaAgentePoliciaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ValidarAgentePolicia.class)
    public JAXBElement<ValidaAgentePoliciaRequest> createValidarAgentePoliciaRequest(ValidaAgentePoliciaRequest value) {
        return new JAXBElement<ValidaAgentePoliciaRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ValidaAgentePoliciaRequest.class, ValidarAgentePolicia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ValidarAgentePoliciaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ValidarAgentePoliciaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ValidarAgentePoliciaResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ValidarAgentePoliciaResponse> createValidarAgentePoliciaResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ValidarAgentePoliciaResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ValidarAgentePoliciaResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ValidarAgentePoliciaResponse.class, es.greenaall.gos.gf.ws.ValidarAgentePoliciaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioGosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioGosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "request", scope = ValidarUsuarioGos.class)
    public JAXBElement<ValidarUsuarioGosRequest> createValidarUsuarioGosRequest(ValidarUsuarioGosRequest value) {
        return new JAXBElement<ValidarUsuarioGosRequest>(_ActualizarEstadoDocumentoRequest_QNAME, ValidarUsuarioGosRequest.class, ValidarUsuarioGos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ValidarUsuarioGosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.gos.gf.ws.response.xsd.ValidarUsuarioGosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = es.greenaall.gos.gf.ws.ValidarUsuarioGosResponse.class)
    public JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ValidarUsuarioGosResponse> createValidarUsuarioGosResponseReturn(es.greenaall.gos.gf.ws.response.xsd.ValidarUsuarioGosResponse value) {
        return new JAXBElement<es.greenaall.gos.gf.ws.response.xsd.ValidarUsuarioGosResponse>(_ActualizarEstadoDocumentoResponseReturn_QNAME, es.greenaall.gos.gf.ws.response.xsd.ValidarUsuarioGosResponse.class, es.greenaall.gos.gf.ws.ValidarUsuarioGosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatoConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatoConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "datosConexion", scope = AltaTributoGUI.class)
    public JAXBElement<DatoConexion> createAltaTributoGUIDatosConexion(DatoConexion value) {
        return new JAXBElement<DatoConexion>(_AltaTributoGUIDatosConexion_QNAME, DatoConexion.class, AltaTributoGUI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = AltaTributoGUIResponse.class)
    public JAXBElement<String> createAltaTributoGUIResponseReturn(String value) {
        return new JAXBElement<String>(_ActualizarEstadoDocumentoResponseReturn_QNAME, String.class, AltaTributoGUIResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiquidacionRc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LiquidacionRc }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "liquidacion", scope = ConsultarLiquidacionesTributosGUI.class)
    public JAXBElement<LiquidacionRc> createConsultarLiquidacionesTributosGUILiquidacion(LiquidacionRc value) {
        return new JAXBElement<LiquidacionRc>(_ConsultarLiquidacionesTributosGUILiquidacion_QNAME, LiquidacionRc.class, ConsultarLiquidacionesTributosGUI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatoConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatoConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "datosConexion", scope = ConsultarLiquidacionesTributosGUI.class)
    public JAXBElement<DatoConexion> createConsultarLiquidacionesTributosGUIDatosConexion(DatoConexion value) {
        return new JAXBElement<DatoConexion>(_AltaTributoGUIDatosConexion_QNAME, DatoConexion.class, ConsultarLiquidacionesTributosGUI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultarLiquidacionesTributosGUIResponse.class)
    public JAXBElement<String> createConsultarLiquidacionesTributosGUIResponseReturn(String value) {
        return new JAXBElement<String>(_ActualizarEstadoDocumentoResponseReturn_QNAME, String.class, ConsultarLiquidacionesTributosGUIResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioRc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObjetoTributarioRc }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "objetoTributario", scope = ConsultarTributosGUI.class)
    public JAXBElement<ObjetoTributarioRc> createConsultarTributosGUIObjetoTributario(ObjetoTributarioRc value) {
        return new JAXBElement<ObjetoTributarioRc>(_ConsultarTributosGUIObjetoTributario_QNAME, ObjetoTributarioRc.class, ConsultarTributosGUI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatoConexion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatoConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "datosConexion", scope = ConsultarTributosGUI.class)
    public JAXBElement<DatoConexion> createConsultarTributosGUIDatosConexion(DatoConexion value) {
        return new JAXBElement<DatoConexion>(_AltaTributoGUIDatosConexion_QNAME, DatoConexion.class, ConsultarTributosGUI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = ConsultarTributosGUIResponse.class)
    public JAXBElement<String> createConsultarTributosGUIResponseReturn(String value) {
        return new JAXBElement<String>(_ActualizarEstadoDocumentoResponseReturn_QNAME, String.class, ConsultarTributosGUIResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.greenaall.util.comun.excepciones.xsd.CtrError }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link es.greenaall.util.comun.excepciones.xsd.CtrError }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "CtrError", scope = es.greenaall.gos.gf.ws.CtrError.class)
    public JAXBElement<es.greenaall.util.comun.excepciones.xsd.CtrError> createCtrErrorCtrError(es.greenaall.util.comun.excepciones.xsd.CtrError value) {
        return new JAXBElement<es.greenaall.util.comun.excepciones.xsd.CtrError>(_CtrErrorCtrError_QNAME, es.greenaall.util.comun.excepciones.xsd.CtrError.class, es.greenaall.gos.gf.ws.CtrError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "sIdioma", scope = DameParametroSistema.class)
    public JAXBElement<String> createDameParametroSistemaSIdioma(String value) {
        return new JAXBElement<String>(_DameParametroSistemaSIdioma_QNAME, String.class, DameParametroSistema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "return", scope = DameParametroSistemaResponse.class)
    public JAXBElement<String> createDameParametroSistemaResponseReturn(String value) {
        return new JAXBElement<String>(_ActualizarEstadoDocumentoResponseReturn_QNAME, String.class, DameParametroSistemaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.gf.gos.greenaall.es", name = "Exception", scope = Exception.class)
    public JAXBElement<Object> createExceptionException(Object value) {
        return new JAXBElement<Object>(_ExceptionException_QNAME, Object.class, Exception.class, value);
    }

}
