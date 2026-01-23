import java.util.Scanner;

public class HeatEnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for inputs
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (°C): ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature (°C): ");
        double finalTemperature = input.nextDouble();

        // Apply the formula: Q = waterMass * (final - initial) * 4184
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed is " + energy + " joules.");
    }
}


