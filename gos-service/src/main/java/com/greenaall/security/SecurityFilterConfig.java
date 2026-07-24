package com.greenaall.security;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class SecurityFilterConfig {

	@Bean
	public FilterRegistrationBean<JwtAuthenticationFilter> jwtFilter(JwtAuthenticationFilter filter) {
		FilterRegistrationBean<JwtAuthenticationFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(filter);
		registration.addUrlPatterns("/*");
		registration.setOrder(Ordered.HIGHEST_PRECEDENCE + 10);
		return registration;
	}
}
