package com.greenaall.models.rd.service;

import java.math.BigDecimal;

import com.greenaall.models.rd.entity.RdDocumentoInteresado;

public interface IRdDocumentoInteresadoService {
	
	public RdDocumentoInteresado save(RdDocumentoInteresado oRdDocumentoInteresado);
	public BigDecimal max(Short intPrinc);
}
