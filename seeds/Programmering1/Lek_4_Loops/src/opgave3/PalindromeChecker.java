package opgave3;

import java.util.Scanner;

public class PalindromeChecker {
    //static
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNumber = askForNumber();
        int reversed = reverse(inputNumber);
        System.out.println(reversed);
    }

    public static int askForNumber() {
        System.out.print("Enter an integer: ");
        return input.nextInt();
    }

    public static int reverse(int number) {
        int result = 0;
        int temp = number;

        while (number != 0) { //using != 0 to also handle negative integers
            int lastDigit = number % 10;
            result = (result * 10) + lastDigit;
            number /= 10;
        }
        return result;
    }

    public static int isPalidrome(int number) {
        boolean palidromeChecker;

        if (reverse(number) == inputNumber) {
            return palidromeChecker == true }
    }
// 2. Lav en metode 'isPalindrome(int number)', der returnerer true eller false.
//    - Et tal er et palindrom, hvis det læses ens forfra og bagfra (f.eks. 121).
//    - VIGTIGT: Du SKAL bruge din reverse-metode til at tjekke dette.
//    - Logik: Hvis (tal == reverse(tal)), så er det et palindrom.
//
// 3. Lav et testprogram i din 'main' metode:
//    - Bed brugeren om at indtaste et heltal (brug en Scanner).
//    - Fortæl brugeren om tallet er et palindrom eller ej ved at kalde dine metoder.

    // TIP: Hvis du går i stå med reverse-logikken, så prøv at "køre" koden på et stykke papir først.
    // Hvad sker der med tallet 123, hvis du tager 123 % 10?
    // Hvordan gemmer du det 3-tal og gør plads til det næste?

}
