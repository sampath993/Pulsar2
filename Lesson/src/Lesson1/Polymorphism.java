package Lesson1;

public class Polymorphism {

	public static void main(String[] args) {
		
		Bank abc = new Bank_ABC();
		
		Bank state = new BankState();
		
		Bank hdfc = new BankHDFC();
		
		System.out.println(abc.getIntrestRate());
		System.out.println(state.getIntrestRate());
		System.out.println(hdfc.getIntrestRate());

	}

}
