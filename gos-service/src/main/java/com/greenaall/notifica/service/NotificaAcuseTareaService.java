package com.greenaall.notifica.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.pe.entity.Notificacion;

@Service
public class NotificaAcuseTareaService {

	@Autowired
	private TareaTramiteExpedienteServiceImpl tareaTramiteExpedienteService;

	public void registrarAcuseEnTarea(Notificacion notificacion, String idAcuseExterno, Long codArchiAcuse,
			String usuContr) {
		List<TareaTramiteExpediente> tareas = tareaTramiteExpedienteService
				.findByNotificacion(notificacion.getIdNotif());
		if (tareas == null || tareas.isEmpty()) {
			return;
		}

		TareaTramiteExpediente tareaOrigen = tareas.get(0);
		short siguienteNumero = 1;
		if (tareaOrigen.getTramite() != null) {
			List<TareaTramiteExpediente> delTramite = tareaTramiteExpedienteService
					.findByTramite(tareaOrigen.getTramite());
			for (TareaTramiteExpediente t : delTramite) {
				if (t.getNumero() != null && t.getNumero() >= siguienteNumero) {
					siguienteNumero = (short) (t.getNumero() + 1);
				}
			}
		}

		Date ahora = new Date();
		TareaTramiteExpediente tareaAcuse = new TareaTramiteExpediente();
		tareaAcuse.setDescripcion("Acuse Notifica: " + idAcuseExterno);
		tareaAcuse.setFecInicio(ahora);
		tareaAcuse.setNumero(siguienteNumero);
		tareaAcuse.setVisible(true);
		tareaAcuse.setTramite(tareaOrigen.getTramite());
		tareaAcuse.setUsuario(tareaOrigen.getUsuario());
		tareaAcuse.setTramitador(tareaOrigen.getTramitador());
		tareaAcuse.setTareaProcedimiento(tareaOrigen.getTareaProcedimiento());
		tareaAcuse.setNotificacion(notificacion.getIdNotif());
		tareaAcuse.setDocAport(Short.valueOf((short) 0));
		tareaAcuse.setTipDocEni("TD99");
		tareaAcuse.setTipAnexo(Short.valueOf((short) 0));
		tareaAcuse.setDocumentacion(Short.valueOf((short) 1));
		tareaAcuse.setFirmado(Short.valueOf((short) 1));
		if (codArchiAcuse != null) {
			tareaAcuse.setArchivo(codArchiAcuse);
		}
		tareaAcuse.setUsuContr(usuContr);
		tareaAcuse.setFecContr(ahora);
		tareaTramiteExpedienteService.save(tareaAcuse);

		if (codArchiAcuse != null) {
			notificacion.setCodArchiAcuse(codArchiAcuse);
		}
	}
}
