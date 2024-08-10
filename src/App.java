import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Hands on with Java 8 features
        //Taking all the reference from winterbe/java8-tutorial - https://github.com/winterbe/java8-tutorial?tab=readme-ov-file#default-methods-for-interfaces

        // Example of using default methods in interfaces
        // Default methods in interfaces are not implemented in the class that
        // implements the interface. Instead, they are inherited by the class that
        // implements the interface.
        // Default methods enable you to add new functionality to interfaces of your
        // libraries and ensure binary compatibility with code written for older
        // versions of those interfaces.
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println("Default Method example1: " + formula.sqrt(16));
        System.out.println("Default Method example2: "+formula.sqrt(16));

        // Sorting of a list of strings prior to Java 8
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println("List soreted prev to lambda example:" +names);

        // Sorting of a list of strings using lambda expressions in Java 8
        // The lambda expression is a short block of code which takes in parameters and returns a value.
        // Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
        // The simplest lambda expression contains a single parameter and an expression: parameter -> expression
        // You can also add parentheses around the parameter: (parameter) -> expression
        // Multiple parameters are separated by commas: (parameter1, parameter2) -> expression
        // An empty pair of parentheses is used to indicate that no parameters are needed: () -> expression
        List<String> names2 = Arrays.asList("peter", "anna", "mike", "xenia");
        //Sorting in reverse order using lambda expressions
        Collections.sort(names2, (String a, String b) -> b.compareTo(a));
        System.out.println("List soreted using lambda example:" +names2);

        List<String> names3 = Arrays.asList("peter", "anna", "mike", "xenia");

        names3.sort((a, b) -> a.compareTo(b));
        System.out.println("List soreted using lambda example2:" +names3);


        //Example of FunctionalInterface Convert
        //A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.
        //From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
        Convert<String, Integer> convert = (from) -> Integer.valueOf(from);
        Integer converted = convert.convert("123");
        System.out.println("Example of functional interface (Converting String to integer): "+converted);
        //Example of default method in FunctionalInterface Convert
        //A functional interface can have any number of default methods. The default methods are defined in the interface with the keyword default.
        System.out.print("Example of default method in FunctionalInterface Convert: ");
        convert.print();

        //Code can be further simplified by using method references
        //Method references help to point to methods by their names. A method reference is described using "::" symbol.
        Convert<String, Integer> convert2 = Integer::valueOf;
        Integer converted2 = convert2.convert("123");
        System.out.println("Example of method reference : "+converted2);

        //Example of using method references to refer to instance methods
        class Something {
            String startsWith(String s) {
                return String.valueOf(s.charAt(0));
            }
        }
        Something something = new Something();
        Convert<String, String> convert3 = something::startsWith;
        String converted3 = convert3.convert("Java");
        System.out.println("Example of method reference to use instance methods: "+converted3);


        //Example of using constructor references
        //Constructor references help to point to a constructor by its name. It is a special type of method reference.
        //A constructor reference is described using the name of a class or an array followed by "::" and "new".
        //The following code demonstrates the use of constructor references to create a new instance of a Person class.
        class Person {
            String firstName;
            String lastName;
        
            Person(String fullName) {
                String[] names = fullName.split(" ");
                this.firstName = names[0];
                this.lastName = names[1];
            }
            Person() {
            }
        }
        Convert<String, Person> convert4 = Person::new;
        Person person = convert4.convert("John Doe");
        System.out.println(person.firstName);
        System.out.println(person.lastName);


        //Example of lambda scope
        //Accessing fields and static variables
        //Lambda expressions have access to final variables from the enclosing scope. This is known as lambda capture.
        final int num = 1; //this variable is implicitly final
        Convert<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));
        
        int num2 = 2; //this variable is not implicitly final, but as we are not changing it in the lambda expression, it is effectively final.
        Convert<Integer, String> stringConverter2 = (from) -> String.valueOf(from + num2);
        System.out.println(stringConverter2.convert(3));
        //num2 = 3; //this will give a compilation error as num2 is not effectively final.



        //Accessing default methods in interfaces using lambda expressions.
        //Default methods cannot be accessed from within lambda expressions. This is because lambda expressions do not have access to the default methods of the functional interface.
        //Formula formula2 = (a) -> sqrt(a * 100); //this will give a compilation error as sqrt is a default method in the interface Formula.



        //Default functional interfaces in Java 8
        //Java 8 has a lot of new features, and one of the most important features is the functional interface.
        //An interface with exactly one abstract method is called a functional interface.
        //Java 8 has defined a lot of functional interfaces to be used extensively in lambda expressions.
        //Predicate, Consumer, Function, and Supplier are the core functional interfaces in Java 8.
        //Example of using Predicate functional interface
        //The Predicate interface represents a predicate (boolean-valued function) of one argument.
        //This is a functional interface whose functional method is test(Object).
        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println("Example of Predicate functional interface: "+ predicate.test("foo")); // true
        System.out.println("Example of Predicate functional interface default method: "+ predicate.negate().test("foo")); // false


        //Eaxmple of using Function functional interface
        //The Function interface represents a function (method) that takes a single parameter and returns a single value.
        //This is a functional interface whose functional method is apply(Object).
        Function<String, Integer> toInteger = Integer::valueOf;
        System.out.println("Example of Function functional interface: "+ toInteger.apply("123"));     // 123
        //The andThen method of the Function interface returns a composed function that first applies the original function and then applies the after function.
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        System.out.println("Example of Function functional interface default method andThen: "+ backToString.apply("123").length()); // 3

        //Example of using Supplier functional interface
        //The Supplier interface represents a supplier of results. It has a single get method.
        //This is a functional interface whose functional method is get().
        Supplier<Person> personSupplier = Person::new;
        System.out.println("Example of Supplier functional interface: "+ personSupplier.get());   // new Person

        //Example of using Consumer functional interface
        //The Consumer interface represents an operation that accepts a single input argument and returns no result.
        //This is a functional interface whose functional method is accept(Object).
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Luke Skywalker"));


        //Accessing fields and static variables
        Lambda4 lambda4 = new Lambda4();
        lambda4.testScopes();

    }
}


//Example of lambda scopes for fields and static variables
class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Convert<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };
        System.out.println(stringConverter1.convert(24));

        Convert<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };

        System.out.println(stringConverter2.convert(25));
    }
}
