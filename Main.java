import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        int randomNumber1, randomNumber2, randomNumber3;
        int userGuess;

        // Welcome to the Lottery Game!
        System.out.println("Hello! This program will generate 3 random numbers between 1 and 10");
        System.out.println("Your job will be to guess the numbers, lets begin!");
        System.out.println(" ");

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        //While loop test
        for (int i = 0; i < 100; i++) {
            // Generate random numbers
            randomNumber1 = (int) (Math.random() * 10 + 1);
            randomNumber2 = (int) (Math.random() * 10 + 1);
            randomNumber3 = (int) (Math.random() * 10 + 1);

            // Get user input
            System.out.print("Please guess the first number: ");
            userGuess = input.nextInt();

            //Print random numbers
            System.out.println("The first number is " + randomNumber1);
            System.out.println("The second number is " + randomNumber2);
            System.out.println("The third number is " + randomNumber3);

            // Check if the random numbers are equal to each other
            while (randomNumber1 == randomNumber2 || randomNumber1 == randomNumber3 || randomNumber2 == randomNumber3) {
                randomNumber1 = (int) (Math.random() * 10 + 1);
                randomNumber2 = (int) (Math.random() * 10 + 1);
                randomNumber3 = (int) (Math.random() * 10 + 1);
                System.out.println("One or more numbers equaled each other, re-rolling!");

                // Print new random numbers
                System.out.println("The first number is " + randomNumber1);
                System.out.println("The second number is " + randomNumber2);
                System.out.println("The third number is " + randomNumber3);
            }

            // Check if the user guessed correctly
            if(userGuess == randomNumber1) {
                System.out.println("You guessed correctly!");
                System.out.println(" ");
            } else if(userGuess == randomNumber2) {
                System.out.println("You guessed the second number correctly!");
                System.out.println(" ");
            } else if(userGuess == randomNumber3) {
                System.out.println("You guessed the third number correctly!");
                System.out.println(" ");
            } else {
                System.out.println("You guessed incorrectly!");
                System.out.println(" ");
            }
        }
    }
}
