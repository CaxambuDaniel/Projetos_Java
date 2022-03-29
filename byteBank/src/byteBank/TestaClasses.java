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
import exceptions.SaldoInsuficienteException;

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
