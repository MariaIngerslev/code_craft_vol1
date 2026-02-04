package opgave3;

import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Input
        System.out.print("Enter the number of minutes: ");
        long numberInput = input.nextLong();

        //Initialize variables to 0
        long years = 0L;
        long days = 0L;

        //Logic
        //Omregn minutter til dage
        days = numberInput / 60 / 24 ;

        //Omregn dage til år
        years = days / 365;
        days = days % 365;

        //Output to display
        System.out.print(numberInput + " minutes is approximately " + years + " years and " + days + " days");

        input.close();
    }
}
