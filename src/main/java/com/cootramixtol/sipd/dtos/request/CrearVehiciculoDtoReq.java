package com.cootramixtol.sipd.dtos.request;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearVehiciculoDtoReq {

	private String placa;
	private long conductorId;
	private String tipo;
	private String marca;
	private String modelo;
	private int capacidadPasajeros;
	private String tarjetaPropiedad;
	private long tarifaId;
	private Date vigenciaSoat;
	private Date vigenciaRtm;
    
}