package com.cootramixtol.sipd.dtos.response;

import java.time.LocalDate;

import com.cootramixtol.sipd.entities.Conductor;
import com.cootramixtol.sipd.entities.Tarifa;
import com.cootramixtol.sipd.entities.Vehiculo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearPlanillaDtoResp {

    private LocalDate fecha;
	private LocalDate fechaRegistro;
	private Tarifa tarifa;
	private Conductor conductor;
	private Vehiculo vehiculo;
    
}
