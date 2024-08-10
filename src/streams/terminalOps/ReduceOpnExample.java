package streams.terminalOps;

import java.util.Arrays;
import java.util.List;

public class ReduceOpnExample {

    public static void main(String[] args) {
        //reduce takes BinaryOperator as argument
        //BinaryOperator is a functional interface which takes two arguments and returns a value
        //Example: BinaryOperator<Integer> sum = (a, b) -> a + b;
        //Here, a and b are the arguments and a + b is the expression which returns an integer value

        //reduce() method is used to reduce the elements of a stream to a single value
        //It takes two arguments:
        //1. Identity: The initial value of the reduction operation
        //2. Accumulator: The operation used to reduce the elements of the stream to a single value

        //Example: To find the sum of all elements in a stream
        //List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //int sum = integerList.stream().reduce(0, (a, b) -> a + b);
        //System.out.println("Sum of all elements in the list: " + sum);

        //Example: To find the maximum element in a stream
        //List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //int max = integerList.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        //System.out.println("Maximum element in the list: " + max);

        //Example: To find the minimum element in a stream
        //List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //int min = integerList.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        //System.out.println("Minimum element in the list: " + min);

        //Example: To concatenate all strings in a stream
        //List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward", "Frank");
        //String concatenated = names.stream().reduce("", (a, b) -> a + b);
        //System.out.println("Concatenated string: " + concatenated);

        //Example:

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer totalSum = integerList.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Total sum of all elements in the list: " + totalSum);

        
        }
}
