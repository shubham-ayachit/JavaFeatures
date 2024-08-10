package streams.terminalOps;

import java.util.List;

public class AnyMatchOpnExample {

    public static void main(String[] args) {
        //anyMatch is a terminal operation which is used to check if any element in the stream matches the given predicate
        //anyMatch is a terminal operation
        //anyMatch takes a predicate as argument
        //anyMatch returns a boolean value
        //anyMatch returns true if any element in the stream matches the given predicate
        //anyMatch returns false if no element in the stream matches the given predicate

        //Output: true
        //true is printed
        //1 is present in the list
        //true is printed
        //true is printed
        //true is printed

        //anyMatch takes a predicate as argument
        

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean isPresent = integerList.stream().anyMatch(num -> num%2==0);
        System.out.println("Is 1 present in the list: " + isPresent);
    }
}
