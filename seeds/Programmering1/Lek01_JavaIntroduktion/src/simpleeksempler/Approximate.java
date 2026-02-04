public class Approximate {

    public static void main(String[] args) {

// First result
        double pi1 = 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0);
        System.out.println("Resultat 1: " + pi1);

// Second result
        double pi2 = pi1 + 4*(1.0/13.0);
        System.out.println("Resultat 2: " + pi2);
    }
}