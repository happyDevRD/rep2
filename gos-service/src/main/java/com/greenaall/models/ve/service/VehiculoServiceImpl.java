package com.greenaall.models.ve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ve.dao.VehiculoDao;
import com.greenaall.models.ve.entity.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private VehiculoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> findByMatForma(String matForma) {
		
		List<Vehiculo> aVehiculo = vehiculoDao.findByMatForma(matForma);
		
		if(aVehiculo != null) {
			return aVehiculo;
		}
		return null;
	}
}
