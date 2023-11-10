package com.cootramixtol.sipd.services.conductor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Conductor registrar(Conductor asociado) {
        return conductorRepository.save(asociado);
    }
    
}
