package Practice;

public class Methods {

	public static void main(String[] args) {
		
		//Using Method we can use single function multiple times execution 
		
		hellowmethod();
		hellowmethod();
		hellowmethod();
		
//		using arguments 
		
		argumentMethod(10, 20);
		argumentMethod(10, 30);
		argumentMethod(20, 30);
		
		

	}

	public static void hellowmethod() {
		System.out.println("Hellow Method");
		
	}
	
	public static void argumentMethod(int a , int b) {
		System.out.println(a+b);
		
	}
	
}
