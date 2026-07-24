package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;


public interface ITareaHistoricoTramiteExpedienteService {
	
	public TareaHistoricoTramiteExpediente save(TareaHistoricoTramiteExpediente tareaHistoricoTramiteExpediente);
	public List<TareaHistoricoTramiteExpediente> findAll();
	public TareaHistoricoTramiteExpediente findById(Long id);
	public void deleteById(Long id);
	public List<TareaHistoricoTramiteExpediente> findByTarea(Long idTarea);

}
