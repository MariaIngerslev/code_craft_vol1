package opgave3;

import java.util.Scanner;

public class CostOfDriving {
    public static void main (String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Input
        System.out.print("Enter the driving distance in miles: ");
        double drivingDistance = input.nextDouble();

        System.out.print("Enter miles per galon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        //Initialize variable
        double costOfDriving;

        //Logic
        costOfDriving = (drivingDistance/milesPerGallon) *pricePerGallon;

        //Output to display
        System.out.println("The cost of driving is " + costOfDriving);
    }
}