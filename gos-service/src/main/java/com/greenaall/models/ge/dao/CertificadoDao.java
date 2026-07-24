package com.greenaall.models.ge.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greenaall.models.ge.entity.Certificado;

public interface CertificadoDao extends CrudRepository<Certificado, Long>{
	
	@Query(value = "SELECT * FROM ge_certificado WHERE id_his_perso=?1 AND id_perso = ?2", nativeQuery = true)
	Certificado findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);

}
