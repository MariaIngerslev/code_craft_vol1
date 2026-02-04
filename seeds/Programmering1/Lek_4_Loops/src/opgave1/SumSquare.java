package opgave1;

public class SumSquare {

    public static void main(String[] args) {
        int i = 1;
        int limit = 100;
        int sum = 0;
        while (i*i <= limit) {
            sum = sum + i * i;
            i++;
        }
        System.out.println(sum);
        }

}
