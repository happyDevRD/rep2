package com.greenaall.security;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

public class JwtToken {

	public static String GenerateToken(String usuario) { 
			
	    int expiration = 43200;
	    
		try{
			String tokenJWTString = Jwts.builder().setSubject(usuario)
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(new Date().getTime() + expiration * 1000))
	                .signWith(getSigningKey())
	                .compact();
			return tokenJWTString;
		}catch (Exception e) {
			System.out.println(e);
			return "Error creando el token JWT" + e;
		}
	}
	
	private static Key getSigningKey() {
	  
		String secretString = "Q2FkYSBkw61hIGVzIHVuYSBvcG9ydHVuaWRhZCBwYXJhIHNlciBmZWxpeiwgcGFyYSB2aXZpciB0dSBtZWpvciB2aWRhIHkgcGFyYSBhcHJlbmRlciBkZSB0dXMgZXJyb3JlcyBkZSBjYXJhIGEgc2VyIGxhIG1lam9yIHZlcnNpw7NuIGRlIHRp";
		byte[] keyBytes = Decoders.BASE64.decode(secretString);
		return Keys.hmacShaKeyFor(keyBytes);
	}
	
	public static boolean validarToken(String token, String usuario){
	 	final String username = extraerUsername(token);
        return (username.equals(usuario) && !isTokenExpiration(token));
	}
 
	public static boolean isTokenExpiration(String token){
		return extraerTiempoVencimiento(token).before(new Date());
	}
	
	public static Date extraerTiempoVencimiento(String token){
		return extraerContenidoClaims(token).getExpiration();
	}
	
	public static String extraerUsername(String token) {
	    return extraerContenidoClaims(token).getSubject();
	}
	
	public static Claims extraerContenidoClaims(String token){
		return Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token).getBody();
	} 
	
}
