package oops;

class mains{
	public void job() {
		System.out.println("teacher");
	}
	public void phone() {
		System.out.println("iphone");
		
	}
	
}
class sub extends mains{

	@Override
	public void job() {
		System.out.println("developer");
		super.job();
	}

	@Override
	public void phone() {
		System.out.println("realme");
		super.phone();
	}
}
public class Polyoverridding {
	
	
	public static void main(String[] args) {
		sub c=new sub();
		c.job();
		c.phone();
			
		}

}
