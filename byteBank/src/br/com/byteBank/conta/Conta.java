package br.com.byteBank.conta;

import br.com.byteBank.cliente.Cliente;
import br.com.byteBank.exceptions.SaldoInsuficienteException;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor); 

	public void saca(double valor)throws SaldoInsuficienteException  {
		if (this.saldo < valor) {			
			throw new SaldoInsuficienteException("Saldo: " + getSaldo() + ", valor" + valor ); 
		} 
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {		
		    this.saca(valor);
		    destino.deposita(valor);
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
