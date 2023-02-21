
public class TesteSacaValoresNegativos {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
//		System.out.println(conta.saldo);

		conta.saca(101);

		// isso precisa ser proibido;
//		conta.saldo += -101;
		// invocando metodo de um atributo privado: pegaSaldo()
		System.out.println(conta.getSaldo());
		System.out.println(conta);
	}

}
