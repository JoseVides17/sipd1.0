package com.cootramixtol.sipd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cootramixtol.sipd.entities.Planilla;

@Repository
public interface PlanillaRepository extends JpaRepository<Planilla, Long>{
    
     Planilla findById(long id);

}
