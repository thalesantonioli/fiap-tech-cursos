package com.curso.fiap.curso.fiap.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_modulo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Modulo implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_modulo")
  private Long id;

  @Column(name = "nm_modulo")
  private String nome;

  @Column(name = "carga_horaria")
  private String cargaHoraria;

  @OneToMany(cascade = CascadeType.PERSIST)
  private List<Conteudo> conteudos;

  @ManyToOne
  @JoinColumn(name = "id_curso")
  private Curso curso;
}
