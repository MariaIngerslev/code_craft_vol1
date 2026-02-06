package opgave3;

public class InvestmentCalculator {
}

// OPGAVEBESKRIVELSE:
// 1. Opret en metode 'futureInvestmentValue', der beregner værdien af en investering.
// 2. Metoden skal bruge formlen: futureValue = investmentAmount * (1 + monthlyInterestRate)^(years * 12).
// 3. I Java bruger vi Math.pow(base, exponent) til at opløfte tal.
//
// METODE-SIGNATUR:
// public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
//
// HOVEDPROGRAM (Main):
// - Bed brugeren om et investeringsbeløb (f.eks. 1000).
// - Bed brugeren om en årlig rentesats i procent (f.eks. 9%).
// - VIGTIGT: Omregn den årlige rente til månedlig rente (årlig rente / 12 / 100).
// - Lav et loop fra 1 til 30, der printer en tabel over den fremtidige værdi for hvert år.