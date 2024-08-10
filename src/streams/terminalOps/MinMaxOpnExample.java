package streams.terminalOps;

import java.util.List;

public class MinMaxOpnExample {

    public static void main(String[] args) {
        //min and max are terminal operations which are used to find the minimum and maximum element in the stream
        //min and max are terminal operations
        //min and max take a Comparator as argument
        //Comparator is a functional interface which takes two arguments and returns an integer value
        //Example: Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        //Here, a and b are the arguments and a.compareTo(b) is the expression which returns an integer value
        //If the value is negative, then a is less than b
        //If the value is positive, then a is greater than b
        //If the value is zero, then a is equal to b

        //min and max take a Comparator as argument
        

        //Output: 1
        //1 is the minimum element in the stream
        //1 is printed
        //Output: 10
        //10 is the maximum element in the stream
        //10 is printed
        //Output: 1
        //1 is the minimum element in the stream
        //1 is printed
        //Output: 10
        //10 is the maximum element in the stream
        //10 is printed
        //Output: 1
        //1 is the minimum element in the stream
        //1 is printed
        //Output: 10
        //10 is the maximum element in the stream
        //10 is printed

        //min and max take a Comparator as argument
        

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Minimum element in the stream: ");
        System.out.println(integerList.stream().min(Integer::compareTo).get());
        System.out.println("Maximum element in the stream: ");
        System.out.println(integerList.stream().max(Integer::compareTo).get());
    }
}
