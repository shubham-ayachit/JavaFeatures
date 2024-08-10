package oops.abstractionFeature;

public class AbstractionFeatureMain {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();
        circle.draw();

        Square square = new Square(5);
        square.display();
        square.draw();
    }
}
