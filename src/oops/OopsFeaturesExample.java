package oops;

public class OopsFeaturesExample {
    public static void main(String[] args) {
        //Encapsulation Example
        Student student = new Student("John", "Doe", 20, "Computer Science");
        System.out.println(student);

        //Inheritance Example
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        System.out.println(dog.color);

        //Polymorphism Example
        //Dynamic polymorphism
        Animal animal = new Dog();
        animal.eat();
        System.out.println(animal.color);

        //Compile time polymorphism
        dog.eat("Bones");
    }
}





//Inheritance Example - Parent class
class Animal {
    String color = "White";

    void eat() {
        System.out.println("Animal is eating");
    }
}

//Inheritance Example - Child class
class Dog extends Animal {
    //Inheritance Example
    String color = "Black";

    void bark() {
        System.out.println("Dog is barking");
    }

    //Compile time polymorphism
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    void eat(String food) {
        System.out.println("Dog is eating " + food);
    }
}