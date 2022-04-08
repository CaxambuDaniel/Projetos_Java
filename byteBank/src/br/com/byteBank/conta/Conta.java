package br.com.byteBank.conta;

import br.com.byteBank.cliente.Cliente;
import br.com.byteBank.exceptions.SaldoInsuficienteException;

/**
 * Classe m�e que define a base para a cria��o de uma conta *
 * 
 * @author Daniel Carvalho
 * @version 1.0
 */
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	/**
	 * Construtor da classe, contendo as informa��es m�nimas para a cria��o de uma
	 * conta
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	/**
	 * Metodo abstrado que define (a partir da classe filha)os parametros para a
	 * realiza��o de um deposito
	 * 
	 * @param valor
	 */
	public abstract void deposita(double valor);

	/**
	 * Define, verificando o saldo em conta, os parametros para realiza��o de um
	 * saque.
	 * 
	 * Caso os requisitos n�o sejam atendidos (no caso, o saldo precisa ser maior ou
	 * igual ao valor do saque) a exception SaldoInsuficienteException � apresentada
	 * informando o valor do saldo em conta e o valor da tentativa de saque
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + getSaldo() + ", valor" + valor);
		}
		this.saldo -= valor;
	}

	/**
	 * Define os parametros para a realiza��o de uma transferencia que s�o: o valor
	 * em conta (verificado pelo metodo saca())e uma conta destino
	 * 
	 * @param valor
	 * @param destino
	 * @throws SaldoInsuficienteException
	 */
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	/**
	 * Sobrescri��o do m�todo ToString, da classe Object.
	 * O intuito da sobrescri��o � deixar mais clara a mensagem apresentada ao imprimirmos na tela a referencia de um objeto Conta
	 */
	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agencia: " + this.agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return total;
	}
}
