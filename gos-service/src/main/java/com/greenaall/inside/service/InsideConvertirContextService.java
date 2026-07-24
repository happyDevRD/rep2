package com.greenaall.inside.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.ge.dto.IndiceENI;
import com.greenaall.inside.dto.InsideConvertirContextDto;
import com.greenaall.inside.dto.InsideTareaDocumentoContextDto;
import com.greenaall.inside.mapper.InsideIflowMapper;
import com.greenaall.models.ad.entity.OrganizacionElemento;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ad.service.OrganizacionElementoServiceImpl;
import com.greenaall.models.ad.service.OrganizacionUsuarioServiceImpl;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.Tramite;
import com.greenaall.models.ex.service.AtributoExpedienteoServiceImpl;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.InteresadoServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ex.service.TramiteServiceImpl;

@Service
public class InsideConvertirContextService {

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@Autowired
	private TramiteServiceImpl tramiteService;

	@Autowired
	private TareaTramiteExpedienteServiceImpl tareaTramiteExpedienteService;

	@Autowired
	private InteresadoServiceImpl interesadoService;

	@Autowired
	private PersonaEntidadServiceImpl personaEntidadService;

	@Autowired
	private ProcedimientoServiceImpl procedimientoService;

	@Autowired
	private OrganizacionUsuarioServiceImpl organizacionUsuarioService;

	@Autowired
	private OrganizacionElementoServiceImpl organizacionElementoService;

	@Autowired
	private AtributoExpedienteoServiceImpl atributoExpedienteService;

	@Autowired
	private InsideIndiceEniService insideIndiceEniService;

	@Autowired
	private InsideMetadatosEniService insideMetadatosEniService;

	@Autowired
	private InsideEniFileService insideEniFileService;

	public InsideConvertirContextDto cargarContexto(Long expedienteId) throws Exception {
		Expediente expediente = expedienteService.findById(expedienteId);
		if (expediente == null) {
			throw new NoDataFoundException();
		}

		InsideConvertirContextDto context = new InsideConvertirContextDto();
		context.setExpediente(expediente);
		context.setOrganoDir3(resolverOrgano(expediente));
		context.setClasificacion(resolverClasificacion(expediente));
		context.setInteresados(cargarInteresados(expedienteId));
		context.setIndiceEni(insideIndiceEniService.obtenerIndicePorExpediente(expedienteId));
		context.setAtributos(cargarAtributos(expedienteId));
		context.setDocumentos(cargarDocumentos(expedienteId, context.getIndiceEni()));
		return context;
	}

	public InsideTareaDocumentoContextDto cargarDocumentoTarea(Long expedienteId, Long tareaId) throws Exception {
		InsideConvertirContextDto context = cargarContexto(expedienteId);
		return context.getDocumentos().stream()
				.filter((documento) -> documento.getTarea().getId().equals(tareaId))
				.findFirst()
				.orElse(null);
	}

	private List<InsideTareaDocumentoContextDto> cargarDocumentos(Long expedienteId, List<IndiceENI> indiceEni)
			throws Exception {
		List<TareaTramiteExpediente> tareas = new ArrayList<>();
		List<Tramite> tramites = tramiteService.findByExpediente(expedienteId);
		if (tramites != null) {
			for (Tramite tramite : tramites) {
				List<TareaTramiteExpediente> tareasTramite = tareaTramiteExpedienteService
						.findByTramite(tramite.getId());
				if (tareasTramite != null) {
					tareas.addAll(tareasTramite);
				}
			}
		}

		List<TareaTramiteExpediente> ordenadas = InsideIflowMapper.ordenarTareasConDocumento(tareas);
		List<InsideTareaDocumentoContextDto> documentos = new ArrayList<>();
		int orden = 0;

		for (TareaTramiteExpediente tarea : ordenadas) {
			orden++;
			InsideTareaDocumentoContextDto documento = new InsideTareaDocumentoContextDto();
			documento.setTarea(tarea);
			documento.setOrden(orden);
			documento.setMetadatos(insideMetadatosEniService.obtenerMetadatosPorArchivo(tarea.getArchivo()));
			documento.setContenidoBase64(insideEniFileService.obtenerContenidoArchivoBase64(tarea.getArchivo()));
			documento.setIndice(buscarIndice(indiceEni, tarea.getArchivo()));
			documentos.add(documento);
		}

		return documentos;
	}

	private IndiceENI buscarIndice(List<IndiceENI> indiceEni, Long codArchi) {
		if (indiceEni == null || codArchi == null) {
			return null;
		}

		String codigo = String.valueOf(codArchi);
		for (IndiceENI item : indiceEni) {
			if (codigo.equals(item.getArchivo())) {
				return item;
			}
		}

		return null;
	}

	private List<AtributoExpediente> cargarAtributos(Long expedienteId) {
		List<AtributoExpediente> atributos = atributoExpedienteService.findByIdExped(expedienteId);
		return atributos != null ? atributos : new ArrayList<>();
	}

	private List<String> cargarInteresados(Long expedienteId) {
		Set<String> documentos = new LinkedHashSet<>();
		List<Interesado> interesados = interesadoService.findByExpediente(expedienteId);
		if (interesados == null) {
			return new ArrayList<>();
		}

		for (Interesado interesado : interesados) {
			PersonaEntidadPK pk = new PersonaEntidadPK();
			pk.setIdHisPerso(interesado.getIdHisPerso());
			pk.setIdPerso(interesado.getIdPerso());
			PersonaEntidad persona = personaEntidadService.findById(pk);
			if (persona != null && persona.getNumDocum() != null && !persona.getNumDocum().isBlank()) {
				documentos.add(persona.getNumDocum().trim());
			}
		}

		return new ArrayList<>(documentos);
	}

	private String resolverClasificacion(Expediente expediente) {
		if (expediente.getProcedimiento() == null) {
			return "";
		}

		Procedimiento procedimiento = procedimientoService.findById(expediente.getProcedimiento());
		if (procedimiento != null && procedimiento.getCodigoSia() != null) {
			return procedimiento.getCodigoSia();
		}

		return String.valueOf(expediente.getProcedimiento());
	}

	private String resolverOrgano(Expediente expediente) {
		if (expediente.getProcedimiento() != null) {
			Procedimiento procedimiento = procedimientoService.findById(expediente.getProcedimiento());
			if (procedimiento != null && procedimiento.getDepartamento() != null) {
				OrganizacionElemento departamento = procedimiento.getDepartamento();
				if (departamento.getOrgano() != null && !departamento.getOrgano().isBlank()) {
					return departamento.getOrgano();
				}
				if (departamento.getCadEleme() != null && !departamento.getCadEleme().isBlank()) {
					return departamento.getCadEleme();
				}
			}
		}

		if (expediente.getInstructor() != null && expediente.getInstructor().length() >= 9) {
			List<OrganizacionUsuario> usuarios = organizacionUsuarioService.findByUsuario2(expediente.getInstructor());
			if (usuarios != null && !usuarios.isEmpty()) {
				OrganizacionElemento elemento = organizacionElementoService.findById(usuarios.get(0).getIdOrgEleme());
				if (elemento != null && elemento.getOrgano() != null) {
					return elemento.getOrgano();
				}
			}
			return expediente.getInstructor().substring(0, 9);
		}

		return "EA0000000";
	}
}
