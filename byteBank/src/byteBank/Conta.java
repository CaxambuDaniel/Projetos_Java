package byteBank;

public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}

	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}

	}
		
	public double getSaldo() {
		return this.saldo;
	}	
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getAgencia () {
		return this.agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}


}


