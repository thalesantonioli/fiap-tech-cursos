package com.curso.fiap.curso.fiap.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_carrinho")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrinho implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_carrinho")
  private Long id;

  @Column(name = "preco_total")
  private double precoTotal;

  @OneToOne
  @JoinColumn(name = "id_usuario")
  private Usuario usuario;

  @ManyToMany
  @JoinTable(name = "tb_carrinho_cupom", joinColumns = @JoinColumn(name = "id_carrinho"),
      inverseJoinColumns = @JoinColumn(name = "id_cupom"))
  private List<Cupom> cupons;

  @ManyToMany
  @JoinTable(name = "tb_carrinho_curso", joinColumns = @JoinColumn(name = "id_carrinho"),
      inverseJoinColumns = @JoinColumn(name = "id_curso"))
  private List<Curso> cursos;
}
