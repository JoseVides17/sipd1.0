package com.cootramixtol.sipd.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cootramixtol.sipd.dtos.request.CrearConductorDtoReq;
import com.cootramixtol.sipd.dtos.request.CrearDespachoDtoReq;
import com.cootramixtol.sipd.dtos.request.CrearPlanillaDtoReq;
import com.cootramixtol.sipd.dtos.request.CrearUsuarioDtoReq;
import com.cootramixtol.sipd.dtos.request.CrearVehiciculoDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearConductorDtoResp;
import com.cootramixtol.sipd.dtos.response.CrearDespachoDtoResp;
import com.cootramixtol.sipd.dtos.response.CrearPlanillaDtoResp;
import com.cootramixtol.sipd.dtos.response.CrearUsuarioDtoResp;
import com.cootramixtol.sipd.dtos.response.CrearVehiculoDtoResp;
import com.cootramixtol.sipd.entities.Conductor;
import com.cootramixtol.sipd.entities.Despacho;
import com.cootramixtol.sipd.entities.Planilla;
import com.cootramixtol.sipd.entities.Usuario;
import com.cootramixtol.sipd.entities.Vehiculo;

@Mapper
public interface Mapeador{
    
      Mapeador INSTANCE = Mappers.getMapper(Mapeador.class);

      CrearVehiculoDtoResp mapVehiculo(Vehiculo vehiculo);
      Vehiculo mapVehiculo(CrearVehiciculoDtoReq crearVehiciculoDtoReq);

      CrearUsuarioDtoResp mapUsuario(Usuario usuario);
      Usuario mapUsuario(CrearUsuarioDtoReq crearUsuarioDtoReq);

      CrearConductorDtoResp mapConductor(Conductor conductor);
      Conductor mapConductor(CrearConductorDtoReq crearConductorDtoReq);

      CrearDespachoDtoResp mapDespacho(Despacho despacho);
      Despacho mapDespacho(CrearDespachoDtoReq crearDespachoDtoReq);

      CrearPlanillaDtoResp mapPlanilla(Planilla planilla);
      Planilla mapPlanilla(CrearPlanillaDtoReq crearPlanillaDtoReq);

}
