package com.curso.fiap.curso.fiap.model.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.curso.fiap.curso.fiap.model.dto.CursoResponseDTO;
import com.curso.fiap.curso.fiap.model.entity.Curso;

@Mapper(componentModel = "spring")
public interface CursoMapper {
  CursoResponseDTO cursoToCursoResponseDTO(Curso curso);

  List<CursoResponseDTO> cursoListToCursoResponseDTOList(List<Curso> curso);
}
