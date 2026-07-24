package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.TareaProcedimiento;

public interface ITareaProcedimientoService {

	public TareaProcedimiento save(TareaProcedimiento tareaProcedimiento);
	public List<TareaProcedimiento> findAll();
	public TareaProcedimiento findById(Long id);
	public void deleteById(Long id);
	public List<TareaProcedimiento> findByProcedimiento(Long procedimiento);
	public TareaProcedimiento findByTareaAutomatica(Long procedimiento);
	public List<TareaProcedimiento> findByProcedimientoAndFaseTarea(Long procedimiento, String faseTarea);
	
}
