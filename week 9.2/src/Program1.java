import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        // Create ArrayList with at least 10 Strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Alpha");
        words.add("Bravo");
        words.add("Charlie");
        words.add("Delta");
        words.add("Echo");
        words.add("Foxtrot");
        words.add("Golf");
        words.add("Hotel");
        words.add("India");
        words.add("Juliet");

        // Print using for-each loop
        System.out.println("ArrayList Contents:");
        for (String w : words) {
            System.out.println(w);
        }

        Scanner scanner = new Scanner(System.in);

        // Ask user which element they want to see again
        System.out.print("\nEnter the index of the element you want to see again: ");

        // AUTOUNBOXING: user enters a String → Integer.parseInt → int
        String userInput = scanner.nextLine();
        Integer indexObject = Integer.parseInt(userInput); // Autoboxing
        int index = indexObject; // Auto-unboxing

        try {
            System.out.println("Element at index " + index + ": " + words.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}
