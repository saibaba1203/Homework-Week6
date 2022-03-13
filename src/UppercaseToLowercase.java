import java.util.Scanner;

//9.Write a java programme to convert the Uppercase to Lowercase
public class UppercaseToLowercase {
    private static Scanner sc;

    public static void main(String[] args) {
        UppercaseToLowercase obj = new UppercaseToLowercase();
        obj.upper();


    }

    public void upper() {
        String UpperStr;

        sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter Uppercase String =");
        UpperStr = sc.nextLine();
        String UpperStr1 = UpperStr.toLowerCase();
        System.out.println("\n The Lowercase String =" + UpperStr1);
    }
}
