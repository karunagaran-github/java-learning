package advanced;

import java.util.ArrayList;

public class AEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList and add some elements
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Create a new ArrayList to store reversed elements
        ArrayList<String> reversedNames = new ArrayList<>();

        // Copy elements from the original ArrayList to the new ArrayList in reverse order
        for (int i = names.size() - 1; i >= 0; i--) {
            reversedNames.add(names.get(i));
        }

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList:");
        for (String name : reversedNames) {
            System.out.println(name);
        }

	}

}
