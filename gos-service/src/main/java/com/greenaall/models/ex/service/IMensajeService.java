package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.Mensaje;

public interface IMensajeService {
	
	public Mensaje save(Mensaje mensaje);
	public List<Mensaje> findAll();
	public Mensaje findById(Long id);
	public void deleteById(Long id);
	public List<Mensaje> findByDestinatario(Long destinatario);
	public List<Mensaje> findByRemitente (Long remitente);
	public List<Mensaje> findByEstadoAndDestinatario (String estado, Long destinatario);
	public List<Mensaje> findByDestinatarioAndExpediente (Long destinatario, Long idExped);

}
