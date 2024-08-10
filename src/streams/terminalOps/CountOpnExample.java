package streams.terminalOps;

import java.util.List;

public class CountOpnExample {

    public static void main(String[] args) {
        //count is a terminal operation which is used to count the number of elements in the stream
        //count is a terminal operation
        //count takes no argument
        //count returns a long value which is the number of elements in the stream

        //Output: 6
        //6 is printed
        //There are 6 elements in the stream

        //count takes no argument
        

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);
        long count = integerList.stream().count();
        System.out.println("Number of elements in the stream: " + count);
    }
}
