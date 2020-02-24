	package Practice1;
	import java.text.SimpleDateFormat;
import java.util.*;
	public class DateANDTime {
	
		public static void main(String []arg) {
	
			Date date = new Date();
			System.out.println(date.toString());
				
			System.out.println(date.getTime());
			System.out.println(date.getMonth());
			System.out.println(date.getDay());
			System.out.println(date.getYear());
			System.out.println(date.getHours());
			
			SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
			System.out.println(sdf.format(date));
			
		}
	
	}
