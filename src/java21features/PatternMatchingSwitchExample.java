package java21features;

// Pattern Matching for switch expression
// Switch expression can match to the type of the object in the case label instead of just premitive types
// Here we have two classes Employee and Point. Employee class has name and age fields and Point class has x and y fields.
// Switch expression amtches for Employee and Point objects and prints the details of the object.
public class PatternMatchingSwitchExample {

    public static void main(String args[]) {
        
        Object obj = new Employee("John", 30);

        String result = switch(obj) {
            case Employee e -> e.name() + " is " + e.age() + " years old";
            default -> "Unknown";
        };
        System.out.println(result);

        // Pattern Matching for switch expression with record
        // Matches the record objects as well as extracts the values from the record object to use in the case label.
        Object obj1 = new Point(10, 20);
        switch(obj1) {
            case Point(int x, int y) -> System.out.println("Point is at (" + x + ", " + y + ")");
            default -> System.out.println("Unknown");
        }

        if(obj1 instanceof Point(int x, int y)) {
            System.out.println("Point is at (" + x + ", " + y + ")");
        }
        if(obj instanceof Employee e) {
            System.out.println(e.name() + " is " + e.age() + " years old");
        } else {
            System.out.println("Unknown");
        }
    }
}


class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }
}

record Point(int x, int y) {}