package br.com.byteBank.funcionario;

import br.com.byteBank.Interfaces.Autentica;

public class Gerente extends Funcionario implements Autentica{
	
	private int senha;
	
	public Gerente(String nome,String cpf,double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	
	public boolean autentica(int senha) {
	    if (this.senha == senha) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
    public double getBonificacao() {
        return super.salario *= 0.1;
    }


	public void setSenha(int i) {
		// TODO Auto-generated method stub
		
	}

}
