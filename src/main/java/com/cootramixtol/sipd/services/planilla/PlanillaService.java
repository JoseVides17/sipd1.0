package com.cootramixtol.sipd.services.planilla;

import java.util.List;

import com.cootramixtol.sipd.dtos.request.CrearPlanillaDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearPlanillaDtoResp;
import com.cootramixtol.sipd.entities.Planilla;

public interface PlanillaService {
    
     CrearPlanillaDtoResp registrar(CrearPlanillaDtoReq crearPlanillaDtoReq);
	 Planilla consultar(long id);
	 List<Planilla> listar();

}
