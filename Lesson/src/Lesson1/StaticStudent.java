package Lesson1;

public class StaticStudent {
	
	public static void main(String[] args) {
		
		StudentStatic mark = new StudentStatic();
		System.out.println(mark.getNoOfStudents());
		StudentStatic max = new StudentStatic();
		System.out.println(max.getNoOfStudents());
		System.out.println(StudentStatic.getNoOfStudents());
		
		
		
	}

}
