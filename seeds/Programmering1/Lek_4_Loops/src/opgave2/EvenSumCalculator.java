package opgave2;

import java.util.Scanner;

public class EvenSumCalculator {
    //statics
    private static final Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        int number1 = askForNumber();
        int number2 = askForNumber();

        //find lower and upper bounds regardless of input order
        int lower = Math.min(number1, number2);
        int upper = Math.max(number1, number2);

        int totalSum= sumEvenInts(lower, upper);

        System.out.println("Result is " + totalSum);

    }
        public static int sumEvenInts(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int askForNumber() {
        System.out.print("Enter a number: ");
        return input.nextInt();
    }
}
