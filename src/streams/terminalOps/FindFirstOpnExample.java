package streams.terminalOps;

import java.util.List;
import java.util.Optional;

public class FindFirstOpnExample {

    public static void main(String[] args) {
        //findFirst is a terminal operation which is used to find the first element in the stream
        //findFirst is a terminal operation
        //findFirst takes no argument
        //findFirst returns an Optional object
        //Optional is a container object which may or may not contain a non-null value
        //Optional is used to represent the existence or absence of a value
        //Optional is introduced in Java 8
        //Optional is a final class
        //Optional is a public final class
        //Optional is a generic class

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> first = integerList.stream().filter(n -> n%2==0).findFirst();
        System.out.println("First even number in the list: " + first.get());
    }
}
