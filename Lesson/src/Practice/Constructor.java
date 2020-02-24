package Practice;

public class Constructor {

	public static void main(String[] args) {
		
		Constructor1 cons = new Constructor1();
		System.out.println(cons.getCubeVolume());
		
		Constructor1 cons2 = new Constructor1(20,20,30);
		System.out.println(cons2.getCubeVolume());
	}

}
