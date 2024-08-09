package basic;

public class Operators {
	public static void main(String[] args) {
		
		
		//arithmetic operations	
			//addition
			int a=15,b=10;
			int sum=a+b;
			System.out.println("sum is="+sum);
			
			int c=20,d=10;
			System.out.println("sum is="+(c+d));
			
			
			//subtraction
			int sub=a-b;
			System.out.println("difference is="+sub);
			
			System.out.println("difference is"+(c-d));
			
			//multiplication
			
			int mul=a*b;
			System.out.println("product is="+mul);
			System.out.println("product is"+(c*d));
			
			//division
			
			int div=a/b;
			System.out.println("division="+div);
			System.out.println("division is="+(c/d));
			
			//modulus
			
			int mod=a%b;
			System.out.println("mod is"+(c%d));
			System.out.println("mod is"+mod);
			
			
		//relational operator
			
			//>
			
			boolean bo=a>b;
			System.out.println("it is "+bo);
			System.out.println("it is"+(a>b));
			
			//<
			
			System.out.println("it is "+(a<b));
			boolean b2=a<b;
			System.out.println("it is "+b2);
			
			
			//<=
			
			System.out.println("it is "+(a<=b));
			boolean b3=a<=b;
			System.out.println("it is "+b3);
			
			//>=
			System.out.println("it is "+(a>=b));
			boolean b4=a>=b;
			System.out.println("it is "+b4);
			
			//==
			System.out.println("it is "+(a==b));
			boolean b5=a==b;
			System.out.println("it is "+b5);
			
			
			//!=
			System.out.println("it is "+(a!=b));
			boolean b6=a!=b;
			System.out.println("it is "+b6);
			
			
		//unary operators
			
			//++ right increment
			
			System.out.println(a++);
			System.out.println(a);
			
			//++ left increment
			
			System.out.println(++a);
			System.out.println(a);
			
			//-- right decrement
			
			System.out.println(a--);
			System.out.println(a);
			
			
			//--left decrement
			System.out.println(--a);
			System.out.println(a);
			
			
			
		//logical operator 
			
			String username="AnjithaAsokan";
			String password="Anjitha@123";
			
			
			//AND(&&)
			
			System.out.println(username=="AnjithaAsokan" && password=="Anjitha@123");
			System.out.println(username=="AnjithaAsokan" && password=="Anjitha123");
			
			//or(||)
			System.out.println(username=="AnjithaAsokan" || password=="Anjitha@123");
			System.out.println(username=="AnjithAsokan" || password=="Anjitha@123");
			System.out.println(username=="AnjithaAskan" && password=="Anjith@123");
			
			//NOT (!=)
			
			System.out.println(!(username=="AnjithaAsokan"));
			System.out.println(!(username=="AnjitaAsokan"));
			
			
			
		// sample question
			
			//write a program to check if the 2 numbers 23 and 45 are equal 
			
			int z=23,y=45;
			System.out.println("it is "+(z==y));
			
			//assign values to variables x and w as 55 and 70 respectively and check if both conditions a<50 and a<b are true
			
			int x=55,w=70;
			System.out.println((x>50) && x<w);
			
			//int v=27 print the second digit
			
			int v=27;
			System.out.println(v%10);
			
			//input f=20 g=30 swap the values of f and g, that is f=30 g=20
			
			int f=20,g=30,h;
			h=f;
			f=g;
			g=h;
			System.out.println("value of g="+g);
			System.out.println("value of f="+f);
			System.out.println();
	}

}
