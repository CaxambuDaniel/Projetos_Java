package br.com.byteBank.conta;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}
	/**
	 * Sobrescri��o do m�todo ToString, da classe Conta.
	 * O intuito da sobrescri��o � deixar mais clara a mensagem apresentada ao imprimirmos na tela a referencia de um objeto ContaPoupanca
	 */
	@Override
	public String toString() {
		return "Conta Poupan�a, " + super.toString();
	}
	
	

}
