package com.greenaall.inside.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.inside.dto.InsideEniXmlBase64Dto;
import com.greenaall.inside.dto.InsideEnvioResultadoDto;
import com.greenaall.inside.dto.InsideValidacionDto;
import com.greenaall.inside.service.InsideConvertirService;
import com.greenaall.inside.service.InsideDocumentoEnvioService;
import com.greenaall.inside.service.InsideEniFileService;
import com.greenaall.inside.service.InsideExpedienteEnvioService;
import com.greenaall.inside.service.InsidePrepareValidationService;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;

@RestController
@RequestMapping("/inside")
public class InsidePrepareController {

	@Autowired
	private InsidePrepareValidationService insidePrepareValidationService;

	@Autowired
	private InsideEniFileService insideEniFileService;

	@Autowired
	private InsideExpedienteEnvioService insideExpedienteEnvioService;

	@Autowired
	private InsideDocumentoEnvioService insideDocumentoEnvioService;

	@Autowired
	private InsideConvertirService insideConvertirService;

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@Autowired
	private TareaTramiteExpedienteServiceImpl tareaTramiteExpedienteService;

	@GetMapping("/expediente/{id}/eni-xml-base64")
	public InsideEniXmlBase64Dto obtenerExpedienteEniXmlBase64(@PathVariable Long id) throws Exception {
		return insideEniFileService.obtenerExpedienteEniXmlBase64(id);
	}

	@GetMapping("/archivo/{codArchi}/eni-xml-base64")
	public InsideEniXmlBase64Dto obtenerDocumentoEniXmlBase64(@PathVariable Long codArchi) throws Exception {
		return insideEniFileService.obtenerDocumentoEniXmlBase64(codArchi);
	}

	@GetMapping("/expediente/{id}/validar")
	public InsideValidacionDto validarExpediente(@PathVariable Long id) {
		return insidePrepareValidationService.validarExpediente(id);
	}

	@PostMapping("/expediente/{id}/enviar-alta-xml")
	@ResponseStatus(HttpStatus.OK)
	public InsideEnvioResultadoDto enviarAltaExpedienteEniXml(@PathVariable Long id) {
		Expediente expediente = expedienteService.findById(id);
		if (expediente == null) {
			throw new NoDataFoundException();
		}
		return insideExpedienteEnvioService.enviarAltaExpedienteEniXml(id, expediente.getInstructor());
	}

	@PostMapping("/tarea/{idTarea}/enviar-alta-xml-documento")
	@ResponseStatus(HttpStatus.OK)
	public InsideEnvioResultadoDto enviarAltaDocumentoEniXml(@PathVariable Long idTarea) {
		TareaTramiteExpediente tarea = tareaTramiteExpedienteService.findById(idTarea);
		if (tarea == null) {
			throw new NoDataFoundException();
		}
		return insideDocumentoEnvioService.enviarAltaDocumentoEniXml(idTarea, tarea.getUsuContr());
	}

	@PostMapping("/tarea/{idTarea}/enviar-alta-documento-eni")
	@ResponseStatus(HttpStatus.OK)
	public InsideEnvioResultadoDto enviarAltaDocumentoEni(@PathVariable Long idTarea) {
		TareaTramiteExpediente tarea = tareaTramiteExpedienteService.findById(idTarea);
		if (tarea == null) {
			throw new NoDataFoundException();
		}
		return insideDocumentoEnvioService.enviarAltaDocumentoEni(idTarea, tarea.getUsuContr());
	}

	@PostMapping("/expediente/{id}/enviar-convertir-expediente")
	@ResponseStatus(HttpStatus.OK)
	public InsideEnvioResultadoDto enviarConvertirExpediente(@PathVariable Long id) {
		Expediente expediente = expedienteService.findById(id);
		if (expediente == null) {
			throw new NoDataFoundException();
		}
		return insideConvertirService.enviarConvertirExpediente(id, expediente.getInstructor());
	}

	@PostMapping("/tarea/{idTarea}/enviar-convertir-documento")
	@ResponseStatus(HttpStatus.OK)
	public InsideEnvioResultadoDto enviarConvertirDocumento(@PathVariable Long idTarea) {
		TareaTramiteExpediente tarea = tareaTramiteExpedienteService.findById(idTarea);
		if (tarea == null) {
			throw new NoDataFoundException();
		}
		return insideConvertirService.enviarConvertirDocumentoTarea(idTarea, tarea.getUsuContr());
	}

	@PostMapping("/expediente/{id}/enviar-convertir-documentos")
	@ResponseStatus(HttpStatus.OK)
	public List<InsideEnvioResultadoDto> enviarConvertirDocumentosExpediente(@PathVariable Long id) {
		Expediente expediente = expedienteService.findById(id);
		if (expediente == null) {
			throw new NoDataFoundException();
		}
		return insideConvertirService.enviarConvertirDocumentosExpediente(id, expediente.getInstructor());
	}
}
