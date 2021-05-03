package br.com.bytebank.bank.test;
import br.com.bytebank.bank.model.*;

public class TestAccounts {

	public static void main(String[] args) throws InsufficientBalanceException {
	
	//Full Qualified Name
	SavingsAccount sa = new SavingsAccount(123, 123);
	sa.deposit(100.0);
		
	CheckingAccount ca = new CheckingAccount(465, 456);
	ca.deposit(100.0);
	
	ca.transfer(10.0, sa);
	System.out.println("Conta corrente: " + ca.getBalance());
	System.out.println("Conta poupança: " + sa.getBalance());
	
	}
}
