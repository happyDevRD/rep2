package com.greenaall.ex.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.AtributoExpedientePK;
import com.greenaall.models.ex.service.AtributoExpedienteoServiceImpl;
import com.greenaall.models.ge.dto.MetadatoGrupoAtributoDto;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributo;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributoPK;
import com.greenaall.models.ge.service.MetadatoGrupoAtribImpl;

/**
 *
 * @author jmmoyano
 */

@RestController
public class AtributoExpedienteController {

	@Autowired
	private AtributoExpedienteoServiceImpl service;
	
	@Autowired
	private MetadatoGrupoAtribImpl metadatoGrupoAtributoService;

	@PutMapping("/atributoExpediente/editar")
	@ResponseStatus(HttpStatus.CREATED)
	public AtributoExpediente editar(@RequestBody AtributoExpediente atributoExpediente) {
			
		atributoExpediente.setFecContr(new Date());
		return service.save(atributoExpediente);

	}
	
	@DeleteMapping("/atributoExpediente/borrar/{idGrupo}/{etiGruAtrib}/{idExped}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long idGrupo, @PathVariable String etiGruAtrib, @PathVariable Long idExped) {

		AtributoExpedientePK oAtributoExpedientePK = new AtributoExpedientePK();
		oAtributoExpedientePK.setIdGrupo(idGrupo);
		oAtributoExpedientePK.setEtiGruAtrib(etiGruAtrib);
		oAtributoExpedientePK.setIdExped(idExped);
		
		service.deleteById(oAtributoExpedientePK);
    }

	@GetMapping("/atributoExpediente/listar/{idExped}")
	public List<MetadatoGrupoAtributoDto> listar(@PathVariable Long idExped) {

		List<AtributoExpediente> aAtributosExpediente = service.findByIdExped(idExped);

		if (aAtributosExpediente != null && !aAtributosExpediente.isEmpty()) {
			List<MetadatoGrupoAtributoDto> aMetadatos = new ArrayList<MetadatoGrupoAtributoDto>();
			for (int i = 0; i < aAtributosExpediente.size(); i++) {
				MetadatoGrupoAtributoPK oMetadatoGrupoAtributoPK = new MetadatoGrupoAtributoPK();
				oMetadatoGrupoAtributoPK.setIdGrupo(aAtributosExpediente.get(i).getIdGrupo());
				oMetadatoGrupoAtributoPK.setEtiGruAtrib(aAtributosExpediente.get(i).getEtiGruAtrib());

				MetadatoGrupoAtributo oMetadatoGrupo = metadatoGrupoAtributoService.findById(oMetadatoGrupoAtributoPK);
				MetadatoGrupoAtributoDto oMetadatos = new MetadatoGrupoAtributoDto();
				oMetadatos.setValor(aAtributosExpediente.get(i).getValor());
				oMetadatos.setIdGrupo(aAtributosExpediente.get(0).getIdGrupo());

				if (oMetadatoGrupo.getDesGruAtrib() != null) {
					oMetadatos.setDesGruAtrib(oMetadatoGrupo.getDesGruAtrib());
				}
				if (oMetadatoGrupo.getEtiGruAtrib() != null) {
					oMetadatos.setEtiGruAtrib(oMetadatoGrupo.getEtiGruAtrib());
				}
				if (oMetadatoGrupo.getRequerido() != null) {
					oMetadatos.setRequerido(oMetadatoGrupo.getRequerido());
				}
				if (oMetadatoGrupo.getValInici() != null) {
					oMetadatos.setValInici(oMetadatoGrupo.getValInici());
				}
				if (oMetadatoGrupo.getValMaxim() != null) {
					oMetadatos.setValMaxim(oMetadatoGrupo.getValMaxim());
				}
				if (oMetadatoGrupo.getValMinim() != null) {
					oMetadatos.setValMinim(oMetadatoGrupo.getValMinim());
				}
				if (oMetadatoGrupo.getIdAtrib() != null) {
					oMetadatos.setIdAtrib(oMetadatoGrupo.getIdAtrib());
					if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 1))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 2))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 1));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 3))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 2));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 4))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 3));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 5))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 4));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 6))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 5));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 7))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 6));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 8))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 7));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 9))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 8));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 10))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 9));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 11))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 10));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 12))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 11));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 13))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 12));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 14))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 15));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 15))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 20));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 16))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 50));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 17))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 100));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 18))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 200));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 19))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 500));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 20))) {
						oMetadatos.setTipo("TEXTO");
						oMetadatos.setLongitud(Short.valueOf((short) 1000));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 21))) {
						oMetadatos.setTipo("FECHACORTA");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 22))) {
						oMetadatos.setTipo("FECHALARGA");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 23))) {
						oMetadatos.setTipo("FECHAHORA");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 24))) {
						oMetadatos.setTipo("HORA");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 25))) {
						oMetadatos.setTipo("AÑOLARGO");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 26))) {
						oMetadatos.setTipo("AÑOCORTO");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 27))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 1));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 28))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 2));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 29))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 3));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 30))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 4));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 31))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 5));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 32))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 6));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 33))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 7));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 34))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 8));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 35))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 9));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 36))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 10));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 37))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 11));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 38))) {
						oMetadatos.setTipo("NUMERO");
						oMetadatos.setLongitud(Short.valueOf((short) 12));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 39))) {
						oMetadatos.setTipo("MONEDA");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 40))) {
						oMetadatos.setTipo("PRECIO");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 41))) {
						oMetadatos.setTipo("PORCENTAJE");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					} else if (oMetadatoGrupo.getIdAtrib().equals(Long.valueOf((long) 42))) {
						oMetadatos.setTipo("COEFICIENTE");
						oMetadatos.setLongitud(Short.valueOf((short) 0));
					}
				}
				aMetadatos.add(oMetadatos);
			}
			return aMetadatos;
		}
		return null;
	}

}
