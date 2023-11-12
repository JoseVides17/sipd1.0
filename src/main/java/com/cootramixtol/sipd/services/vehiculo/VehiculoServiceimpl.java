package com.cootramixtol.sipd.services.vehiculo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.entities.Vehiculo;
import com.cootramixtol.sipd.repositories.VehiculoRepository;

@Service
public class VehiculoServiceimpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo consultar(long id) {
        return vehiculoRepository.findById(id);
    }

    @Override
    public List<Vehiculo> listar() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo registrar(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }
    
}
