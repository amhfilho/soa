package com.knight.estoque.daos;

import java.util.ArrayList;
import java.util.List;

import com.knight.estoque.modelos.Livro;

public class LivroDAO {
	
	public List<Livro> listarLivros(){
		List<Livro> livros = new ArrayList<Livro>();
		Livro l1 = new Livro();
		l1.setAnoDePublicacao(2005);
		l1.setEditora("Editora livro1");
		l1.setNome("Livro 1");
		l1.setResumo("Resumo 1");
		List<String> autores = new ArrayList<String>();
		autores.add("Autor 1");
		autores.add("Autor 2");
		l1.setAutores(autores);
		livros.add(l1);
		
		Livro l2 = new Livro();
		l2.setAnoDePublicacao(2010);
		l2.setEditora("Editora livro2");
		l2.setNome("Livro 2");
		l2.setResumo("Resumo 2");
		List<String> autores2 = new ArrayList<String>();
		autores2.add("Autor 3");
		autores2.add("Autor 4");
		l2.setAutores(autores2);
		livros.add(l2);
		
		return livros;
	}

}
