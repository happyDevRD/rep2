package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.DocumentoSolicitud;

public interface DocumentoSolicitudDao extends CrudRepository<DocumentoSolicitud, Long>{

	List<DocumentoSolicitud> findBySolicitud(Long solicitud);

}
