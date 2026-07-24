package com.greenaall.models.pe.service;

import com.greenaall.models.pe.entity.DomiciliacionBancaria;
import com.greenaall.models.pe.entity.DomiciliacionBancariaPK;

public interface IDomiciliacionBancariaService {
	
	public DomiciliacionBancaria findById(DomiciliacionBancariaPK oDomiciliacionBancariaPK);
	public DomiciliacionBancaria save(DomiciliacionBancaria oDomiciliacionBancaria);

}
