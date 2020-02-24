package Lesson1;

public class StaticKeyword {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		hello .age = 10;
		//Hello.DoSomething("Hello String");		
		System.out.println(hello.age);
		
		Hello hello1 = new Hello();
		//hello1.DoSomethingEles("Hellow String else");
		hello1.age = 50;
		System.out.println(hello1.age);
	
		

	}
	
	

}
