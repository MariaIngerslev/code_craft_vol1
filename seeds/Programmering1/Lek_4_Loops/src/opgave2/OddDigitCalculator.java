package opgave2;

import java.util.Scanner;

public class OddDigitCalculator {

    //static
    private static final Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        long number = askForNumber();
        long totalSum = sumOddDigits(number);

        System.out.println("The total sum is " + totalSum);
    }

    public static long sumOddDigits(long number) {
        long sum=0;

        while (number > 0) {
            //gå igennem alle index til vi når numbers længde
            long lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                sum += lastDigit;
            }
            number /=10;
            }
        return sum;
        }

    public static long askForNumber() {
        System.out.print("Enter a number: ");
        return input.nextLong();
    }
}
