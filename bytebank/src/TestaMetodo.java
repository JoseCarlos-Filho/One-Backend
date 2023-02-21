
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoZe = new Conta();
		contaDoZe.saldo = 100;
		contaDoZe.deposita(50);
		System.out.println("Saldo da conta do Zé: " + contaDoZe.saldo);
		
		boolean conseguiuRetiar = contaDoZe.saca(20);
		System.out.println("saldo da conta do ze: " + contaDoZe.saldo);
		
		System.out.println("Conseguiu retirar:  " + conseguiuRetiar);
		
		Conta contaDaTiemi = new Conta();
		contaDaTiemi.deposita(1000);
		
		if (contaDaTiemi.transfere(300, contaDoZe)){
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("falha na transferencia, saldo insuficiente!");
		}
		
		contaDoZe.titular = "Jose Carlos";
		System.out.println("titular: " + contaDoZe.titular);
		
		System.out.println("saldo conta tiemi : " + contaDaTiemi.saldo);
		System.out.println("saldo da conta " + contaDoZe.titular + " : " + contaDoZe.saldo);
		
		
	}
}
