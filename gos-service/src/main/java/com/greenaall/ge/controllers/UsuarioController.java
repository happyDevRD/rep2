package com.greenaall.ge.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.ErrorEnvioEmail;
import com.greenaall.exception.UsuarioNotFoundException;
import com.greenaall.ge.dto.LoginRequest;
import com.greenaall.ge.util.UsuarioValide;
import com.greenaall.models.ad.entity.OrganizacionElemento;
import com.greenaall.models.ad.entity.OrganizacionUsuario;
import com.greenaall.models.ad.service.IOrganizacionElementoService;
import com.greenaall.models.ad.service.IOrganizacionUsuarioService;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.entity.Usuario;
import com.greenaall.models.ge.entity.UsuarioContexto;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.ge.service.IUsuarioService;
import com.greenaall.models.pe.entity.PersonaContacto;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.PersonaContactoServiceImpl;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.util.Utiles;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
*
* @author jmmoyano
*/

@RestController
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IOrganizacionUsuarioService organizacionUsuarioService;
	
	@Autowired
	private IOrganizacionElementoService organizacionElementoService;
	
	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;
	
	@Autowired
	private IParametroSistemaService parametroSistemaService;
	
	@Autowired
	private PersonaContactoServiceImpl servicePersonaContacto;
	
	@GetMapping("/usuario/listar")
	public List<Usuario> listar(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/usuario/listar/{usuario}")
	public Usuario detalle(@PathVariable String usuario){
		return usuarioService.findById(usuario);
	}
	
	@GetMapping("/usuarioC/{idHisPerso}/{idPerso}")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioContexto loginCertificado(@PathVariable Long idHisPerso, @PathVariable Long idPerso) {
		
		PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
		oPersonaEntidadPK.setIdHisPerso(idHisPerso);
		oPersonaEntidadPK.setIdPerso(idPerso);
		PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);		
		if(oPersonaEntidad != null) {
			Usuario oUsuario = usuarioService.findByIdHisPersoAndIdPerso(oPersonaEntidad.getIdHisPerso(), oPersonaEntidad.getIdPerso());
			if(oUsuario != null) {
	    		UsuarioContexto usuarioValido = UsuarioValide.validaUsuario(oUsuario,  null); 
	    		if(usuarioValido != null) {
	    			List<OrganizacionUsuario> aOrganizacionUsuario = organizacionUsuarioService.findByUsuario(oUsuario);
	    			if(aOrganizacionUsuario != null && !aOrganizacionUsuario.isEmpty()) {
	    				Optional<OrganizacionUsuario> oOrgUsuPrimero = aOrganizacionUsuario.stream().findFirst();
	    				if(oOrgUsuPrimero.isPresent()){
	    					OrganizacionUsuario oOrganizcionUsuario = oOrgUsuPrimero.get();
	        				usuarioValido.setSolUsuar(oOrganizcionUsuario.getSolUsuar());
	        				usuarioValido.setTraUsuar(oOrganizcionUsuario.getTraUsuar());
	        				usuarioValido.setIdOrgUsuar(oOrganizcionUsuario.getIdOrgUsuar());
	        				OrganizacionElemento oOrganizacionElemento = organizacionElementoService.findById(oOrganizcionUsuario.getIdOrgEleme());
	        				
	        				if(oOrganizacionElemento != null) {
	        					usuarioValido.setDepartamento(oOrganizacionElemento.getDesEleme());
	        					usuarioValido.setIdOrgEleme(oOrganizacionElemento.getIdOrgEleme());				
	        				}else {
	        					usuarioValido.setDepartamento("Sin departamento");
	        				}
	        				
	        				ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
	        						"es", Short.valueOf((short) 9277));
	        				ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
	        				if(oParametroSistema != null && oParametroSistema.getValor().equalsIgnoreCase("SI")) {
	        					String eMail = null;
	        					List<PersonaContacto> emailsContacto = servicePersonaContacto
	    								.findByIdHisPersoAndIdPerso(oUsuario.getIdHisPerso(), oUsuario.getIdPerso());
	    						if (emailsContacto != null) {
	    							for (int h = 0; h < emailsContacto.size(); h++) {
	    								if (emailsContacto.get(h).getTipConta() != null
	    										&& emailsContacto.get(h).getTipConta().equals(Short.valueOf((short) 4))
	    										&& emailsContacto.get(h).getDatConta() != null) {
	    									eMail = emailsContacto.get(h).getDatConta();
	    									break;
	    								}
	    							}
	    						}
	    						if(eMail == null) {
	    							throw new ErrorEnvioEmail();
	    						}
	        			
	        					String sServidor = null;
								String sRemitente = null;
								String sUsuario = null;
								String sPass = null;
								String sPuerto = null;
								String sTarttls = null;
								String sAuth = null;
								String sSocket = null;
	        					ParametroSistemaPK oParametroSistemaPk51 = new ParametroSistemaPK(Long.valueOf((long) 0),
										Long.valueOf((long) 0), "es", Short.valueOf((short) 51));
								ParametroSistema oParametroSistema51 = parametroSistemaService
										.findById(oParametroSistemaPk51);
								if (oParametroSistema51 != null) {
									sServidor = oParametroSistema51.getValor();
								} else {
									System.err.println("Falta el parámetro del sistema número 51");
									throw new ErrorEnvioEmail();
								}

								ParametroSistemaPK oParametroSistemaPk52 = new ParametroSistemaPK(Long.valueOf((long) 0),
										Long.valueOf((long) 0), "es", Short.valueOf((short) 52));
								ParametroSistema oParametroSistema52 = parametroSistemaService
										.findById(oParametroSistemaPk52);
								if (oParametroSistema52 != null) {
									sRemitente = oParametroSistema52.getValor();
								} else {
									System.err.println("Falta el parámetro del sistema número 52");
									throw new ErrorEnvioEmail();
								}

								ParametroSistemaPK oParametroSistemaPk53 = new ParametroSistemaPK(Long.valueOf((long) 0),
										Long.valueOf((long) 0), "es", Short.valueOf((short) 53));
								ParametroSistema oParametroSistema53 = parametroSistemaService
										.findById(oParametroSistemaPk53);
								if (oParametroSistema53 != null) {
									sUsuario = oParametroSistema53.getValor();
								} else {
									System.err.println("Falta el parámetro del sistema número 53");
									throw new ErrorEnvioEmail();
								}

								ParametroSistemaPK oParametroSistemaPk54 = new ParametroSistemaPK(Long.valueOf((long) 0),
										Long.valueOf((long) 0), "es", Short.valueOf((short) 54));
								ParametroSistema oParametroSistema54 = parametroSistemaService
										.findById(oParametroSistemaPk54);
								if (oParametroSistema54 != null) {
									sPass = oParametroSistema54.getValor();
								} else {
									System.err.println("Falta el parámetro del sistema número 54");
									throw new ErrorEnvioEmail();
								}

								ParametroSistemaPK oParametroSistemaPk254 = new ParametroSistemaPK(Long.valueOf((long) 0),
										Long.valueOf((long) 0), "es", Short.valueOf((short) 254));
								ParametroSistema oParametroSistema254 = parametroSistemaService
										.findById(oParametroSistemaPk254);
								if (oParametroSistema254 != null) {
									sPuerto = oParametroSistema254.getValor();
								} else {
									System.err.println("Falta el parámetro del sistema número 254");
									throw new ErrorEnvioEmail();
								}

								ParametroSistemaPK oParametroSistemaPk9273 = new ParametroSistemaPK(Long.valueOf((long) 0),
										Long.valueOf((long) 0), "es", Short.valueOf((short) 9273));
								ParametroSistema oParametroSistema9273 = parametroSistemaService
										.findById(oParametroSistemaPk9273);
								if (oParametroSistema9273 != null) {
									sTarttls = oParametroSistema9273.getValor();
								} else {
									System.err.println("Falta el parámetro del sistema número 9273");
									throw new ErrorEnvioEmail();
								}

								ParametroSistemaPK oParametroSistemaPk9274 = new ParametroSistemaPK(Long.valueOf((long) 0),
										Long.valueOf((long) 0), "es", Short.valueOf((short) 9274));
								ParametroSistema oParametroSistema9274 = parametroSistemaService
										.findById(oParametroSistemaPk9274);
								if (oParametroSistema9274 != null) {
									sAuth = oParametroSistema9274.getValor();
								} else {
									System.err.println("Falta el parámetro del sistema número 9274");
									throw new ErrorEnvioEmail();
								}

								ParametroSistemaPK oParametroSistemaPk9275 = new ParametroSistemaPK(Long.valueOf((long) 0),
										Long.valueOf((long) 0), "es", Short.valueOf((short) 9275));
								ParametroSistema oParametroSistema9275 = parametroSistemaService
										.findById(oParametroSistemaPk9275);
								if (oParametroSistema9275 != null) {
									sSocket = oParametroSistema9275.getValor();
								} else {
									System.err.println("Falta el parámetro del sistema número 9275");
									throw new ErrorEnvioEmail();
								}
								int iCodigo = (int)(Math.random()*(9999-1000+1)+1000);
								usuarioValido.setCodigo(iCodigo);
								String sCodigo= String.valueOf(iCodigo);
								String sAsunto = "Código de validación para iFlow";
								String sCuerpo = "Hemos recibido una solicitud para iniciar sesión en tu cuenta de iFlow." + "\n" 
										+ "Aquí está el código que necesitas: " + sCodigo;

								boolean envioMail = Utiles.EMail(eMail, sAsunto, sCuerpo, sPuerto,
										sServidor, sRemitente, sUsuario, sPass, sTarttls, sAuth, sSocket);
								if (!envioMail) {
									throw new ErrorEnvioEmail();
								}
	        				}
	        				
	        				return usuarioValido;
	    				}
	        		}
	    		}
	    	}
		}
		return null;
		
	}
	 
	@PostMapping("/usuario/login")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioContexto loginPorBody(HttpServletRequest request, HttpServletResponse response,
			@RequestBody LoginRequest loginRequest) {
		if (loginRequest == null || loginRequest.getUsuario() == null || loginRequest.getPassword() == null) {
			throw new UsuarioNotFoundException("");
		}
		return login(request, response, loginRequest.getUsuario(), loginRequest.getPassword());
	}

	@PostMapping("/usuario/{usuario}/{password}")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioContexto login(HttpServletRequest request, HttpServletResponse response, @PathVariable String usuario, @PathVariable String password) {
	
		Usuario oUsuario = null;
		oUsuario = usuarioService.findById(usuario); 
		/*if(usuario == null || usuario.equals("")) {
			String dni = LoginCertificado.ejecutar(request, response);
			PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findByNumDocum(dni);
			if(oPersonaEntidad != null) {
				oUsuario = usuarioService.findByIdHisPersoAndIdPerso(oPersonaEntidad.getIdHisPerso(), oPersonaEntidad.getIdPerso());
			}
		}else {
			oUsuario = usuarioService.findById(usuario);
		}*/
    	  
    	if(oUsuario != null) {
    		UsuarioContexto usuarioValido = UsuarioValide.validaUsuario(oUsuario, password); 
    		if(usuarioValido != null) {
    			List<OrganizacionUsuario> aOrganizacionUsuario = organizacionUsuarioService.findByUsuario(oUsuario);
    			if(aOrganizacionUsuario != null && !aOrganizacionUsuario.isEmpty()) {
    				Optional<OrganizacionUsuario> oOrgUsuPrimero = aOrganizacionUsuario.stream().findFirst();
    				if(oOrgUsuPrimero.isPresent()){
    					OrganizacionUsuario oOrganizcionUsuario = oOrgUsuPrimero.get();
        				usuarioValido.setSolUsuar(oOrganizcionUsuario.getSolUsuar());
        				usuarioValido.setTraUsuar(oOrganizcionUsuario.getTraUsuar());
        				usuarioValido.setIdOrgUsuar(oOrganizcionUsuario.getIdOrgUsuar());
        				OrganizacionElemento oOrganizacionElemento = organizacionElementoService.findById(oOrganizcionUsuario.getIdOrgEleme());
        				if(oOrganizacionElemento != null) {
        					usuarioValido.setDepartamento(oOrganizacionElemento.getDesEleme());
        					usuarioValido.setIdOrgEleme(oOrganizacionElemento.getIdOrgEleme());				
        				}else {
        					usuarioValido.setDepartamento("Sin departamento");
        				}
        				
        				
        				ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
        						"es", Short.valueOf((short) 9277));
        				ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
        				if(oParametroSistema != null && oParametroSistema.getValor().equalsIgnoreCase("SI")) {
        					String eMail = null;
        					List<PersonaContacto> emailsContacto = servicePersonaContacto
    								.findByIdHisPersoAndIdPerso(oUsuario.getIdHisPerso(), oUsuario.getIdPerso());
    						if (emailsContacto != null) {
    							for (int h = 0; h < emailsContacto.size(); h++) {
    								if (emailsContacto.get(h).getTipConta() != null
    										&& emailsContacto.get(h).getTipConta().equals(Short.valueOf((short) 4))
    										&& emailsContacto.get(h).getDatConta() != null) {
    									eMail = emailsContacto.get(h).getDatConta();
    									break;
    								}
    							}
    						}
    						if(eMail == null) {
    							throw new ErrorEnvioEmail();
    						}
        			
        					String sServidor = null;
							String sRemitente = null;
							String sUsuario = null;
							String sPass = null;
							String sPuerto = null;
							String sTarttls = null;
							String sAuth = null;
							String sSocket = null;
        					ParametroSistemaPK oParametroSistemaPk51 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 51));
							ParametroSistema oParametroSistema51 = parametroSistemaService
									.findById(oParametroSistemaPk51);
							if (oParametroSistema51 != null) {
								sServidor = oParametroSistema51.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 51");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk52 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 52));
							ParametroSistema oParametroSistema52 = parametroSistemaService
									.findById(oParametroSistemaPk52);
							if (oParametroSistema52 != null) {
								sRemitente = oParametroSistema52.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 52");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk53 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 53));
							ParametroSistema oParametroSistema53 = parametroSistemaService
									.findById(oParametroSistemaPk53);
							if (oParametroSistema53 != null) {
								sUsuario = oParametroSistema53.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 53");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk54 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 54));
							ParametroSistema oParametroSistema54 = parametroSistemaService
									.findById(oParametroSistemaPk54);
							if (oParametroSistema54 != null) {
								sPass = oParametroSistema54.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 54");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk254 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 254));
							ParametroSistema oParametroSistema254 = parametroSistemaService
									.findById(oParametroSistemaPk254);
							if (oParametroSistema254 != null) {
								sPuerto = oParametroSistema254.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 254");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk9273 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 9273));
							ParametroSistema oParametroSistema9273 = parametroSistemaService
									.findById(oParametroSistemaPk9273);
							if (oParametroSistema9273 != null) {
								sTarttls = oParametroSistema9273.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 9273");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk9274 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 9274));
							ParametroSistema oParametroSistema9274 = parametroSistemaService
									.findById(oParametroSistemaPk9274);
							if (oParametroSistema9274 != null) {
								sAuth = oParametroSistema9274.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 9274");
								throw new ErrorEnvioEmail();
							}

							ParametroSistemaPK oParametroSistemaPk9275 = new ParametroSistemaPK(Long.valueOf((long) 0),
									Long.valueOf((long) 0), "es", Short.valueOf((short) 9275));
							ParametroSistema oParametroSistema9275 = parametroSistemaService
									.findById(oParametroSistemaPk9275);
							if (oParametroSistema9275 != null) {
								sSocket = oParametroSistema9275.getValor();
							} else {
								System.err.println("Falta el parámetro del sistema número 9275");
								throw new ErrorEnvioEmail();
							}
							int iCodigo = (int)(Math.random()*(9999-1000+1)+1000);
							usuarioValido.setCodigo(iCodigo);
							String sCodigo= String.valueOf(iCodigo);
							String sAsunto = "Código de validación para iFlow";
							String sCuerpo = "Hemos recibido una solicitud para iniciar sesión en tu cuenta de iFlow." + "\n" 
									+ "Aquí está el código que necesitas: " + sCodigo;

							boolean envioMail = Utiles.EMail(eMail, sAsunto, sCuerpo, sPuerto,
									sServidor, sRemitente, sUsuario, sPass, sTarttls, sAuth, sSocket);
							if (!envioMail) {
								throw new ErrorEnvioEmail();
							}
        				}
        				
        				return usuarioValido;
    				}
        		}
    		}
    	}else {
    		throw new UsuarioNotFoundException(usuario);
    	}
		return null;	
	}

}
