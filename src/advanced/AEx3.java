package advanced;

import java.util.ArrayList;

public class AEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Insert an element at the first position
        colors.add(0, "Yellow");

        // Print the ArrayList to see the result
        System.out.println("ArrayList after inserting at the first position:");
        for (String color : colors) {
            System.out.println(color);
        }
    }

	}


