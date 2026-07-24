package com.greenaall.models.co.service;

import java.util.List;

import com.greenaall.models.co.entity.JusGasto;

public interface IJusGastoService {
	
	public JusGasto save(JusGasto oJusGasto);
	public List<JusGasto> findAll();
	public JusGasto findById(Long idJusGasto);

}
