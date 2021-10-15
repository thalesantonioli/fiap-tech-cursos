package com.curso.fiap.curso.fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.curso.fiap.curso.fiap.model.dto.CursoResponseDTO;
import com.curso.fiap.curso.fiap.model.dto.ListaCursosResponseDTO;
import com.curso.fiap.curso.fiap.service.CursoService;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("cursos")
@Log4j2
public class CursoController {

  @Autowired
  private CursoService cursoService;

  @GetMapping
  @CrossOrigin
  public ResponseEntity<ListaCursosResponseDTO> getCurso(@RequestParam(name = "criteria", defaultValue = "", required = false) String criteria) {
    log.info("Received request.");
    return ResponseEntity.ok(cursoService.findAll(criteria));
  }

  @GetMapping("{id}")
  @CrossOrigin
  public ResponseEntity<CursoResponseDTO> getCursoById(@PathVariable Long id) {
    return ResponseEntity.ok(cursoService.find(id));
  }
}
