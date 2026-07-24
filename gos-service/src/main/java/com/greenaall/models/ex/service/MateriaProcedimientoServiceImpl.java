package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ex.dao.MateriaProcedimientoDao;
import com.greenaall.models.ex.entity.MateriaProcedimiento;

@Service
public class MateriaProcedimientoServiceImpl implements IMateriaProcedimientoService{
	
	@Autowired
    private MateriaProcedimientoDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public List<MateriaProcedimiento> findAll() {
		return (List<MateriaProcedimiento>) dao.findAll();
	}
	
	@Override
	@Transactional( readOnly = true)
	public MateriaProcedimiento findById(Long id) {
		MateriaProcedimiento oMateria = dao.findById(id).orElse(null);
        if (oMateria == null) {
        	return null;
        }
        return oMateria;
	}

}
