package com.cootramixtol.sipd.dtos.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CrearVehiculoDtoResp {

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