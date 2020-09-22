package com.nathan.needhelp.services;

import com.nathan.needhelp.dbo.RegistroRequest;
import com.nathan.needhelp.entities.Usuarios;


public interface RegistroService {	
		public Usuarios registroUsuario(RegistroRequest request);
}
