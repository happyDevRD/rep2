package com.greenaall.models.ge.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.MetadatoGrupo;

public interface MetadatoGrupoDao extends CrudRepository<MetadatoGrupo, Long>{

	 MetadatoGrupo findByCodGrupo(String codGrupo);
}
