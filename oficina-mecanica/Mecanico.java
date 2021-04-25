
public class Mecanico extends Pessoa { 
	private String especialidade; 
	
	public Mecanico(String _cpf, String _nome, String esp) {
		super(_cpf, _nome); 
		especialidade = esp; 
		
		System.out.println("Consta como >>> mecânico responsável <<<");
		System.out.printf("A especialidade é: %s \n", esp);
		
	}
	
	public String toString() {
		return String.format("%s", especialidade);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
