package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.Mensaje;

public interface MensajeDao extends CrudRepository<Mensaje, Long>{

	List<Mensaje> findByDestinatario(Long destinatario);
	List<Mensaje> findByRemitente (Long remitente);
	
	@Query(value = "SELECT * FROM ex_mensaje WHERE estado = ?1 AND destinatario = ?2", nativeQuery = true)
	List<Mensaje> findByEstadoAndDestinatario (String estado, Long destinatario);
	
	
	@Query(value = "SELECT * FROM ex_mensaje WHERE estado = 'TRAMITANDO' AND destinatario = ?1 AND id_exped = ?2", nativeQuery = true)
	List<Mensaje> findByDestinatarioAndExpediente (Long destinatario, Long idExped);
}
