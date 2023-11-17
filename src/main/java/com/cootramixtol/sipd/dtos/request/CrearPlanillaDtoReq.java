package com.cootramixtol.sipd.dtos.request;

import java.time.LocalDate;

import com.cootramixtol.sipd.entities.Conductor;
import com.cootramixtol.sipd.entities.DetallePlanilla;
import com.cootramixtol.sipd.entities.Tarifa;
import com.cootramixtol.sipd.entities.Usuario;
import com.cootramixtol.sipd.entities.Vehiculo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearPlanillaDtoReq {

	private LocalDate fecha;
	private int estado;
	private LocalDate fechaRegistro;
	private LocalDate ultimaFechaActualizacion;
    private DetallePlanilla detalles;
	private Tarifa tarifa;
	private Conductor conductor;
	private Vehiculo vehiculo;
	private Usuario registradoPor;

    
}
