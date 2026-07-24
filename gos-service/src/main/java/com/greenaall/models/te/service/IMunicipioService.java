package com.greenaall.models.te.service;

import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;

public interface IMunicipioService {

	public Municipio findById(MunicipioPK municipioPK);
}
