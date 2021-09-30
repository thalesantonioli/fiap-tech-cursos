package com.curso.fiap.curso.fiap.repository;

import com.curso.fiap.curso.fiap.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario>  findByEmail(String email);

    Optional<Usuario> findByNome(String nome);

}
