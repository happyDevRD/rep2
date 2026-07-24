package com.greenaall.models.te.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.te.entity.Domicilio;
import com.greenaall.models.te.entity.DomicilioPK;

public interface DomicilioDao extends CrudRepository<Domicilio, DomicilioPK>{

}
