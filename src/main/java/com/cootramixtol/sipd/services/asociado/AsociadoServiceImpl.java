package com.cootramixtol.sipd.services.asociado;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.entities.Asociado;
import com.cootramixtol.sipd.repositories.AsociadoRepository;

import lombok.var;

@Service
public class AsociadoServiceImpl implements AsociadoService{
	

	@Autowired
	private AsociadoRepository asociadoRepository; 
		

	@Override
	public Asociado registrar(Asociado asociado) {
		var asociadoExiste = consultar(asociado.getIdentificacion());
		if (asociadoExiste.isActivo()) {
			return Optional.empty();
		}else{
			return asociadoRepository.save(asociado);
		}
	}

	@Override
	public Asociado consultar(long id) {
		return asociadoRepository.findById(id);
	}

	@Override
	public List<Asociado> listar() {
		return asociadoRepository.findAll();
	}

}
