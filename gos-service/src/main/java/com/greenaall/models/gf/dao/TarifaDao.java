package com.greenaall.models.gf.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.GfTarifa;

public interface TarifaDao extends CrudRepository<GfTarifa, Long>{

	List<GfTarifa> findByIdProce(Long idProce);
}
