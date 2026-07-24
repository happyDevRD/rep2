package com.greenaall.models.ex.service;

import java.util.List;

import com.greenaall.models.ex.entity.TareaTramiteExpediente;

public interface ITareaTramiteExpedienteService {

	public TareaTramiteExpediente save(TareaTramiteExpediente tareaTramiteExpediente);
	public List<TareaTramiteExpediente> findAll();
	public TareaTramiteExpediente findById(Long id);
	public void deleteById(Long id);
	public List<TareaTramiteExpediente> findByTramite(Long tramite);
	public List<TareaTramiteExpediente> findByUsuario(String usuario);
	public List<TareaTramiteExpediente> findByTareaProcedimiento(Long tareaProcedimiento);
	public List<TareaTramiteExpediente> findByNotificacion(Long notificacion);
	public List<TareaTramiteExpediente> findbyUsuarioAndFecFin(String usuario);
	public List<TareaTramiteExpediente> findbyInstructor(String usuario);
	List<TareaTramiteExpediente> findbyFirmado(Short firmado);
}
