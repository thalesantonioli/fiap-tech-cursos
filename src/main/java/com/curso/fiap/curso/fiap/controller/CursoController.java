package com.curso.fiap.curso.fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.curso.fiap.curso.fiap.model.dto.CursoResponseDTO;
import com.curso.fiap.curso.fiap.model.dto.ListaCursosResponseDTO;
import com.curso.fiap.curso.fiap.service.CursoService;

@RestController
@RequestMapping("cursos")
public class CursoController {

  @Autowired
  private CursoService cursoService;

  @GetMapping
  public ResponseEntity<ListaCursosResponseDTO> getCurso() {
    return ResponseEntity.ok(cursoService.findAll());
  }

  @GetMapping("{id}")
  public ResponseEntity<CursoResponseDTO> getCursoById(@PathVariable Long id) {
    return ResponseEntity.ok(cursoService.find(id));
  }
}
