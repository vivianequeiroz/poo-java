package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.InsufficientBalanceException;

public class TestWithdraw {

	public static void main(String[] args) {
		
		Account c1 = new CheckingAccount(123, 456);
		
		c1.deposit(200.0);
		
		try {
			c1.withdraw(290.0);
		} catch(InsufficientBalanceException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
		
		System.out.println(c1.getBalance());
	}
}
 