package com.cootramixtol.sipd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cootramixtol.sipd.entities.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

    Usuario findById(long id);
    Usuario findByIdentificacion(long identificacion);
    Usuario findByCorreo(String correo);
    List<Usuario> findByNombresContains(String nombres);

}