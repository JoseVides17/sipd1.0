package com.cootramixtol.sipd.services.despacho;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.entities.Despacho;
import com.cootramixtol.sipd.repositories.DespachoRepository;

@Service
public class DespachoServiceimpl implements DespachoService{

    @Autowired
    private DespachoRepository despachoRepository;

    @Override
    public Despacho consultar(long id) {
        return despachoRepository.findById(id);
    }

    @Override
    public List<Despacho> listar() {
        return despachoRepository.findAll();
    }

    @Override
    public Despacho registrar(Despacho despacho) {
        return despachoRepository.save(despacho);
    }

    
    
}
