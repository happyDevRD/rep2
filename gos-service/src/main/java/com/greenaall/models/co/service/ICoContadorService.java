package com.greenaall.models.co.service;

import com.greenaall.models.co.entity.CoContador;
import com.greenaall.models.co.entity.CoContadorPK;

public interface ICoContadorService {

	public CoContador findById(CoContadorPK oContadorPK);
	public CoContador save(CoContador oContador);
}
