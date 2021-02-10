import java.util.List;

public class Oficina {
	
	private List<OrdemDeServico> OrdemDeServico;
	
	public Oficina(List<OrdemDeServico> os) {
		this.OrdemDeServico = os;
	}

	public String toString() {
		return String.format("%s", OrdemDeServico);
	}
}
