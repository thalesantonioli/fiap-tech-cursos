package com.curso.fiap.curso.fiap.model.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConteudoResponseDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String descricao;
}
