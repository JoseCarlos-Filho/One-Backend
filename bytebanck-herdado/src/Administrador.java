
public class Administrador extends Funcionario implements Autenticavel {

	private ValidaAutenticacao validador;
	
	public Administrador() {
		validador = new ValidaAutenticacao();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
