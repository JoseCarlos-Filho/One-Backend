package br.com.alura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {

	private List<Integer> numerosArrayList = new ArrayList<>();
	private List<Integer> numerosLinkedList = new LinkedList<>();
	private int quantidade = 0;
	
	public Listas(List<Integer> numerosArrayList, List<Integer> numerosLinkedList, int quantidade) {
		this.numerosArrayList = numerosArrayList;
		this.numerosLinkedList = numerosLinkedList;
		this.quantidade = quantidade;
	}
	
	public static long removePrimeirosElementos(List<Integer> numeros) {
		long ini = System.currentTimeMillis();
		
		for (int i = 0; i < 100; i++) {
			numeros.remove(0); // remove sempre o primeiro indice.
		}
		
		long fim = System.currentTimeMillis();
		return fim - ini;
	}
	
	public static long insereElementosNo(List<Integer> numeros, int quantidade ) {
		long ini = System.currentTimeMillis();
		
		for (int i = 0; i < quantidade; i++) {
			numeros.add(i); // remove sempre o primeiro indice.
		}
		
		long fim = System.currentTimeMillis();
		return fim - ini;
	}
}
