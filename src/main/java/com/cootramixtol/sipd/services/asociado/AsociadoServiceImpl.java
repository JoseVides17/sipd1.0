package com.cootramixtol.sipd.services.asociado;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.entities.Asociado;
import com.cootramixtol.sipd.repositories.AsociadoRepository;

@Service
public class AsociadoServiceImpl implements AsociadoService{
	

	@Autowired
	private AsociadoRepository asociadoRepository; 
		

	@Override
	public Asociado registrar(Asociado asociado) {

		Asociado asociadoExiste = asociadoRepository.findByIdentificacion(asociado.getIdentificacion());
		if(asociadoExiste.isActivo()){
			throw new DuplicateKeyException("Este Asociado Existe...");
		}

		Asociado asociadoExistePorCorreo = asociadoRepository.findByCorreo(asociado.getCorreo());
		if (asociadoExistePorCorreo.isActivo()) {
			throw new DuplicateKeyException("Este Asociado Existe...");
		}

		return asociadoRepository.save(asociado);
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
