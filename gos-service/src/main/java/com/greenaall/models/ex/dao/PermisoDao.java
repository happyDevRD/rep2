package com.greenaall.models.ex.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ex.entity.Permiso;

public interface PermisoDao extends CrudRepository<Permiso, Long>{
	List<Permiso> findByIdTarProce(Long idTarProce);
	
	@Query(value = "SELECT * FROM ex_permiso WHERE procedimiento = ?1 AND usuario = ?2", nativeQuery = true)
	List<Permiso> findByProcedimientoAndUsuario(Long procedimiento, String usuario);
	
	@Query(value = "SELECT * FROM ex_permiso WHERE id_tar_proce = ?1 AND usuario = ?2", nativeQuery = true)
	List<Permiso> findByTareaAndUsuario(Long idTarProce, String usuario);
}
