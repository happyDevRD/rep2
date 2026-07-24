package com.greenaall.models.ge.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.PeticionFirmante;
import com.greenaall.models.ge.entity.PeticionFirmantePK;

public interface PeticionFirmanteDao extends CrudRepository<PeticionFirmante, PeticionFirmantePK>{

	@Query(value = "SELECT * FROM ge_peticion_firmante WHERE id_peticion = ?1", nativeQuery = true)
	List<PeticionFirmante> findByIdPeticion(Long idPeticion);
}
