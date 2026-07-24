package com.greenaall.models.gf.service;

import com.greenaall.models.gf.entity.ContadorTipoObjetoTributario;

public interface IContadorTipoObjetoTributarioService {
	
	public ContadorTipoObjetoTributario findById(Long idTipObjTribu);
	public ContadorTipoObjetoTributario save(ContadorTipoObjetoTributario oContadorTipoObjetoTributario);

}
