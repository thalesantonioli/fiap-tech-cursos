package com.curso.fiap.curso.fiap.enums;

public enum CursoNivel {

	INICIANTE("Iniciante"), 
	INTERMEDIARIO("Intermediário"), 
	IVANCADO("Avançado");

	private String descricao;

	CursoNivel(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
