package com.kn.ExcepectionHandling2;

import java.util.Scanner;

public class CalculatorApp {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Welcome to Calucaltor Application");
			System.out.println("Enter the 1st Number");
			int a=scan.nextInt();
			System.out.println("Enter the 2nd Number");
			int b=scan.nextInt();
			
			multiply(a,b);

			System.out.println("************ End of Main()method");
			}

			private static void multiply(int a, int b) {
			System.out.println("-----> Started multiply()method");
			int product= a*b;
			System.out.println("product="+product);
			divide(a,b);
				
			System.out.println("************ End of multiply()method");
			}

			private static void divide(int a, int b) {
			 System.out.println("-----> Started divide()method");
			 double quotient=a/b;
			 
			 System.out.println("Quotient="+quotient);
			 System.out.println("************ End of Divide()method");
				
			

	}

}
