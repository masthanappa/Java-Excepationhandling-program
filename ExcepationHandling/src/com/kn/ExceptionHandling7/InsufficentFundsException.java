package com.kn.ExceptionHandling7;

public class InsufficentFundsException extends Exception {

	public InsufficentFundsException() {
		super();
	}
	public InsufficentFundsException(String s) {
		super(s);
	}
}
