package com.cootramixtol.sipd.controllers;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cootramixtol.sipd.dtos.request.CrearUsuarioDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearUsuarioDtoResp;
import com.cootramixtol.sipd.entities.Usuario;
import com.cootramixtol.sipd.services.usuario.UsuarioService;

@RestController
@RequestMapping("api/usuarios") 
public class UsuarioController {
	
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listar() {	
		return ResponseEntity.ok(usuarioService.listar());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id){
		return ResponseEntity.ok(usuarioService.consultar(id));
	}
	
	@PostMapping
	public ResponseEntity<CrearUsuarioDtoResp> registrar(@RequestBody CrearUsuarioDtoReq crearUsuarioDto ){

	CrearUsuarioDtoResp usuarioCreado =	usuarioService.registrar(crearUsuarioDto);

		if(Objects.isNull(usuarioCreado)){

				return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
		}

		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCreado);
	
	}

}
