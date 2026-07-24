package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.Tramite;

public interface TramiteDao extends CrudRepository<Tramite, Long>{

	List<Tramite> findByExpediente(Long expediente);
}
