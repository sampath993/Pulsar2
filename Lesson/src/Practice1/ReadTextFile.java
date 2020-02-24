package Practice1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
public class ReadTextFile {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new FileReader("fileName.txt"));
			String line;
			while((line = br.readLine()) !=null) {
				System.out.println(line);
			}
		}
		catch(IOException e){
			e.printStackTrace();
			
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
