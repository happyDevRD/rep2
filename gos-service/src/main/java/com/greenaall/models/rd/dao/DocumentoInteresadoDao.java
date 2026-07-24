package com.greenaall.models.rd.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.rd.entity.RdDocumentoInteresado;
import com.greenaall.models.rd.entity.RdDocumentoInteresadoPK;

public interface DocumentoInteresadoDao extends CrudRepository<RdDocumentoInteresado, RdDocumentoInteresadoPK>{

	@Query(value = "SELECT max(num_orden) FROM rd_documento_interesado WHERE int_princ = ?1", nativeQuery = true)
	BigDecimal max(Short intPrinc);
}
