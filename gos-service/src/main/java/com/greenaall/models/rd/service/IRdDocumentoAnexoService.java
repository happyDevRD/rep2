package com.greenaall.models.rd.service;

import java.math.BigDecimal;

import com.greenaall.models.rd.entity.RdDocumentoAnexo;

public interface IRdDocumentoAnexoService {

	public RdDocumentoAnexo save(RdDocumentoAnexo oRdDocumentoAnexo);
	public BigDecimal max(Short tipAnexo);
}
