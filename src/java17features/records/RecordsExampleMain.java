package java17features.records;

import java.util.List;

public class RecordsExampleMain {

    public static void main(String[] args) {
        
        Point point = new Point(10, 20);
        System.out.println("X: " + point.x() + ", Y: " + point.y());

        List<Employee> employees = List.of(new Employee("John", 30, "IT", 50000),
                new Employee("Mike", 35, "Finance", 60000));

        employees.forEach(System.out::println);

    }

}
