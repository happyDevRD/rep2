package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ge.dao.DiaFestivoDao;
import com.greenaall.models.ge.entity.DiaFestivo;
import com.greenaall.models.ge.entity.DiaFestivoPK;

@Service
public class DiaFestivoServiceImpl implements IDiaFestivoService{
	
	@Autowired
	private DiaFestivoDao diaFestivoDao;

	@Override
	@Transactional(readOnly = true)
	public List<DiaFestivo> findAll() {
		List<DiaFestivo> aDiaFestivo = (List<DiaFestivo>) diaFestivoDao.findAll();
		if(aDiaFestivo == null || !aDiaFestivo.isEmpty()) {
			throw new NoDataFoundException();
		}
		return aDiaFestivo;
	}

	@Override
	@Transactional(readOnly = true)
	public DiaFestivo findById(DiaFestivoPK oDiaFestivoPK) {
		DiaFestivo oDiaFestivo = diaFestivoDao.findById(oDiaFestivoPK).orElse(null);
		if(oDiaFestivo == null) {
			return null;
		}
		return oDiaFestivo;
	}

	@Override
	public List<DiaFestivo> findByFecFesti(String fechaIncio, String fechaFin) {
		List<DiaFestivo> aDiaFestivo = (List<DiaFestivo>) diaFestivoDao.findByFecFesti(fechaIncio, fechaFin);
		if(aDiaFestivo == null || aDiaFestivo.isEmpty()) {
			return null;
		}
		return aDiaFestivo;
	}

}
