package byteBank;

public class TestaClasses {
	public static void main(String[] args) {

		Gerente daniel = new Gerente();
		
		daniel.setNome("Daniel Carvalho de Souza");
		daniel.setSenha(121314);
		daniel.setSalario(10000);
		
		
		
		System.out.println(daniel.getNome());
		System.out.println(daniel.autentica(121314));
		System.out.println(daniel.getSalario() );
		System.out.println(daniel.getBonificacao());
		
		

	}
}
