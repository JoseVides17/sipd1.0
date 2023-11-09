package com.cootramixtol.sipd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cootramixtol.sipd.entities.Conductor;

@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Long>{
    
    Conductor findById(long id);
    List<Conductor> findByNameContains(String name);

}
