package com.cootramixtol.sipd.services.usuario;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cootramixtol.sipd.dtos.request.CrearUsuarioDtoReq;
import com.cootramixtol.sipd.dtos.response.CrearUsuarioDtoResp;
import com.cootramixtol.sipd.entities.Rol;
import com.cootramixtol.sipd.entities.Usuario;
import com.cootramixtol.sipd.mapper.Mapeador;
import com.cootramixtol.sipd.repositories.RolRepository;
import com.cootramixtol.sipd.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private RolRepository rolRepository;

	@Override
	public CrearUsuarioDtoResp registrar(CrearUsuarioDtoReq crearUsuarioDtoReq) {

		var existe = usuarioRepository.findByIdentificacion(crearUsuarioDtoReq.getIdentificacion());
		var existePorCorreo = usuarioRepository.findByCorreo(crearUsuarioDtoReq.getCorreo());

		if (Objects.nonNull(existe) && Objects.nonNull(existePorCorreo)) {

			return null;
		}

		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		crearUsuarioDtoReq.setClave(bCryptPasswordEncoder.encode(crearUsuarioDtoReq.getClave()));

		Rol rol = rolRepository.findByDescripcion(crearUsuarioDtoReq.getRol());

		Usuario usuario = Mapeador.INSTANCE.mapUsuario(crearUsuarioDtoReq);
		usuario.setRol(rol);
		Usuario usuarioGuardado = usuarioRepository.save(usuario);
		return Mapeador.INSTANCE.mapUsuario(usuarioGuardado);

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
