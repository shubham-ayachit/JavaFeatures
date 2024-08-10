package streams.intermediateOps;

import java.util.Arrays;
import java.util.List;

public class FlatMapOpnExample {

    public static void main(String[] args) {
        
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        //flatMap takes Function as argument
        //Function is a functional interface which takes one argument and returns a value
        //Example: Function<List<Integer>, Stream<Integer>> listToStream = list -> list.stream();
        //Here, list is the argument and list.stream() is the expression which returns a Stream of integers

        //Complex data structures can be flattened using flatMap like List<List<Integer>> to List<Integer>

        listOfLists.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);

        List<List<String>> listOfLists2 = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David"),
                Arrays.asList("Edward", "Frank")
        );

        listOfLists2.stream().flatMap(t -> t.stream()).filter(str -> str.length() > 3).forEach(System.out::println);
    }
}
