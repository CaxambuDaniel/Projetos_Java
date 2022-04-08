package br.com.byteBank.conta;


import br.com.byteBank.Interfaces.Tributavel;
import br.com.byteBank.exceptions.SaldoInsuficienteException;

/***
 * Classe Filha da classe Conta, especificando os atributos e classes de uma conta Corrente no banco
 * @author Daniel Carvalho
 * @version 1.0
 */
public class ContaCorrente extends Conta implements Tributavel {
	/***
	 * Construtor da classe
	 * @param agencia
	 * @param numero
	 */
	public ContaCorrente (int agencia, int numero) {
		super(agencia , numero);
	}
	
	/***
	 * sobrescrição do metodo saca(), onde é cobrado um valor por cada saque 
	 */
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	/***
	 * sobrescrição da metodo deposita
	 */
	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}
	/***
	 * sobrescrição do metodo getValorImposto() extendido da interface CalculoDeImposto()
	 */
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	/**
	 * Sobrescrição do método ToString, da classe Conta.
	 * O intuito da sobrescrição é deixar mais clara a mensagem apresentada ao imprimirmos na tela a referencia de um objeto Conta Corrente
	 */
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}

}
