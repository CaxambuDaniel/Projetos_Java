package byteBank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia(3412);
		conta.setNumero(5421456);
		
		System.out.println(conta.getNumero());
		
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel Carvalho de Souza");
		
		conta.setTitular(daniel);
		System.out.println(conta.getTitular().getNome());
		
		
		
	}
}
