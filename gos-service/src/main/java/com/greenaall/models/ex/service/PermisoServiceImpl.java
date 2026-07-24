package com.greenaall.models.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ex.dao.PermisoDao;
import com.greenaall.models.ex.entity.Permiso;

/**
*
* @author jmmoyano
*/

@Service
public class PermisoServiceImpl implements IPermisoService{

	@Autowired
    private PermisoDao dao;
	
	@Override
	@Transactional( readOnly = true)
	public Permiso findById(Long id) {
		Permiso permiso = dao.findById(id).orElse(null);
        if (permiso == null) {
        	throw new NoDataFoundException();
        }
        return permiso;
	}
	
	@Override
	@Transactional 
	public void deleteById(Long id) {
		dao.deleteById(id);        
    }
	
	@Override
	@Transactional
	public Permiso save(Permiso permiso) {
		return dao.save(permiso);
	}

	@Override
	@Transactional( readOnly = true)
	public List<Permiso> findAll() {
		return (List<Permiso>) dao.findAll();
	}

	@Override
	@Transactional( readOnly = true)
	public List<Permiso> findByIdTarProce(Long idTarProce) {
		List<Permiso> aPermiso = (List<Permiso>) dao.findByIdTarProce(idTarProce);
		if(aPermiso == null || aPermiso.isEmpty()) {
			return null;
		}
		return aPermiso;
	}

	@Override
	public List<Permiso> findByProcedimientoAndUsuario(Long procedimiento, String usuario) {
		List<Permiso> aPermiso = (List<Permiso>) dao.findByProcedimientoAndUsuario(procedimiento, usuario);
		if(aPermiso == null || aPermiso.isEmpty()) {
			return null;
		}
		return aPermiso;
	}

	@Override
	public List<Permiso> findByTareaAndUsuario(Long idTarProce, String usuario) {
		List<Permiso> aPermiso = (List<Permiso>) dao.findByTareaAndUsuario(idTarProce, usuario);
		if(aPermiso == null || aPermiso.isEmpty()) {
			return null;
		}
		return aPermiso;
	}
}
