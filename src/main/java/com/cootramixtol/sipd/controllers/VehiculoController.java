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

import com.cootramixtol.sipd.dtos.request.CrearVehiciculoDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearVehiculoDtoResp;
import com.cootramixtol.sipd.entities.Vehiculo;
import com.cootramixtol.sipd.services.vehiculo.VehiculoService;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public ResponseEntity<List<Vehiculo>> listar(){
        return ResponseEntity.ok(vehiculoService.listar());
    }

    @GetMapping("/{id}")
	public ResponseEntity<Vehiculo> findById(@PathVariable Long id){
		return ResponseEntity.ok(vehiculoService.consultar(id));
	}

    @PostMapping
    public ResponseEntity<CrearVehiculoDtoResp> registrar(@RequestBody CrearVehiciculoDtoReq vehiculo){
        return ResponseEntity.ok(vehiculoService.registrar(vehiculo));
    }

    @GetMapping("/activos")
    public ResponseEntity<List<Vehiculo>> listarActivos(){
        return ResponseEntity.ok(vehiculoService.listarActivos());
    }
    
}
