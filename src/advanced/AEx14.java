package advanced;

import java.util.ArrayList;
import java.util.Collections;

public class AEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Index positions of elements to swap
        int index1 = 1;
        int index2 = 3;

        // Check if the indices are valid
        if (isValidIndex(colors, index1) && isValidIndex(colors, index2)) {
            // Swap the elements
            Collections.swap(colors, index1, index2);

            // Print the ArrayList after swapping
            System.out.println("ArrayList after swapping elements:");
            for (String color : colors) {
                System.out.println(color);
            }
        } else {
            System.out.println("Invalid indices for swapping.");
        }
    }

    // Method to check if an index is valid for the given ArrayList
    public static <T> boolean isValidIndex(ArrayList<T> list, int index) {
        return index >= 0 && index < list.size();

	}

}
