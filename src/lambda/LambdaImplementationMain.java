package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaImplementationMain {

    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello "+name);
        greeting.perform("Shubham!");


        MathOperation addition = (a, b) -> a+b;
        System.out.println(addition.MathOperation(2, 3));

        MathOperation operation = (a, b) -> {
            return Math.max(a, b);
        };
        System.out.println(operation.MathOperation(2, 3));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.forEach(a -> {
            if(a%2 == 0) {
                System.out.println(a);
            }
        });

        StringOperation stringOperation = (s) -> {
            System.out.println(s.toUpperCase());
            return s.toUpperCase();
        };
        stringOperation.apply("hello");

        List<Person> people = Arrays.asList(
                new Person("Shubham", 22),
                new Person("Rahul", 23),
                new Person("Rohit", 24),
                new Person("Raj", 25)
        );

        people.sort((p1, p2) -> p2.getAge() - p1.getAge());
        people.forEach(System.out::println);


        List<String> names = Arrays.asList("Shubham", "Rahul", "Rohit", "Raj");

        names.forEach(name -> {
            if(name.startsWith("R")) {
                System.out.println(name.toUpperCase());
            }
        });


        List<Employee> employees = Arrays.asList(
                new Employee("Shubham", 1000),
                new Employee("Rahul", 2000),
                new Employee("Rohit", 3000),
                new Employee("Raj", 4000)
        );

        employees.sort((e1, e2) -> e2.getSalary() - e1.getSalary());
        employees.forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        numbers.forEach(num -> {
            if(num%2 == 0 && num > 10) {
                System.out.println(num);
            }
        });


        List<String> nameList = Arrays.asList("Shubham", "Rahul", "Rohit", "Raj", "Saurabh", "Ravi", "Ramesh", "Rajesh");
        
        Predicate<String> predicate = (name) -> name.startsWith("R");

        //nameList.stream().filter(predicate).forEach(System.out::println);

        Predicate<String> negatePredicate = predicate.negate();
        //nameList.stream().filter(negatePredicate).forEach(System.out::println);

        Function<String, Integer> lenFunction = (s) -> s.length();
        Function<Integer, Integer> squareFunction = (i) -> i*i;
        nameList.stream().map(lenFunction.andThen(squareFunction)).forEach(System.out::println);

        Consumer<String> consumer = (s) -> {
            System.out.println(s.toUpperCase());
        };

        nameList.forEach(consumer);

        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get());

        

    }
}
