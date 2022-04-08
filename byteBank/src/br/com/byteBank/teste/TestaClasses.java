package br.com.byteBank.teste;

import br.com.byteBank.conta.Conta;
import br.com.byteBank.conta.ContaCorrente;
import br.com.byteBank.conta.ContaPoupanca;
import br.com.byteBank.exceptions.SaldoInsuficienteException;

public class TestaClasses {
	public static void main(String[] args) {

		Conta cc = new ContaCorrente(3347, 321456);
		Conta cp = new ContaPoupanca(7745, 112445);
		
		System.out.println(cc);
		System.out.println(cp);
		
		
	}
}
