package com.nathan.needhelp.services;

import com.nathan.needhelp.dbo.RegistroRequest;
import com.nathan.needhelp.entities.Usuarios;

public class RegistroServiceImpl implements RegistroService {

	@Override
	public Usuarios registroUsuario(RegistroRequest request) {
		// TODO Auto-generated method stub
		Usuarios newUser = new Usuarios();
		
		newUser.setEmail(request.getEmail());
		newUser.setPassword(request.getPassword());
		newUser.setNome(request.getNome());
		newUser.setSobrenome(request.getSobrenome());
		newUser.setCidade(request.getCidade());
		newUser.setUf(request.getUf());
		newUser.setPais(request.getPais());
		newUser.setEndereco(request.getEndereco());
		//newUser.setDataNascimento(request.getDataNascimento());
		newUser.setSkypeId(request.getSkypeId());
		newUser.setTelefone(request.getTelefone());
		newUser.setFoto(null);		
		newUser.setConfirmado(false);
		
		
		return newUser;
	}

}
