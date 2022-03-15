package byteBank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1337,152425);
		Conta conta2 = new Conta(1335,152255);
		Conta conta3 = new Conta(1334,152655);

		System.out.println(Conta.getTotal());
		
		
	}
}
