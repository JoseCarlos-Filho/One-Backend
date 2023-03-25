package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		//Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		alunos.add("Jose Carlos");
		alunos.add("Elaine Tiemi");
		alunos.add("Vitoria Chie");
		alunos.add("Tsuguioshi Ito");
		alunos.add("Caio Ito");
		alunos.add("Helena Ito");
		
		boolean joseEstaMatriculado = alunos.contains("Carlos");
		alunos.remove("Helena Ito");
		System.out.println(joseEstaMatriculado);
		
		System.out.println(alunos.size());
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println();
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println();
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);

	}

}
