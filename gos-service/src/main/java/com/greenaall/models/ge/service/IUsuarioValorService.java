package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.UsuarioValor;

public interface IUsuarioValorService {
	
	public List<UsuarioValor> findByUsuarioAndNumValor(String usuario, Short numValor);

}
