package com.cootramixtol.sipd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cootramixtol.sipd.dtos.request.CrearUsuarioDto;
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
	public ResponseEntity<Usuario> registrar(@RequestBody CrearUsuarioDto crearUsuarioDto ){
		return ResponseEntity.ok(usuarioService.registrar(crearUsuarioDto));
	}

}
