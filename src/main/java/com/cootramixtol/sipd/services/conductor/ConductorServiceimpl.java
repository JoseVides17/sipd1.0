package com.cootramixtol.sipd.services.conductor;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.dtos.request.CrearConductorDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearConductorDtoResp;
import com.cootramixtol.sipd.entities.Conductor;
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

        Conductor conductor = new Conductor();

        conductor.setIdentificacion(crearConductorDtoReq.getIdentificacion());
        conductor.setNombres(crearConductorDtoReq.getNombres());
        conductor.setApellidos(crearConductorDtoReq.getApellidos());
        conductor.setActivo(true);
        conductor.setFechaNacimiento(crearConductorDtoReq.getFechaNacimiento());
        conductor.setLicencia(crearConductorDtoReq.getLicencia());
        conductor.setCategoriaLicencia(crearConductorDtoReq.getCategoriaLicencia());
        conductor.setVigenciaLicencia(crearConductorDtoReq.getVigenciaLicancia());

        Conductor conductorGuardado = conductorRepository.save(conductor);

        CrearConductorDtoResp crearConductorDtoResp = new CrearConductorDtoResp();

        crearConductorDtoResp.setIdentificacion(conductorGuardado.getIdentificacion());
        crearConductorDtoResp.setNombres(conductorGuardado.getNombres());
        crearConductorDtoResp.setApellidos(conductorGuardado.getApellidos());
        crearConductorDtoResp.setFechaRegistro(conductorGuardado.getFechaRegistro());

        return crearConductorDtoResp;
    }
    
}
