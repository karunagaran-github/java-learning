package advanced;

import java.util.ArrayList;
import java.util.Collections;

public class AEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList and add some elements
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Ace");
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");
        cards.add("10");

        // Shuffle the ArrayList
        Collections.shuffle(cards);

        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList:");
        for (String card : cards) {
            System.out.println(card);
        }

	}

}
