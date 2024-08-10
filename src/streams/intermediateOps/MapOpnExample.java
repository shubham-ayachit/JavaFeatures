package streams.intermediateOps;

import java.util.Arrays;
import java.util.List;

public class MapOpnExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward", "Frank");

        //map takes Function as argument
        //Function is a functional interface which takes one argument and returns a value
        //Example: Function<String, Integer> length = str -> str.length();
        //Here, str is the argument and str.length() is the expression which returns an integer value


        System.out.println("Printing names in uppercase: ");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
