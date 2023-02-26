// Gerente é um funcionário, gerente herda da classe Funcionario, assina a interface Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private ValidaAutenticacao validador;
	
	public Gerente() {
		this.validador = new ValidaAutenticacao();
	}
	
	public double getBonificacao() {
		// super referencia o atributo na classe mãe/pai
		// classe gerente é filho da classe funcionário
		System.out.println("Bonificacao do Gerente");
		return super.getSalario();
		//return super.getBonificacao();
		//return super.getBonificacao() + super.getSalario();  
	}

	@Override
	public void setSenha(int senha) {
		this.validador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		//retorna um boleano
		return this.validador.autentica(senha);
	}
}
