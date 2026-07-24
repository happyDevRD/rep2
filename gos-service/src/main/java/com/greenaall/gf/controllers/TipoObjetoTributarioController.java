package com.greenaall.gf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.gf.dto.TipoObjetoTributarioDto;
import com.greenaall.models.gf.entity.TipoObjetoTributario;
import com.greenaall.models.gf.service.ITipoObjetoTributarioService;



@RestController
public class TipoObjetoTributarioController {
	
	@Autowired
	private ITipoObjetoTributarioService tipoObjetoTributarioService;
	
	@GetMapping("/tipoObjetoTributario/listar")
	public List<TipoObjetoTributarioDto> listar(){
		
		List<TipoObjetoTributario> aTipoObjetoTributario = tipoObjetoTributarioService.findByModulo(Short.valueOf((short) 7));
		
		List<TipoObjetoTributarioDto> aTipoObjetoTributarioDto = new ArrayList<TipoObjetoTributarioDto>();
		
		if(aTipoObjetoTributario != null && !aTipoObjetoTributario.isEmpty()) {
			
			for(int i = 0; i < aTipoObjetoTributario.size(); i++) {
				TipoObjetoTributarioDto oTipoObjetoDto = new TipoObjetoTributarioDto();
				oTipoObjetoDto.setIdHisTipObjTribu(aTipoObjetoTributario.get(i).getIdHisTipObjTribu());
				oTipoObjetoDto.setIdTipObjTribu(aTipoObjetoTributario.get(i).getIdTipObjTribu());
				oTipoObjetoDto.setCodTipObjTribu(aTipoObjetoTributario.get(i).getCodTipObjTribu());
				oTipoObjetoDto.setIdGrupo(aTipoObjetoTributario.get(i).getIdGrupo());
				aTipoObjetoTributarioDto.add(oTipoObjetoDto);
			}
		}
		return aTipoObjetoTributarioDto;
	}

}
