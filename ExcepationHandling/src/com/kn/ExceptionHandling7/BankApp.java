package com.kn.ExceptionHandling7;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
	 System.out.println("Bank Application to Withdraw");
	 Scanner scan= new Scanner(System.in);
     System.out.println("Enter the amount to withdraw=");
     double withdrawalAmount=scan.nextDouble();
     try {
    	 withdraw(withdrawalAmount);
     }catch (Exception e) {
    	 e.printStackTrace();
     }
	}

	private static void withdraw(double withdrawalAmount) throws Exception {
		double accountBalence=15000.00;
		System.out.println("Withdrawal procces started.");
		
		if(withdrawalAmount<=accountBalence) {
			System.out.println(withdrawalAmount+" has deducted from account");
		}else {
			System.out.println("Insufficent Balence");
			throw new InsufficentFundsException();
		}
		
	}

}
