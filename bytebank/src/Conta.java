package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

    public void deposita(double valor) {
		this.saldo += valor;
	}
	//methods
}

// conta attributes 
// specification for creating objects
// Java automatically initializes them with zero or null