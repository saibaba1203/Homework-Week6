import java.util.Scanner;

/*
5. Write a program for a calculator with addition, subtraction, multiplication and division methods
all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)
 */
public class Calculator {
    // Static Method
    public static double additon(double num1, double num2) {
        return num1 + num2;
    }

    // Static method
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    // Instance method
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // Instance method
    public double division(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the Second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("");


        System.out.println("Addition of two numbers is: " + additon(num1, num2));
        System.out.println("Subtraction of two numbers is: " + subtraction(num1, num2));

        Calculator cal = new Calculator(); // Object to call Instance method

        cal.multiplication(num1, num2); // Called Multiplication method with Object
        System.out.println("Multiplication of two numbers is: " + cal.multiplication(num1, num2));

        cal.division(num1, num2); // Called Division method with Object
        System.out.println("Division of two numbers is: " + cal.division(num1, num2));

    }
}
