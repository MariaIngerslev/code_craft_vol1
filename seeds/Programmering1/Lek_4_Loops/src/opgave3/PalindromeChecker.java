package opgave3;

import java.util.Scanner;

public class PalindromeChecker {
    //static
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNumber = askForNumber();
        if (isPalindrome(inputNumber)) {
            System.out.println("The number " + inputNumber + " is a palindrome");
        } else {
            System.out.println("The number " + inputNumber + " is NOT a palindrome");
        }
    }

    public static int askForNumber() {
        System.out.print("Enter an integer: ");
        return input.nextInt();
    }

    public static int reverse(int number) {
        int result = 0;

        while (number != 0) { //using != 0 to also handle negative integers
            int lastDigit = number % 10;
            result = (result * 10) + lastDigit;
            number /= 10;
        }
        return result;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}

