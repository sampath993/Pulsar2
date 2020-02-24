
package Conditional_Statement;

public class Switch_Statement {

	public static void main(String[] args) {
		int score =100;
		//byte, short, int, or char
		
		switch(score) {
		case 100:
		case 85:
		case 90:
			System.out.println("very Good");
			break;
		case 40:
			System.out.println("ok");
			break;
		case 20:
			System.out.println("not ok");
			break;
		default:
			System.out.println("The grades are not defined");
		}


	}

}
