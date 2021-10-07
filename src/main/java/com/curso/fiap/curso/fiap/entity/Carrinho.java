package com.curso.fiap.curso.fiap.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_carrinho")
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
	@JoinTable(name = "tb_carrinho_cupom",
				joinColumns = @JoinColumn(name = "id_carrinho"),
				inverseJoinColumns = @JoinColumn(name = "id_cupom"))
	private List<Cupom> cupons;
	
	@ManyToMany
	@JoinTable(name = "tb_carrinho_curso",
			joinColumns = @JoinColumn(name = "id_carrinho"),
			inverseJoinColumns = @JoinColumn(name = "id_curso"))
	private List<Curso> cursos;
	
	public Carrinho() {
		super();
	}

	public Carrinho(Long id, double precoTotal, Usuario usuario, List<Cupom> cupons, List<Curso> cursos) {
		
		this.id = id;
		this.precoTotal = precoTotal;
		this.usuario = usuario;
		this.cupons = cupons;
		this.cursos = cursos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Cupom> getCupons() {
		return cupons;
	}

	public void setCupons(List<Cupom> cupons) {
		this.cupons = cupons;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
