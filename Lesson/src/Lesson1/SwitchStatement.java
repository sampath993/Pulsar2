package Lesson1;

public class SwitchStatement {

	public static void main(String[] args) {
	
		int score = 90;
		
		switch(score) {
		
		case 100 :
		case 90 :
		case 80 :
			
			System.out.println("Very Good");
			break;
		case 60:
			System.out.println("Good");
			break;
			
		case 40 :
			System.out.println("Ok");
			break;
		
		  default:
			System.out.println("The Grade is not defined"); 
			break;
		 
		        
		}
			

	}

}
