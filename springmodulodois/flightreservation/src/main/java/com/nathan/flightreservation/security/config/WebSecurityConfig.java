package com.nathan.flightreservation.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		//based of patterns
		return new BCryptPasswordEncoder();
	}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		//based of patterns
		http.authorizeRequests().antMatchers("/reservation/*","/reservations").permitAll().antMatchers("/loginP","/showReg","/","/home","/index.html","/registerUser",
				"/login","/showLogin","/login/*","/findFlights",
				"/register","/showCompleteReservation")
		.permitAll().antMatchers("/admin/*").hasAnyAuthority("ADMIN").anyRequest().authenticated()
		.and().csrf().disable();
	}
	//bean fo authenticate
	@Bean(name=BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}
}
