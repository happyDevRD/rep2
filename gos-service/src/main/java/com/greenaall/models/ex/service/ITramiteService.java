package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.Tramite;

public interface ITramiteService {

	public Tramite save(Tramite tramite);
	public List<Tramite> findAll();
	public Tramite findById(Long id);
	public void deleteById(Long id);
	public List<Tramite> findByExpediente(Long expediente);
}
