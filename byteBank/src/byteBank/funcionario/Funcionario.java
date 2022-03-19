package byteBank.funcionario;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome,String cpf,double salario) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
	}
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
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
