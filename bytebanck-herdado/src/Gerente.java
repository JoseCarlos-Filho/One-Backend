// Gerente é um funcionário, gerente herda da classe Funcionario
public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		// super referencia o atributo na classe mãe/pai
		// classe gerente é filho da classe funcionário
		System.out.println("Bonificacao do Gerente");
		return super.getSalario();
		//return super.getBonificacao();
		//return super.getBonificacao() + super.getSalario();  
	}
}
