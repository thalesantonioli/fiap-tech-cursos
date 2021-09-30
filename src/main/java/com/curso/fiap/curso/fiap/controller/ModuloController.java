package com.curso.fiap.curso.fiap.controller;

import com.curso.fiap.curso.fiap.entity.Modulo;
import com.curso.fiap.curso.fiap.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("modulos")
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    @GetMapping("/cursos/{id}")
        public List<Modulo> getModuloByCursoId(@PathVariable("id") Long id){
        return moduloService.findAllByCursoId(id);
    }
}
