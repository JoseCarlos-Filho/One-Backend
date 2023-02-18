
public class Fatorial {

	public static void main(String[] args) {
		
		int valorCalculado = 1;
		
		for (int indice = 1; indice <= 10; indice++) {
			valorCalculado *= indice;
			System.out.println("O fatorial de : " + indice + " é " + valorCalculado);
		}

	}

}
