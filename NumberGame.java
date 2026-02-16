import java.util.Random;
import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain;

        do {
            int number = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\n--- NUMBER GUESSING GAME ---");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + number);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nThanks for playing! Final Score: " + score);
        sc.close();
    }
}