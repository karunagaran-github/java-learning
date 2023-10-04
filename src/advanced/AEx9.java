package advanced;

import java.util.ArrayList;

public class AEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Create the source ArrayList
        ArrayList<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);

        // Approach 1: Using addAll() method
        ArrayList<Integer> destinationList1 = new ArrayList<>();
        destinationList1.addAll(sourceList);

        // Approach 2: Using a loop
        ArrayList<Integer> destinationList2 = new ArrayList<>();
        for (int element : sourceList) {
            destinationList2.add(element);
        }

        // Print the copied ArrayLists
        System.out.println("Copied ArrayList using addAll(): " + destinationList1);
        System.out.println("Copied ArrayList using a loop: " + destinationList2);
    

	}

}
