package opgave2;

public class OpgaveEt {
 static void main(String[] args) {
     //variables
     int i1, i2, a = 4, b = 11, c = 2;
     double d1, d2, r = 4.0, s = 11.0, t = 2.0;

     //output 1
     i1 = b / a;
     System.out.println(i1);

     //output 2
     c = (int) (s / r);
     System.out.println(c);

     //output 3
     d1 = b / a;
     System.out.println(d1);

     //output 4
     d2 = s / r;
     System.out.println(d2);

     //output 5
     d1 = b / r;
     System.out.println(d1);

     //output 6
     d2 = 11.0 / 4.0;
     System.out.println(d2);

     //output 7
     d1 = 11.0 / a * c;
     System.out.println(d1);

     //output 8
     i1++;
     System.out.println(i1);

     //output 9
     i1 = b % a;
     System.out.println(i1);

     //output 10
     i1 = 3 + 7 * 2;
     System.out.println(i1);

     //output 11
     i2 = (3 + 7) * 2;
     System.out.println(i2);
 }
}