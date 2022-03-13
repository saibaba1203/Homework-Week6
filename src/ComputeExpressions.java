/*
12. Write a Java program to compute the specified expressions and print the output
Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class ComputeExpressions {
    public static void compute(){

        double w = 25.5;
        double x = 3.5;
        double y = 40.5;
        double z = 4.5;

        System.out.println("Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))");
        System.out.println("Expected Output: " + ((w*x) - (x*x)) / (y-z));
    }

    public static void main(String[] args) {

        compute();

    }
}
