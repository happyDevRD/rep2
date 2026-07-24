package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ge.dao.UsuarioDao;
import com.greenaall.models.ge.entity.Usuario;

@Service
public class UsuarioServiceImpl  implements IUsuarioService{

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(String usuario) {
		Usuario oUsuario = usuarioDao.findById(usuario).orElse(null);
		if(oUsuario == null) {
			return null;
		}
		return oUsuario;
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso) {
		Usuario oUsuario = usuarioDao.findByIdHisPersoAndIdPerso(idHisPerso, idPerso);
		if(oUsuario != null) {
			return oUsuario;
		}
		return null;
	}
}
