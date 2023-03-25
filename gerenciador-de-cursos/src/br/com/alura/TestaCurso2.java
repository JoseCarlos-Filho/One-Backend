package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		//List<Aula> aulas = javaColecoes.getAulas();
		//System.out.println(aulas);
		
//		javaColecoes.getAulas().add(new Aula("Trabalho com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalho com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando nova aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com collections", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
