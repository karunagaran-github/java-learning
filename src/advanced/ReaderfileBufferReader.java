package advanced;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReaderfileBufferReader {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub

File file = new File("C:\\Users\\DELL\\eclipse-workspace\\learning_java\\Helloworld.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String str;
		
		while( (str=br.readLine())  != null)
		{
			System.out.println(str);
		}
		
		
	}

}
