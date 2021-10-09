package com.curso.fiap.curso.fiap.model.dto;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"nome", "cargaHoraria", "conteudos"})
public class ModuloResponseDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String nome;

  @JsonProperty("carga_horaria")
  private String cargaHoraria;

  private List<ConteudoResponseDTO> conteudos;
}
