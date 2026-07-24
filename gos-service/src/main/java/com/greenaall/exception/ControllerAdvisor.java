package com.greenaall.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler{

	/**
	 * Handler genérico para {@link BusinessException} y todas sus
	 * subclases (p.ej. {@link ObjetoTributarioBajaException},
	 * {@link HabintanteBajaException}, {@link ProcedimientoDescripcionError},
	 * {@link PdfException}, {@link ExcepcionArchivoExistente}). Usa el status
	 * indicado por la propia excepción en lugar de forzar siempre FORBIDDEN.
	 *
	 * <p>El resto de excepciones de negocio de este fichero siguen
	 * gestionándose una a una más abajo; se migrarán progresivamente a
	 * {@code BusinessException} sin romper sus contratos actuales.
	 */
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<Object> handleBusinessException(BusinessException ex, WebRequest request) {

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", ex.getMessage());
		if (ex.getCode() != null) {
			body.put("code", ex.getCode());
		}

		return new ResponseEntity<>(body, ex.getStatus());
	}

	@ExceptionHandler(NoFechaFinException.class)
    public ResponseEntity<Object> handleNoFechaFinException(NoFechaFinException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se ha podido cerrar el expediente. Existen tareas sin finalizar.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(InteresadoExistenteException.class)
    public ResponseEntity<Object> handleInteresadoExistenteException(InteresadoExistenteException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El interesado ya existe.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ExcepcionInfDocumentacionEFirma.class)
    public ResponseEntity<Object> handleExcepcionInfDocumentacionEFirma(ExcepcionInfDocumentacionEFirma ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se ha podido obtener la información del documento con eFirma.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ExcepcionConexionEFirma.class)
    public ResponseEntity<Object> handleExcepcionConexionEFirma(ExcepcionConexionEFirma ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se ha podido conectar con eFirma.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ExcepcionInformeFirma.class)
    public ResponseEntity<Object> handleExcepcionInformeFirma(ExcepcionInformeFirma ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Se ha producido un error al obtener el informe de firma.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ExcepcionNoExisteParametroSistema.class)
    public ResponseEntity<Object> handleExcepcionNoExisteParametroSistema(ExcepcionNoExisteParametroSistema ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No existe el parámetro del sistema.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ExcepcionObtenerIdPeticion.class)
    public ResponseEntity<Object> handleExcepcionObtenerIdPeticion(ExcepcionObtenerIdPeticion ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El archivo no tiene petición de firmado.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ExcepcionSolicitudFirmado.class)
    public ResponseEntity<Object> handleExcepcionSolicitudFirmado(ExcepcionSolicitudFirmado ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se ha podido enviar el documento a eFirma.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NotificacionExistenteException.class)
    public ResponseEntity<Object> handleNotificacionExistenteException(NotificacionExistenteException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "La tarea ya tiene una notificación.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }

	@ExceptionHandler(ErrorEnvioEmail.class)
    public ResponseEntity<Object> handleErrorEnvioEmail(ErrorEnvioEmail ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Se ha producido un error en el envío de correo.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ErrorMailDestinatarioException.class)
    public ResponseEntity<Object> handleErrorMailDestinatarioException(ErrorMailDestinatarioException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se puede mandar un mensaje a sí mismo.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(FaltanDatosException.class)
    public ResponseEntity<Object> handleFaltanDatosException(FaltanDatosException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Debe rellenar todos los campos obligatorios..");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoDescripcionException.class)
    public ResponseEntity<Object> handleNoDescripcionException(NoDescripcionException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Es necesaria la descripción.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ErrorGenerarMetadatosException.class)
    public ResponseEntity<Object> handleErrorGenerarMetadatosException(ErrorGenerarMetadatosException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Error al generar la información de los metadatos ENI.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(FicheroNoSoportadoException.class)
    public ResponseEntity<Object> handleFicheroNoSoportadoException(FicheroNoSoportadoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se puede generar documento ENI de ese tipo de fichero.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(PropuestaExistenteException.class)
    public ResponseEntity<Object> handlePropuestaExistenteException(PropuestaExistenteException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "La tarea ya tiene una propuesta de resolución.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoInstructorFoundException.class)
    public ResponseEntity<Object> handleNoInstructorFoundException(NoInstructorFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se puede iniciar la tramitación, no existe instructor.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(UsuarioExsitenteException.class)
    public ResponseEntity<Object> handleUsuarioExsitenteException(UsuarioExsitenteException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Error, el usuario ya existe.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoFileException.class)
    public ResponseEntity<Object> handleNoFileException(NoFileException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No existe el archivo.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoFestivosFoundException.class)
    public ResponseEntity<Object> handleNoFestivosFoundException(NoFestivosFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No hay definido festivos para el año en curso.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoArchivoFoundException.class)
    public ResponseEntity<Object> handleNoArchivoFoundException(NoArchivoFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "La tarea no tiene documento.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
		
	@ExceptionHandler(NoDataOrganoException.class)
    public ResponseEntity<Object> handleNoDataOrganoException(NoDataOrganoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El elemento de organización no tiene relleno el campo órgano.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(TramitadorPoseeException.class)
    public ResponseEntity<Object> handleTramitadorPoseeException(TramitadorPoseeException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El destinatario ya posee el expediente.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(PersonaRepresentateNotFoundException.class)
    public ResponseEntity<Object> handlePersonaRepresentateNotFoundException(PersonaRepresentateNotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No existen representates.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(PropuestaResolucionException.class)
    public ResponseEntity<Object> handlePropuestaResolucionException(PropuestaResolucionException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El documento ya tiene una prouesta de resolución.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(RegistroSalidaException.class)
    public ResponseEntity<Object> handleRegistroSalidaException(RegistroSalidaException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El documento ya tiene un registro salida.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NotificacionException.class)
    public ResponseEntity<Object> handleNotificacionException(NotificacionException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El documento ya tiene una notificación.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(PlantillaNotFoundException.class)
    public ResponseEntity<Object> handlePlantillaNotFoundException(PlantillaNotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "La plantilla no ha sido encontrada");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ErrorFicheroTeuException.class)
    public ResponseEntity<Object> handleErrorFicheroTeuException(ErrorFicheroTeuException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Se ha producido un error generando el fichero TEU.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(FirmaExistenteException.class)
    public ResponseEntity<Object> handleFirmaExistenteException(FirmaExistenteException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El documento ya tiene una firma.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(FormatoDocumentoNoSoportado.class)
    public ResponseEntity<Object> handleFormatoDocumentoNoSoportado(FormatoDocumentoNoSoportado ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El formado de documento debe ser docx u odt.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoDNIUsuarioFoundException.class)
    public ResponseEntity<Object> handleNoDNIUsuarioFoundException(NoDNIUsuarioFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El usuario no tiene el campo DNI relleno.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoFirmafException.class)
    public ResponseEntity<Object> handleNoFirmafException(NoFirmafException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Se ha producido un error en el firmado del documento.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoPersonaCargoFoundException.class)
    public ResponseEntity<Object> handleNoPersonaCargoFoundException(NoPersonaCargoFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No existe cargo para el usuario.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoFicheroPdfException.class)
    public ResponseEntity<Object> handleNoFicheroPdfException(NoFicheroPdfException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se puede firmar un archivo que no sea pdf.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(NoCertificadoFoundException.class)
    public ResponseEntity<Object> handleNoCertificadoFoundException(NoCertificadoFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No existe certificado digital para el usuario firmante.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ErrorBorradoNotificacionException.class)
    public ResponseEntity<Object> handleErrorBorradoNotificacionException(ErrorBorradoNotificacionException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se pueden borrar notificaciones que no estén en estado generada.");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	
	@ExceptionHandler(ErrorBorradoProcedimientoException.class)
    public ResponseEntity<Object> handleErrorBorradoProcedimientoException(ErrorBorradoProcedimientoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se podido borrar el procedimiento. Existen expedientes asociados");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ErrorBorradoException.class)
    public ResponseEntity<Object> handleErrorBorradoException(ErrorBorradoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se ha podido borrar el elemento. Existen elementos dependientes asociados");

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(MetadatoGrupoAtribError.class)
    public ResponseEntity<Object> handleMetadatoGrupoAtribError(MetadatoGrupoAtribError ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        String error = ex.getMessage();
        body.put("message", error);

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(ExcepcionDocumentoEnEfirma.class)
    public ResponseEntity<Object> handleExcepcionDocumentoEnEfirma(ExcepcionDocumentoEnEfirma ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        String error = ex.getMessage();
        body.put("message", error);

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	
	@ExceptionHandler(ErrorInsertarBD.class)
    public ResponseEntity<Object> handleErrorInsertarBD(ErrorInsertarBD ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        String error = ex.getMessage();
        body.put("message", error);

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(MetadatoGrupoError.class)
    public ResponseEntity<Object> handleMetadatoGrupoError(MetadatoGrupoError ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        String error = ex.getMessage();
        body.put("message", error);

        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }
	
	@ExceptionHandler(UsuarioNotFoundException.class)
    public ResponseEntity<Object> handleCityNotFoundException(UsuarioNotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Usuario no econtrado");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(NoRegistradorPermisoException.class)
    public ResponseEntity<Object> handleNoRegistradorPermisoException(NoRegistradorPermisoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El registrador no tiene permiso para insertar.");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(NoRegistradorFoundException.class)
    public ResponseEntity<Object> handleNoRegistradorFoundException(NoRegistradorFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El usuario no es registrador.");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(NoRegistroFoundException.class)
    public ResponseEntity<Object> handleNoRegistroFoundException(NoRegistroFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se han encontrado registro principal en esta entidad.");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Object> handleNodataFoundException(NoDataFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No se ha encontrado datos");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(OrganizacionElementoNotFoundException.class)
    public ResponseEntity<Object> handleOrganizacionElementoNotFoundException(OrganizacionElementoNotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Organización no econtrada");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(OrganizacionUsuarioNotFoundException.class)
    public ResponseEntity<Object> handleOrganizacionUsuarioNotFoundException(OrganizacionUsuarioNotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Organización usuario no econtrada");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(UsuarioPassNoValidoException.class)
    public ResponseEntity<Object> handleUsuarioPassNoValidoException(UsuarioPassNoValidoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "La pass no coincide");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(UsuarioBloqueoNoValidoException.class)
    public ResponseEntity<Object> handleUsuarioBloqueoNoValidoException(UsuarioBloqueoNoValidoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Usuario bloqueado");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(UsuarioFecVenNoValidoException.class)
    public ResponseEntity<Object> handleUsuarioFecVenNoValidoException(UsuarioFecVenNoValidoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Usuario con fecha vencida");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(UsuarioFecVenPassNoValidoException.class)
    public ResponseEntity<Object> handleUsuarioFecVenPassNoValidoException(UsuarioFecVenPassNoValidoException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Usuario con fecha pass vencida");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(PersonaNotFoundException.class)
    public ResponseEntity<Object> handlePersonaNotFoundException(PersonaNotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "La persona no ha sido encontrada");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
        MethodArgumentNotValidException ex, HttpHeaders headers, 
        HttpStatus status, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDate.now());
        body.put("status", status.value());
        
        List<String> errors = new ArrayList<>();
        
        for(int i = 0; i <  ex.getBindingResult().getFieldErrors().size(); i++) {
        	if(ex.getBindingResult().getFieldErrors().get(i).getField() != null) {
        		String oCadena = ex.getBindingResult().getFieldErrors().get(i).getField();
            	errors.add(oCadena);
        	}
        }
        
       /* List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());*/

        body.put("errors", errors);

        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(ErrorInterno.class)
    public ResponseEntity<String> handleErrorInterno(HttpServletRequest req, ErrorInterno e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Se ha producido un error interno en el servidor");
    }

    @ExceptionHandler(ErrorControlado.class)
    public ResponseEntity<String> handleErrorControlado(HttpServletRequest req, ErrorControlado e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(NotificaIntegracionException.class)
    public ResponseEntity<Object> handleNotificaIntegracionException(NotificaIntegracionException ex, WebRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

}
