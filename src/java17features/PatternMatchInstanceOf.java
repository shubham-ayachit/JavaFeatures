package java17features;

// Pattern matching for instanceof is a new feature in Java 14 that allows you to declare a new variable in the same line as the instanceof keyword.
// This feature simplifies the code and makes it more readable.
//Use case : Type Checking and Casting
public class PatternMatchInstanceOf {

    public static void main(String[] args) {
        // Before Java 14
        Object obj = "Hello";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str);
        }

        // Pattern matching for instanceof
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }

        // Pattern matching for instanceof with else block
        Object obj1 = 10;
        if (obj1 instanceof String str) {
            System.out.println(str);
        } else {
            System.out.println("Not a string");
        }
    }
}
