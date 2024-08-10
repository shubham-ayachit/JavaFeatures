package streams.intermediateOps;

import java.util.Arrays;
import java.util.List;

public class FilterOpnExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //filter takes Predicate as argument
        //Predicate is a functional interface which takes one argument and returns a boolean value
        //Example: Predicate<Integer> evenNumber = n -> n%2 == 0;
        //Here, n is the argument and n%2 == 0 is the expression which returns a boolean value

        
        System.out.println("Printing even numbers from the list: ");
        integerList.stream().filter(n -> n%2 == 0).forEach(System.out::println);

    }
}
