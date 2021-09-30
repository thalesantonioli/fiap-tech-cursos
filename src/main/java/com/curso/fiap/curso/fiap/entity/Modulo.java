package com.curso.fiap.curso.fiap.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tb_modulo")
public class Modulo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "modulo", sequenceName = "sq_tb_modulo", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "modulo")
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

	public Modulo() {
		super();
	}

	public Modulo(Long id, String nome, String cargaHoraria, List<Conteudo> conteudos, Curso curso) {
		this.id = id;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.conteudos = conteudos;
		this.curso = curso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(List<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
