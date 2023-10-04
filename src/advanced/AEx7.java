package advanced;

import java.util.ArrayList;

public class AEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Element to search for
        String elementToSearch = "Orange";

        // Using the contains method to search for the element
        boolean found = fruits.contains(elementToSearch);

        if (found) {
            System.out.println(elementToSearch + " is found in the ArrayList.");
        } else {
            System.out.println(elementToSearch + " is not found in the ArrayList.");
        }

	}

}
