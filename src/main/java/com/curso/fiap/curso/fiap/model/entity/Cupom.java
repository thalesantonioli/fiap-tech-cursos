package com.curso.fiap.curso.fiap.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cupom")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cupom implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "cupom")
  @Column(name = "id_cupom")
  private Long id;

  @Column(name = "cd_cupom")
  private String codigo;

  @Column(name = "ds_cupom")
  private String descricao;

  @Column(name = "desconto_percentual")
  private Double descontoPercentual;

  @Column(name = "desconto_direto")
  private Integer descontoDireto;

  @ManyToMany(mappedBy = "cupons")
  private List<Carrinho> carrinhos;
}
