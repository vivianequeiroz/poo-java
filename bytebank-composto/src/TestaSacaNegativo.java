public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		conta.saca(200);
		// System.out.println(conta.saldo); private attribute from class Conta. It does not allow
		// other classes to read or modify that is not itself
		
		System.out.println(conta.getSaldo());
	}
}
