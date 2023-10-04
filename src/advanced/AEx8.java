package advanced;

import java.util.ArrayList;
import java.util.Collections;

public class AEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList in ascending order:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // To sort in descending order, you can use Collections.reverseOrder()
        Collections.sort(numbers, Collections.reverseOrder());

        // Print the sorted ArrayList in descending order
        System.out.println("\nSorted ArrayList in descending order:");
        for (int number : numbers) {
            System.out.println(number);
        }

	}

}
