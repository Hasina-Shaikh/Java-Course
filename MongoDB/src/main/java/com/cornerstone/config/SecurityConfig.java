package com.cornerstone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/h2-console/**", "/getHealthcheck", "/index","/callexternalapi","/callexchangeapi").permitAll()
				.and().csrf().ignoringAntMatchers("/h2-console/**", "/getHealthcheck", "/index","/callexternalapi","/callexchangeapi").and().headers()
				.frameOptions().sameOrigin();
		httpSecurity.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic()
				.authenticationEntryPoint(new RestAuthenticationEntryPoint());
		httpSecurity.headers().httpStrictTransportSecurity().includeSubDomains(true).maxAgeInSeconds(31536000);
		httpSecurity.headers().contentSecurityPolicy("script-src 'self'");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//		super.configure(auth);
		authenticationManagerBuilder.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
		authenticationManagerBuilder.inMemoryAuthentication().withUser("user").password("user").roles("USER");
	}

	
//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.authorizeRequests().antMatchers("/h2-console/**", "/getHealthcheck").permitAll()
//				.and().csrf().ignoringAntMatchers("/h2-console/**", "/getHealthcheck").and().headers()
//				.frameOptions().sameOrigin();
////		super.configure(http);
//	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
