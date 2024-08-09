package basic;

public class Methodsinjava {
public static void main(String[] args) {
		
		Methodsinjava mm=new Methodsinjava();{
			mm.add();
			mm.sub(10, 5);
			mm.multiplication(10, 5);
			mm.division();
			
		}

	}
	
	//method without return type and without parameter
	
	public void add() {
		int a=10,b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	
	//method without return type and with parameter
	
	public void sub(int c,int d) {
		int sub=c-d;
		System.out.println(sub);
		
	}
	
	//method with return type and with parameter
	
	public int multiplication(int e,int f) {
		int mul=e*f;
		System.out.println(mul);
		return mul;
		
	}
	
	//method with return type and with out parameter
	
	public int division() {
		int g=10,h=2;
		int div=g/h;
		System.out.println(div);
		return div;
		
		
	}


}
