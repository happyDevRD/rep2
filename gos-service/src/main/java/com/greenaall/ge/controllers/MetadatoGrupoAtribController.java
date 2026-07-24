package com.greenaall.ge.controllers;

import java.util.Date;
import java.util.ArrayList;
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

import com.greenaall.exception.MetadatoGrupoAtribError;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ge.dto.MetadatoGrupoAtributoDto;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributo;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributoPK;
import com.greenaall.models.ge.service.MetadatoGrupoAtribImpl;
import com.greenaall.models.gf.entity.GfTarifa;
import com.greenaall.models.gf.service.TarifaServiceImpl;

/**
*
* @author jmmoyano
*/

@RestController
public class MetadatoGrupoAtribController {
	
	@Autowired
	private MetadatoGrupoAtribImpl metadatoGrupoAtributoService;
	
	
	@Autowired
	private TarifaServiceImpl tarifaService;
	
	@DeleteMapping("/metadatoGrupoAtributo/borrar/{idGrupo}/{etiGruAtrib}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long idGrupo, @PathVariable String etiGruAtrib) {
		
	
		MetadatoGrupoAtributoPK oMetadatoGrupoAtributoPK = new MetadatoGrupoAtributoPK();
		oMetadatoGrupoAtributoPK.setIdGrupo(idGrupo);
		oMetadatoGrupoAtributoPK.setEtiGruAtrib(etiGruAtrib);
		
		metadatoGrupoAtributoService.deleteById(oMetadatoGrupoAtributoPK);
    }
	
	@PutMapping("/metadatoGrupoAtributo/editar")
	@ResponseStatus(HttpStatus.CREATED)
	public MetadatoGrupoAtributo editar(@RequestBody MetadatoGrupoAtributoDto oMetadatos, @PathVariable String etiOri) {
		
		MetadatoGrupoAtributoPK oMetadatoGrupoAtributoPK = new MetadatoGrupoAtributoPK();
		oMetadatoGrupoAtributoPK.setIdGrupo(oMetadatos.getIdGrupo());
		oMetadatoGrupoAtributoPK.setEtiGruAtrib(oMetadatos.getEtiGruAtrib());
		
		MetadatoGrupoAtributo oMetadatoGrupo = metadatoGrupoAtributoService.findById(oMetadatoGrupoAtributoPK);
		
		if(oMetadatoGrupo != null) {
			
			if(oMetadatos.getEtiGruAtrib() != null) {
				oMetadatoGrupo.setEtiGruAtrib(oMetadatos.getEtiGruAtrib());
			}
			if(oMetadatos.getValInici() != null) {
				oMetadatoGrupo.setValInici(oMetadatos.getValInici());
			}
			if(oMetadatos.getValMinim() != null) {
				oMetadatoGrupo.setValMinim(oMetadatos.getValMinim());
			}
			if(oMetadatos.getValMaxim() != null) {
				oMetadatoGrupo.setValMaxim(oMetadatos.getValMaxim());
			}
			if(oMetadatos.getRequerido() != null) {
				oMetadatoGrupo.setRequerido(oMetadatos.getRequerido());
			}
			if(oMetadatos.getIdAtrib() != null) {
				oMetadatoGrupo.setIdAtrib(oMetadatos.getIdAtrib());
			}
			if(oMetadatos.getUsuario() != null) {
				oMetadatoGrupo.setUsuContr(oMetadatos.getUsuario());
			}
		
			MetadatoGrupoAtributo oMetadatoGrupoModif = metadatoGrupoAtributoService.save(oMetadatoGrupo);
			return oMetadatoGrupoModif;
		}
		return null;
	}
	
	@PostMapping("/metadatoGrupoAtributo/crear/{idProc}")
	@ResponseStatus(HttpStatus.CREATED)
	public MetadatoGrupoAtributo crear(@RequestBody MetadatoGrupoAtributoDto oMetadatos, @PathVariable Long idProc) throws Exception{
		
		List<GfTarifa> oTarifaBus = tarifaService.findByIdProce(idProc);
		
		MetadatoGrupoAtributo oMetadatoGrupoBus = metadatoGrupoAtributoService.findByIdGrupoAndEtiGruAtrib(oTarifaBus.get(0).getIdGrupo(), oMetadatos.getEtiGruAtrib());
		
		if(oMetadatoGrupoBus != null) {
			throw new MetadatoGrupoAtribError(oMetadatoGrupoBus.getEtiGruAtrib());
		}
				
		MetadatoGrupoAtributo oMetadatoGrupo = new MetadatoGrupoAtributo();
		oMetadatoGrupo.setDesGruAtrib(oMetadatos.getDesGruAtrib());
		oMetadatoGrupo.setIdAtrib(oMetadatos.getIdAtrib());
		oMetadatoGrupo.setRequerido(oMetadatos.getRequerido());
		oMetadatoGrupo.setEtiGruAtrib(oMetadatos.getEtiGruAtrib());
		
		if(oMetadatos.getValInici() != null) {
			oMetadatoGrupo.setValInici(oMetadatos.getValInici());
		}
		if(oMetadatos.getValMinim() != null) {
			oMetadatoGrupo.setValMinim(oMetadatos.getValMinim());
		}
		if(oMetadatos.getValMaxim() != null) {
			oMetadatoGrupo.setValMaxim(oMetadatos.getValMaxim());
		}
		
		if(oTarifaBus != null && !oTarifaBus.isEmpty()) {
			oMetadatoGrupo.setIdGrupo(oTarifaBus.get(0).getIdGrupo());
		}
		oMetadatoGrupo.setFiltrable(Short.valueOf((short) 1));
		oMetadatoGrupo.setModificable(Short.valueOf((short) 1));
		oMetadatoGrupo.setReservado(Short.valueOf((short) 1));
		oMetadatoGrupo.setVisWeb(Short.valueOf((short) 1));
		oMetadatoGrupo.setVisible(Short.valueOf((short) 1));
		oMetadatoGrupo.setFecContr(new Date());
		oMetadatoGrupo.setUsuContr(oMetadatos.getUsuario());
		
		metadatoGrupoAtributoService.save(oMetadatoGrupo);
		
		return oMetadatoGrupo;
	}
	
	@GetMapping("metadatoGrupoAtrib/listarPorTipoObjeto/{idGrupo}")
	public List<MetadatoGrupoAtributo> listarAtributosPorTipoObjeto(@PathVariable Long idGrupo){
		
		List<MetadatoGrupoAtributo> aMetadatos = metadatoGrupoAtributoService.findByIdGrupo(idGrupo);
		
		if(aMetadatos == null) {
			throw new NoDataFoundException(); 
		}
		
		return aMetadatos;
	}

	@GetMapping("metadatoGrupoAtrib/listarPorProc/{idProce}")
	public List<MetadatoGrupoAtributoDto> listarAtributosPorProcedimiento(@PathVariable Long idProce){
		
		List<GfTarifa> aTarifa = tarifaService.findByIdProce(idProce);
		List<MetadatoGrupoAtributoDto> aMetadatos = new ArrayList<MetadatoGrupoAtributoDto>();
		if(aTarifa != null) {
			List<MetadatoGrupoAtributo> aMetadatoGrupoAtributo = metadatoGrupoAtributoService.findByIdGrupo(aTarifa.get(0).getIdGrupo());
			if(aMetadatoGrupoAtributo != null) {
				for(int i = 0; i < aMetadatoGrupoAtributo.size(); i++) {
					MetadatoGrupoAtributoDto oMetadatos = new MetadatoGrupoAtributoDto();
					oMetadatos.setIdGrupo(aTarifa.get(0).getIdGrupo());
					if(aMetadatoGrupoAtributo.get(i).getDesGruAtrib() != null) {
						oMetadatos.setDesGruAtrib(aMetadatoGrupoAtributo.get(i).getDesGruAtrib());
					}
					if(aMetadatoGrupoAtributo.get(i).getEtiGruAtrib() != null) {
						oMetadatos.setEtiGruAtrib(aMetadatoGrupoAtributo.get(i).getEtiGruAtrib());
					}
					if(aMetadatoGrupoAtributo.get(i).getRequerido() != null) {
						oMetadatos.setRequerido(aMetadatoGrupoAtributo.get(i).getRequerido());
					}
					if(aMetadatoGrupoAtributo.get(i).getValInici() != null) {
						oMetadatos.setValInici(aMetadatoGrupoAtributo.get(i).getValInici());
					}
					if(aMetadatoGrupoAtributo.get(i).getValMaxim() != null) {
						oMetadatos.setValMaxim(aMetadatoGrupoAtributo.get(i).getValMaxim());
					}
					if(aMetadatoGrupoAtributo.get(i).getValMinim() != null) {
						oMetadatos.setValMinim(aMetadatoGrupoAtributo.get(i).getValMinim());
					}
					if(aMetadatoGrupoAtributo.get(i).getIdAtrib() != null) {
						oMetadatos.setIdAtrib(aMetadatoGrupoAtributo.get(i).getIdAtrib());
						if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 1))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 2))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 1));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 3))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 2));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 4))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 3));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 5))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 4));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 6))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 5));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 7))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 6));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 8))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 7));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 9))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 8));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 10))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 9));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 11))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 10));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 12))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 11));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 13))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 12));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 14))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 15));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 15))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 20));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 16))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 50));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 17))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 100));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 18))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 200));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 19))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 500));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 20))) {
							oMetadatos.setTipo("TEXTO");
							oMetadatos.setLongitud(Short.valueOf((short) 1000));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 21))) {
							oMetadatos.setTipo("FECHACORTA");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 22))) {
							oMetadatos.setTipo("FECHALARGA");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 23))) {
							oMetadatos.setTipo("FECHAHORA");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 24))) {
							oMetadatos.setTipo("HORA");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 25))) {
							oMetadatos.setTipo("AÑOLARGO");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 26))) {
							oMetadatos.setTipo("AÑOCORTO");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 27))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 1));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 28))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 2));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 29))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 3));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 30))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 4));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 31))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 5));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 32))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 6));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 33))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 7));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 34))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 8));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 35))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 9));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 36))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 10));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 37))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 11));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 38))) {
							oMetadatos.setTipo("NUMERO");
							oMetadatos.setLongitud(Short.valueOf((short) 12));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 39))) {
							oMetadatos.setTipo("MONEDA");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 40))) {
							oMetadatos.setTipo("PRECIO");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 41))) {
							oMetadatos.setTipo("PORCENTAJE");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}else if(aMetadatoGrupoAtributo.get(i).getIdAtrib().equals(Long.valueOf((long) 42))) {
							oMetadatos.setTipo("COEFICIENTE");
							oMetadatos.setLongitud(Short.valueOf((short) 0));
						}
					}
					aMetadatos.add(oMetadatos);
				}
				return aMetadatos;
			}
		}
		return null;
	}
}
