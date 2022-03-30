package br.com.byteBank.funcionario;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	
	public Funcionario(String nome,String cpf,double salario) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
	}
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

}
