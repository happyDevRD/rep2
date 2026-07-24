package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dao.MensajeDao;
import com.greenaall.models.ex.entity.Mensaje;

@Service
public class MensajeServiceImpl implements IMensajeService{
	
	@Autowired
    private MensajeDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Mensaje findById(Long id) {
		Mensaje mensaje = dao.findById(id).orElse(null);
        if (mensaje == null) {
        	throw new NoDataFoundException();
        }
        return mensaje;
	}
	
	@Override
	@Transactional
	public Mensaje save(Mensaje mensaje) {
		return dao.save(mensaje);
	}

	@Override
	@Transactional( readOnly = true)
	public List<Mensaje> findAll() {
		return (List<Mensaje>) dao.findAll();
	}

	@Override
	public void deleteById(Long id) {
		dao.deleteById(id);	 	
	}

	@Override
	@Transactional( readOnly = true)
	public List<Mensaje> findByDestinatario(Long destinatario) {
		List<Mensaje> aMensajes = (List<Mensaje>) dao.findByDestinatario(destinatario);
		if(aMensajes.isEmpty()) {
			return null;
		}
		return aMensajes;
	}

	@Override
	public List<Mensaje> findByRemitente(Long remitente) {
		List<Mensaje> aMensajes = (List<Mensaje>) dao.findByRemitente(remitente);
		if(aMensajes.isEmpty()) {
			return null;
		}
		return aMensajes;
	}

	@Override
	public List<Mensaje> findByEstadoAndDestinatario(String estado, Long destinatario) {
		List<Mensaje> aMensajes = (List<Mensaje>) dao.findByEstadoAndDestinatario(estado, destinatario);
		if(aMensajes.isEmpty()) {
			return null;
		}
		return aMensajes;
	}

	@Override
	public List<Mensaje> findByDestinatarioAndExpediente(Long destinatario, Long idExped) {
		List<Mensaje> aMensajes = (List<Mensaje>) dao.findByDestinatarioAndExpediente(destinatario, idExped);
		if(aMensajes.isEmpty()) {
			return null;
		}
		return aMensajes;
	}
	
}
