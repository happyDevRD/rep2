package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.TareaHistoricoTramiteExpediente;

public interface TareaHistoricoTramiteExpedienteDao extends CrudRepository<TareaHistoricoTramiteExpediente, Long>{

	List<TareaHistoricoTramiteExpediente> findByTarea(Long idTarea);
}
