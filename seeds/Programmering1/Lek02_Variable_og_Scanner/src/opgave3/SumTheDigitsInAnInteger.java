package opgave3;

import java.util.Scanner;

public class SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Input
        System.out.print("Enter a number between 0 and 1000: ");
        int numberInput = input.nextInt();

        //Initialize sum to 0
        int sum = 0;

        // Check if the number is within range
        if (numberInput >= 0 && numberInput <= 1000) {
            while (numberInput > 0) {
                int digit = numberInput % 10;
                sum += digit;
                numberInput/= 10;
            }

            // Display results
            System.out.println("The sum of the digits is " + sum);

        } else {
            System.out.println("Number must be between 0 and 1000.");
        }

        input.close();
    }
}

