package com.cootramixtol.sipd.services.planilla;

import java.util.List;

import com.cootramixtol.sipd.entities.Planilla;

public interface PlanillaService {

	Planilla registrar(Planilla planilla);

	Planilla consultar(long id);

	List<Planilla> listar();

}
