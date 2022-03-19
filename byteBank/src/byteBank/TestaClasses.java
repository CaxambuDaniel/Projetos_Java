package byteBank;

import byteBank.conta.ContaCorrente;
import byteBank.conta.ContaPoupanca;
import byteBank.funcionario.ControleBonificacao;
import byteBank.funcionario.Funcionario;
import byteBank.funcionario.Gerente;

public class TestaClasses {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1542, 12);
		ContaPoupanca cp = new ContaPoupanca(4512, 45);
		
		cc.deposita(10000);		
		cc.transfere(500, cp);
		cc.saca(1000);
		
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		System.out.println("CC: " + cc.getSaldo());
				
		
		

	}
}
