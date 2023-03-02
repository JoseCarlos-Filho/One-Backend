
public class FluxoComTratamento {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExecao e) {
        	String msg = e.getMessage();
        	System.out.println("Exception " + msg);
        	e.printStackTrace();
        } 
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExecao("Erro!!!");
        //System.out.println("Fim do metodo2");
    } 

}
