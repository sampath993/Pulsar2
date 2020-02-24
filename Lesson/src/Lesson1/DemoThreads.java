package Lesson1;




class MyClass123 extends Thread{
	
	public void run() {
		int i;
		
		for(i =0 ; i<10 ; i++) {
		
		System.out.println(Thread.currentThread().getId() + "Value" +i);
		
		}
	}
	
	
}
public class DemoThreads {

	public static void main(String[] args) {
		MyClass123 mycls = new MyClass123();
		mycls.start();
		MyClass123 mycls1 = new MyClass123();
		mycls1.start();
			

	}

}




