package com.greenaall.models.pa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.pa.entity.Habitante;
import com.greenaall.models.pa.entity.HabitantePK;

public interface HabitanteDao extends CrudRepository<Habitante, HabitantePK>{
	
	@Query(value = "SELECT * FROM pa_habitante WHERE num_docum = ?1 AND reg_activ = 1 AND cod_entid = 1", nativeQuery = true)
	public List<Habitante> findByNumDocum(String numDocum);
}

