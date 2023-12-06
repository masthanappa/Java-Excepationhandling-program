package com.kn.ExcepectionHandling2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		System.out.println("WelCome to Shoping Application");
		shop();
		System.out.println("*********Main()method ended******");
	}

	private static void shop() {
		System.out.println("-----> shop() method started");
		pay();
	    System.out.println("****Shop()method ended");
		
	}

	private static void pay() {
		System.out.println("-------> pay() method started");
		Scanner scan =null;
		System.out.println("Enter the amount to be paid=");
		try {
		scan=new Scanner(System.in);
		double amount =scan.nextDouble();
		System.out.println("Amount paid ="+amount);
		}catch (InputMismatchException ime){
			System.out.println("Expetion Handling");
			throw ime;
		}
				
		
	}
	}


