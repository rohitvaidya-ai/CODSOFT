import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxRounds = 5;  
        int score = 0; 

        System.out.println("Welcome to the Number Guessing Game!");

        
        for (int round = 1; round <= maxRounds; round++) {
            System.out.println("\nRound " + round + " of " + maxRounds);
            int attempts = 5;  
            int numberToGuess = random.nextInt(100) + 1;  

            System.out.println("Guess the number between 1 and 100. You have " + attempts + " attempts.");

            boolean hasGuessedCorrectly = false;

            
            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    score += attempts;  
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                attempts--;
                System.out.println("Attempts remaining: " + attempts);
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);

            
            if (round < maxRounds) {
                System.out.print("Do you want to play another round? (yes/no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes")) {
                    break;
                }
            }
        }

        System.out.println("\nGame over! Your final score: " + score);
        scanner.close();
    }
}
