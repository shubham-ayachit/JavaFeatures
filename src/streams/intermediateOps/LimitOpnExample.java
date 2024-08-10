package streams.intermediateOps;

import java.util.List;

public class LimitOpnExample {

    public static void main(String[] args) {
        //limit is an intermediate operation which is used to limit the number of elements in the stream
        //limit is a non-terminal operation
        //limit takes a long value as argument
        //Example: limit(3) will limit the number of elements in the stream to 3

        //Output: 1, 2, 3
        //1, 2, 3 are printed
        //3 elements are present in the list
        //3 elements are printed
        //3 elements are printed

        //limit takes a long value as argument
        

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("After limiting the number of elements to 3: ");
        integerList.stream().limit(3).forEach(System.out::println);
    }
}
