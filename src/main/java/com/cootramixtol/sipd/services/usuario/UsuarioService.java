package com.cootramixtol.sipd.services.usuario;

import java.util.List;

import com.cootramixtol.sipd.dtos.request.CrearUsuarioDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearUsuarioDtoResp;
import com.cootramixtol.sipd.entities.Usuario;

public interface UsuarioService {

	CrearUsuarioDtoResp registrar(CrearUsuarioDtoReq crearUsuarioDto);

	Usuario consultar(long id);

	List<Usuario> listar();

}
