/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class StatiAndInstance {
    int x = 20;// Instance variable
    static int c = 30;// Static variable

    public static void main(String[] args) {
        StatiAndInstance obj = new StatiAndInstance();
        System.out.println(obj.x); //20
        //System.out.println(StaticVariables.c);//
        myMethod();//30
    }

    public void test() {
        // Instance area
        System.out.println(x);
        StatiAndInstance obj = new StatiAndInstance();
    }

    public static void myMethod() {
        System.out.println(c);
    }
}
