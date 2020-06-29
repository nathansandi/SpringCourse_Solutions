package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//add our user for in memory auth
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("nsandi").password("2").roles("ADMIN"))
			.withUser(users.username("nsandi1").password("2").roles("EMPLOYEE"))
			.withUser(users.username("nsandi2").password("2").roles("ROLE"));
		
	}
	//security webapps for applitcation for logs
	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/showMyLoginPage")				
				.loginProcessingUrl("/authenticateTheUser")
				.permitAll();
			

	}
	
	

}
