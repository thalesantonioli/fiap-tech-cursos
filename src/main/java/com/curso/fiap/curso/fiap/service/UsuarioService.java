package com.curso.fiap.curso.fiap.service;

import java.util.List;
import java.util.Optional;

import com.curso.fiap.curso.fiap.entity.Usuario;
import com.curso.fiap.curso.fiap.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario create(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario update(Usuario usuario) {
		if (!usuarioRepository.existsById(usuario.getId())) {
			throw new RuntimeException("Usuário não encontrado");
		}
		
		return usuarioRepository.save(usuario);
	}

	public void delete(Long id) {
		if (!usuarioRepository.existsById(id)) {
			throw new RuntimeException("Usuário não encontrado");
		}
		
		usuarioRepository.deleteById(id);
	}

	public Usuario find(Long id) {
		Optional<Usuario> optional = usuarioRepository.findById(id);
		
		if (!optional.isPresent()) {
			throw new RuntimeException("Usuário não encontrado");
		}
		
		return optional.get();
	}

	public Usuario findByNome(String nome) {

		Optional<Usuario> optional = usuarioRepository.findByNome(nome);

		if (!optional.isPresent()) {
			throw new RuntimeException("Usuário não encontrado");
		}

		return optional.get();
	}

	public Usuario findByEmail(String email) {

		Optional<Usuario> optional = usuarioRepository.findByEmail(email);

		if (!optional.isPresent()) {
			throw new RuntimeException("Usuário não encontrado");
		}

		return optional.get();
	}

	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
}
