package corejava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilecreationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the path of the file with filename");
		Scanner sc = new Scanner(System.in);
		
		String fileName= sc.nextLine();
		
		File f = new File(fileName+".txt");
		f.createNewFile();

	}

}
