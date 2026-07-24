package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.TipoObjetoTributario;
import com.greenaall.models.gf.entity.TipoObjetoTributarioPK;

public interface ITipoObjetoTributarioService {

	public List<TipoObjetoTributario> findByModulo(Short modulo);
	public TipoObjetoTributario findById(TipoObjetoTributarioPK oTipoObjetoTributarioPK);
}
