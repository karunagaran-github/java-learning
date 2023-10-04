package corejava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FilewriteEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
File file = new File("C:\\Users\\DELL\\eclipse-workspace\\learning_java\\Helloworld.txt");
		
		String lineToAdd="This is the first line of the program";

		FileWriter fWriter= new FileWriter(file);
		
		fWriter.write(lineToAdd);
		
		System.out.println("File is written");
		
		fWriter.close();
		
		

		
		

	}

}
