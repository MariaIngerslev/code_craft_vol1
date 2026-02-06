package opgave3;

import java.util.Scanner;


public class InvestmentCalculator {
        // scanner
        private static final Scanner input = new Scanner(System.in);

        public static void main (String[]args) {
            // input
                double amount = promptInvestmentAmount();
                double annualPercent = promptAnnualInterestRate();

            //convert anual procent to montly decimal
                double monthlyRate = convertAnnualToMonthlyDecimal(annualPercent);

            // output: the tabel
            System.out.println("Year\t\tFuture Value");
            System.out.println("-------------------------");
                for (int i = 1; i <= 30; i++) {
                    double value = futureInvestmentValue(amount, monthlyRate, i);

                    System.out.println(i + "\t\t" + String.format("%.2f", value));
            }
        }

        public static double promptInvestmentAmount () {
            System.out.print("Enter the investment amount: ");
            return input.nextDouble();
        }

        public static double promptAnnualInterestRate () {
            System.out.print("Enter the annual investment rate: ");
            return input.nextDouble();
        }

        public static double convertAnnualToMonthlyDecimal (double anualPercent) {
                return anualPercent / 100 / 12;
            }

        public static double futureInvestmentValue (double amount, double montlyRate, int years){
            return amount * Math.pow((1 + montlyRate), (years * 12));
        }
    }
