package Lesson1;

public class StudentStatic {
	
	static int NoOfStudents =0;
	
	StudentStatic(){
		
		NoOfStudents++;
	}
	
	public static int getNoOfStudents() {
		return NoOfStudents;
	}
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;


}
