
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		//conta.numero = 1337;
		// invocação de metodo do atributo privado numero(encapsulamento)
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente Jose = new Cliente();
		conta.setTitular(Jose);
	}

}
