package byteBank;

public class CriaConta {
	public static void main(String[] args) {
		
		Cliente daniel = new Cliente();
		daniel.nome = "Daniel Carvalho de Souza";
		daniel.cpf = "111.111.111-11";
		daniel.profissao = "Analista de Dados";
		
		Conta contaDoDaniel = new Conta();
		contaDoDaniel .deposita(1000);
		
		contaDoDaniel.titular = daniel;	
		
		System.out.println(contaDoDaniel.titular.nome);
		
	}
}
