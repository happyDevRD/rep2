package com.greenaall.models.ge.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.PeticionFirma;

public interface PeticionFirmaDao extends CrudRepository<PeticionFirma, Long>{

	@Query(value = "SELECT * FROM ge_peticion_firma WHERE id_pet_plata = ?1", nativeQuery = true)
	PeticionFirma findByIdPetPlata(String idPetPlata);
}
