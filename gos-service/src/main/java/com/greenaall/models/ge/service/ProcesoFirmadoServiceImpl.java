package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ge.dao.ProcesoFirmadoDao;
import com.greenaall.models.ge.entity.ProcesoFirmado;

@Service
public class ProcesoFirmadoServiceImpl implements IProcesoFirmadoService {
	
	@Autowired
	private ProcesoFirmadoDao procesoFirmadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<ProcesoFirmado> findAll() {
		return (List<ProcesoFirmado>) procesoFirmadoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ProcesoFirmado findById(Integer id) {
		
		ProcesoFirmado oProcesoFirmado = procesoFirmadoDao.findById(id).orElse(null);
		if(oProcesoFirmado == null) {
			return null;
		}
		return oProcesoFirmado;

	}

	@Override
	@Transactional(readOnly = true)
	public List<ProcesoFirmado> findByPlantilla(String plantilla) {
		List<ProcesoFirmado> aProcesoFirmado = (List<ProcesoFirmado>) procesoFirmadoDao.findByPlantilla(plantilla);
		if(aProcesoFirmado == null || aProcesoFirmado.isEmpty()) {
			return null;
		}
		return aProcesoFirmado;
	}

}
