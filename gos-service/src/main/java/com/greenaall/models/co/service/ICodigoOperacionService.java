package com.greenaall.models.co.service;

import com.greenaall.models.co.entity.CodigoOperacion;

public interface ICodigoOperacionService {

	public CodigoOperacion findByIdCodOpera(Long idGruCodOpera, Short indArea, Short indAgrup, Short signo, Short claOpera);
	public CodigoOperacion findById(Long idCodOpera);
}
