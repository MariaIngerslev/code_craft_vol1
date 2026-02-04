package opgave4;

import java.util.Scanner;

public class ChildApp {

    private static final Scanner input = new Scanner(System.in);

    //method userinput
    public static int askQuestion() {
        System.out.print("Enter the childs age: ");
        // Wait for user to provide an integer input
        int userInput = input.nextInt();
        return userInput;
    }

    //logic
    public static String institution(int age) {
        if (age == 0) {
            return "Home";
        } else if (age == 1 || age == 2) {
            return "Nusery";
        } else if (age >= 3 && age <= 5) {
            return "Kindergarten";
        } else if (age >= 6 && age <= 16) {
            return "School";
        } else if (age >= 17) {
            return "Out of school";
        }
        return "Error: Unknown age";
    }



    public static void main(String[] args) {
        //1. get input and store it
        int myAge = askQuestion();

        //2. process logic using the method intended by the assignment
        String result = institution(myAge);

        //3. print result
        System.out.println("A child aged " + myAge + " should attend " + result);
    }

}