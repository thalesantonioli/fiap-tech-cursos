package com.curso.fiap.curso.fiap.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.curso.fiap.curso.fiap.enums.CursoNivel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_curso")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_curso")
  private Long id;

  @Enumerated(EnumType.ORDINAL)
  @Column(name = "nivel")
  private CursoNivel nivel;

  @Column(name = "nm_curso")
  private String nome;

  @Column(name = "ds_curso")
  private String descricao;

  @Column(name = "preco_original")
  private Double precoOriginal;

  @Column(name = "preco_promocional")
  private Double precoPromocional;

  @Column(name = "porc_desconto")
  private Double porcDesconto;

  @Column(name = "url_imagem")
  private String urlImagem;

  @OneToMany(mappedBy = "curso")
  private List<Modulo> modulos;
}
