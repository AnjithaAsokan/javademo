package oops;

class member{
	String name;
	int age;
	int phoneno;
	int salary;
	String address;
	
	public void printdetails() {
		System.out.println("Name ="+name );
		System.out.println("Age ="+age );
		System.out.println("phone ="+phoneno );
		System.out.println("salary ="+salary );

		
	}
	
	
}

class employee extends member{
	String specialization;
}

class manager extends member{
	String department;
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e=new employee();
		System.out.println(e.name="Anjitha");
		System.out.println(e.age=24);
		System.out.println(e.address="hjgm");
		System.out.println(e.phoneno=784521);
		System.out.println(e.salary=41526);
		System.out.println(e.specialization="ST");
		
		manager m=new manager();
		System.out.println(m.department="testing");







	}


}
