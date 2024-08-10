package oops.abstractionFeature;

public class Square extends Shape implements Drawable {

    public int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
