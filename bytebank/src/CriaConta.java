
public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;

		primeiraConta.agencia = 146;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);

		System.out.println("Agencia primeira conta " + primeiraConta.agencia);
		System.out.println("N° primeira conta " + primeiraConta.numero);

		System.out.println("primeira conta tem " + primeiraConta.saldo);

		segundaConta.agencia = 146;
		System.out.println("Agencia segunda conta " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta!");
		} else {
			System.out.println("contas diferentes");
		}
		
		// referência para contas diferentes(objetos diferentes)
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}

}
