package pilha;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
			System.out.println("Fim do main");
		} catch (ArithmeticException ex) {
			System.out.println("Deu ruim Doid�o");
		}
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = 1 / 0;
			System.out.println("Fim do metodo2");
		}
	}
}