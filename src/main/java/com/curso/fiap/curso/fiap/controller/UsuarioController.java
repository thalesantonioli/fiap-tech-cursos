package com.curso.fiap.curso.fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.curso.fiap.curso.fiap.model.dto.UsuarioRequestDTO;
import com.curso.fiap.curso.fiap.model.entity.Usuario;
import com.curso.fiap.curso.fiap.service.UsuarioService;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioService usuarioService;

  @PostMapping
  @CrossOrigin
  public Usuario create(@RequestBody UsuarioRequestDTO usuario) {
    return usuarioService.create(usuario);
  }

  @PutMapping("{id}")
  @CrossOrigin
  public Usuario update(@RequestBody UsuarioRequestDTO usuario, @PathVariable("id") Long id) {
    return usuarioService.update(id, usuario);
  }
}
