// Gerente é um funcionário, gerente herda da classe Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		// super referencia o atributo na classe mãe/pai
		// classe gerente é filho da classe funcionário
		System.out.println("Metodo: Bonificacao do Designer");
		return 200;  
	}
}
