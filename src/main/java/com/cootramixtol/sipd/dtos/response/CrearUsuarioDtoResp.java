package com.cootramixtol.sipd.dtos.response;

import com.cootramixtol.sipd.entities.Rol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearUsuarioDtoResp {
    
    private long identificacion;
    private String nombres;
    private String apellidos;
    private Rol rol;
    private String correo;      

}
