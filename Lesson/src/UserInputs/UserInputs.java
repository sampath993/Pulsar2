package UserInputs;

import java.util.Scanner;


public class UserInputs {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value");
		int use_integr = scn.nextInt();
		System.out.println("Enter the decimal value is");
		double use_duble = scn.nextDouble();
		System.out.println("Enter the Sting value is");
		String use_srtng = scn.nextLine();
		
		
		System.out.println("Entered value is");
		System.out.println(use_integr);
		System.out.println(use_duble);
		System.out.println(use_srtng);
		

	}

}
