package oops;

class Animal{
	public void jump() {
		System.out.println("jump");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}


class Monkey extends Animal
{
	public void bite() {
		System.out.println("bite");
	}
}


public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monkey mm=new Monkey();
		mm.bite();
		mm.jump();
		mm.sleep();

	}

}
