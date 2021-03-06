package com.curso.fiap.curso.fiap.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curso.fiap.curso.fiap.model.entity.Conteudo;
import com.curso.fiap.curso.fiap.repository.ConteudoRepository;

@Service
public class ConteudoService {

  @Autowired
  private ConteudoRepository conteudoRepository;

  public Conteudo create(Conteudo conteudo) {
    return conteudoRepository.save(conteudo);
  }

  public Conteudo update(Conteudo conteudo) {
    if (!conteudoRepository.existsById(conteudo.getId())) {
      throw new RuntimeException("Conteúdo não encontrado");
    }

    return conteudoRepository.save(conteudo);
  }

  public void delete(Long id) {
    if (!conteudoRepository.existsById(id)) {
      throw new RuntimeException("Conteúdo não encontrado");
    }

    conteudoRepository.deleteById(id);
  }

  public Conteudo find(Long id) {
    Optional<Conteudo> optional = conteudoRepository.findById(id);

    if (!optional.isPresent()) {
      throw new RuntimeException("Conteúdo não encontrado");
    }

    return optional.get();
  }

  public List<Conteudo> findAll() {
    return conteudoRepository.findAll();
  }
}
