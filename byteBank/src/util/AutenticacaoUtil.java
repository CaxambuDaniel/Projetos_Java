package util;

import byteBank.Interfaces.Autentica;

public class AutenticacaoUtil implements Autentica {


    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
	
	

}
