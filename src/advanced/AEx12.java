package advanced;

import java.util.ArrayList;
import java.util.List;

public class AEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Specify the range of indices to extract (inclusive start, exclusive end)
        int startIndex = 1; // Inclusive
        int endIndex = 4;   // Exclusive

        // Extract a sublist using the subList() method
        List<String> sublist = colors.subList(startIndex, endIndex);

        // Print the extracted sublist
        System.out.println("Extracted Sublist:");
        for (String color : sublist) {
            System.out.println(color);
        }

	}

}
