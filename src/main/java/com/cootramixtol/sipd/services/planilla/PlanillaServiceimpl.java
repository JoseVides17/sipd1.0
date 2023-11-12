package com.cootramixtol.sipd.services.planilla;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.entities.Planilla;
import com.cootramixtol.sipd.repositories.PlanillaRepository;

@Service
public class PlanillaServiceimpl implements PlanillaService{

    @Autowired
    private PlanillaRepository planillaRepository;

    @Override
    public Planilla consultar(long id) {
        return planillaRepository.findById(id);
    }

    @Override
    public List<Planilla> listar() {
        return planillaRepository.findAll();
    }

    @Override
    public Planilla registrar(Planilla planilla) {
        return planillaRepository.save(planilla);
    }
    
}
