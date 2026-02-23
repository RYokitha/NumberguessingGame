import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1; // Generates number between 1–100
        int guess;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Too low! Try again.");
            } 
            else if (guess > number) {
                System.out.println("Too high! Try again.");
            } 
            else {
                System.out.println("🎉 Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}