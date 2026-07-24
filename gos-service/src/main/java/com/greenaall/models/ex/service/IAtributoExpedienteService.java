package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.AtributoExpedientePK;

public interface IAtributoExpedienteService {
	
	public AtributoExpediente save(AtributoExpediente otributoExpediente);
	public List<AtributoExpediente> findAll();
	public AtributoExpediente findById(AtributoExpedientePK id);
	public void deleteById(AtributoExpedientePK atributoExpediente);
	public List<AtributoExpediente> findByIdExped(Long idExped);
	public AtributoExpediente findByIdGrupoAndEtiGruAtrib(Long idGrupo, String etiGruAtrib);

}
