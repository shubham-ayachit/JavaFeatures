package java17features.sealedClasses;

public sealed class Trapezoid implements Quadrilaterals permits AcuteTrapezoid, ObtuseTrapezoid {

    //Instance variables to store the length of the parallel sides and the height of the trapezoid.
    private double side1;
    private double side2;
    private double height;

    //Parameterized constructor to initialize the length of the parallel sides and the height of the trapezoid.
    public Trapezoid(double side1, double side2, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    //Implementation of the area method for the trapezoid.
    @Override
    public double area() {
        return (side1 + side2) * height / 2;
    }

}
