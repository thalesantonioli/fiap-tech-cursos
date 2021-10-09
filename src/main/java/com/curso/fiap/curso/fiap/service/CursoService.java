package com.curso.fiap.curso.fiap.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curso.fiap.curso.fiap.model.dto.CursoResponseDTO;
import com.curso.fiap.curso.fiap.model.dto.ListaCursosResponseDTO;
import com.curso.fiap.curso.fiap.model.entity.Curso;
import com.curso.fiap.curso.fiap.model.mapper.CursoMapper;
import com.curso.fiap.curso.fiap.repository.CursoRepository;

@Service
public class CursoService {

  @Autowired
  private CursoRepository cursoRepository;

  @Autowired
  private CursoMapper mapper;

  public Curso create(Curso curso) {
    return cursoRepository.save(curso);
  }

  public Curso update(Curso curso) {
    if (!cursoRepository.existsById(curso.getId())) {
      throw new RuntimeException("Curso não encontrado");
    }

    return cursoRepository.save(curso);
  }

  public void delete(Long id) {
    if (!cursoRepository.existsById(id)) {
      throw new RuntimeException("Curso não encontrado");
    }

    cursoRepository.deleteById(id);
  }

  public CursoResponseDTO find(Long id) {
    Optional<Curso> optional = cursoRepository.findById(id);

    if (!optional.isPresent()) {
      throw new RuntimeException("Curso não encontrado");
    }

    return mapper.cursoToCursoResponseDTO(optional.get());
  }

  public Curso findByNome(String nome) {
    Optional<Curso> optional = cursoRepository.findByNome(nome);

    if (!optional.isPresent()) {
      throw new RuntimeException("Curso não encontrado");
    }

    return optional.get();
  }

  public ListaCursosResponseDTO findAll() {
    List<CursoResponseDTO> cursosResponse =
        mapper.cursoListToCursoResponseDTOList(cursoRepository.findAll());
    ListaCursosResponseDTO response =
        ListaCursosResponseDTO.builder().cursos(cursosResponse).build();

    return response;
  }
}
