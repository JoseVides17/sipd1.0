package com.cootramixtol.sipd.services.despacho;

import java.util.List;

import com.cootramixtol.sipd.entities.Despacho;

public interface DespachoService {
    
    Despacho registrar(Despacho despacho);
	Despacho consultar(long id);
	List<Despacho> listar();

}
