package com.curso.fiap.curso.fiap.repository;

import com.curso.fiap.curso.fiap.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	Optional<Curso> findByNome(String nome);
}
