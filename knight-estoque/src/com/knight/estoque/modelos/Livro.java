package com.knight.estoque.modelos;

import java.util.List;

public class Livro {
	private String nome;
	private List<String> autores;
	private Integer anoDePublicacao;
	private String editora;
	private String resumo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getAutores() {
		return autores;
	}
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(Integer anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	

}
