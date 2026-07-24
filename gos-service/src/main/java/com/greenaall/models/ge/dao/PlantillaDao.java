package com.greenaall.models.ge.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.Plantilla;
import com.greenaall.models.ge.entity.PlantillaPK;

public interface PlantillaDao extends CrudRepository<Plantilla, PlantillaPK> {

	List<Plantilla> findByModulo(Short sModulo);

}
