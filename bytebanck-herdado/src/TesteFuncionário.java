
public class TesteFuncionário {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente paulo = new Gerente();
		paulo.setNome("Paulo");
		paulo.setCpf("111.333.888-99");
		paulo.setSalario(2600.00);
		
		System.out.println(paulo.getNome());
		System.out.println(paulo.getBonificacao());
		

		
		

	}

}
