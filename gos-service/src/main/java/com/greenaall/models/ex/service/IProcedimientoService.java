package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.Procedimiento;

public interface IProcedimientoService {

	public Procedimiento save(Procedimiento procedimiento);
	public List<Procedimiento> findAll();
	public Procedimiento findById(Long id);
	public List<Procedimiento> findByDescripcion(String descripcion);
	public void deleteById(Long id);
}
