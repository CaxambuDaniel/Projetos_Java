package byteBank;

import byteBank.Interfaces.Autentica;
import byteBank.cliente.Cliente;
import byteBank.conta.CalculadorDeImposto;
import byteBank.conta.ContaCorrente;
import byteBank.conta.ContaPoupanca;
import byteBank.conta.SeguroDeVida;
import byteBank.funcionario.Administrador;
import byteBank.funcionario.ControleBonificacao;
import byteBank.funcionario.Designer;
import byteBank.funcionario.Funcionario;
import byteBank.funcionario.Gerente;
import byteBank.sistema.SistemaInterno;

public class TestaClasses {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(0, 0);
		cc.deposita(100);
		
		SeguroDeVida s = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(s);
		
		System.out.println(calc.getTotalImposto());
		
	}
}
