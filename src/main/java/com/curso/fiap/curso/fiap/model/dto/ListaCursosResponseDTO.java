package com.curso.fiap.curso.fiap.model.dto;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListaCursosResponseDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private List<CursoResponseDTO> cursos;
}
