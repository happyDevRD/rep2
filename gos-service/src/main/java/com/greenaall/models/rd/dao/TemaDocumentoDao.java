package com.greenaall.models.rd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.rd.entity.RdTemaDocumento;

public interface TemaDocumentoDao extends CrudRepository<RdTemaDocumento, String> {

	@Query(value = "SELECT * FROM rd_tema_documento WHERE id_org_eleme = ?1 AND ind_activ = 1", nativeQuery = true)
	List<RdTemaDocumento> findByIdOrgElemeAndIndActiv(Long idOrgEleme);
}
