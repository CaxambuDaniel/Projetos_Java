package byteBank;

import byteBank.funcionario.ControleBonificacao;
import byteBank.funcionario.Funcionario;
import byteBank.funcionario.Gerente;

public class TestaClasses {
	public static void main(String[] args) {

		Funcionario daniel = new Gerente("daniel","11122233344",10000,214578);
		
		
		
		Funcionario pedro = new Funcionario("Pedro","22211133344",15000);
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(pedro);
		controle.registra(daniel);
		
		System.out.println(controle.getSoma());
		
		

	}
}
