package oops;

interface calculator{
	
	public void add();
	public void sub();
	public void mul();
	public void div();
	
}

//inherit class from interface
class Scientific implements calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		int sum=a+b;
		System.out.println(sum);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		int sub=a-b;
		System.out.println(sub);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		int mul=a*b;
		System.out.println(mul);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		double a=10,b=20;
		double div=a/b;
		System.out.println(div);
	}
	
}

public class Abstractinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scientific s=new Scientific(); {
			s.add();
			s.div();
			s.mul();
			s.sub();
		}

	}


}
