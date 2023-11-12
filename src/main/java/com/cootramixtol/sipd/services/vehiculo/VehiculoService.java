package com.cootramixtol.sipd.services.vehiculo;

import java.util.List;

import com.cootramixtol.sipd.entities.Vehiculo;

public interface VehiculoService {
    
     Vehiculo registrar(Vehiculo vehiculo);
	 Vehiculo consultar(long id);
	 List<Vehiculo> listar();


}
