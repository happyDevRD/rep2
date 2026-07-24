package com.greenaall.models.ad.service;

import com.greenaall.models.ad.entity.Contador;

public interface IContadorService {

	public Contador findByAnnoAndModuloAndNumContaAndCodEntid(Short anno, Short modulo, Short numConta, Short codEntid);
	public Contador save(Contador oContador);
}
