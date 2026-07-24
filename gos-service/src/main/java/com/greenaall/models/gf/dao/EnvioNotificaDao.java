package com.greenaall.models.gf.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.GfEnvioNotifica;

public interface EnvioNotificaDao extends CrudRepository<GfEnvioNotifica, Long> {

	Optional<GfEnvioNotifica> findFirstByIdNotifAndActivoOrderByFecContrDesc(Long idNotif, String activo);

	GfEnvioNotifica findFirstByIdEnvioExternoAndActivo(String idEnvioExterno, String activo);

	List<GfEnvioNotifica> findByEstadoNotificaAndActivo(String estadoNotifica, String activo);

	List<GfEnvioNotifica> findByIdNotifOrderByFecContrDesc(Long idNotif);
}
