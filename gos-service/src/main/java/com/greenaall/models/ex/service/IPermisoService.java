package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.Permiso;

public interface IPermisoService {

	public Permiso save(Permiso permiso);
	public List<Permiso> findAll();
	public List<Permiso> findByIdTarProce(Long idTarProce);
	public Permiso findById(Long id);
	public void deleteById(Long id);
	public List<Permiso> findByProcedimientoAndUsuario(Long procedimiento, String usuario);
	public List<Permiso> findByTareaAndUsuario(Long idTarProce, String usuario);
}
