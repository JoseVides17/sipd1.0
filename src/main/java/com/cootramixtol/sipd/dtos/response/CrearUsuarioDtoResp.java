package com.cootramixtol.sipd.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearUsuarioDtoResp {
    
    private long identificacion;
    private String nombres;
    private String apellidos;
    private String rol;
    private String correo;      

}
