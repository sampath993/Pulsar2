package Lesson1;

public class ClassesandObjects {

	public static void main(String[] args) {
		
		Student mark = new Student();  //mark is called as object or instance 
		
		mark.setId(1);
		mark.setName("John");
		mark.setAge(15);
		
		Student tom = new Student();
		tom.setId(2);
		tom.setName("Tom");
		tom.setAge(15);
		
		System.out.println(mark.getName() +"is" + mark.getAge() + "Years old");
		System.out.println(tom.getName() + "is" +tom.getAge()+"Years old");
		
		
		

	}

}
