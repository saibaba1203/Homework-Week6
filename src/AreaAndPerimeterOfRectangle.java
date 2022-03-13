import java.util.Scanner;

/*
14. Write a Java program to print the area and perimeter of a rectangle.
Test Data: Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class AreaAndPerimeterOfRectangle {
    public void rectangle() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter width of rectangle: ");
        double width = scan.nextDouble();
        System.out.print("Enter height of rectangle: ");
        double height = scan.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area of Rectangle is: "+ area);
        System.out.println("Perimeter of Rectabgle is : "+perimeter);

    }

    public static void main(String[] args) {

        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle();

        obj.rectangle();
    }
}
