package com.knExceptionHandling1;

import java.util.Scanner;

public class CaluclatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Wellcome to Calculator Application");
		System.out.println("");
		System.out.println("Enter Numrator Value =");
		int n=scan.nextInt();
		System.out.println("Enter Denominator=");
		int d=scan.nextInt();
		
		double divison=0;
		scan.close();
		try {
			divison=n/d;
		}catch(ArithmeticException ae) {
			System.out.println("Kindly provide Denominator as non-zero value");
		}
		System.out.println("Divison="+divison);
		System.out.println("");
		System.out.println("Thank you using caluclator application");

	}

}
