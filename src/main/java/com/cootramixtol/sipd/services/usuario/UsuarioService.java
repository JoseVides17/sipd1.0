package com.cootramixtol.sipd.services.usuario;

import java.util.List;

import com.cootramixtol.sipd.entities.Usuario;

public interface UsuarioService {
	
	 Usuario registrar(Usuario usuario);
	 Usuario consultar(long id);
	 List<Usuario> listar();

} 
