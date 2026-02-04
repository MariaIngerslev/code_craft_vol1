package simpleeksempler;

public class AreaPerimeterCircle {
    public static void main(String[] args) {
        //input variables
        double pi = 3.14159;
        double radius = 6.5;

        //variables
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        //Output results
        System.out.println("The perimeter of the circle is " + perimeter);
        System.out.println("The area of the circle is " + area);
    }
}
