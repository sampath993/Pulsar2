package Practice;

public class Classes_ObjectOriented {

	public static void main(String[] args) {
		
		//1st student details
		Classes_ObjectOriented1 studentDetails = new Classes_ObjectOriented1();
		
		studentDetails.id =1;
		studentDetails.name = "Ashok";
		studentDetails.age = 17;
		
		System.out.println("id "+ studentDetails.id +" name of the Student is "+ studentDetails.name + " age is " + studentDetails.age+ " Years of Old");
		
		
		//2nd Student details
		
		Classes_ObjectOriented1 studentDetails2 = new Classes_ObjectOriented1();
		studentDetails2.id=2;
		studentDetails2.name="Santhanam";
		studentDetails2.age =17;
		
		System.out.println("id "+ studentDetails2.id +" name of the Student is "+ studentDetails2.name + " age is " + studentDetails2.age+ " Years of Old");
				
		

	}

}
