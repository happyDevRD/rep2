package com.greenaall.ad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ad.service.OrganizacionUsuarioServiceImpl;


/**
*
* @author jmmoyano
*/

@RestController
public class OrganizacionUsuarioController {
	
	@Autowired
    private OrganizacionUsuarioServiceImpl service;
	
	@GetMapping("/organizacionUsuario/listar")
	public List<OrganizacionUsuario> listar() {
		List<OrganizacionUsuario> aOrganizacionUsuario = service.findByTraUsuar();
		if(aOrganizacionUsuario.isEmpty() || aOrganizacionUsuario == null) {
			 throw new NoDataFoundException();
		}
		return aOrganizacionUsuario;
	}
	
	@GetMapping("/organizacionUsuario/usuDepTraExped/{idOrgEleme}")
	public List<OrganizacionUsuario> usuDepTraExped(@PathVariable Long idOrgEleme) {
		List<OrganizacionUsuario> aOrganizacionUsuario = service.findByIdOrgEleme(idOrgEleme);
		if(aOrganizacionUsuario.isEmpty() || aOrganizacionUsuario == null) {
			 throw new NoDataFoundException();
		}
		return aOrganizacionUsuario;
	}

}
