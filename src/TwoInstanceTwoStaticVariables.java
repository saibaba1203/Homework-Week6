/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class TwoInstanceTwoStaticVariables {
    int x = 10;
    int y = 20;
    static String name = "Prime";
    static String name1 = "Testing";

    // Instance Method
    public void myInstance() {

        System.out.println("Below is output for Instance Method");
        TwoInstanceTwoStaticVariables t = new TwoInstanceTwoStaticVariables();
        System.out.println(t.x);
        System.out.println(t.y);

        System.out.println(name);
        System.out.println(name1);
    }

    // Static Method
    public static void myStatic() {

        System.out.println("");
        System.out.println("Below output is for Static Method");
        TwoInstanceTwoStaticVariables t2 = new TwoInstanceTwoStaticVariables();
        System.out.println(t2.x);
        System.out.println(t2.y);

        System.out.println(name);
        System.out.println(name1);
    }

    // Main method
    public static void main(String[] args) {

        TwoInstanceTwoStaticVariables obj = new TwoInstanceTwoStaticVariables(); // Object created to call Instance method
        obj.myInstance();
        myStatic();

    }
}
