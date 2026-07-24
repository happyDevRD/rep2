package com.greenaall.ex.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.models.ex.dto.DocumentoSolicitudDto;
import com.greenaall.models.ex.entity.DocumentoSolicitud;
import com.greenaall.models.ex.entity.Solicitud;
import com.greenaall.models.ex.service.DocumentoSolicitudServiceImpl;
import com.greenaall.models.ex.service.SolicitudServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.ArchivoServiceImpl;
import com.greenaall.models.ge.service.IParametroSistemaService;

@RestController
public class DocumentoSolicitudController {
	
	@Autowired
    private DocumentoSolicitudServiceImpl service;
	
	@Autowired
    private SolicitudServiceImpl solicitudService;
	
	@Autowired
    private ArchivoServiceImpl archivoService;
	
	@Autowired
	private IParametroSistemaService parametroSistemaService;
	
	@PostMapping("/documentoSolicitud/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public DocumentoSolicitud crear(@RequestBody DocumentoSolicitudDto solicitud) {
		
		DocumentoSolicitud oDocSolicitud = new DocumentoSolicitud();
		oDocSolicitud.setSolicitud(solicitud.getIdSolicitud());
		oDocSolicitud.setDescripcion(solicitud.getDescripcion());
		oDocSolicitud.setFechaSubida(solicitud.getFechaSubida());
		oDocSolicitud.setNombreArchivo(solicitud.getNombreArchivo());
		oDocSolicitud.setUsuContr(solicitud.getUsuContr());
		oDocSolicitud.setFecContr(new Date());
		DocumentoSolicitud oDocSolicitudNew = service.save(oDocSolicitud);
		
		Solicitud oSolicitud = solicitudService.findById(solicitud.getIdSolicitud());
		
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 9300));			
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
		int tipo = 1;
		Archivo oArchivo = ArchivoValide.altaArchivo(solicitud.getFicBas64(), oParametroSistema.getValor(), 
				oSolicitud.getEjercicio(), oSolicitud.getNumero(), solicitud.getNombreArchivo(), tipo);
		
		File file = new File(oArchivo.getDesArchiFlow());
        
		byte[] fileContent;
		try {
			fileContent = Files.readAllBytes(file.toPath());
			oArchivo.setArcExpd(fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		oArchivo.setUsuContr(solicitud.getUsuContr());
		Archivo oArchivoNew = archivoService.save(oArchivo);
		
		oDocSolicitudNew.setArchivo(oArchivoNew.getCodArchi());
		DocumentoSolicitud oDocSolicitudUpd = service.save(oDocSolicitudNew);
		return oDocSolicitudUpd;
	}
	
	@GetMapping("/documentoSolicitud/ver/{id}")
	public DocumentoSolicitud detalle(@PathVariable Long id) {
		DocumentoSolicitud solicitud = service.findById(id);
		return solicitud;
	}
	
	@GetMapping("/documentoSolicitud/verDocProc/{solicitud}")
	public List<DocumentoSolicitud> detalleDocProc(@PathVariable Long solicitud) {
		List<DocumentoSolicitud> aSolicitud = service.findBySolicitud(solicitud);
		return aSolicitud;
	}
	
	@GetMapping("/documentoSolicitud/listar")
	public List<DocumentoSolicitud> listar() {
		List<DocumentoSolicitud> aDocumentoSolicitud = (List<DocumentoSolicitud>) service.findAll();
		if(aDocumentoSolicitud == null || aDocumentoSolicitud.isEmpty()) {
			return null;
		}
		return aDocumentoSolicitud;
	}
	
	@PutMapping("/documentoSolicitud/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public DocumentoSolicitud editar(@RequestBody DocumentoSolicitud documentoSolicitud, @PathVariable Long id) {
		DocumentoSolicitud documentosolicitudDB = service.findById(id);
		documentosolicitudDB.setArchivo(documentoSolicitud.getArchivo());
		documentosolicitudDB.setDescripcion(documentoSolicitud.getDescripcion());
		documentosolicitudDB.setFecContr(new Date());
		documentosolicitudDB.setNombreArchivo(documentoSolicitud.getNombreArchivo());
		documentosolicitudDB.setSolicitud(documentoSolicitud.getSolicitud());
		documentosolicitudDB.setUsuContr(documentoSolicitud.getUsuContr());
		return service.save(documentosolicitudDB);
		
	}
	
	@DeleteMapping("/documentoSolicitud/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
		DocumentoSolicitud solicitudDB = service.findById(id);
		if (solicitudDB == null) {
			throw new NoDataFoundException();	  
		}
		Solicitud oSolicitud = solicitudService.findById(solicitudDB.getSolicitud());
		if(solicitudDB.getArchivo() != null && oSolicitud != null && oSolicitud.getIdHisDocum() == null) {
			Long idArchivo = solicitudDB.getArchivo();
			solicitudDB.setArchivo(null);
			service.save(solicitudDB);
			Archivo oArchivo =  archivoService.findById(idArchivo);
			if(oArchivo != null && oArchivo.getDesArchiFlow() != null) {
				File oFichero = new File(oArchivo.getDesArchiFlow());
				if(oFichero.exists()) {
					oFichero.delete();
				}
			}
			archivoService.deleteById(idArchivo);
		}
		
      service.deleteByObject(solicitudDB);
    }

}
