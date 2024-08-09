package basic;

import java.util.Scanner;

public class Arrayss {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=ss.nextInt();
		int[] ar=new int[size];

		for(int i=0;i<size;i++) {
			System.out.println("enter the element" +(i+1));
			ar[i]=ss.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=ar[i];
		}
		System.out.println("array elements");
		for(int i=0;i<size;i++) {
			System.out.println(ar[i]);
			
		}
		System.out.println("sum of array :"+sum);

	}


}
