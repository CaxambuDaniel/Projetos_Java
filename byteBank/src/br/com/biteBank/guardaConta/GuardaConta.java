package br.com.biteBank.guardaConta;

import br.com.byteBank.conta.Conta;

public class GuardaConta {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardaConta() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref) {
        referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

}
