package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.MateriaProcedimiento;

public interface IMateriaProcedimientoService {
	
	public List<MateriaProcedimiento> findAll();
	public MateriaProcedimiento findById(Long id);

}
