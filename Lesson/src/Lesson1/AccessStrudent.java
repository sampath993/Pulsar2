package Lesson1;

public class AccessStrudent {
	
	public String name;
	public int age;
	
	private String name1;
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	private int age1;

	
	 String name2;
	 int age2;

	protected String name3;
	protected int age3;
	
	
	/*Access Levels
	 * 
	 * Modifier 	class 	package 	subclass 	World
	 * public 		 Y			Y			Y			Y
	 * protected 	 Y			Y			Y			N
	 * no modifier	 Y			Y			N			N
	 * private		 Y			N			N			N	
	*/

}
