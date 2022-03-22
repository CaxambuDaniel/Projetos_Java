package byteBank;

import byteBank.Interfaces.Autentica;
import byteBank.cliente.Cliente;
import byteBank.conta.ContaCorrente;
import byteBank.conta.ContaPoupanca;
import byteBank.funcionario.Administrador;
import byteBank.funcionario.ControleBonificacao;
import byteBank.funcionario.Designer;
import byteBank.funcionario.Funcionario;
import byteBank.funcionario.Gerente;
import byteBank.sistema.SistemaInterno;

public class TestaClasses {
	public static void main(String[] args) {

		Autentica g = new Gerente(null, null, 0, 2222);

		Autentica c = new Cliente(null, null, null);

		Autentica adm = new Administrador(null, null, 0);
		
		g.setSenha(222);
		
		System.out.println(g.autentica(2222));
	}
}
