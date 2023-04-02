package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalho com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando nova aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com collections", 22));
		
		Aluno a1 = new Aluno("José Carlos", 34672);
		Aluno a2 = new Aluno("Elaine Tiemi", 5617);
		Aluno a3 = new Aluno("Vitória Chie",17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados");
		
		javaColecoes.getAlunos().forEach(a -> {
				System.out.println(a);
		});
		
		System.out.println();
		System.out.println("O aluno" + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno jose = new Aluno("José Carlos", 34672);
		System.out.println();
		System.out.println("E esse José, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(jose));
		
		System.out.println();
		System.out.println("O a1 é == ao José?");
		System.out.println(a1.equals(jose));
		
		System.out.println(a1.hashCode() == jose.hashCode());
		
		System.out.println();
		System.out.println("Todos os alunos matriculados: ");
		
		// for utilzado para exibir uma collection do tipo list o set antes do java8
//		for(Aluno a: javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		// for utilzado para exibir uma collection do tipo list o set antes do java5
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
	}

}
