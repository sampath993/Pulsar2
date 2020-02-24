package Practice;

public class ReturnStatement {
	
public static void main (String [] args) {
	
	int sum = returnStatement(10, 20 , 30);
	
	int sum1 = returnStatement(10, 30, 50);
	int result = sum1 * 15;
	
	int sum2 = returnStatement(20, 30, 60);
	int result1 = sum2/2;
	
	
	System.out.println(sum);		
	System.out.println(result);		
	System.out.println(result1);		
	

	}


public static int returnStatement(int a, int b, int c){

	return(a+b+c);
	
	
	
	
		}
	
	}
