import java.util.Scanner;

/*
13. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class AverageOfNumbers {
    public static double average(double x, double y, double z){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number= ");
        x = scan.nextDouble();
        System.out.print("Enter Second number= ");
        y = scan.nextDouble();
        System.out.print("Enter Third number= ");
        z = scan.nextDouble();

        double result = (x+y+z)/3;

        System.out.println("The average of Three numbers is: " + result);
        return result;


    }

    public static void main(String[] args) {

        average(10,20,30);

    }
}
