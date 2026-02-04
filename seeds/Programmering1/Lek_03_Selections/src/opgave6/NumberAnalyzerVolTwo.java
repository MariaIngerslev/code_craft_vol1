package opgave6;

import java.util.Scanner;

public class NumberAnalyzerVolTwo {

    //Statics
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = askForNumber();
        String output = sign(number);
        System.out.println(output);
    }

    //Handles the User Interface (UI) by prompting the user for input.
    public static int askForNumber() {
        System.out.print("Enter an integer to evaluate (positive/negative/zero): ");
        return input.nextInt();
    }
    //logic
    public static String sign(int number) {
        if (number < 0) {
            return "negativ";
        } if (number > 0) {
            return "positiv";
        } else {
            return "nul";
        }
    }
}
