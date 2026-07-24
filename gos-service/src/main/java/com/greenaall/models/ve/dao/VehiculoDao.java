package com.greenaall.models.ve.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ve.entity.Vehiculo;
import com.greenaall.models.ve.entity.VehiculoPK;

public interface VehiculoDao extends CrudRepository<Vehiculo, VehiculoPK>{
	
	@Query(value = "SELECT * FROM ve_vehiculo WHERE mat_forma = ?1 AND cod_entid = 1 AND reg_activ=1 AND parque = 1", nativeQuery = true)
	public List<Vehiculo> findByMatForma(String matricula);
}
