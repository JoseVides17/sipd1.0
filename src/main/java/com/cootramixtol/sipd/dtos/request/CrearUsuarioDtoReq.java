package com.cootramixtol.sipd.dtos.request;

import com.cootramixtol.sipd.entities.Rol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearUsuarioDtoReq {
    
    private long identificacion;
    private String nombres;
    private String apellidos;
    private boolean activo;
    private Rol rol;
    private String clave;
    private String correo;      

}
