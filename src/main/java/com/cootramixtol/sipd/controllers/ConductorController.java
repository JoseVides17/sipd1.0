package com.cootramixtol.sipd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cootramixtol.sipd.dtos.request.CrearConductorDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearConductorDtoResp;
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

    @PostMapping
    public ResponseEntity<CrearConductorDtoResp> registrar(@RequestBody CrearConductorDtoReq conductor){

        
        return ResponseEntity.ok(conductorService.registrar(conductor));
    } 
    
}
