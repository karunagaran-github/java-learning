package advanced;

import java.util.Iterator;
import java.util.ArrayList;

	public class AEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        // Create an ArrayList and add some elements
		        ArrayList<String> fruits = new ArrayList<>();
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Orange");
		        fruits.add("Grapes");

		        // Using a for-each loop to iterate through elements
		        System.out.println("Iterating using for-each loop:");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }

		        // Using an Iterator to iterate through elements
		        System.out.println("\nIterating using Iterator:");
		        Iterator<String> iterator = fruits.iterator();
		        while (iterator.hasNext()) {
		            String fruit = iterator.next();
		            System.out.println(fruit);
		        }
		    
	}

}
