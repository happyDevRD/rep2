package com.greenaall.models.rd.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.rd.entity.RdRegistrador;
import com.greenaall.models.rd.entity.RdRegistradorPK;

public interface RegistradorDao extends CrudRepository<RdRegistrador, RdRegistradorPK>{

}
