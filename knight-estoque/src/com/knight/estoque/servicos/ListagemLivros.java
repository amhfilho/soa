package com.knight.estoque.servicos;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.knight.estoque.daos.LivroDAO;
import com.knight.estoque.modelos.Livro;

@WebService
public class ListagemLivros {
	
	
	public List<Livro> listarLivros(){
		return new LivroDAO().listarLivros();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/livros", new ListagemLivros());
		System.out.println("Servi�o inicializado");
	}

}
