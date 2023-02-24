// Gerente é um funcionário, gerente herda da classe Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		// super referencia o atributo na classe mãe/pai
		// classe gerente é filho da classe funcionário
		System.out.println("Metodo: Bonificacao do Editor de Video");
		return 150;
		//return super.getBonificacao() + 100;  
	}
}
