package advanced;

import java.util.ArrayList;
import java.util.Arrays;

public class AEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create two ArrayLists
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // Compare the two ArrayLists
        boolean isEqual = compareArrayLists(list1, list2);

        if (isEqual) {
            System.out.println("The ArrayLists are equal.");
        } else {
            System.out.println("The ArrayLists are not equal.");
        }
    }

    // Method to compare two ArrayLists
    public static <T> boolean compareArrayLists(ArrayList<T> list1, ArrayList<T> list2) {
        // Check if the sizes are equal
        if (list1.size() != list2.size()) {
            return false;
        }

        // Check if the elements are equal in the same order
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;

	}

}
