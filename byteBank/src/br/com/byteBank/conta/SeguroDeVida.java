package br.com.byteBank.conta;

import br.com.byteBank.Interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 20;
	}

}
