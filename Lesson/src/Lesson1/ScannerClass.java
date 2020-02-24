package Lesson1;

import java.util.Scanner;

public class ScannerClass {

	public static void main (String[]args) {
		//Integer scanner code
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Some Output");
		int user_input_number = scn.nextInt();
		System.out.println("The Entered Value is");
		System.out.println(user_input_number);
		
		//String scanner code
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Enter User String value");
		String user_input_string = scn1.nextLine();
		System.out.println("The entered value is");
		System.out.print(user_input_string);
		// Double Scanner code
		
		Scanner Scn2 = new Scanner(System.in);
		System.out.println("Enter the User Value");
		Double user_intput_double= Scn2.nextDouble();
		System.out.println("The User Entered value is");
		System.out.println(user_intput_double);
		
		//Float Value for scanner code
		
		Scanner scn3 = new Scanner(System.in);
		System.out.println("Enter the User Value");
		Float user_input_float = scn3.nextFloat();
		System.out.println("User Entered value is");
		System.out.println(user_input_float);
		
		//Boolean value for Scanner 
		
		Scanner scn4= new Scanner(System.in);
		System.out.println("Enter the User value");
		Boolean user_input_boolean = scn4.nextBoolean();
		System.out.println("User Entered value is");
		System.out.println(user_input_boolean);
		
				
	}
}
