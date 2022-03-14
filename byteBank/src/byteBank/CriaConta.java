package byteBank;

public class CriaConta {
	public static void main(String[] args) {
		Conta contaDaniel = new Conta();
		contaDaniel.deposita(1000);
		
		Conta contaDiego = new Conta();
		contaDiego.deposita(100);
		
		contaDaniel.transfere(500, contaDiego);
		
		System.out.println(contaDaniel.saldo);
		System.out.println(contaDiego.saldo);
		
	}
}
