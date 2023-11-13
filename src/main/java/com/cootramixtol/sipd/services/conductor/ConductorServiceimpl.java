package com.cootramixtol.sipd.services.conductor;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.dtos.request.CrearConductorDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearConductorDtoResp;
import com.cootramixtol.sipd.entities.Conductor;
import com.cootramixtol.sipd.entities.Usuario;
import com.cootramixtol.sipd.mapper.Mapeador;
import com.cootramixtol.sipd.repositories.ConductorRepository;

@Service
public class ConductorServiceimpl implements ConductorService{

    @Autowired
    private ConductorRepository conductorRepository;

    @Override
    public Conductor consultar(long id) {
        return conductorRepository.findById(id);
    }

    @Override
    public List<Conductor> listar() {
        return conductorRepository.findAll();
    }

    @Override
    public CrearConductorDtoResp registrar(CrearConductorDtoReq crearConductorDtoReq) {

        var existe = conductorRepository.findByIdentificacion(crearConductorDtoReq.getIdentificacion());

        if (Objects.nonNull(existe)) {
			
			return null;
		}

        Conductor conductor = Mapeador.INSTANCE.mapConductor(crearConductorDtoReq);
	    Conductor conductorGuardado = conductorRepository.save(conductor);       
		return Mapeador.INSTANCE.mapConductor(conductorGuardado);

    }
    
}
