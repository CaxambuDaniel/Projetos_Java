package byteBank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,152425);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel Carvalho de Souza");
		
		conta.setTitular(daniel);
		System.out.println(conta.getTitular().getNome());
		
		
		
	}
}
