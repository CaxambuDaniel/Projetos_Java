package byteBank.cliente;

import byteBank.Interfaces.Autenticacao;

public class Cliente implements Autenticacao {
	private String nome;
	private String cpf;
	private String profissao;
	private int senha;
	
	public Cliente(String nome,String cpf,String profissao ) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		//this.senha = senha;
	}


	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getProfissao() {
		return this.profissao;
	}


	@Override
	public void setSenha(int Senha) {
		this.senha = senha; 
		
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
