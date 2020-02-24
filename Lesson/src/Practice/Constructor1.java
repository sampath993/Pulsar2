package Practice;

public class Constructor1 {

	 int length;
	 int bredth;
	 int height;
	
	public  int getCubeVolume() {
		
		return (length*bredth*height);
		
	}
	
	public Constructor1() {
	
		length = 10;
		bredth =20;
		height =30;
		
	}
	
	Constructor1(int l, int b, int h){
		
		length =l;
		bredth =b;
		height =h;
		
		
		
	}
	
	
	
}
