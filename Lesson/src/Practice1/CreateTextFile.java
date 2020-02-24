package Practice1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateTextFile {

	public static void main(String[] args) {

		try {
			File file = new File("fileName.txt");
			if (!file.exists()) {

				file.createNewFile();
			}


			PrintWriter pw = new PrintWriter(file);
			pw.println("This is file Content");
			pw.println(1000);
			pw.close();

		}catch (IOException e) {

			e.printStackTrace();
		}



	}





}
