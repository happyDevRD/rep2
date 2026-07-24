package com.greenaall.models.ad.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ad.entity.OrganizacionUsuario;

public interface OrganizacionUsuarioDao extends CrudRepository<OrganizacionUsuario, Long>{

	List<OrganizacionUsuario> findByUsuario(String usuario);
	List<OrganizacionUsuario> findByTraUsuar(Short flag);
	
	@Query(value = "SELECT * FROM ad_organizacion_usuario WHERE id_org_eleme=?1 AND tra_usuar = true", nativeQuery = true)
	List<OrganizacionUsuario> findByIdOrgEleme(Long idOrgEleme);
}
