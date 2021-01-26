
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 23343);

		System.out.println("A agencia e: " + conta.getAgencia(0));
		
		conta.setAgencia(45328);
		
		Conta conta2 = new Conta(1243, 65654);
		Conta conta3 = new Conta(1343, 54654);
		
		System.out.println(Conta.getTotal());
							// method from the class Conta, so a reference at the left side is not necessary
	}
}
