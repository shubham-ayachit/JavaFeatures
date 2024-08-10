package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStream {

    public static void main(String[] args) {
        
        //primitive array
        int[] primitiveArray = {1, 2, 3, 4, 5};
        //Object array
        Integer[] wrappedIntegers = {1, 2, 3, 4, 5};

        final IntStream intStream = Arrays.stream(primitiveArray);
        System.out.println("Printing of primitive array: ");
        intStream.forEach(System.out::print);

        final Stream<Integer> intStream2 = Arrays.stream(wrappedIntegers);
        System.out.println("\nPrinting of wrapped integer array: ");
        intStream2.forEach(System.out::print);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\nPrinting of integer list: ");
        integerList.stream().forEach(System.out::print);


    }
}
