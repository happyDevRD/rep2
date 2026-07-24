package com.greenaall.notifica.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import com.greenaall.exception.NotificaIntegracionException;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.service.IArchivoService;
import com.greenaall.models.gf.dao.EnvioNotificaDao;
import com.greenaall.models.gf.entity.GfEnvioNotifica;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.models.pe.service.NotificacionServiceImpl;
import com.greenaall.notifica.client.NotificaClient;
import com.greenaall.notifica.config.NotificaConfigService;
import com.greenaall.notifica.dto.NotificaEnvioResponse;
import com.greenaall.notifica.dto.NotificaEstadoResponse;
import com.greenaall.util.fiscal.GestionFiscalConstantes;

@ExtendWith(MockitoExtension.class)
class NotificaIntegracionServiceTest {

	@InjectMocks
	private NotificaIntegracionService service;

	@Mock
	private NotificacionServiceImpl notificacionService;
	@Mock
	private EnvioNotificaDao envioNotificaDao;
	@Mock
	private NotificaClient notificaClient;
	@Mock
	private NotificaConfigService notificaConfigService;
	@Mock
	private NotificaAcuseTareaService notificaAcuseTareaService;
	@Mock
	private IArchivoService archivoService;

	@BeforeEach
	void setup() {
		ReflectionTestUtils.setField(service, "notificaModo", "mock");
	}

	@Test
	void enviar_sinPdf_lanzaExcepcion() {
		Notificacion n = new Notificacion();
		n.setIdNotif(1L);
		n.setSituacion(GestionFiscalConstantes.NOTIFICACION_GENERADA);
		when(notificacionService.findById(1L)).thenReturn(n);

		assertThrows(NotificaIntegracionException.class, () -> service.enviarANotifica(1L, "gos"));
	}

	@Test
	void enviar_ok_pasaANotificaEnviada() {
		Notificacion n = new Notificacion();
		n.setIdNotif(1L);
		n.setSituacion(GestionFiscalConstantes.NOTIFICACION_GENERADA);
		n.setCodArchi(99L);
		when(notificacionService.findById(1L)).thenReturn(n);
		when(archivoService.findById(99L)).thenReturn(new Archivo());
		when(envioNotificaDao.findFirstByIdNotifAndActivoOrderByFecContrDesc(1L, GfEnvioNotifica.ACTIVO_SI))
				.thenReturn(Optional.empty());
		when(notificaConfigService.getCodDir3()).thenReturn("DIR3");
		when(notificaConfigService.getProcedimientoSia()).thenReturn("SIA");

		NotificaEnvioResponse resp = new NotificaEnvioResponse();
		resp.setIdEnvioExterno("MOCK-1");
		resp.setEstadoNotifica(GfEnvioNotifica.ESTADO_ENVIADA);
		when(notificaClient.enviar(any(), eq("DIR3"), eq("SIA"))).thenReturn(resp);
		when(envioNotificaDao.save(any())).thenAnswer(inv -> inv.getArgument(0));

		var result = service.enviarANotifica(1L, "gos");
		assertEquals(GestionFiscalConstantes.NOTIFICACION_NOTIFICA_ENVIADA, result.getSituacion());
		verify(notificacionService, times(2)).save(any(Notificacion.class));
	}

	@Test
	void sincronizar_recepcionada_creaAcuse() {
		Notificacion n = new Notificacion();
		n.setIdNotif(2L);
		n.setSituacion(GestionFiscalConstantes.NOTIFICACION_NOTIFICA_ENVIADA);
		when(notificacionService.findById(2L)).thenReturn(n);

		GfEnvioNotifica envio = new GfEnvioNotifica();
		envio.setIdNotif(2L);
		envio.setEstadoNotifica(GfEnvioNotifica.ESTADO_PUESTA_DISPOSICION);
		when(envioNotificaDao.findFirstByIdNotifAndActivoOrderByFecContrDesc(2L, GfEnvioNotifica.ACTIVO_SI))
				.thenReturn(Optional.of(envio));

		NotificaEstadoResponse resp = new NotificaEstadoResponse();
		resp.setRecepcionada(true);
		resp.setIdAcuseExterno("ACUSE-1");
		when(notificaClient.consultarEstado(envio)).thenReturn(resp);

		var result = service.sincronizarConNotifica(2L, "gos");
		assertEquals(GestionFiscalConstantes.NOTIFICACION_RECEPCIONADA, result.getSituacion());
		verify(notificaAcuseTareaService).registrarAcuseEnTarea(eq(n), eq("ACUSE-1"), any(), eq("gos"));
	}
}
