package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.Interesado;

public interface InteresadoDao extends CrudRepository<Interesado, Long>{

	@Query(value = "SELECT * FROM ex_interesado WHERE expediente = ?1 AND id_his_perso = ?2", nativeQuery = true)
	List<Interesado> findByExpedienteAndIdHisPerso(Long expediente, Long idHisPerso);
	
	@Query(value = "SELECT * FROM ex_interesado WHERE expediente = ?1 AND principal = 1", nativeQuery = true)
	Interesado findByExpedienteAndPrincipal(Long expediente);
	
	List<Interesado> findByExpediente(Long expediente);
}
