package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.ObjetoTributario;
import com.greenaall.models.gf.entity.ObjetoTributarioPK;

public interface IObjetoTributarioService {

	public ObjetoTributario save(ObjetoTributario objetoTributario);
	public ObjetoTributario findById(ObjetoTributarioPK oObjetoTributarioPK);
	public List<ObjetoTributario> findByTipObjTribuAndSujPasiv(Long idHisTipObjTribu, Long idTipObjTribu, Long idHisSujPasiv, Long idSujPasiv);
	public ObjetoTributario findByIdObjTribu(Long idObjTribu, Long idHisTipObjTribu, Long idTipObjTribu);
}
