package com.nathan.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		//u8se password token
		
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails, password,userDetails.getAuthorities());
		
		authenticationManager.authenticate(token);
		
		boolean authenticated = token.isAuthenticated();
		
		if(authenticated) {
			SecurityContextHolder.getContext().setAuthentication(token);
		}
		
		return authenticated;
	}

}
