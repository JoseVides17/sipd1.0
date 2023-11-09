package com.cootramixtol.sipd.services.conductor;

import java.util.List;

import com.cootramixtol.sipd.entities.Conductor;

public interface ConductorService {
    
    Conductor registrar(Conductor asociado);
	Conductor consultar(long id);
	List<Conductor> listar();

}
