package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	public Usuario findById(String usuario);
	public Usuario findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);
}
