import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a secret number between 1 and 10: ");
        byte guess = reader.nextByte();
        byte win = 5;
        int guesses = 3;

        if (guesses == 3) {

        if (guess == 5) {
            System.out.println("You win!");
        } else if (guess > 5) {
            System.out.println("Guess lower!");
        } else {
            System.out.println("Guess higher!");
        }
        guesses = guesses-1;
        System.out.println("You have " + guesses + " guesses left!");

        guess = reader.nextByte();

        if (guess == 5) {
            System.out.println("You win!");
        } else if (guess > 5) {
            System.out.println("Guess lower!");
        } else {
            System.out.println("Guess higher!");
        }
        guesses = guesses-1;
        System.out.println("You have " + guesses + " guesses left!");


            guess = reader.nextByte();

        if (guess == 5) {
            System.out.println("You win!");
        } else if (guess > 5) {
            System.out.println("Guess lower!");
        } else {
            System.out.println("Guess higher!");
        }
        guesses = guesses-1;
        System.out.println("You have " + guesses + " guesses left!");

        }


    }
}

