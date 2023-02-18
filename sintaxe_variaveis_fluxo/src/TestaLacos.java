
public class TestaLacos {

	public static void main(String[] args) {
		
		for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
			System.out.println("tabuada do : " + multiplicador);
			for (int indice = 0; indice <= 10; indice++) {
				System.out.print(multiplicador + " x " + indice + " = " + (multiplicador * indice));
				System.out.println(" ");
				
			}
			System.out.println();
		}

	}

}
