package com.kn.ExceptionHandling6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaluclatorApp {

	
	public static void main(String[] args) {
	System.out.println("Caluclation Application is Started");
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the 1st number");
	int a=scan.nextInt();
	System.out.println("Enter the 2nd number");
    int b=scan.nextInt();
	addition(a,b);
	sub(a,b);
	multiply(a,b);
	try {
	divison(a,b);
	}catch (Exception e) {
		System.out.println("Exception handled");
		//e.printStackTrace();
	}finally {
		System.out.println("Ended the Arithmatic program.............");
	}
	
	}

	private static void divison(int a, int b) throws ArithmeticException,InputMismatchException,Exception {
		System.out.println("Divison()method started......");
		try {
		double div=a/b;
		}catch(ArithmeticException ae) {
			System.out.println("Exception handled: for the divison");
			throw ae;
		}finally {
			System.out.println("divison() method ended............");
		}
	}

	private static void multiply(int a, int b) {
		System.out.println("multiply()method started......");
		double multi=a*b;
		System.out.println("Multiplicaton ="+multi);
		System.out.println("Multiplication() method ended");
		
	}

	private static void sub(int a, int b) {
		System.out.println("multiply()method started......");
		try {
		double sub=a*b;
		}catch(ArithmeticException ae) {
			System.out.println("Exception handled: for the sub");
			throw ae;
		}finally {
			System.out.println("sub() method ended............");
		}
		
		
		
	}

	private static void addition(int a, int b) {
		System.out.println("addition()method started......");
		double add=a+b;
		System.out.println("Addition ="+add);
		System.out.println("Addition() method ended");
		
		
	}
}