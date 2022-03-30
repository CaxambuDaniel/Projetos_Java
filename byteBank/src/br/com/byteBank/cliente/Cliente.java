package br.com.byteBank.cliente;

import br.com.byteBank.Interfaces.Autentica;
import br.com.byteBank.util.AutenticacaoUtil;

public class Cliente implements Autentica {
	private String nome;
	private String cpf;
	private String profissao;	
	private AutenticacaoUtil autenticador;
	
	public Cliente(String nome,String cpf,String profissao ) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int Senha) {
		this.autenticador.setSenha(Senha);; 
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
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

}
