package br.com.alura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteListas {

	public static void main(String[] args) {
		
		System.out.println("**** ArrayList vs LinkedList ****");
		
		List<Integer> numerosArrayList = new ArrayList<>();
		List<Integer> numerosLinkedList = new LinkedList<>();
		
		int quantidadeElementos = 10000000;
		
		Listas Colecao = new Listas(numerosArrayList, numerosLinkedList, quantidadeElementos);
		
		long tempoArrayList = Colecao.insereElementosNo(numerosArrayList, quantidadeElementos);
		long tempoLinkedList = Colecao.insereElementosNo(numerosLinkedList, quantidadeElementos);
		
		System.out.println("Inserção na ArrayList demorou " + tempoArrayList);
		System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);
		
		tempoArrayList = Colecao.removePrimeirosElementos(numerosArrayList);
		tempoLinkedList = Colecao.removePrimeirosElementos(numerosLinkedList);
		
		System.out.println();
		System.out.println("Remoção da ArrayList demorou " + tempoArrayList);
		System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
		
		
		
		
	}

}
