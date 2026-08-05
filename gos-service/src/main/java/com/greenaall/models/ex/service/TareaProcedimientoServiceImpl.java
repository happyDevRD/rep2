package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ex.dao.TareaProcedimientoDao;
import com.greenaall.models.ex.entity.TareaProcedimiento;

/**
*
* @author jmmoyano
*/

@Service
public class TareaProcedimientoServiceImpl implements ITareaProcedimientoService{

	@Autowired
    private TareaProcedimientoDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public TareaProcedimiento findById(Long id) {
		return dao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public TareaProcedimiento save(TareaProcedimiento tareaProcedimiento) {
		return dao.save(tareaProcedimiento);
	}

	@Override
	@Transactional( readOnly = true)
	public List<TareaProcedimiento> findAll() {
		return (List<TareaProcedimiento>) dao.findAll();
	}

	@Override
	@Transactional( readOnly = true)
	public List<TareaProcedimiento> findByProcedimiento(Long procedimiento) {
		List<TareaProcedimiento> aTareaProcedimiento = (List<TareaProcedimiento>) dao.findByProcedimiento(procedimiento);
		if(aTareaProcedimiento.isEmpty()) {
			return null;
		}
		return aTareaProcedimiento;
	}

	@Override
	@Transactional( readOnly = true)
	public TareaProcedimiento findByTareaAutomatica(Long procedimiento) {
		TareaProcedimiento oTarProce = dao.findByTareaAutomatica(procedimiento);
		if(oTarProce == null) {
			return null;
		}
		return oTarProce;
	}

	@Override
	@Transactional( readOnly = true)
	public List<TareaProcedimiento> findByProcedimientoAndFaseTarea(Long procedimiento, String faseTarea) {
		List<TareaProcedimiento> aTareaProcedimiento = dao.findByProcedimientoAndFaseTarea(procedimiento, faseTarea);
		if (aTareaProcedimiento == null) {
			return List.of();
		}
		return aTareaProcedimiento;
	}
}
