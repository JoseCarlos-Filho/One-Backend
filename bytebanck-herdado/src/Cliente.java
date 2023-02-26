
// O implements é a firmação do contrato com a interface
public class Cliente implements Autenticavel {
	
	private ValidaAutenticacao validador;
	
	public Cliente() {
		this.validador = new ValidaAutenticacao();
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
