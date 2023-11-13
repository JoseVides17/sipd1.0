package com.cootramixtol.sipd.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cootramixtol.sipd.entities.Vehiculo;
import java.util.List;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    
    Vehiculo findById(long id);
    Vehiculo findByPlaca(String placa);

    @Query("SELECT v FROM Vehiculo v WHERE v.activo = 1")
    List<Vehiculo> findActive();


}
