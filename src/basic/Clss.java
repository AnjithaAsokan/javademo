package basic;

import java.util.Scanner;

public class Clss {
	public static void main(String[] args) {
		// scanner class
		
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Enter the 2nd numer:");
		int b=sc.nextInt();
		System.out.println("enter the operation");
		String op=sc.next();
		switch(op) {
		case "+":System.out.println("addition ="+(a+b));
		break;
		case "-":System.out.println("subtraction ="+(a-b));
		break;
		case "*":System.out.println("multiplication ="+(a*b));
		break;
		case "/":System.out.println("division ="+(a/b));
		break;
		
		}	
	}



}
