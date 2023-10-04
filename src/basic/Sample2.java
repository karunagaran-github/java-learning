package basic;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "guvi";
        String s2 = "selenium";

        System.out.println("Before swapping:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // Swap the values using a temporary variable
        String temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
	}

}
