package com.curso.fiap.curso.fiap.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tb_conteudo")
public class Conteudo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "conteudo", sequenceName = "sq_tb_conteudo", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conteudo")
	@Column(name = "id_conteudo")
	private Long id;

	@Column(name = "ds_conteudo")
	private String descricao;

	public Conteudo() {
		super();
	}

	public Conteudo(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
