package streams.terminalOps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectOpnExample {

    public static void main(String[] args) {
        //collect is a terminal operation which is used to collect the elements of the stream into a collection
        //collect is a terminal operation
        //collect takes a Collector as argument
        //Example: Collectors.toList() will collect the elements of the stream into a List
        //Example: Collectors.toSet() will collect the elements of the stream into a Set
        //Example: Collectors.toMap() will collect the elements of the stream into a Map
        //Example: Collectors.joining() will join the elements of the stream into a single String
        //Example: Collectors.counting() will count the number of elements in the stream
        //Example: Collectors.summarizingInt() will collect the statistics of the stream elements
        //Example: Collectors.partitioningBy() will partition the elements of the stream based on a predicate
        //Example: Collectors.groupingBy() will group the elements of the stream based on a classifier
        //Example: Collectors.collectingAndThen() will perform an additional operation on the collected elements
        
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenSqrList = integerList.stream().filter(n -> n%2 == 0).map(n -> n * n).collect(Collectors.toList());
        System.out.println("List of even numbers after squaring: ");
        System.out.println(evenSqrList);

        //GroupingBy is used to group the elements of the stream based on a classifier.
        //In this example, the elements of the stream are grouped based on whether they are even or odd.
        //The elements are grouped into two lists: one for even numbers and one for odd numbers.
        //The groupingBy operation returns a Map<Integer, List<Integer>> where the key is the classifier and the value is the list of elements.
        //The classifier is a Predicate which returns a boolean value.
        //In this example, the classifier is n -> n%2 == 0 which returns true if the number is even and false if the number is odd.
        //The groupingBy operation is a static method in the Collectors class.

        Map<String, List<Integer>> groupNumbersByEvenOdd = integerList.stream().collect(Collectors.groupingBy(n -> n%2 == 0 ? "Even" : "Odd"));
        System.out.println("Grouping numbers by Even and Odd: ");
        System.out.println(groupNumbersByEvenOdd);

        //PartitioningBy is used to partition the elements of the stream based on a predicate.
        //In this example, the elements of the stream are partitioned based on whether they are even or odd.
        //The elements are partitioned into two lists: one for even numbers and one for odd numbers.
        //The partitioningBy operation returns a Map<Boolean, List<Integer>> where the key is the result of the predicate and the value is the list of elements.

        Map<Boolean, List<Integer>> partitionNumbersByEvenOdd = integerList.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println("Partitioning numbers by Even and Odd: ");
        System.out.println(partitionNumbersByEvenOdd);
    }
}
