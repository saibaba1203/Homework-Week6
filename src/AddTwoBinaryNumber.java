import java.util.Scanner;

/*
16. Write a Java program to add two binary numbers.
Input Data: Input first binary number: 10
Input second binary number: 11
Expected Output: Sum of two binary numbers: 101
 */
public class AddTwoBinaryNumber {
    public static void main(String[] args) {

        dectobin();

    }

    public static void dectobin() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st Binary number: ");
        int num1 = scan.nextInt(2);
        System.out.print("Enter 2nd Binary number: ");
        int num2 = scan.nextInt(2);

        System.out.println("Sum of two Binary number is : " + Integer.toBinaryString(num1 + num2));

    }
}