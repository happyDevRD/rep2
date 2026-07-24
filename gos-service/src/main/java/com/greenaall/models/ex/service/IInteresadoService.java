package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.Interesado;

public interface IInteresadoService {

	public Interesado save(Interesado intersado);
	public List<Interesado> findAll();
	public Interesado findById(Long id);
	public void deleteById(Long id);
	public List<Interesado> findByExpediente(Long expediente);
	public List<Interesado> findByExpedienteAndIdHisPerso(Long expediente, Long idHisPerso);
	public Interesado findByExpedienteAndPrincipal(Long expediente);
}
