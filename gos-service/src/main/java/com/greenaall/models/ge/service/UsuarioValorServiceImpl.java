package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ge.dao.UsuarioValorDao;
import com.greenaall.models.ge.entity.UsuarioValor;

@Service
public class UsuarioValorServiceImpl implements IUsuarioValorService {
	
	@Autowired
	private UsuarioValorDao usuarioValorDao;

	@Override
	public List<UsuarioValor> findByUsuarioAndNumValor(String usuario, Short numValor) {
		List<UsuarioValor> aUsuarioValor = (List<UsuarioValor>) usuarioValorDao.findByUsuarioAndNumValor(usuario, numValor);
		if(aUsuarioValor == null || aUsuarioValor.isEmpty()) {
			return null;
		}
		return aUsuarioValor;
	}

}
