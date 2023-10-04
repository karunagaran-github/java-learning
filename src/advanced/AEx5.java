package advanced;

import java.util.Arrays;

public class AEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Element and index to update
        int newValue = 10;
        int indexToUpdate = 2;

        // Check if the index is within bounds
        if (indexToUpdate >= 0 && indexToUpdate < numbers.length) {
            // Update the element at the specified index
            numbers[indexToUpdate] = newValue;

            // Print the updated array
            System.out.println("Updated array: " + Arrays.toString(numbers));
        } else {
            System.out.println("Index is out of bounds.");
        }

	}

}
