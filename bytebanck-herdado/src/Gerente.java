// Gerente é um funcionário, gerente herda da classe Funcionario
public class Gerente extends Funcionario {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		// super referencia o atributo na classe mãe/pai
		// classe gerente é filho da classe funcionário
		System.out.println("Bonificacao do Gerente");
		return super.getSalario();
		//return super.getBonificacao();
		//return super.getBonificacao() + super.getSalario();  
	}
}
