package com.curso.fiap.curso.fiap.controller;

import com.curso.fiap.curso.fiap.entity.Usuario;
import com.curso.fiap.curso.fiap.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }
}
