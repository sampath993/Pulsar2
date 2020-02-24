package Lesson1;

public class ForLoop {

	public static void main(String[] args) {
		
		//for loop with array
		
		int [] myintarray = {1,2,3,4,5};
		
		for(int index=0; index < 5; index++) {
			System.out.println(myintarray[index]);
		}
		
		//only for loop
		
		int j ;
		for(j=1; j<=10; j++) {
			System.out.println(j);
		}
		
		//for loop with array another model
		
		for(int element :myintarray ) {
			
			System.out.println(element);
		}
	}

}
