package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.Tramitador;

public interface ITramitadorService {

	public Tramitador save(Tramitador tramitador);
	public List<Tramitador> findAll();
	public Tramitador findById(Long id);
	public void deleteById(Long id);
	public List<Tramitador> findByExpediente(Long expediente);
	public List<Tramitador> findByUsuario(String usuario);
	public List<Long> findByExpedientUsuario(String usuario);
	public List<Tramitador> findByExpedienteAndPosesion(Long id, String usuario);
	public List<Tramitador> findByExpedienteAndPosesionAndEstado(Long id, String usuario);
}
