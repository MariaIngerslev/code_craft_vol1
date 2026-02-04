package opgave2;

public class PowerCalculator {
    public static void main (String[] args) {
        printPowersOfTwo();
    }
        public static void printPowersOfTwo() {
        int i = 0;
        int currentPower = 1;

        while (i <= 20) {
            System.out.println(currentPower);

            currentPower *= 2;
            i++;

        }
        }

}
