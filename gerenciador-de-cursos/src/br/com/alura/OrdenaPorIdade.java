package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario f, Funcionario outrof) {
		return f.getIdade() - outrof.getIdade();
	}

}
