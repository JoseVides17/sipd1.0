package com.cootramixtol.sipd.services.usuario;

import java.util.List;

import com.cootramixtol.sipd.dtos.request.CrearUsuarioDto;
import com.cootramixtol.sipd.entities.Usuario;

public interface UsuarioService {
	
	 Usuario registrar(CrearUsuarioDto crearUsuarioDto);
	 Usuario consultar(long id);
	 List<Usuario> listar();

} 
