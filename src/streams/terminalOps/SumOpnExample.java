package streams.terminalOps;

public class SumOpnExample {

    public static void main(String[] args) {
        //sum is a terminal operation which is used to sum the elements in the stream
        //sum is a terminal operation
        //sum takes no argument
        //sum returns a long value which is the sum of the elements in the stream

        //mapToLong is used to convert the stream of integers to a stream of long values

        //Output: 21
        //21 is printed
        //Sum of the elements in the stream is 21
        
        //sum takes no argument
        
        long sum = java.util.List.of(1, 2, 3, 4, 5, 6).stream().mapToLong(Integer::longValue).sum();
        System.out.println("Sum of the elements in the stream: " + sum);
    }
}
