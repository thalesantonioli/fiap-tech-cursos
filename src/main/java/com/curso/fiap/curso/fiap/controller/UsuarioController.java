package com.curso.fiap.curso.fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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

  @GetMapping
  @CrossOrigin
  public Usuario getUserByEmail(
      @RequestParam(name = "email", defaultValue = "", required = false) String email) {
    return usuarioService.findByEmail(email);
  }
}
