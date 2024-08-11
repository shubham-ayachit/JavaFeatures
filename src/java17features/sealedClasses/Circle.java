package java17features.sealedClasses;

//It is a non-sealed class that implements the sealed interface Shape.
//As it is non-sealed, it can be extended by any class.
public non-sealed class Circle implements Shape {

    //Instance variable to store the radius of the circle.
    private double radius;

    //Parameterized constructor to initialize the radius of the circle.
    public Circle(double radius) {
        this.radius = radius;
    }

    //Area implementation for the circle.
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
