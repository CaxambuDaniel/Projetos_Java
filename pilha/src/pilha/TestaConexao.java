package pilha;

public class TestaConexao {

	public static void main(String[] args) {
		
			
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (Exception e) {
			System.out.println("Deu Ruim na conexão");
		}
		

	}

}
