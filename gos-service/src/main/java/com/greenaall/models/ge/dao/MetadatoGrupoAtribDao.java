package com.greenaall.models.ge.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.MetadatoGrupoAtributo;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributoPK;

public interface MetadatoGrupoAtribDao extends CrudRepository<MetadatoGrupoAtributo, MetadatoGrupoAtributoPK>{

	List<MetadatoGrupoAtributo> findByIdGrupo(Long idGrupo);
	MetadatoGrupoAtributo findByEtiGruAtrib(String etiGruAtrib);
	
	@Query(value = "SELECT * FROM ge_metadato_grupo_atrib WHERE id_grupo = ?1 AND eti_gru_atrib = ?2", nativeQuery = true)
	MetadatoGrupoAtributo findByIdGrupoAndEtiGruAtrib(Long idGrupo, String etiGruAtrib);
}
