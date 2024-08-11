package java17features.sealedClasses;

public class SealedClassesExampleMain {


    public static void main(String[] args) {
        //Creating an object of the Circle class.
        Circle circle = new Circle(5);
        //Printing the area of the circle.
        System.out.println("Area of the circle: " + circle.area());

        //Creating an object of the Square class.
        Square square = new Square(4);
        //Printing the area of the square.
        System.out.println("Area of the square: " + square.area());

        //Creating an object of the Rectangle class.
        Rectangle rectangle = new Rectangle(3, 5);
        //Printing the area of the rectangle.
        System.out.println("Area of the rectangle: " + rectangle.area());
    }
}
