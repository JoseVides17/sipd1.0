package com.cootramixtol.sipd.services.asociado;

import java.util.List;

import com.cootramixtol.sipd.entities.Asociado;

public interface AsociadoService {
	
	 Asociado registrar(Asociado asociado);
	 Asociado consultar(long id);
	 List<Asociado> listar();

} 
