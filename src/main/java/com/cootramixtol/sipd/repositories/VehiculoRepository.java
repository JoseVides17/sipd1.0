package com.cootramixtol.sipd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cootramixtol.sipd.entities.Vehiculo;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    
    Vehiculo findById(long id);
    Vehiculo findByPlaca(String placa);

}
