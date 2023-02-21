
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaTiemi = new Conta();
		// exibindo metodo pegaSaldo de um atributo privado.
		System.out.println(contaDaTiemi.getSaldo());
		
		contaDaTiemi.titular = new Cliente();
		System.out.println(contaDaTiemi.titular);
		
		contaDaTiemi.titular.nome = "Tiemi";
		System.out.println(contaDaTiemi.titular.nome);
		
	}

}
