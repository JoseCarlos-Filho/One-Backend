public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("total de contas abertas: " + total);
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        } else {
        	this.agencia = agencia;
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        } else {
        	this.numero = numero;
        }
		
		
		//this.saldo = 100;
		//System.out.println("Criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (saldo < valor) {
			// exception
			throw new SaldoInsuficienteException("Saldo :" + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}
//	public boolean saca(double valor) {
//		if (saldo >= valor) {
//			this.saldo -= valor;
//			return true;
//		} else {
//			return false;
//		}
//	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}