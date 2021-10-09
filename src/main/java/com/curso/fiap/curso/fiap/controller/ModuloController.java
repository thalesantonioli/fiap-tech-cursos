package com.curso.fiap.curso.fiap.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.curso.fiap.curso.fiap.model.entity.Modulo;
import com.curso.fiap.curso.fiap.service.ModuloService;

@RestController
@RequestMapping("modulos")
public class ModuloController {

  @Autowired
  private ModuloService moduloService;

  @GetMapping("/cursos/{id}")
  public List<Modulo> getModuloByCursoId(@PathVariable("id") Long id) {
    return moduloService.findAllByCursoId(id);
  }
}
