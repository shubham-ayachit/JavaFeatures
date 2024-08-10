package streams.intermediateOps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeakOpnExample {

    public static void main(String[] args) {
        //peek takes Consumer as argument
        //Consumer is a functional interface which takes one argument and returns nothing
        //Example: Consumer<String> print = str -> System.out.println(str);
        //Here, str is the argument and System.out.println(str) is the expression which returns nothing

        //peek is an intermediate operation which is used to perform some action on each element of the stream
        //peek is mainly used for debugging purposes
        //peek is a non-terminal operation
        //peek is a lazy operation
        //peek is used to perform some action on each element of the stream without changing the elements of the stream

        //Example: To print each element of the stream

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        integerList.stream().peek(n -> System.out.println("Original: "+n)).map(n -> n * n).peek(n -> System.out.println("After Square: "+n)).collect(Collectors.toList());
        
        
    }
}
