package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;

public interface IParametroSistemaService {
	
	public List<ParametroSistema> findAll();
	public ParametroSistema findById(ParametroSistemaPK oParametroSistemaPK);

}
