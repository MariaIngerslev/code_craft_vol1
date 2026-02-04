package opgave2;

import java.util.Scanner;

public class NumberAnalyzer {

    //Statics
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = askForNumber();
        String output = checkNumbers(number);
        System.out.println("The number is " + output);
    }

    //Handles the User Interface (UI) by prompting the user for input.
    public static int askForNumber() {
        System.out.print("Enter an integer to evaluate (positive/negative/zero): ");
        int userInput = input.nextInt();
        return userInput;
    }

    //Output
    public static String checkNumbers(int number) {
        if (number< 0) {
            return "negativ";
        } if (number > 0) {
            return "positiv";
        } else {
            return "nul";
        }
    }
}
