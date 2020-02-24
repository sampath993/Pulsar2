package Conditional_Statement;

import java.util.Scanner;

public class IF_Statement {

	public static void main(String[] args) {
		
		/*
		 * == is equals to
		 * != not equals to
		 * < less than 
		 * > greater than 
		 * <= less than are equal to
		 * >= greater than are equal to 
		*/
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value");
		int x = scn.nextInt();
		 System.out.println("Entered value is = ");
			System.out.println(x);
		if (x==100) {
			System.out.println("Yes X==100");
		}
		else {
			System.out.println("No !X==100");
			
		}
	

	}

}
