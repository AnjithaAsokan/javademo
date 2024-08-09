package basic;

public class Methodexample {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Methodexample m=new Methodexample(); {
			m.circle(2);
			m.square();
			m.rec();
			m.triangle(5, 2);
			
		}
			
		
	}
	
	//method without return type and with parameter
	
	public void circle(int r) 
	{
		double area=(3.14*r*r);
		System.out.println("area of circle ="+area);
		
	}
	
	//method without return type and without parameter
	
	public void square() {
		int a=10;
		int area=(a*a);
		System.out.println("area of a square="+area);
	}
	
	//method with return type and with out parameter
	
	public int rec() {
		int l=5,b=8;
		int area=(l*b);
		System.out.println("area of a rectangle="+area);
		return area;
	}
	
	//method with return type and with parameter
	
	public double triangle(int b,int h) {
		double area=(0.5*b*h);
		System.out.println("area of a triangle="+area);
		return area;
		
	}


}
