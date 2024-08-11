package java17features.sealedClasses;

public non-sealed class Rectangle implements Quadrilaterals {

    //Instance variables to store the length and breadth of the rectangle.
    private double length;
    private double breadth;

    //Parameterized constructor to initialize the length and breadth of the rectangle.
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //Implementation of the area method for the rectangle.
    @Override
    public double area() {
        return length * breadth;
    }

}
