package com.cootramixtol.sipd.services.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.entities.Usuario;
import com.cootramixtol.sipd.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	

	@Autowired
	private UsuarioRepository usuarioRepository; 
		

	@Override
	public Usuario registrar(Usuario asociado) {

		var existe = usuarioRepository.findByIdentificacion(asociado.getIdentificacion());
		var existePorCorreo = usuarioRepository.findByCorreo(asociado.getCorreo());
		if (existe != null || existePorCorreo != null) {
			existe = null;
			existePorCorreo = null;
			return existe;
		}

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        asociado.setClave(bCryptPasswordEncoder.encode(asociado.getClave()));

		return usuarioRepository.save(asociado);
	}

	@Override
	public Usuario consultar(long id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}

}
