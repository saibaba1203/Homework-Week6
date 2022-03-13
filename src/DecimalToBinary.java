import java.util.Scanner;

/*
17. Write a Java program to convert a decimal number to binary number.
Input Data: Input a Decimal Number : 5
Expected Output Binary number is: 101
 */
public class DecimalToBinary {
    public static void decimal(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int decimal = scan.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is " + binary);

    }

    public static void main(String[] args) {

        decimal();
    }
}
