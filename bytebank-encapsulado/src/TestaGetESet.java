
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337;
		// invocação de metodo do atributo privado numero(encapsulamento)
//		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente Jose = new Cliente();
		Jose.setNome("jose carlos");
		conta.setTitular(Jose);
		
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		
		// Uma linha de comando ambas executam o mesmo código
		// de formas diferentes
		conta.getTitular().setProfissao("Programador");
		// agora em duas linhas
		Cliente titulaDaConta = conta.getTitular();
		titulaDaConta.setProfissao("Programador");
		
		// aponta todos para o mesmo objeto(mesma referencia de memória
		System.out.println(titulaDaConta);
		System.out.println(Jose);
		System.out.println(conta.getTitular());
	}

}
