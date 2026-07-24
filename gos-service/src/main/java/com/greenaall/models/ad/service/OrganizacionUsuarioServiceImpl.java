package com.greenaall.models.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ad.dao.OrganizacionUsuarioDao;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ge.entity.Usuario;

@Service
public class OrganizacionUsuarioServiceImpl implements IOrganizacionUsuarioService {

	@Autowired
	private OrganizacionUsuarioDao organizacionUsuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public OrganizacionUsuario findById(Long id) {
		OrganizacionUsuario oOrganizacionUsuario = organizacionUsuarioDao.findById(id).get();
		if(oOrganizacionUsuario == null) {
			return null;
		}
		return oOrganizacionUsuario;
	}

	@Override
	@Transactional(readOnly = true)
	public List<OrganizacionUsuario> findByUsuario(Usuario usuario) {
		List<OrganizacionUsuario> aOrganizacionUsuario = organizacionUsuarioDao.findByUsuario(usuario.getUsuario());
		if(aOrganizacionUsuario == null) {
			return null;
		}
		return aOrganizacionUsuario;
		//return Optional.ofNullable(((Optional<OrganizacionUsuario>) organizacionUsuarioDao.findByUsuario(usuario.getUsuario())).orElseThrow(() -> new OrganizacionUsuarioNotFoundException(usuario.getUsuario())));
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<OrganizacionUsuario> findByTraUsuar() {
		List<OrganizacionUsuario> aOrganizacionUsuario = (List<OrganizacionUsuario>) organizacionUsuarioDao.findByTraUsuar(Short.valueOf((short) 1));
		if(aOrganizacionUsuario.isEmpty()) {
			return null;
		}
		return aOrganizacionUsuario;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<OrganizacionUsuario> findByIdOrgEleme(Long idOrgElemen) {
		List<OrganizacionUsuario> aOrganizacionUsuario = (List<OrganizacionUsuario>) organizacionUsuarioDao.findByIdOrgEleme(idOrgElemen);
		if(aOrganizacionUsuario.isEmpty()) {
			return null;
		}
		return aOrganizacionUsuario;
	}

	@Override
	@Transactional(readOnly = true)
	public List<OrganizacionUsuario> findByUsuario2(String usuario) {
		
		List<OrganizacionUsuario> aOrganizacionUsuario = organizacionUsuarioDao.findByUsuario(usuario);
		if(aOrganizacionUsuario == null) {
			return null;
		}
		return aOrganizacionUsuario;
		//return Optional.ofNullable(((Optional<OrganizacionUsuario>) organizacionUsuarioDao.findByUsuario(usuario)).orElseThrow(() -> new OrganizacionUsuarioNotFoundException(usuario)));	
	}

}
