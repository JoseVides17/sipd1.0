package com.cootramixtol.sipd.services.vehiculo;

import java.util.List;

import com.cootramixtol.sipd.dtos.request.CrearVehiciculoDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearVehiculoDtoResp;
import com.cootramixtol.sipd.entities.Vehiculo;

public interface VehiculoService {
    
     CrearVehiculoDtoResp registrar(CrearVehiciculoDtoReq vehiculo);
	 Vehiculo consultar(long id);
	 List<Vehiculo> listar();


}
