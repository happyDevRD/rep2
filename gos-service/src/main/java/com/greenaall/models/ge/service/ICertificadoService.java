package com.greenaall.models.ge.service;

import com.greenaall.models.ge.entity.Certificado;

public interface ICertificadoService {
	
	public Certificado findByIdHisPersoAndIdPerso(Long idHisPerso, Long idPerso);

}
