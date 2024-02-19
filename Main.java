import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Variables
        int randomNumber1, randomNumber2, randomNumber3;
        int userGuess1, userGuess2, userGuess3;

        // Welcome to the Lottery Game!
        System.out.println("Hello! This program will generate 3 random numbers between 1 and 10");
        System.out.println("Your job will be to guess the numbers, lets begin!");
        System.out.println(" ");

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Generate random numbers
        randomNumber1 = (int) (Math.random() * 10 + 1);
        randomNumber2 = (int) (Math.random() * 10 + 1);
        randomNumber3 = (int) (Math.random() * 10 + 1);

        // Get user input
        System.out.print("Please guess the first number: ");
        userGuess1 = input.nextInt();

        System.out.print("Please guess the second number: ");
        userGuess2 = input.nextInt();

        System.out.print("Please guess the third number: ");
        userGuess3 = input.nextInt();

        // Check if the user guessed correctly

    }

}
