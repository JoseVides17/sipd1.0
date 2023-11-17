package com.cootramixtol.sipd.services.despacho;

import java.util.List;

import com.cootramixtol.sipd.dtos.request.CrearDespachoDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearDespachoDtoResp;
import com.cootramixtol.sipd.entities.Despacho;

public interface DespachoService {
    
    CrearDespachoDtoResp registrar(CrearDespachoDtoReq crearDespachoDtoReq);
	Despacho consultar(long id);
	List<Despacho> listar();

}
