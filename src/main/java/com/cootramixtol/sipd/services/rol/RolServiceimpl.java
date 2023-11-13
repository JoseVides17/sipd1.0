package com.cootramixtol.sipd.services.rol;

import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.entities.Rol;

@Service
public class RolServiceimpl implements RolService{

    @Override
    public String mapRol(Rol rol) {
        return (rol != null) ? rol.getDescripcion() : null;
    }
    
}
