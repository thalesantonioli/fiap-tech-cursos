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
@JsonPropertyOrder({"id", "nivel", "nome", "descricao", "precoOriginal", "precoPromocional",
    "porcDesconto", "urlImagem", "modulos"})
public class CursoResponseDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private String nivel;

  private String nome;

  private String descricao;

  @JsonProperty("preco_original")
  private String precoOriginal;

  @JsonProperty("preco_promocional")
  private String precoPromocional;

  @JsonProperty("porc_desconto")
  private int porcDesconto;

  @JsonProperty("url_imagem")
  private String urlImagem;

  private List<ModuloResponseDTO> modulos;
}
