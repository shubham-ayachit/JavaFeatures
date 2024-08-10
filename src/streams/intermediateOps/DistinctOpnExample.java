package streams.intermediateOps;

import java.util.Arrays;
import java.util.List;

public class DistinctOpnExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3);

        //distinct is an intermediate operation which is used to remove duplicates from the stream
        //distinct is a non-terminal operation
        //distinct takes no argument
        
        integerList.stream().distinct().forEach(System.out::println);
    }
}
