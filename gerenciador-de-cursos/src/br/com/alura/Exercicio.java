package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        pessoas.keySet().forEach(idade -> {
        	System.out.println(pessoas.get(idade));
        });
        
        
        Map<String, Integer> nomes = new HashMap<>();
        nomes.put("Paulo", 31);
        nomes.put("Adriano", 25);
        nomes.put("Alberto", 33);
        nomes.put("Guilherme", 26);
        
        System.out.println();
        Set<String> chaves = nomes.keySet();
        for (String nome : chaves) {
        	System.out.println(nome);
		}
        
        System.out.println();
        Collection<Integer> valores = nomes.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }
        
        System.out.println();
        Set<Entry<String, Integer>> associacoes = nomes.entrySet();
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
	}

}
