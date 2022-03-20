package byteBank.sistema;

import byteBank.Interfaces.Autenticacao;
import byteBank.funcionario.Gerente;

public class SistemaInterno{

    private int senha = 2222;

    public void autentica(Autenticacao a){

        boolean autenticou = a.autentica(this.senha);

        if(autenticou){
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("N�o pode entrar no sistema");
        }
    }
}