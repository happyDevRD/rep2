package com.greenaall.models.pe.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.pe.entity.Notificacion;

public interface NotificacionDao extends CrudRepository<Notificacion, Long>{
	
	@Query(value = "SELECT * FROM pe_notificacion WHERE eje_exped = ?1 AND num_exped = ?2", nativeQuery = true)
	List<Notificacion> findByEjeExpedAndNumExped(Short ejeExped, String numExped);
	
	@Query(value = "SELECT max(num_notif) FROM pe_notificacion WHERE eje_notif = ?1", nativeQuery = true)
	BigDecimal max(Short ejeNotif);

}
