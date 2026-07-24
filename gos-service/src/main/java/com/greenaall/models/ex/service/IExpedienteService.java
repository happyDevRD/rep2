package com.greenaall.models.ex.service;

import java.math.BigDecimal;
import java.util.List;

import com.greenaall.models.ex.entity.Expediente;


public interface IExpedienteService {

	public Expediente save(Expediente expediente);
	public List<Expediente> findAll();
	public Expediente findById(Long id);
	public List<Expediente> findByInstructor(String instructor);
	public void deleteById(Long id);
	public BigDecimal max(Short ejercicio);
	public Expediente findByEjercicioAndNumero(Short ejercicio, Integer numero);
	public List<Expediente> findByProcedimiento(Long idProc);
}
