package com.cootramixtol.sipd.services.asociado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.entities.Usuario;
import com.cootramixtol.sipd.repositories.AsociadoRepository;

@Service
public class AsociadoServiceImpl implements AsociadoService{
	

	@Autowired
	private AsociadoRepository asociadoRepository; 
		

	@Override
	public Usuario registrar(Usuario asociado) {

		var existe = asociadoRepository.findByIdentificacion(asociado.getIdentificacion());
		var existePorCorreo = asociadoRepository.findByCorreo(asociado.getCorreo());
		if (existe != null || existePorCorreo != null) {
			existe = null;
			existePorCorreo = null;
			return existe;
		}

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        asociado.setClave(bCryptPasswordEncoder.encode(asociado.getClave()));

		return asociadoRepository.save(asociado);
	}

	@Override
	public Usuario consultar(long id) {
		return asociadoRepository.findById(id);
	}

	@Override
	public List<Usuario> listar() {
		return asociadoRepository.findAll();
	}

}
