//This is a simple example to show how memory is allocated in Java

import java.util.ArrayList;
import java.util.List;

public class MemoryAllocationExample {

    int a = 10; //stored in a stack
    int b = 20; //stored in a stack

    MemoryAllocationExample example = new MemoryAllocationExample(); //stored in a heap
    static List<Integer> list = new ArrayList<>(); //stored in a heap

    public static void main(String[] args) {
        int localA = 30; //stored in a stack
        int localB = 40; //stored in a stack

        Student student = new Student(1, "John", 20); //stored in a heap
        student.display(); //stored in a stack
        String nameWithDepartment = student.getNameWithLocalDepartment(); //stored in a stack
        System.out.println(nameWithDepartment); //stored in a stack

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        System.out.println(list); //stored in a stack
    }

}

class Student {
    int id;
    String name;
    int age;
    
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student ID: " + id + " Name: " + name + " Age: " + age);
    }

    public String getNameWithLocalDepartment() {
        String department = "Computer Science";
        return name+" "+department;
    }
}
