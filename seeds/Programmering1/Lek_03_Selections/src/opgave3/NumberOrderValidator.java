package opgave3;

import java.util.Scanner;

public class NumberOrderValidator {

    //statics
    private static final Scanner input = new Scanner(System.in);

    // main method
    public static void main(String[] args){
        int number1 = askQuestion();
        int number2 = askQuestion();
        int number3= askQuestion();
        String output = logic(number1, number2, number3);
        System.out.println(number1 + " " + number2 + " " + number3 + " is " + output);
    }

    //method 1 - userinput
    public static int askQuestion() {
        System.out.print("You should enter 3 numbers. Enter an integer: ");

        // Wait for user to provide an integer input
        int userInput = input.nextInt();
        return userInput;
    }

    //method 2 - logic + output
    public static String logic(int number1, int number2, int number3) {
        //logic varibales
        String output = number1 + " " + number2 + " " + number3 + " is ";

        if (number1 < number2 && number2 < number3) {
            return "increasing";
        } else if (number1 > number2 && number2 > number3) {
            return "decreasing";
        } else {
            return "neither";
        }
    }
}
