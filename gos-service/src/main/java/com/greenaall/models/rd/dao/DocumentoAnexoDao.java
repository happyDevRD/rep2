package com.greenaall.models.rd.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.rd.entity.RdDocumentoAnexo;
import com.greenaall.models.rd.entity.RdDocumentoAnexoPK;

public interface DocumentoAnexoDao extends CrudRepository<RdDocumentoAnexo, RdDocumentoAnexoPK>{

	@Query(value = "SELECT max(num_orden) FROM rd_documento_anexo WHERE tip_anexo = ?1", nativeQuery = true)
	BigDecimal max(Short tipAnexo);
}
