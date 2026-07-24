package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.TareaTramiteExpediente;

public interface TareaTramiteExpedienteDao extends CrudRepository<TareaTramiteExpediente, Long>{
	
	List<TareaTramiteExpediente> findByTramite(Long tramite);
	List<TareaTramiteExpediente> findByUsuario(String usuario);
	List<TareaTramiteExpediente> findByTareaProcedimiento(Long tareaProcedimiento);
	List<TareaTramiteExpediente> findByNotificacion(Long notificacion);
	
	
	@Query(value = "SELECT * FROM ex_tarea_tramite_expediente WHERE usuario = ?1 and fec_fin is null ORDER BY fec_inicio desc", nativeQuery = true)
	List<TareaTramiteExpediente> findbyUsuarioAndFecFin(String usuario);
	
	@Query(value = "SELECT a.* FROM ex_tarea_tramite_expediente a JOIN ex_tramite b ON (a.tramite = b.id) JOIN ex_expediente c ON (c.id = b.expediente) WHERE c.instructor = ?1 and a.fec_fin is null	ORDER BY a.fec_inicio desc", nativeQuery = true)
	List<TareaTramiteExpediente> findbyInstructor(String usuario);
	
	@Query(value = "SELECT * FROM ex_tarea_tramite_expediente WHERE firmado = ?1", nativeQuery = true)
	List<TareaTramiteExpediente> findbyFirmado(Short firmado);
	
}
