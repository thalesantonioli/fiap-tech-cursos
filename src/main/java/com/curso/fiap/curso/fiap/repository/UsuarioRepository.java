package com.curso.fiap.curso.fiap.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.fiap.curso.fiap.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

  Optional<Usuario> findByEmail(String email);

  Optional<Usuario> findByNome(String nome);
}
