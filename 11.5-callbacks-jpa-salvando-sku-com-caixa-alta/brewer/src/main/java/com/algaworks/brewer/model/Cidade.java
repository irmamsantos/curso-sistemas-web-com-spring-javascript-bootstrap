package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cidade {
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
