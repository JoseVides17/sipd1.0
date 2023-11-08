package com.cootramixtol.sipd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cootramixtol.sipd.entities.Asociado;

@Repository
public interface AsociadoRepository  extends JpaRepository<Asociado, Long>{

}
 