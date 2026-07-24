package com.greenaall.models.rd.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.rd.entity.RdDocumento;

public interface DocumentoDao extends CrudRepository<RdDocumento, Long>{
	
	@Query(value = "SELECT * FROM rd_documento WHERE id_his_docum = ?1 AND cod_entid = 1 AND reg_activ = 1", nativeQuery = true)
	RdDocumento findByIdHisDocumAndRegActiv(Long idHisDocum);
}
