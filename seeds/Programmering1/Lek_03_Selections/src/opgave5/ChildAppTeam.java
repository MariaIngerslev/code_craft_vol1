package opgave5;

import java.util.Scanner;

public class ChildAppTeam {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Testing different scenarios as requested
        //System.out.println("Result 1: " + team(false, 7));  // Expected: Tumbling girls
        // System.out.println("Result 2: " + team(true, 10));  // Expected: Cool boys

        boolean isBoy = askIfBoy();
        int age = askForAge();

        String result = team(isBoy, age);
        System.out.println("The child should join: " + result);
    }

    public static String team(boolean isBoy, int age) {
        if (isBoy) {
            // Logic for boys
            return (age < 8) ? "Young cubs" : "Cool boys";
        } else {
            // Logic for girls
            if (age < 8) {
                return "Tumbling girls";
            } else {
                return "Springy girls";
            }
        }
    }

    public static boolean askIfBoy() {
        System.out.print("Is the child a boy or girl?: ");
        String answer = input.next().toLowerCase();
        // Returns true if user types 'yes', otherwise false
        return answer.equals("boy");
    }

    public static int askForAge() {
        System.out.print("Enter age: ");
        while (!input.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            input.next();
        }
        return input.nextInt();
    }
}