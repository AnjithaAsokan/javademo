package oops;

import java.util.Scanner;


interface bank{
	public void account_details();
	public void balance(); 
	public void deposite(); 
	public void withdraw(); 
	
}
class South_indian implements bank{
	
	int bal=0;

	@Override
	public void account_details() {
		// TODO Auto-generated method stub
		String Bank_name="southindian";
		int account_number=125478;
		String account_holder_name="anjitha";
		
	    
	    System.out.println(Bank_name);
	    System.out.println(account_number);
	    System.out.println(account_holder_name);
	  

	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("The balance is "+bal);
		
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Enter the deposite amount=");
		Scanner sc =new Scanner(System.in);
		
	    int dep=sc.nextInt();
	    bal=bal+dep;
	    System.out.println("Balance is "+bal);
	    
		
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the widraw amount=");
		Scanner sc =new Scanner(System.in);
		int wid=sc.nextInt();
		bal=bal-wid;
		System.out.println("Balance is "+bal);

		
	}

	
}
public class Abstractexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		South_indian ss=new South_indian();{
			ss.account_details();
			ss.balance();
			ss.deposite();
			ss.withdraw();
		}

	}



			
		}



