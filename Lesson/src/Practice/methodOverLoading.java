package Practice;

public class methodOverLoading {

	public static void main(String[] args) {
	
		
		//Two different methods with same name to perform same operation it's called method overloading 
		
		System.out.println(add(10, 20));
		System.out.println(add(10.26, 20.26));
		System.out.println(add("santhosh", "Kumar"));
		System.out.println(purchase(10,20));

	}
	
	public static int add(int a , int b) {
		return(a+b);
	}

	
	public static double add(double a , double b) {
		return(a+b);
	}

	public static String add(String a , String b) {
		
		return(a+b);
	}

	
	
	public static int purchase(int a, int b) {
		return(a*b);
		
	}
}
