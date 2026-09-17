package com.greenaall.models.gf.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.gf.entity.GfEnvioArchive;

public interface EnvioArchiveDao extends CrudRepository<GfEnvioArchive, Long> {

	Optional<GfEnvioArchive> findFirstByIdExpedienteAndActivoOrderByFecContrDescIdEnvioDesc(Long idExpediente,
			String activo);

	List<GfEnvioArchive> findByIdExpedienteAndActivoOrderByFecContrDescIdEnvioDesc(Long idExpediente, String activo);

	List<GfEnvioArchive> findByEstadoEnvioAndActivo(String estadoEnvio, String activo);
}
