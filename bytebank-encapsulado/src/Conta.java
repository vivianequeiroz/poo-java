public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	//atributes from the instance
	private static int total; 
	// total from the class
	
	public Conta(int agencia, int numero) {
		Conta.total++;
	//	System.out.println("O total de contas é: " + Conta.total);
		
		this.agencia = agencia; 
		this.numero = numero;
	//	System.out.println("Estou criando uma conta " + this.numero);
	}	
	// Constructors can require minimal attributes/restrictions to build an object
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
			return false;
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não é possível valor menor ou igual a 0");
			return; //void
		}
		this.numero = numero;
	}
	
	public int getAgencia(int agencia) {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) { 
			System.out.println("Não é possível valor menor ou igual a 0");
			return; //void
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	} //method from the class
	  //this is not used

	//methods
}
