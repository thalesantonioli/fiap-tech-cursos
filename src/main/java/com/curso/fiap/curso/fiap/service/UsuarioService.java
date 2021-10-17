package com.curso.fiap.curso.fiap.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curso.fiap.curso.fiap.model.dto.UsuarioRequestDTO;
import com.curso.fiap.curso.fiap.model.entity.Usuario;
import com.curso.fiap.curso.fiap.model.mapper.UsuarioMapper;
import com.curso.fiap.curso.fiap.repository.UsuarioRepository;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private UsuarioMapper mapper;

  public Usuario create(UsuarioRequestDTO request) {
    Usuario usuario = this.mapper.usuarioRequestDTOToUsuario(request);
    return usuarioRepository.save(usuario);
  }

  public Usuario update(Long id, UsuarioRequestDTO usuario) {
    Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

    if (!usuarioOptional.isPresent()) {
      throw new RuntimeException("Usuário não encontrado");
    }

    Usuario usuarioToUpdate = usuarioOptional.get();
    usuarioToUpdate.setEmail(usuario.getEmail());
    usuarioToUpdate.setNome(usuario.getNome());
    usuarioToUpdate.setPassword(usuario.getPassword());

    return usuarioRepository.save(usuarioToUpdate);
  }

  public Usuario findByEmail(String email) {

    Optional<Usuario> usuarioOptional = this.usuarioRepository.findByEmail(email);

    if (usuarioOptional.isEmpty()) {
      throw new RuntimeException("Usuário não encontrado");
    }

    return usuarioOptional.get();
  }
}
