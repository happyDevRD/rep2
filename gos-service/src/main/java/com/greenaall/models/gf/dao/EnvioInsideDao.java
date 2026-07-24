package com.greenaall.models.gf.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.GfEnvioInside;

public interface EnvioInsideDao extends CrudRepository<GfEnvioInside, Long> {

	Optional<GfEnvioInside> findFirstByIdExpedienteAndActivoOrderByFecContrDesc(Long idExpediente, String activo);

	List<GfEnvioInside> findByIdExpedienteAndActivoOrderByFecContrDesc(Long idExpediente, String activo);

	List<GfEnvioInside> findByEstadoEnvioAndActivo(String estadoEnvio, String activo);
}
