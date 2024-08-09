package basic;

import java.util.Scanner;

public class Twodimenarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row=ss.nextInt();
		System.out.println("Enter the number of columns:");
		int col=ss.nextInt();

		int[][] arayy2= new int[row][col];
		System.out.println("enter the values");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arayy2[i][j]=ss.nextInt();
				
			}
			
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++){
				System.out.print(arayy2[i][j]);
				
			}
			System.out.println();
		}

	}


}
