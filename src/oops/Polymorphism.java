package oops;

public class Polymorphism {
	public void add() {
		int a=20,b=30;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p=new Polymorphism();{
			p.add();
			p.add(10, 10.2);
			p.add(10, 12);
			p.add(12.5, 10);
			p.add(10, 5, 20);
			
		}

	}
	
	public void add(int a, double b) {
		double sum=a+b;
		System.out.println(sum);
	}
	public void add(double b,int a) {
		double sum=a+b;
		System.out.println(sum);
	}
	
	public void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	
	


}
