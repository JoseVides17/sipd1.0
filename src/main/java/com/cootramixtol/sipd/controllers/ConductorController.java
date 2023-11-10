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

import com.cootramixtol.sipd.entities.Conductor;
import com.cootramixtol.sipd.services.conductor.ConductorService;

@RestController
@RequestMapping("api/conductores")
public class ConductorController {

    @Autowired
    private ConductorService conductorService;

    @GetMapping
    public ResponseEntity<List<Conductor>> listar(){
        return ResponseEntity.ok(conductorService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conductor> findById(@PathVariable Long id){
        return ResponseEntity.ok(conductorService.consultar(id));
    }

    @PostMapping
    public ResponseEntity<Conductor> registrar(@RequestBody Conductor conductor){
        return ResponseEntity.ok(conductorService.registrar(conductor));
    } 
    
}
