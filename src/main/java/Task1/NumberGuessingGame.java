package Task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            // Generate a random number for each round
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            int userGuess;

            // Prompt the user for their guess
            System.out.println("\nI have selected a number between " + lowerBound + " and " + upperBound +
                    ". Can you guess it? You have " + maxAttempts + " attempts.");

            // Guessing loop
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                // Provide feedback on the guess
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            // Ask if the user wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            // Check if the user wants to exit the game
            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing! Your total score is: " + score);
                break;
            }

        } while (true);

        // Close the scanner
        scanner.close();
    }
}
