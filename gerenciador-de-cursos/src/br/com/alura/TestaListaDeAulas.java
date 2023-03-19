package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

	public static void main(String[] args) {
		Aula au1 = new Aula("Revisando as ArrayLists", 21);
		Aula au2 = new Aula("Listas de objetos", 20);
		Aula au3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(au1);
		aulas.add(au2);
		aulas.add(au3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
	}

}
