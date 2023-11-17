package com.cootramixtol.sipd.services.despacho;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.dtos.request.CrearDespachoDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearDespachoDtoResp;
import com.cootramixtol.sipd.entities.Despacho;
import com.cootramixtol.sipd.mapper.Mapeador;
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
    public CrearDespachoDtoResp registrar(CrearDespachoDtoReq crearDespachoDtoReq) {

        Despacho despacho = Mapeador.INSTANCE.mapDespacho(crearDespachoDtoReq);
        Despacho despachoGuardado = despachoRepository.save(despacho);
        return Mapeador.INSTANCE.mapDespacho(despachoGuardado);
        
    }

    
    
}
