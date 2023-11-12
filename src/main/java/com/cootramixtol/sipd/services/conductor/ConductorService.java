package com.cootramixtol.sipd.services.conductor;

import java.util.List;

import com.cootramixtol.sipd.dtos.request.CrearConductorDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearConductorDtoResp;
import com.cootramixtol.sipd.entities.Conductor;

public interface ConductorService {
    
    CrearConductorDtoResp registrar(CrearConductorDtoReq crearConductorDtoReq);
	Conductor consultar(long id);
	List<Conductor> listar();

}
