package com.curso.fiap.curso.fiap.entity;

import com.curso.fiap.curso.fiap.enums.CursoNivel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_curso")
@JsonPropertyOrder({"id", "nivel", "nome", "descricao", "precoOriginal", "precoPromocional", "porcDesconto", "ulrImagem", "modulos" })
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
	@JsonProperty("preco_original")
	private Double precoOriginal;

	@Column(name = "preco_promocional")
	@JsonProperty("preco_promocional")
	private Double precoPromocional;

	@Column(name = "porc_desconto")
	@JsonProperty("porc_desconto")
	private Double porcDesconto;

	@Column(name = "url_imagem")
	@JsonProperty("url_imagem")
	private String ulrImagem;

	@OneToMany(mappedBy = "curso")
	private List<Modulo> modulos;

	public Curso(Long id, CursoNivel nivel, String nome, String descricao, Double precoOriginal, Double precoPromocional, String ulrImagem, Double porcDesconto) {
		this.id = id;
		this.nivel = nivel;
		this.nome = nome;
		this.descricao = descricao;
		this.precoOriginal = precoOriginal;
		this.precoPromocional = precoPromocional;
		this.ulrImagem = ulrImagem;
		this.porcDesconto = porcDesconto;
	}

	public Curso() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CursoNivel getNivel() {
		return nivel;
	}

	public void setNivel(CursoNivel nivel) {
		this.nivel = nivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPrecoOriginal() {
		return precoOriginal;
	}

	public void setPrecoOriginal(Double precoOriginal) {
		this.precoOriginal = precoOriginal;
	}

	public Double getPrecoPromocional() {
		return precoPromocional;
	}

	public void setPrecoPromocional(Double precoPromocional) {
		this.precoPromocional = precoPromocional;
	}

	public String getUlrImagem() {
		return ulrImagem;
	}

	public void setUlrImagem(String ulrImagem) {
		this.ulrImagem = ulrImagem;
	}

	public Double getPorcDesconto() {
		return porcDesconto;
	}

	public void setPorcDesconto(Double porcDesconto) {
		this.porcDesconto = porcDesconto;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
}
