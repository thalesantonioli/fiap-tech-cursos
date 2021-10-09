package com.curso.fiap.curso.fiap.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.fiap.curso.fiap.model.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
  Optional<Curso> findByNome(String nome);
}
