package oops;

//Encapsulation class
//Class is self-contains and hide the implementation details. Protecgts data from direct access.
//Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String major;

    // Constructor
    public Student(String firstName, String lastName, int age, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    // Optionally, override toString method
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}
