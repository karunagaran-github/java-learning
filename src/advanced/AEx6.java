package advanced;

import java.util.ArrayList;

public class AEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Check if the ArrayList has at least three elements
        if (colors.size() >= 3) {
            // Remove the third element (index 2)
            colors.remove(2);

            // Print the updated ArrayList
            System.out.println("ArrayList after removing the third element:");
            for (String color : colors) {
                System.out.println(color);
            }
        } else {
            System.out.println("ArrayList does not have enough elements.");
        }

	}

}
