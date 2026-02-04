package simpleeksempler;

public class AreaPerimeterRectangle {
    public static void main(String[] args) {
        //input variables
        double width = 5.3;
        double height = 8.6;

        //variables
        double area = width * height;
        double perimeter = 2 * (width+height);

        //output
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
