
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		Autenticavel referencia = new Gerente();
		
		g1.setNome("Joao");
		g1.setCpf("123456789-01");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(1111);
		boolean autenticou = g1.autentica(1111);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
