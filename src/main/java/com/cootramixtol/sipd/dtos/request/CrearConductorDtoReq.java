package com.cootramixtol.sipd.dtos.request;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CrearConductorDtoReq {

    private Long identificacion;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private boolean activo;
    private String licencia;
    private String categoriaLicencia;
    private LocalDate vigenciaLicancia;
    
}
