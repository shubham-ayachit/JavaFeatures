package java17features.sealedClasses;

//Final class Square that implements the sealed interface Quadrilaterals.
//As it is a final class, it cannot be extended by any other class.
public final class Square implements Quadrilaterals {

    //Instance variable to store the side of the square.
    private double side;

    //Parameterized constructor to initialize the side of the square.
    public Square(double side) {
        this.side = side;
    }

    //Implementation of the area method for the square.
    @Override
    public double area() {
        return side * side;
    }

}
