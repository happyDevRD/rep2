package com.greenaall.security;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	private static final List<String> RUTAS_PUBLICAS = List.of(
			"/usuario/",
			"/usuario/login",
			"/notifica/adviser",
			"/actuator/health");

	@Value("${jwt.enabled:true}")
	private boolean jwtEnabled;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		if (!jwtEnabled || esRutaPublica(request.getRequestURI())) {
			filterChain.doFilter(request, response);
			return;
		}

		String authHeader = request.getHeader("Authorization");
		if (authHeader == null || !authHeader.startsWith("Bearer ")) {
			response.sendError(HttpStatus.UNAUTHORIZED.value(), "Token JWT requerido");
			return;
		}

		String token = authHeader.substring(7);
		try {
			if (JwtToken.isTokenExpiration(token)) {
				response.sendError(HttpStatus.UNAUTHORIZED.value(), "Token JWT expirado");
				return;
			}
			JwtToken.extraerUsername(token);
		} catch (Exception ex) {
			response.sendError(HttpStatus.UNAUTHORIZED.value(), "Token JWT inválido");
			return;
		}

		filterChain.doFilter(request, response);
	}

	private boolean esRutaPublica(String uri) {
		if (uri == null) {
			return true;
		}
		for (String ruta : RUTAS_PUBLICAS) {
			if (uri.contains(ruta)) {
				return true;
			}
		}
		return false;
	}
}
