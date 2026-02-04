package opgave1;

import java.util.Scanner;

/**
 * Exercise 3.2: Multiplication Quiz.
 * This class implements a simple math game that generates three random single-digit
 * integers and validates the product based on user input.
 * * Revised from Listing 3.1 (Addition Quiz) as per textbook requirements.
 */
public class MultiplicationQuiz {

    // Fields are marked static to be accessible within the static context of main
    private static int number1, number2, number3, answer;
    private static final Scanner input = new Scanner(System.in);

    /**
     * Entry point of the application.
     * Orchestrates the flow: Generate data -> Interact with user -> Validate result.
     */
    public static void main(String[] args) {
        generateNumbers();
    }

    /**
     * Evaluates the logic and provides feedback to the user.
     * Includes a fallback message if the answer is incorrect.
     */
    public static void showResult() {
        int correctAnswer = number1 * number2 * number3;
        boolean isCorrect = (answer == correctAnswer);

        // Display results using boolean evaluation
        System.out.println(
                number1 + " * " + number2 + " * " + number3 + " = " + answer +
                        " is " + isCorrect
        );

        // Strategic feedback for the learner
        if (!isCorrect) {
            System.out.println("Correction: The actual product is " + correctAnswer);
        }
    }

    /**
     * Generates three single-digit integers using system time as a seed.
     * Uses prime multipliers (7, 13) to minimize collision between variables.
     */
    public static void generateNumbers() {
        // Extract the last digit of current milliseconds for pseudo-randomness
        number1 = (int) (System.currentTimeMillis() % 10);
        number2 = (int) (System.currentTimeMillis() * 7 % 10);
        number3 = (int) (System.currentTimeMillis() * 13 % 10);

        askQuestion();
    }

    /**
     * Handles the User Interface (UI) by prompting the user for input.
     */
    public static void askQuestion() {
        System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + "? ");

        // Wait for user to provide an integer input
        answer = input.nextInt();

        showResult();
    }
}
