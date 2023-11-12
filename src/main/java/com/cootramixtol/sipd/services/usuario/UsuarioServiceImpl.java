package com.cootramixtol.sipd.services.usuario;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.dtos.request.CrearUsuarioDto;
import com.cootramixtol.sipd.entities.Rol;
import com.cootramixtol.sipd.entities.Usuario;
import com.cootramixtol.sipd.repositories.RolRepository;
import com.cootramixtol.sipd.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	

	@Autowired
	private UsuarioRepository usuarioRepository; 

	@Autowired
	private RolRepository rolRepository;
		

	@Override
	public Usuario registrar(CrearUsuarioDto crearUsuarioDto) {

		var existe = usuarioRepository.findByIdentificacion(crearUsuarioDto.getIdentificacion());
		var existePorCorreo = usuarioRepository.findByCorreo(crearUsuarioDto.getCorreo());
		if (existe != null || existePorCorreo != null) {
			existe = null;
			existePorCorreo = null;
			return existe;
		}

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        crearUsuarioDto.setClave(bCryptPasswordEncoder.encode(crearUsuarioDto.getClave()));


		Rol rol = rolRepository.findByDescripcion(crearUsuarioDto.getRol());
		

		Usuario usuario = new Usuario();

		usuario.setIdentificacion(crearUsuarioDto.getIdentificacion());
		usuario.setNombres(crearUsuarioDto.getNombres());
		usuario.setApellidos(crearUsuarioDto.getApellidos());
		usuario.setRol(rol);
		usuario.setActivo(true);
		usuario.setCorreo(crearUsuarioDto.getCorreo());
		usuario.setClave(crearUsuarioDto.getClave());
		usuario.setFechaRegistro(LocalDate.now());


		return usuarioRepository.save(usuario);
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
