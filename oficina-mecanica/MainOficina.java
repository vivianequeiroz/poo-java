
public class MainOficina {
	
	public static void main (String args []) {
		
		Cliente cliente = new Cliente("123.456-7", "Viviane", "5555-5555");
		
		Servico servico = new Servico("Pintura", 964, 979.98);
		
		Mecanico mecanico = new Mecanico("123.456-9", "Abel", "Funilaria");
	
		OrdemDeServico os = new OrdemDeServico(100, cliente.nome);
	}
}
