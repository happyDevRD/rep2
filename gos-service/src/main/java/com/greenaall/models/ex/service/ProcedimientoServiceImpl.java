package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ex.dao.ProcedimientoDao;
import com.greenaall.models.ex.entity.Procedimiento;

/**
*
* @author jmmoyano
*/

@Service
public class ProcedimientoServiceImpl implements IProcedimientoService{
	
	@Autowired
    private ProcedimientoDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Procedimiento findById(Long id) {
		Procedimiento procedimiento = dao.findById(id).orElse(null);
        if (procedimiento == null) {
        	return null;
        }
        return procedimiento;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public Procedimiento save(Procedimiento procedimiento) {
		return dao.save(procedimiento);
	}

	@Override
	@Transactional( readOnly = true)
	public List<Procedimiento> findAll() {
		return (List<Procedimiento>) dao.findAll();
	}

	@Override
	@Transactional( readOnly = true)
	public List<Procedimiento> findByDescripcion(String descripcion) {
		List<Procedimiento> aProcedimiento = dao.findByDescripcion(descripcion);
		if(aProcedimiento != null) {
			return aProcedimiento;
		}
		return null;
	}

}
