package com.cootramixtol.sipd.dtos.response;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.cootramixtol.sipd.entities.Ruta;
import com.cootramixtol.sipd.entities.Vehiculo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearDespachoDtoResp {

    private Ruta ruta;
    private Vehiculo vehiculo;
	private LocalDateTime hora;
	private LocalDate fecha;
	private int numeroPasajeros;
	private LocalDate fechaRegistro;
    
}
