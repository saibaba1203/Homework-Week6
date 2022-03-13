/*
19. Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */
public class StringIntoLowercase {
    public void lowercase1(){

        String str = new String("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");

        System.out.println("Input in Uppercase: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        System.out.println("Output in Lowercase: " + str.toLowerCase());

    }

    public static void main(String[] args) {

        StringIntoLowercase obj = new StringIntoLowercase();

        obj.lowercase1();

    }
}
