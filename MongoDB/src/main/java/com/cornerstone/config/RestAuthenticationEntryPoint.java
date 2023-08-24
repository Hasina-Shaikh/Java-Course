package com.cornerstone.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component("restAuthenticationEntryPoint")
@Slf4j
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.getOutputStream().println("{ \"message\": \"" + "You are not authorized User" + "\",\"status\":"
				+ HttpStatus.UNAUTHORIZED.value() + "\n}");

	}
//	public void commence(HttpServletRequest request, HttpServletResponse response,
//			AuthenticationException authenticationException) throws IOException, ServletException {
//		log.error("Unauthorized error. Message - {}", authenticationException.getMessage());
//		response.setContentType("application/json");
//		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//		response.getOutputStream().println("{ \"message\": \"" + "You are not authorized User" + "\",\"status\":"
//				+ HttpStatus.UNAUTHORIZED.value() + "\n}");
//	}

}
