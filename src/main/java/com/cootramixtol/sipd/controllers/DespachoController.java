package com.cootramixtol.sipd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cootramixtol.sipd.entities.Despacho;
import com.cootramixtol.sipd.services.despacho.DespachoService;

@RestController
@RequestMapping("api/despachos")
public class DespachoController {

    @Autowired
    private DespachoService despachoService;

    @GetMapping
    public ResponseEntity<List<Despacho>> listar(){
        return ResponseEntity.ok(despachoService.listar());
    }

    @PostMapping
    public ResponseEntity<Despacho> resgistrar(@RequestBody Despacho despacho){
        return ResponseEntity.ok(despachoService.registrar(despacho));
    }
    
}
