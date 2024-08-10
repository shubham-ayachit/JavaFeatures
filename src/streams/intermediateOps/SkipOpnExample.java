package streams.intermediateOps;

import java.util.List;

public class SkipOpnExample {

    public static void main(String[] args) {
        //skip is an intermediate operation which is used to skip the first n elements from the stream
        //skip is a non-terminal operation
        //skip takes a long value as argument
        //Example: skip(3) will skip the first 3 elements from the stream

        //Output: 4, 5, 6, 7, 8, 9, 10
        //1, 2, 3 are skipped
        //4, 5, 6, 7, 8, 9, 10 are printed
        //10 elements are present in the list
        //3 elements are skipped
        //7 elements are printed
        //10 - 3 = 7
        //7 elements are printed

        //skip takes a long value as argument
        

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("After skipping the first 3 elements: ");
        integerList.stream().skip(3).forEach(System.out::println);
    }
}
