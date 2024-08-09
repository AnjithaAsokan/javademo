package oops;
abstract class Car{
	public void accelaration() {
		//regular method
		System.out.println("acceleration");
	}
	//abstract method
	abstract public void speed();
}

class Bmw extends Car{

	@Override
	public void speed() {
		System.out.println("speeed");
		
	}
	
}


public class AbstractClass {
	public static void main(String[] args) {
		Bmw n=new Bmw();{
			n.accelaration();
			n.speed();
		}

	}



}
