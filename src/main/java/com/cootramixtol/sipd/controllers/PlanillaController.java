package com.cootramixtol.sipd.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cootramixtol.sipd.dtos.request.CrearPlanillaDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearPlanillaDtoResp;
import com.cootramixtol.sipd.entities.Planilla;
import com.cootramixtol.sipd.services.planilla.PlanillaService;

@RestController
@RequestMapping("api/planillas")
public class PlanillaController {

    private PlanillaService planillaService;

    @PostMapping
    public ResponseEntity<CrearPlanillaDtoResp> registrar(@RequestBody CrearPlanillaDtoReq crearPlanillaDtoReq){
        return ResponseEntity.ok(planillaService.registrar(crearPlanillaDtoReq));
    }

    @GetMapping
    public ResponseEntity<List<Planilla>> listar(){
        return ResponseEntity.ok(planillaService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Planilla> consultar(@PathVariable long id){
        return ResponseEntity.ok(planillaService.consultar(id));
    }
    
}
