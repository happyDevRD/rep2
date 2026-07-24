package com.greenaall.ge.util;

import java.util.Date;

import com.greenaall.exception.UsuarioBloqueoNoValidoException;
import com.greenaall.exception.UsuarioFecVenNoValidoException;
import com.greenaall.exception.UsuarioFecVenPassNoValidoException;
import com.greenaall.exception.UsuarioPassNoValidoException;
import com.greenaall.models.ge.entity.Usuario;
import com.greenaall.models.ge.entity.UsuarioContexto;
import com.greenaall.security.JwtToken;
import com.greenaall.util.Codificador;

public class UsuarioValide {
	
	public static UsuarioContexto validaUsuario(Usuario oUsuario, String passWord) { 
		
		if(passWord != null) {
			String sPass = Codificador.encriptar(passWord);
			if (!oUsuario.getPassword().equals(sPass)) {
				throw new UsuarioPassNoValidoException(oUsuario.getUsuario());
			}
			
		}
		
		if (oUsuario.getBloqueo().equals(Short.valueOf("1"))) {
			throw new UsuarioBloqueoNoValidoException(oUsuario.getUsuario());
		}
		
		if (oUsuario.getFecVenUsuar() != null && oUsuario.getFecVenUsuar().getTime() <= new Date().getTime()) {
			throw new UsuarioFecVenNoValidoException(oUsuario.getUsuario());
		}
		
	    if (oUsuario.getFecVenPassw() != null && oUsuario.getFecVenPassw().getTime() <= new Date().getTime()) {
	    	throw new UsuarioFecVenPassNoValidoException(oUsuario.getUsuario());
	    } 
				
		UsuarioContexto oUsuarioContexto = new UsuarioContexto();
		String token = JwtToken.GenerateToken(oUsuario.getUsuario());
		oUsuarioContexto.setUsuario(oUsuario.getUsuario());
		oUsuarioContexto.setToken(token);	
		oUsuarioContexto.setNivAcces(oUsuario.getNivAcces());
		return oUsuarioContexto;
	}
	
}
