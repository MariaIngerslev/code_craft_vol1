package opgave8;

import java.util.Scanner;

public class RockPaperScissor {

    // Initialize Scanner as static to allow access from all static methods without passing it around.
    private static final Scanner input = new Scanner(System.in);

    // Constants defined to avoid "Magic Numbers".
    // This makes the code readable: "if (hand == ROCK)" is better than "if (hand == 1)"
    static final int SCISSOR = 0;
    static final int ROCK = 1;
    static final int PAPER = 2;

    public static void main(String[] args) {
        // Step 1: Get input from the user.
        int usersChoice = askQuestion();

        // Step 2: Generate the computer's move.
        int computersChoice = randomGenerator();

        // Step 3: Determine the winner and format the output message.
        String result = logic(usersChoice, computersChoice);

        // Step 4: Display the final result to the user.
        System.out.println(result);
    }

    // Handles user interaction to keep the main method clean.
    public static int askQuestion() {
        System.out.print("Enter 0 (Scissor), 1 (Rock), or 2 (Paper): ");
        // Reads the next integer from the console input.
        return input.nextInt();
    }

    // Generates a random integer between 0 and 2.
    public static int randomGenerator() {
        // Math.random() returns a double (0.0 - 0.99). We multiply by 3 to get range 0.0 - 2.99.
        // We cast to (int) to truncate decimals, resulting in 0, 1, or 2.
        return (int) (Math.random() * 3);
    }

    // Helper method to convert internal integer representation to human-readable strings.
    public static String getName(int hand) {
        if (hand == SCISSOR) return "scissor";
        if (hand == ROCK) return "rock";
        if (hand == PAPER) return "paper";
        return "unknown"; // Fallback for invalid input
    }

    // Core game logic. Determines the winner and constructs the result string.
    public static String logic(int user, int computer) {
        // Convert integers to strings for the output message.
        String userHand = getName(user);
        String computerHand = getName(computer);

        // Output message.
        String baseMessage = "The computer is " + computerHand + ". You are " + userHand + ". ";

        // Check for a draw first to simplify subsequent logic.
        if (computer == user) {
            return baseMessage + "It is a draw";
        }

        // Variable to track the win condition.
        boolean userWins;

        // Determine winner based on game rules.
        if (computer == SCISSOR) {
            // If computer is scissor, user wins only if they chose ROCK.
            userWins = (user == ROCK);
        } else if (computer == ROCK) {
            // If computer is rock, user wins only if they chose PAPER.
            userWins = (user == PAPER);
        } else {
            // If computer is paper (implied else), user wins only if they chose SCISSOR.
            userWins = (user == SCISSOR);
        }

        // Return the final constructed message.
        if (userWins) {
            return baseMessage + "You won";
        } else {
            return baseMessage + "You lost";
        }
    }
}