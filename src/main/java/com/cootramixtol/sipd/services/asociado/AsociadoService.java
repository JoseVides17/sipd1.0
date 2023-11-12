package com.cootramixtol.sipd.services.asociado;

import java.util.List;

import com.cootramixtol.sipd.entities.Usuario;

public interface AsociadoService {
	
	 Usuario registrar(Usuario asociado);
	 Usuario consultar(long id);
	 List<Usuario> listar();

} 
