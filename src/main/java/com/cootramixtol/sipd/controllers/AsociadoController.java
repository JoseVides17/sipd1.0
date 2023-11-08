package com.cootramixtol.sipd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cootramixtol.sipd.entities.Asociado;
import com.cootramixtol.sipd.services.asociado.AsociadoService;

@RestController
@RequestMapping("api/asociados") 
public class AsociadoController {
	
	
	@Autowired
	private AsociadoService asociadoServices;
	
	@GetMapping
	public ResponseEntity<List<Asociado>> listar() {
				
		return ResponseEntity.ok(asociadoServices.listar());
	}
	
	@PostMapping
	public ResponseEntity<Asociado> registrar(@RequestBody Asociado asociado ){
		
		return ResponseEntity.ok(asociadoServices.registrar(asociado));
	}

}
