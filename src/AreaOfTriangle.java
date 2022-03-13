import java.util.Scanner;

//8. Write a program to calculate the area of a triangle.
public class AreaOfTriangle {
    public static void main(String[] args) {

        areaoftriangle();


    }

    public static void areaoftriangle(){

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Width of the Triangle: ");
        double width=s.nextDouble();

        System.out.println("Enter the height of the Triangle: ");
        double height=s.nextDouble();

        double area=(width*height)/2;
        System.out.println("Area of Triangle is: " + area);

    }
}
