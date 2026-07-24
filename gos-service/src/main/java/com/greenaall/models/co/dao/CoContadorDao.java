package com.greenaall.models.co.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.co.entity.CoContador;
import com.greenaall.models.co.entity.CoContadorPK;

public interface CoContadorDao extends CrudRepository<CoContador, CoContadorPK>{

}
