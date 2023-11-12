 package com.cootramixtol.sipd.dtos.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class CrearVehiculoDtoResp {

    private String placa;
	private long idConductor;
	private String tipo;
	private String marca;
	private Date modelo;
	private int capacidadPasajeros;
	private String tarjetaPropiedad;
	private int codigoTarifa;
	private Date vigenciaSoat;
	private Date vigenciaRtm;
    
}