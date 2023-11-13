package com.cootramixtol.sipd.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cootramixtol.sipd.dtos.request.CrearVehiciculoDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearVehiculoDtoResp;
import com.cootramixtol.sipd.entities.Vehiculo;

@Mapper
public interface Mapeador{
    
      Mapeador INSTANCE = Mappers.getMapper(Mapeador.class);

      CrearVehiculoDtoResp MapVehiculo(Vehiculo vehiculo);
      Vehiculo MapVehiculo(CrearVehiciculoDtoReq crearVehiciculoDtoReq);

}
