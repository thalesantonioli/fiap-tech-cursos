package com.curso.fiap.curso.fiap.repository;

import com.curso.fiap.curso.fiap.entity.Modulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModuloRepository extends JpaRepository<Modulo, Long> {
    List<Modulo> findAllByCursoId(Long id);
}
