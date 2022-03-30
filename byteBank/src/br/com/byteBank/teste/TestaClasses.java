package br.com.byteBank.teste;

import br.com.byteBank.conta.ContaCorrente;
import br.com.byteBank.exceptions.SaldoInsuficienteException;

public class TestaClasses {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(0, 0);
		cc.deposita(100);
		try {
			cc.saca(110);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(cc.getSaldo());
		
	}
}
