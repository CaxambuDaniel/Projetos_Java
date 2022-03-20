package byteBank;

import byteBank.conta.ContaCorrente;
import byteBank.conta.ContaPoupanca;
import byteBank.funcionario.ControleBonificacao;
import byteBank.funcionario.Designer;
import byteBank.funcionario.Funcionario;
import byteBank.funcionario.Gerente;

public class TestaClasses {
	public static void main(String[] args) {

		Gerente g = new Gerente(null, null, 12000, 0);
		Designer d = new Designer(null, null, 5000);
		
		System.out.println(g.getBonificacao());
		System.out.println(d.getBonificacao());
				
		
		

	}
}
