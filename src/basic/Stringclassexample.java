package basic;

import java.util.Scanner;

public class Stringclassexample {
	public static void main(String[] args) {
		
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sd.next();
		int count=0;
		char z[]=s.toCharArray();
		for(char v:z)
		{
			if(v =='a' || v =='e' || v=='i' || v=='o' || v=='u') 
				count++;
				
			}
			System.out.println("Count of vouwels ="+count);
			
			
		//print alphabet
			
			for(char b='a';b<'z';b++) {
				System.out.println(b);
			}
			
			
		//character count
			int countc=0;
			for(char c:z) {
				countc++;
				
			}
			System.out.println("count="+countc);
			

		}


}
