import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Computer randomly picks 1, 2, or 3
        int computerChoice = rand.nextInt(3) + 1;

        // Prompt user
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Your choice: ");

        int userChoice = input.nextInt();

        // Convert numbers to words
        String compMove = "";
        String userMove = "";

        if (computerChoice == 1) compMove = "Rock";
        else if (computerChoice == 2) compMove = "Paper";
        else compMove = "Scissors";

        if (userChoice == 1) userMove = "Rock";
        else if (userChoice == 2) userMove = "Paper";
        else if (userChoice == 3) userMove = "Scissors";
        else userMove = "Invalid";

        // Display choices
        System.out.println("\nComputer chose: " + compMove);
        System.out.println("You chose: " + userMove);

        // Determine winner
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please run the program again.");
        } else if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        input.close();
    }
}

