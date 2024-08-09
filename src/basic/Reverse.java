package basic;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
		
		
		Scanner rn =new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number=rn.nextInt();
		int reverseNumber = 0;
		while (number != 0) 
		
		{
	    int digit = number % 10;
	    reverseNumber= reverseNumber * 10 + digit;
	    number /= 10;
	        }
		
		
		System.out.println("Reversed number: "+reverseNumber);
		rn.close();

	}


}
