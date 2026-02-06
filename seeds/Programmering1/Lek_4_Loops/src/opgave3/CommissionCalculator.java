package opgave3;

import java.util.Scanner;

public class CommissionCalculator {
    // scanner
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sales Amount\t\tCommission");

        //calculate and show tabel
        int salesAmount = 1000;
        while (salesAmount <= 20000) {
            double commission = computeComission(salesAmount);
            System.out.println(salesAmount + "\t\t\t\t" + commission);
            salesAmount += 1000;
        }
    }

    public static double computeComission(double salesAmount) {
        // 0-5000 = 6 %
        if (salesAmount <= 5000) {
            return salesAmount * 0.06;
        }
        double commisionTier1 = 5000 * 0.06;

        //5000-10000 = 8 %
        if (salesAmount <= 10000) {
            return commisionTier1 + (salesAmount - 5000) * 0.08;
        }
        double commosionTier2 = 5000 * 0.08;

        // + 10000 = 10 %
        double commisionTier3 = (salesAmount - 10000) * 0.1;

        return commisionTier1 + commosionTier2 + commisionTier3;
    }
}


// OPGAVEBESKRIVELSE:
// Formål: At beregne provision (commission) for sælgere baseret på deres salgsbeløb.
//
// 1. Implementér metoden: public static double computeCommission(double salesAmount)
// 2. Benyt følgende provisionsrater (fra opgave 5.39):
//    - Salg fra 0 - 5.000 kr.: 6% i provision.
//    - Salg fra 5.001 - 10.000 kr.: 8% i provision.
//    - Salg over 10.000 kr.: 10% i provision.
//
// 3. I din main-metode skal du lave et testprogram, der udskriver en tabel.
// 4. OBS: Din underviser har bedt om at tabellen skal vise intervaller
//    fra 1.000, 2.000, 3.000 ... op til 20.000.
//
// HINT: Husk at provisionen er akkumuleret (ligesom topskat).
// Hvis du sælger for 15.000, får du 6% af de første 5.000,
// 8% af de næste 5.000 og 10% af de resterende 5.000.