package advanced;

import java.util.ArrayList;

public class AEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create an ArrayList to store colors (strings)
		        ArrayList<String> colorsList = new ArrayList<>();

		        // Add some colors to the ArrayList
		        colorsList.add("Red");
		        colorsList.add("Green");
		        colorsList.add("Blue");
		        colorsList.add("Yellow");

		        // Print out the collection
		        System.out.println("Colors in the ArrayList:");
		        for (String color : colorsList) {
		            System.out.println(color);
		        }
		    }

	}


