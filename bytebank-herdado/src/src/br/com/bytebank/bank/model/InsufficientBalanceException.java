package br.com.bytebank.bank.model;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException(String msg) {
		
		super(msg);
	}
}
