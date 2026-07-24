package com.greenaall.models.gf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.gf.dao.TarifaDao;
import com.greenaall.models.gf.entity.GfTarifa;

/**
*
* @author jmmoyano
*/

@Service
public class TarifaServiceImpl implements ITarifaService {

	@Autowired
    private TarifaDao dao;

	@Override
	@Transactional( readOnly = true)
	public List<GfTarifa> findAll() {
		return (List<GfTarifa>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public GfTarifa findById(Long idTarif) {
		GfTarifa tarifa = dao.findById(idTarif).orElse(null);
        if (tarifa == null) {
        	return null;
        }
        return tarifa;
	}

	@Override
	@Transactional( readOnly = true)
	public List<GfTarifa> findByIdProce(Long idProce) {
		List<GfTarifa> aTarifa = dao.findByIdProce(idProce);
		if(aTarifa != null && !aTarifa.isEmpty()) {
			return aTarifa;
		}		
		return  null;
	}

	@Override
	@Transactional
	public GfTarifa save(GfTarifa oTarifa) {
		GfTarifa oTarifaNueva = dao.save(oTarifa);
		return oTarifaNueva;
	}


	@Override
	@Transactional
	public void delete(Long idTarif) {
		dao.deleteById(idTarif);
		
	}
	
	
}
