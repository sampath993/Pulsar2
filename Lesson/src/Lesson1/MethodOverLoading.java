package Lesson1;

public class MethodOverLoading {

	public static void main(String[] args) {

		System.out.println(Add(1,36));
		System.out.println(Add(5.656,40.66));
		System.out.println(Add("Hellow","World"));

	}
	
	public static int Add(int a, int b) {
		return (a+b);
		
	}

	public static double Add(double a, double b) {
		return (a+b);
		
	}
	public static String Add(String a, String b) {
		return (a+b);
		
	}
}
