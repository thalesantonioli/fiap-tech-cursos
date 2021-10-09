package com.curso.fiap.curso.fiap.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.fiap.curso.fiap.model.entity.Modulo;

public interface ModuloRepository extends JpaRepository<Modulo, Long> {
  List<Modulo> findAllByCursoId(Long id);
}
