package com.cootramixtol.sipd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cootramixtol.sipd.entities.Rol;

public interface RolRepository extends JpaRepository<Rol, Long>{
    Rol findByDescripcion(String descripcion);
}
