package advanced;

import java.util.ArrayList;

public class AEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Specify the index from which to retrieve the element
        int indexToRetrieve = 2;

        // Check if the index is within bounds
        if (indexToRetrieve >= 0 && indexToRetrieve < fruits.size()) {
            // Retrieve the element at the specified index
            String element = fruits.get(indexToRetrieve);

            // Print the retrieved element
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Index is out of bounds.");
        }

	}

}
