
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente jose = new Cliente();
		jose.nome = "Jose Carlos Filho";
		jose.cpf = "111.222.333-44";
		jose.profissao = "Desenvolvedor frontend";
		
		Conta contaDoJose = new Conta();
		contaDoJose.deposita(100);
		
		// associa o cliente Jose a conta contaDoJose
		contaDoJose.titular = jose;
		System.out.println("titula da conta: " + contaDoJose.titular.nome);
	}

}
