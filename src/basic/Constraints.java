package basic;

public class Constraints {
	public static void main(String[] args) {
		//decision statements
			//IF else
			
			
			int a=200,b=20;
			if(a>b)
			{
				System.out.println("Test passed");
			}
			else
			{
				System.out.println("Test failed");
			}
			
			
			//else if (multiple conditions)
			
			int c=20,d=30;
			if(c>d)
			{
				System.out.println("Test passed");

			}
			else if(c==d) {
				System.out.println("c = d");

			}
			else {
				System.out.println("Test failed");

			}
			
			
			//example
			
			int h=200,e=25,f=10;
			if((h>e) && (h>f))
			{
				System.out.println("h is largest number");
			}
			else if((e>h) && (e>f)){
				System.out.println("e is largest number");

			}
			else {
				System.out.println("f is largest number");

			}
			
			//odd even
			
			int m=10;
			if(m%2==0) {
				System.out.println("its even ");
			}
			else {
				System.out.println("its odd");
				
			}
			
			//negative or positive
			
			if(m>0) {
				System.out.println("its positive number");
			}
			else {
				System.out.println("its negative number");
			}
			
			
		}


}
