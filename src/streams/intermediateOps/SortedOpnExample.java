package streams.intermediateOps;

import java.util.Comparator;
import java.util.List;

public class SortedOpnExample {

    public static void main(String[] args) {
        
        List<Integer> integerList = List.of(1, 5, 3, 4, 2, 6, 7, 8, 9, 10);

        //Sorted is an intermediate operation which is used to sort the elements of the stream
        //Sorted takes no argument
        //Sorted is a non-terminal operation


        System.out.println("Sorting in ascending order: ");
        integerList.stream().sorted().forEach(System.out::println);

        System.out.println("Sorting in descending order: ");
        integerList.stream().sorted((a, b) -> b - a).forEach(System.out::println);

        //Using Comparator.reverseOrder()
        System.out.println("Sorting in descending order using Comparator.reverseOrder(): ");
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<String> stringList = List.of("Alice", "Bob", "Charlie", "David", "Edward", "Frank");
        //Sorting based on length of the string
        System.out.println("Sorting based on length of the string: ");
        stringList.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
    }
}
