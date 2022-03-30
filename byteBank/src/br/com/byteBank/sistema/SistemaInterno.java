package br.com.byteBank.sistema;

import br.com.byteBank.Interfaces.Autentica;

public class SistemaInterno{

    private int senha = 2222;

    public void autentica(Autentica a){

        boolean autenticou = a.autentica(this.senha);

        if(autenticou){
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }
}