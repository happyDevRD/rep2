package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.ImpuestoConcepto;
import com.greenaall.models.gf.entity.ImpuestoConceptoPK;

public interface IImpuestoConceptoService {
	
	public ImpuestoConcepto findById(ImpuestoConceptoPK oImpuestoConceptoPK);
	public List<ImpuestoConcepto> findByIdImpue(Long idImpue);

}
