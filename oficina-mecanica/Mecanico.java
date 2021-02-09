
public class Mecanico { 
	private String especialidade; 
	
	public Mecanico(String esp) {
		especialidade = esp; 
		
		System.out.printf("A especialidade do mecanico é: %s", this);
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
