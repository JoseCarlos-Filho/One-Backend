
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
//			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo");

		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}
}
