package br.com.byteBank.teste;

import java.util.Iterator;

import br.com.byteBank.conta.Conta;
import br.com.byteBank.conta.ContaCorrente;
import br.com.byteBank.conta.ContaPoupanca;
import br.com.byteBank.exceptions.SaldoInsuficienteException;

public class TestaClasses {
	public static void main(String[] args) {

//		Conta cc = new ContaCorrente(3347, 321456);
//		Conta cp = new ContaPoupanca(7745, 112445);
//		
//		System.out.println(cc);
//		System.out.println(cp);
		
		//criando uym array de referencia
		ContaCorrente [] contas = new ContaCorrente[5];
		ContaCorrente conta1 = new ContaCorrente(124, 132);
		ContaCorrente conta2 = new ContaCorrente(142, 123);
		
		contas[0]= conta1;
		contas[1]= conta2;
		
		System.out.println(contas[0].getAgencia());
		
		for (int i = 0; i < args.length; i++ ) {
			System.out.println(args[i]);
			
		}
		
		
		
		
	}
}
