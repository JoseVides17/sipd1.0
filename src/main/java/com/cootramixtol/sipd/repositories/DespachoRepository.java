package com.cootramixtol.sipd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cootramixtol.sipd.entities.Despacho;

@Repository
public interface DespachoRepository extends JpaRepository<Despacho, Long>{

    Despacho findById(long id);
    List<Despacho> findByRutaContains(String ruta);
    
}
