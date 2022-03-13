/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */

public class InstanceVariable {
    int a =10;
    int b=20;


    public static void main(String[] args) {

        InstanceVariable obj = new InstanceVariable();

        obj.test();

    }

    public void test(){

        System.out.println(a); // Direct access
        System.out.println(b);

    }
}
