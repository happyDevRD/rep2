package com.greenaall.models.ad.service;

import java.util.List;

import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ge.entity.Usuario;

public interface IOrganizacionUsuarioService {
	
	public OrganizacionUsuario findById(Long id);
	public List<OrganizacionUsuario> findByUsuario(Usuario usuario);
	public List<OrganizacionUsuario> findByUsuario2(String usuario);
	public List<OrganizacionUsuario> findByTraUsuar();
	public List<OrganizacionUsuario> findByIdOrgEleme(Long idOrgEleme);

}
