package com.cootramixtol.sipd.dtos.response;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CrearConductorDtoResp {
    
    private Long identificacion;
    private String nombres;
    private String apellidos;
    private LocalDate fechaRegistro;;

}
