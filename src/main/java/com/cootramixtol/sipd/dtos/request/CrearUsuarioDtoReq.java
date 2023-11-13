package com.cootramixtol.sipd.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearUsuarioDtoReq {
    
    private long identificacion;
    private String nombres;
    private String apellidos;
    private String rol;
    private String clave;
    private String correo;      

}
