package Lesson1;

public class Method {

	public static void main(String[] args) {

		myFirstMethod();
		myFirstMethod();
		myFirstMethod();
		myFirstMethod();
		myFirstMethod();
		
		sayHellow("john");
		
	//	Add(100, 200);  - using without return
		
		int sum = Add1(100,200);
		int result = sum*10;
		System.out.println(result);
		
	}
	//sample method
	
	public static void myFirstMethod() {
		
		System.out.println("Hellow World");
		
	}
	
	//method with arguments passed
	
	public static void sayHellow(String name) {
		
		System.out.println("Hellow " + name);
	}
	//using without return

	/*
	 * public static int Add(int a, int b) { 
	 * System.out.println(a+b);
	 * 
	 * }
	 */
	
	//with return statement
	public static int Add1(int a, int b) {
		return(a+b);
		
	}
}
