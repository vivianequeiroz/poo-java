import java.util.List;

public class OrdemDeServico {
	
	private int codigo;
	private String Cliente;
	private List<Servico> Servico;
	private List<Mecanico> Mecanico;

	public OrdemDeServico(int cod, String nome) {
		this.codigo = cod;
		this.Cliente = nome;
		
		System.out.println("-----------------------------------------------------");
		System.out.printf("O código do serviço solicitado é o: " + cod);
	}

	public String toString() {
		return String.format("%s", Cliente);
	}
		
	
	public List<Servico> getServico() {
		return Servico;
	}

	public void setServico(List<Servico> servico) {
		Servico = servico;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public List<Mecanico> getMecanico() {
		return Mecanico;
	}

	public void setMecanico(List<Mecanico> mecanico) {
		Mecanico = mecanico;
	}


}
