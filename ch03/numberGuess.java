import java.util.Random;
import java.util.Scanner;

/**
 * A simple number guessing game
 */

public class numberGuess {
    public static void main(String[] args) {
        // pick a random number
        Random rand = new Random();
        final int number = rand.nextInt(100) +1;
        // get user input
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess?");
        Scanner in = new Scanner(System.in);
        int guess;
        guess = in.nextInt();
        // return guess to user
        System.out.printf("You guessed %d!\n", guess);
        // share my number
        System.out.printf("I was thinking of %d!\n", number);
        // share difference
        final int difference = guess - number;
        System.out.printf("You were off by %d...\n", difference);
    }
}