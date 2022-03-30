package br.com.byteBank.funcionario;

import br.com.byteBank.Interfaces.Autentica;

public class Administrador extends Funcionario  implements Autentica {
	
	private int senha;
		
	public Administrador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void setSenha(int Senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica(int senha) {
	    if (this.senha == senha) {
	        return true;
	    } else {
	        return false;
	    }
	}

}
