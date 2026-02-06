package opgave3;

public class CommissionCalculator {
}

// OPGAVEBESKRIVELSE:
// Formål: At beregne provision (commission) for sælgere baseret på deres salgsbeløb.
//
// 1. Implementér metoden: public static double computeCommission(double salesAmount)
// 2. Benyt følgende provisionsrater (fra opgave 5.39):
//    - Salg fra 0 - 5.000 kr.: 8% i provision.
//    - Salg fra 5.001 - 10.000 kr.: 10% i provision.
//    - Salg over 10.000 kr.: 12% i provision.
//
// 3. I din main-metode skal du lave et testprogram, der udskriver en tabel.
// 4. OBS: Din underviser har bedt om at tabellen skal vise intervaller
//    fra 1.000, 2.000, 3.000 ... op til 20.000.
//
// HINT: Husk at provisionen er akkumuleret (ligesom topskat).
// Hvis du sælger for 15.000, får du 8% af de første 5.000,
// 10% af de næste 5.000 og 12% af de resterende 5.000.